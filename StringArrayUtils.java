 

/**
 * Created by Yang on 1/23/20.
 */

public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
        if(array.length==0) {
            return null;
        }
        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        if(array.length==0||array.length==1) {
            return null;
        }
        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        return array[array.length-1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        if(array.length==0||array.length == 1) {
            return null;
        }else {
            return array[array.length-2];
        }
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        for(String str: array) {
            if(str.equals(value)) {
                return true;
            }
        }
        return false;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        String[] reversedStr = new String[array.length];
    	// set pointer to the last
    	int pointer = array.length-1;
    	for(String str: array) {
    		reversedStr[pointer] = str;
    		pointer--;
    	}
        return reversedStr;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        int pointer = array.length-1;
    	for(String str: array) {
    		if(array[pointer] == str) {
    			pointer--;
    			continue;
    		}else {
    			return false;
			}
    	}
        return true;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
       	int sum = 0;
       	int map[] = new int[26];
    	for(String str:array) {
    		char[] characterArray = str.toLowerCase().toCharArray();
            
            for(char current : characterArray) {

                int asciiCode = (int) current;
                if (asciiCode >= 97 && asciiCode <= 122) {

                    if (map[122 - asciiCode] == 0) {

                        sum += 1;
                        map[122 - asciiCode] = 1;
                    }
                }
            }
    	}
    	return sum == 26;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int occurrence =0;
    	for(String str:array) {
    		if(str==value) {
    			occurrence++;
    		}
    	}
        return occurrence;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        // for only remove 1
    	int indexOfNew = 0;
    	String[] arrayNew = new String[array.length-1];
    	for(int i = 0; i<array.length;i++) {
    
    		if(array[i]==valueToRemove) {
    			continue;
    		}
    		arrayNew[indexOfNew] = array[i];
    		indexOfNew++;
    	}
    	
        return arrayNew;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
       int indexOfNew = 0;

		int lengthOfNew = 0;
		for (int i = 0; i < array.length; i++) {
			if (i == array.length - 1) {
				lengthOfNew++;
				break;
			}else if (array[i] == array[i + 1]) {
				continue;
			}
			
			lengthOfNew++;
		}
		
		String[] arrayNew = new String[lengthOfNew];
		for (int i = 0; i < array.length; i++) {

			if (i == array.length - 1) {
				arrayNew[indexOfNew] = array[i];
				
				break;
			}else if (array[i] == array[i + 1]) {
				continue;
			}
			arrayNew[indexOfNew] = array[i];
			indexOfNew++;
		}
		
		return arrayNew;
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        int indexOfNew = 0;
		int lengthOfNew = 0;
		
		for (int i = 0; i < array.length; i++) {
			if (i == array.length - 1) {
				lengthOfNew++;
				break;
			}else if (array[i] == array[i + 1]) {
				continue;
			}
			
			lengthOfNew++;
		}
		String[] arrayNew = new String[lengthOfNew];
		String strTemp ="";
		
		for (int i = 0; i < array.length; i++) {

			if (i == array.length - 1) {
				strTemp+=array[i];
				arrayNew[indexOfNew] = strTemp;
				
				break;
			}else if (array[i] == array[i + 1]) {
				strTemp+=array[i];
				continue;
			}
			strTemp+=array[i];
			arrayNew[indexOfNew] = strTemp;
			strTemp ="";
			indexOfNew++;
		}
		
		return arrayNew;
    }


}
