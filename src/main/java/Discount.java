public class Discount {

//на каждую вторую покупку скидка 2%
//после 18:00 +2%
//int i - номер покупки
//int after18 (0, 1) - после 18 или нет

    public int discountCalc(int i, int after18){
        // i номер покупки
            int result =0;

            if (i >0 & (after18 <2 & after18>=0)) {

                if (i % 2 == 1 & after18 == 0) {
                    return result;
                } else if (i % 2 == 0 & after18 == 0) {
                    result = 2;
                } else if (i % 2 == 1 & after18 == 1) {
                    result = 2;
                } else if (i % 2 == 0 & after18 == 1) {
                    result = 4;
                }
                return result;
            }
            else {
                return -1;
            }
    }
}
