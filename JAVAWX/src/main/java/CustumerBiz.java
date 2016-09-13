/**
 * Created by Administrator on 2016/9/13.
 */
public class CustumerBiz {
        String[] List = new String[10];
        int i = 0;
        int j = 0;

        public void  addName(String p_name){
            List[i] = p_name;
            i++;
        }
        public void  showName (){
            for (; j < i; j++) {

                System.out.print(List[j] + "   ");
            }
        }

        public static void main(String[] args) {
            String inputName;
            String input1;
            CustomerBiz cb = new CustomerBiz();
            Scanner input = new Scanner(System.in);
            do {
                System.out.print("请输入客户姓名: ");
                inputName = input.next();
                cb.addName(inputName);
                System.out.print("继续输入吗？（y/n） ");
                input1 = input.next();
            }while (input1.equals("y"));
            System.out.println("******************");
            System.out.println("   客户姓名列表： ");
            System.out.println("******************");
            cb.showName();
        }


    public class CustomerBiz {
        String customName;
        void addName(String name){
            customName = customName + "  "+ name;
        }
        void showNames(){

            System.out.println(customName);
        }
        public static void main(String[] args){
            CustomerBiz customerName = new CustomerBiz();
            for(int i = 1; ; i++){
                Scanner Cname = new Scanner(System.in);
                System.out.print("请输入客户姓名：");
                String newName = Cname.next();
                System.out.print("继续输入吗？（y/n）");
                Scanner judge = new Scanner (System.in);
                String isin = judge.next();
                customerName.addName(newName);

                if (isin.equals("n")){
                    break;
                }
            }
            System.out.println("*****************************");
            System.out.println("      客户姓名列表    ");
            System.out.println("*****************************");
            customerName.showNames();
        }
    }
