package hillel.lesson12;

import java.util.HashMap;
import java.util.Map;

public class WordCounter {
    public static void main(String[] args) {
        String input = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas non faucibus turpis, vitae lobortis dui. In eget consequat risus. Aliquam sed tincidunt purus. Integer non semper magna. Aliquam non ipsum quis leo egestas condimentum sit amet sit amet massa. Pellentesque nec lacus massa. Mauris neque ante, commodo in dapibus ut, dictum euismod est. Donec non arcu dolor. Aliquam vel tincidunt elit. Vivamus a enim laoreet, porttitor nisl quis, cursus nulla. Vivamus sit amet tortor dui. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Vestibulum at pellentesque elit, id vehicula risus. In blandit orci vitae quam sagittis tempus. Vestibulum tincidunt ligula mauris. Suspendisse eget odio dui. Fusce sollicitudin lectus in augue posuere, eget lobortis lacus accumsan. Praesent elementum egestas lorem non semper. Fusce ultricies sed massa quis scelerisque. Suspendisse eleifend, felis quis sollicitudin suscipit, orci nunc rutrum urna, eu gravida odio tortor iaculis lacus. In malesuada sagittis vestibulum. Nulla facilisi. Ut mi sem, viverra imperdiet elementum ut, congue sed metus. Quisque vel egestas est. Maecenas tincidunt tortor sit amet ex tempus rutrum. Suspendisse vitae mollis velit. Aenean non libero semper, porttitor lectus in, commodo quam. Duis quam elit, faucibus eu tincidunt at, placerat in nunc. Aliquam erat volutpat. Mauris sit amet diam nisl. Aliquam tortor purus, pellentesque nec bibendum sed, sagittis nec dolor. Pellentesque sollicitudin odio nec ipsum interdum finibus. Phasellus egestas ligula vitae enim convallis ultrices. Integer molestie, orci quis sagittis maximus, ipsum tortor ultricies nibh, nec convallis neque leo ut nunc. Nulla pulvinar lobortis felis ut pretium. Suspendisse rutrum velit congue urna tincidunt venenatis. Phasellus ante nisi, facilisis at commodo quis, commodo at dui. Duis vel ligula quis enim accumsan tincidunt. Nullam accumsan efficitur velit, id commodo risus sodales in. Nulla ut massa sed enim fermentum consequat. Integer massa tortor, tincidunt eget mollis et, congue id mi. Fusce nunc sem, hendrerit sed pellentesque a, eleifend at leo. Etiam convallis purus vehicula turpis sagittis, vitae imperdiet nisi egestas. Quisque vitae sodales mauris. Mauris vulputate tincidunt velit. Phasellus elit sem, pretium pulvinar ipsum tempus, tristique venenatis leo. Pellentesque congue, nulla tempus feugiat vestibulum, erat leo sollicitudin orci, et tempus lacus metus ac nunc. Donec quis ipsum a leo facilisis placerat et non leo. Cras magna neque, sodales in finibus a, fermentum vel est. Maecenas sit amet imperdiet justo. In sit amet dolor ullamcorper, mattis elit ut, maximus quam. Aliquam efficitur mi at tempus tristique. Donec luctus sed purus id molestie. Curabitur sollicitudin diam eu turpis suscipit, sed hendrerit arcu bibendum. Ut vel risus a leo consectetur pharetra. Integer porta elit id ante aliquet tempus. Maecenas mollis massa magna, ut fermentum elit pharetra id. Sed congue ut mauris in volutpat. Suspendisse tempus odio in hendrerit condimentum. Nullam congue justo at dolor vulputate rutrum. Nulla sapien felis, imperdiet a pretium nec, pellentesque at dolor. Nulla egestas sit amet nulla at varius. Duis massa quam, dignissim ac maximus sed, mattis eget nulla. Duis sagittis odio sit amet aliquam euismod. Quisque augue odio, rhoncus vitae posuere quis, interdum non ligula. Sed.";

        String[] words = input.split(" ");
        Map<String, Integer> wordsCountMap = new HashMap<>();

        for (String word : words) {
            word = word.replace(",", "").replace(".", "").toLowerCase();

            if (wordsCountMap.containsKey(word)) {
                wordsCountMap.put(word, wordsCountMap.get(word) + 1);
            } else {
                wordsCountMap.put(word, 1);
            }
        }

        System.out.println(wordsCountMap);
    }
}
