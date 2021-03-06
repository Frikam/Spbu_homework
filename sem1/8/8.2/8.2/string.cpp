#include <iostream>

#include <string.h>

#include "string.hpp"

using namespace std;

String *createString(char word[])
{
    String *newString = new String {};
    newString->length = strlen(word);
    newString->word = new char[newString->length];
    
    for (int i = 0; i < newString->length; i++)
    {
        newString->word[i] = word[i];
    }
    
    return newString;
}

String *clone(String *string)
{
    String *clonedWord = createString(string->word);
    return clonedWord;
}

bool areEqual(String *firstWord, String *secondWord)
{
    if (firstWord->length == secondWord->length)
    {
        for (int i = 0; i < firstWord->length; i++)
        {
            if (firstWord->word[i] != secondWord->word[i])
            {
                return false;
            }
        }
    }
    else
    {
        return false;
    }
    
    return true;
}

int getSize(String *string)
{
    return string->length;
}

bool isEmpty(String *string)
{
    return string->length == 0;
}

char *representation(String *string)
{
    char *line = new char[string->length];
    
    for (int i = 0; i < string->length; i++)
    {
        line[i] = string->word[i];
    }
    
    return line;
}

void concatenate(String *firstWord, String *secondWord)
{
    firstWord->length = firstWord->length + secondWord->length;
    char *newWord = new char[firstWord->length];
    
    for (int i = 0; i < firstWord->length - secondWord->length; i++)
    {
        newWord[i] = firstWord->word[i];
    }
    
    for (int i = 0; i < secondWord->length; i++)
    {
        newWord[i + firstWord->length - secondWord->length] = secondWord->word[i];
    }
    
    delete[] firstWord->word;
    firstWord->word = newWord;
}

String *substring(String *string, int index)
{
    String *word = new String {};
    word->length = index + 1;
    word->word = new char [index + 1];
    for (int i = 0; i <= index; i++)
    {
        word->word[i] = string->word[i];
    }
    
    return word;
}

void deleteString(String *string)
{
    delete[] string->word;
    delete string;
}
