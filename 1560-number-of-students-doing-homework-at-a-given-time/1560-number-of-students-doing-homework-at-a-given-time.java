class Solution {
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        if(startTime.length != endTime.length){
        return 0;
    }
 int t=0;
for(int i=0;i<startTime.length;i++){
if(queryTime>=startTime[i] && queryTime<=endTime[i])
 t++;
}
return t;
    }
}