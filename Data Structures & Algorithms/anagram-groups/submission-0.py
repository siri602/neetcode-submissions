class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        res = defaultdict(list)  # Dictionary where each value is a list

        for s in strs:
            count = [0] * 26  # Count of each letter (a to z)
            for c in s:
                count[ord(c) - ord("a")] += 1  # Increment the count for character c

            res[tuple(count)].append(s)  # Use tuple(count) as a key (immutable)

        return list(res.values())  # Return all groups of anagrams

