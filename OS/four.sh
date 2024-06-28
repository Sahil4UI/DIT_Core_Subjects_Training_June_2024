echo "Enter No1 : "
read NO1
echo "Enter No2 : "
read NO2

echo "Enter Choice +,-,/,* : "
read CHOICE

case $CHOICE in
+) RES=$(($NO1 + $NO2));;
-) RES=$(($NO1 - $NO2));;
\*) RES=$(($NO1 * $NO2));;
/) RES=$(($NO1 / $NO2));;
*) echo "INVALID"; exit 1 ;;
esac
echo $RES