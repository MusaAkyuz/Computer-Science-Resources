class Solution(object):
    def longestPalindrome(self, words):
        """
        :type words: List[str]
        :rtype: int
        """
        
        """
        Mission
        You are given an array of strings words. Each element of words consists of two 
        lowercase English letters.

        Create the longest possible palindrome by selecting some elements from words and 
        concatenating them in any order. Each element can be selected at most once.

        Return the length of the longest palindrome that you can create. If it is impossible to 
        create any palindrome, return 0.

        A palindrome is a string that reads the same forward and backward.
        """

        # converting hashmap
        count = Counter(words)
        leftPol = 0
        centerPol = False

        for word, num in count.items():
            # keys is word
            # values is num

            # check polindrome words
            if word[0] == word[1]:
                # if num of polindrome word is even
                # we can write polindrome wtih them
                if num % 2 == 0:
                    leftPol += num
                # for example there are 3 "bb" in words
                # adds 2 to answer and 1 about central True
                # after we will check
                else:
                    leftPol += num - 1
                    centerPol = True
            elif word[0] < word[1]:
                leftPol += min(num, count[word[1] + word[0]]) * 2
        
        if centerPol:
            leftPol += 1
        return leftPol * 2

                 



        

            
        
