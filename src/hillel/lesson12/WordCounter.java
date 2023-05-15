package hillel.lesson12;

import java.util.HashMap;

public class WordCounter {
    public static void main(String[] args) {
        String input = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer quis elementum mauris. Suspendisse potenti. Donec turpis velit, pretium vitae mi quis, cursus faucibus felis. Donec vestibulum est at scelerisque rhoncus. Morbi cursus nulla at odio malesuada, in tincidunt libero venenatis. Sed suscipit sapien non erat finibus, gravida maximus ipsum vehicula. Mauris eget leo enim. Vestibulum tempor sollicitudin libero, in porttitor eros tincidunt at. Sed fermentum lacus aliquam gravida suscipit.\n" +
                "\n" +
                "Suspendisse potenti. Quisque pretium venenatis eros sed feugiat. Mauris quis arcu dui. Sed non massa sit amet magna aliquet viverra quis ut sem. Curabitur aliquam quis augue eget ultrices. Duis ullamcorper, est quis tempus pharetra, mauris eros euismod arcu, ut consequat sapien nibh sit amet nulla. Morbi scelerisque erat sed velit tincidunt, quis imperdiet lectus posuere. Nullam porta a mi commodo tristique. Nulla egestas molestie mattis. Suspendisse potenti. Maecenas non nulla et orci consectetur varius sed ac ligula. Suspendisse dolor orci, varius vel semper eu, scelerisque eleifend odio. Aenean porta mollis eleifend. Sed egestas sit amet sapien a egestas. Suspendisse scelerisque, dolor sed egestas tempus, urna tortor vulputate purus, ac gravida lorem dui eget justo. Vivamus lorem erat, tristique quis tempor sed, pharetra vitae purus.\n" +
                "\n" +
                "Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Nulla facilisi. Phasellus aliquam, ante sed tempor elementum, massa nibh cursus tortor, et finibus ex urna ac massa. Aliquam vestibulum purus et dolor rutrum vehicula. Aenean lectus nulla, vehicula congue ullamcorper vitae, congue in dui. Integer congue lorem a porttitor mattis. Etiam egestas sem feugiat, placerat diam eu, ullamcorper tortor. Proin sed purus cursus justo faucibus rutrum. Aenean mollis purus non tempor scelerisque.\n" +
                "\n" +
                "Aenean vel congue diam. Donec non condimentum tellus. Mauris non felis a erat semper interdum id non elit. Donec felis velit, laoreet et aliquam in, imperdiet eget ipsum. Integer sit amet urna sapien. Aliquam tempus, libero sed tristique facilisis, mauris neque feugiat augue, et tristique augue nunc id nulla. Nunc tortor elit, porta non fermentum non, fermentum non ipsum. Nullam at ullamcorper nibh. Cras aliquet lacus enim. Nulla scelerisque ipsum a nunc accumsan, eleifend facilisis nunc sodales.\n" +
                "\n" +
                "Fusce eu varius odio, vitae mollis leo. Nullam nec mauris eget risus imperdiet cursus. Vestibulum dapibus turpis pellentesque ligula tincidunt, a pulvinar velit volutpat. Curabitur in elit et augue mollis faucibus a sit amet augue. Sed vel velit vulputate, malesuada enim vitae, suscipit tellus. Vestibulum ipsum urna, ornare in semper vel, placerat non lacus. Donec auctor felis vitae metus fermentum iaculis. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Interdum et malesuada fames ac ante ipsum primis in faucibus. Donec rutrum velit in felis cursus viverra. In finibus, libero ac finibus pulvinar, velit est hendrerit nunc, et ornare eros turpis at magna. Nunc sed est non felis pellentesque pulvinar. Vivamus aliquam tristique nunc, fermentum feugiat est sodales non. Curabitur fermentum ut mi ut dignissim. Nam nec ligula quam."
                String[] words = input.split("");
        Map<String, Integer> map = new HashMap<>();
        for (String word: words) {
            word = word.replace(",","").replace()
        }

    }

}
