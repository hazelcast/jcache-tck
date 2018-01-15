wget https://raw.githubusercontent.com/hazelcast/hazelcast/master/pom.xml -O hazelcast.xml
a=$(sed '/<dependencies>/,/<\/dependencies>/d;/<version>/!d;s/ *<\/\?version> *//' hazelcast.xml | head -1 | sed -e 's/\(.*\)<\/version>/\1/g')
rm hazelcast.xml
b=$(echo "${a}" | tr -d ' ')
echo "$b"
sed s/\${implementation.version}/"${b}"/ pom.xml > pom2.xml
mv pom2.xml pom.xml
sleep 1
