public class Divide implements Operate{
    public Double getResult(Double...nums){
        Double div = nums[0];
        for(int i=1; i< nums.length;i++){
            div /= nums[i];
        }

        return div;
    }
}
