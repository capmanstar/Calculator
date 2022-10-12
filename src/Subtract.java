public class Subtract implements Operate{
    public Double getResult(Double...nums){
        Double sub = nums[0];
        for(int i=1; i< nums.length;i++){
            sub -= nums[i];
        }

        return sub;
    }
}
