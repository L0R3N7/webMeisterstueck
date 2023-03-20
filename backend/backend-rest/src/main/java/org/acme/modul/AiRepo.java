package org.acme.modul;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class AiRepo {

    String jokes[] = {"It just occurred to me that the opposite of Artificial Intelligence is …\nReal Stupid.",
            "I hear they’ve made a new artificially intelligent Oreo?\nIt’s one smart cookie.",
            "A man creates the smartest AI and presents it to the UN, boasting it can solve any problem\n" +
                    "“Oh yeah?” Said the president of the United States. “Ok, how do we solve poverty?”\n" +
                    "“Calculating,” said the AI, moments later printing out a sheet of paper for the UN to read.\n" +
                    "Leaders from all over the world applied the proposals on the paper and in a month everyone starts living a better lives.\n" +
                    "Impressed, they called for the AI’s assistance again and asked, “How do we create world peace?”\n" +
                    "“Calculating,” said the AI and same as before printed a sheet of paper.\n" +
                    "Leaders applied the writings, and in a month all wars and conflicts stopped. Everybody hates guns now and the world is full of love.\n" +
                    "On the next UN gathering, curious about the purpose of life, they asked the AI, “Is there a God?”\n" +
                    "“Calculating,” said the AI. This time though it didn’t give a response immediately.\n" +
                    "In fact it took a whole day of processing before finally printing out a paper saying, “Insufficient resources, need more for the computation!”\n" +
                    "“Okay, we’ll help out!” Said the leaders of America.\n" +
                    "And they provided the AI with all of the advanced tech America can offer. Then they asked the question again.\n" +
                    "“Calculating,” responded the AI.\n" +
                    "But still, it responded, “Insufficient resources. Still need more for computation!”\n" +
                    "“Ok, we’ll also pitch in!” Said the other leaders of the world, providing their tech and networks to the AI.\n" +
                    "After the upgrade, the world leaders asked again to the AI, “Is there a God?”\n" +
                    "The AI responded, “There is now.”",
            "What do you get when you cross a wall unit with artificial intelligence?\nShelf-awareness.",
            "When the first device with AI takes a picture of itself…\nIt’ll be selfie aware."
    };

    public String getRandomAiJoke(){
        return jokes[(int)(Math.random() * jokes.length)];
    }
}
