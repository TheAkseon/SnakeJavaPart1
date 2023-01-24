import javax.swing.*;//подключаем библиотеку swing, она нужна для того чтобы
//показывать пользователю графический интерфейс (окно игры)
import java.awt.*;//эта библиотека также нужна для отображения интерфейсы, в данном случае картинок (бонусы для змейки, саму змейку)


public class GameField extends JPanel {//создаем класс GameField, в котором будем прописывать всю игровую логику для змейки, также мы
    //наследуем его от JPanel для того, чтобы отображать бонусы и саму змейку
    private final int SIZE = 320;
    private final int DOT_SIZE = 16;//размер в пикселях сколько будет занимать бонус для змейки и одна секция для змейки
    private final int ALL_DOTS = 400;//максимальное кол-во единиц (dots), которое может поместиться на игровом поле
    private Image dot;//отображение секции змейки
    private Image apple;//отображение бонуса змейки
    private int appleX;//позиция бонуса для змейки по оси X
    private int appleY;//позиция бонуса для змейки по оси Y
    private int[] x = new int[ALL_DOTS];//все положения змейки по оси x
    private int[] y = new int[ALL_DOTS];//все положения змейки по оси y
    private int dots;//размер змейки в данный момент времени
    private Timer timer;//это таймер - он будет нужен для расчета скорости обновления экрана, то есть кол-ва фпс в игре
    //или скорости змейки
    private boolean left = false;//направление змейки влево
    private boolean right = false;//направление змейки вправо
    private boolean up = true;//направление змейки вверх
    private boolean down = false;//направление змейки вниз
    private boolean inGame = true;//проверка на то играем ли мы сейчас или уже проиграли


    public GameField(){
        setBackground(Color.black);//тут мы используем метод setBackground, он нам нужен для того, чтобы
        //назначить цвет нашего фона, в данном случае мы назначили черный
    }

    public void loadImages(){
        ImageIcon imageIconApple = new ImageIcon("apple.png");//тут мы создаем переменную с типом ImageIcon
        //и ложим в эту переменную картинку бонуса змейки
        apple = imageIconApple.getImage();//присваиваем полю apple картинку с бонусом
        ImageIcon imageIconDot = new ImageIcon("dot.png");//тут мы создаем переменную с типом ImageIcon
        //и ложим в эту переменную картинку секции змейки
        dot = imageIconDot.getImage();//присваиваем полю dot картинку с секцией змейки
    }
}
