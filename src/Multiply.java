public class Multiply implements Operate{
    public Double getResult(Double...nums){
        Double mult = nums[0];
        for(int i=1; i< nums.length;i++){
            mult *= nums[i];
        }

        return mult;
    }
}
