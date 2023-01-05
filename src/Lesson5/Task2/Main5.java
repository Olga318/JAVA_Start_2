package Lesson5.Task2;

import java.util.*;

//Учитывая список paths информации о каталоге, включая путь к каталогу и все файлы
// с содержимым в этом каталоге, вернуть все дубликаты файлов в файловой системе
// с точки зрения их путей . Вы можете вернуть ответ в любом порядке .
public class Main5 {
    public static void main(String[] args) {
    }

    public List<List<String>> findDuplicate(String[] paths) {
        List<List<String>> res = new LinkedList<>();
        Map<String,List<String>> map = new HashMap<>();

        for (String path: paths) {
            String[] arr = path.split(" ");

            for (int i = 1; i < arr.length; i++) {
                String fileName = arr[i].substring(0, arr[i].indexOf('('));
                String content = arr[i].substring(arr[i].indexOf('(')+1, arr[i].length()-1);
                map.putIfAbsent(content, new LinkedList<String>());
                map.get(content).add(arr[0] + '/' + fileName);
            }
        }
        for (List<String> list : map.values()){
            if(list.size()>1) res.add(list);
        }
        return res;
    }
}