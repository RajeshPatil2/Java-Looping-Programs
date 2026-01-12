class Chat
{

    while (true) 
    {
            // Prompt the user for input
            String userInput = getUserInput();

            // Send the user's input to ChatGPT and receive a response
            String aiResponse = sendToChatGPT(userInput);

            // Process and display the AI response
            processAndDisplayResponse(aiResponse);

        // Check for an exit condition (e.g., the user types "exit")
        if (userInput.equalsIgnoreCase("exit")) 
        {
            break;
        }
    }
}
