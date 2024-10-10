#!/bin/bash
set -e
. ../process.sh

FILES="\
de/vw/mib/bap/mqbab2/audiosd/functions/CurrentStationInfo.java \

de/vw/mib/asl/internal/androidauto/target/AndroidAutoTarget.java \
de/vw/mib/asl/internal/androidauto/target/NavigationHandler.java \
de/vw/mib/asl/internal/androidauto/target/ManeuverDescriptorSender.java \
de/vw/mib/asl/internal/androidauto/target/ManeuverDescriptorMainElement.java \
de/vw/mib/asl/internal/androidauto/target/ManeuverDescriptorDirection.java \
de/vw/mib/asl/internal/androidauto/target/NavTurn.java \

de/vw/mib/bap/mqbab2/navsd/functions/RGStatus.java \
de/vw/mib/bap/mqbab2/navsd/functions/ManeuverDescriptor.java \
de/vw/mib/bap/mqbab2/navsd/functions/DistanceToNextManeuver.java \

org/dsi/ifc/androidauto2/Constants.java \
"

find . -name "*.class" -type f -delete
for j in $FILES; do
echo "Compiling $j"
  ${JAVA_HOME}/bin/javac -source 1.2 -target 1.2 -cp ".:${JAR}" $j
done

CLASSES=""
for i in $FILES; do
    classPattern=$(echo $i | sed -r 's:\.java:*.class:g')
    classFiles=$(find . -path "./$classPattern" -type f)
    CLASSES="$CLASSES $classFiles"
done
echo "$CLASSES"

jar cvf VCAndroidAuto.jar $CLASSES

echo "Upload"
ssh mib sh -l /root/.profile

scp -O VCAndroidAuto.jar mib:/mnt/app/eso/hmi/lsd/jars/

date