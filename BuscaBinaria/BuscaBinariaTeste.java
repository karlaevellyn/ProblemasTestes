import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BuscaBinariaTeste {

    // Casos de teste
    // "N_" -> Número

    @Test
        public void N_ExistenteInicio(){
            int[] array = {0,1,20,35,40,57,99};
            int chave = 1;
              
            // Bbti -> busca binária teste no inicio

            BuscaBinaria bbti = new BuscaBinaria();

			assertEquals(1, bbti.busca(array, chave));

            }

    @Test
            public void N_ExistenteFinal(){
                int[] array = {1,23,55,64,78,87,96};
                int chave = 96;
                
                // Bbti -> busca binária teste no final

                BuscaBinaria bbtf = new BuscaBinaria();
    
                assertEquals(6, bbtf.busca(array, chave));
    
    
                }
    @Test
            public void N_ExistenteMeio(){
                int[] array = {2,18,24,37,63,72,89};
                int chave = 37;
        
                // Bbtm -> busca binária teste no meio

                BuscaBinaria bbtm = new BuscaBinaria();
        
                assertEquals(3, bbtm.busca(array, chave));
        
        
                }

    @Test
            public void N_Inexistente(){
                int[] array = {0,5,15,25,35,45,55};
                int chave = 12;
                
                // Bbt0-> busca binária teste inexistente

                BuscaBinaria bbt0= new BuscaBinaria();
            
                assertEquals(-1, bbt0.busca(array, chave));
            
            } 

    @Test
            public void N_Repetidos(){
                int[] array = {1,2,3,4,4,5,6};
                int chave = 4;
                
                // Bbtr-> busca binária teste de número repetido

                BuscaBinaria bbtr= new BuscaBinaria();
            
                assertEquals(3, bbtr.busca(array, chave));
            
            } 
    @Test
            public void N_Iguais(){
                int[] array = {7,7,7,7,7,7,7};
                int chave = 7;
                 
                // Bbti-> busca binária teste de número iguais

                BuscaBinaria bbti= new BuscaBinaria();
            
                assertEquals(3, bbti.busca(array, chave));
            
            } 
           
}
















    



    

