package org.apache.commons.csv;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static org.apache.commons.csv.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.csv.EqualityUtils.*;
import java.lang.Character;
import java.lang.Object;
import java.lang.String;

public class CSVFormat_toStringArray_253801929112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16255;
     Object term16383;
     Object term68791;
     Object term68816;
     Object term68549;

    public CSVFormat_toStringArray_253801929112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term16257 = new Character('I');
        Character term16260 = new Character('Y');
        Character term16351 = new Character('n');
        Class<? extends Object> term68892 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term68891 = ((Class) term68892).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term68891).setAccessible(true);
        Object enum140 = ((Field) term68891).get((Object) null);
        term16255 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term16262 = (Object[]) newArray("java.lang.String", 5);
        Object[] term16323 = (Object[]) newArray("java.lang.String", 1);
        setBooleanField(term16255, term16255.getClass(), "allowMissingColumnNames", false);
        setField(term16255, term16255.getClass(), "commentMarker", term16257);
        setCharField(term16255, term16255.getClass(), "delimiter", 'n');
        setField(term16255, term16255.getClass(), "escapeCharacter", term16260);
        setElement(term16262, 0, "zLMTXDQHYH");
        setElement(term16262, 1, "PqywFWJlpE");
        setElement(term16262, 2, "OzXRsFGTIp");
        setElement(term16262, 3, "TjWpyghUWN");
        setElement(term16262, 4, "dkZFDZxcde");
        setField(term16255, term16255.getClass(), "header", term16262);
        setElement(term16323, 0, "WXcZEtUKlI");
        setField(term16255, term16255.getClass(), "headerComments", term16323);
        setBooleanField(term16255, term16255.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term16255, term16255.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term16255, term16255.getClass(), "ignoreSurroundingSpaces", false);
        setField(term16255, term16255.getClass(), "nullString", "IkpjUOuWQU");
        setField(term16255, term16255.getClass(), "quoteCharacter", term16351);
        setField(term16255, term16255.getClass(), "quoteMode", enum140);
        setField(term16255, term16255.getClass(), "recordSeparator", "boSSpezHeU");
        setBooleanField(term16255, term16255.getClass(), "skipHeaderRecord", false);
        setBooleanField(term16255, term16255.getClass(), "trailingDelimiter", false);
        setBooleanField(term16255, term16255.getClass(), "trim", true);
        term16383 = (Object[]) newArray("java.lang.Object", 4);
        Object term16384 = newInstance(Class.forName("java.lang.Object"));
        Object term16385 = newInstance(Class.forName("java.lang.Object"));
        Object term16386 = newInstance(Class.forName("java.lang.Object"));
        Object term16387 = newInstance(Class.forName("java.lang.Object"));
        setElement(term16383, 0, term16384);
        setElement(term16383, 1, term16385);
        setElement(term16383, 2, term16386);
        setElement(term16383, 3, term16387);
        Character term68792 = new Character('I');
        Character term68793 = new Character('Y');
        Character term68810 = new Character('n');
        Class<? extends Object> term69172 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term69171 = ((Class) term69172).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term69171).setAccessible(true);
        Object enum141 = ((Field) term69171).get((Object) null);
        term68791 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term68794 = (Object[]) newArray("java.lang.String", 5);
        Object[] term68805 = (Object[]) newArray("java.lang.String", 1);
        setBooleanField(term68791, term68791.getClass(), "allowMissingColumnNames", false);
        setField(term68791, term68791.getClass(), "commentMarker", term68792);
        setCharField(term68791, term68791.getClass(), "delimiter", 'n');
        setField(term68791, term68791.getClass(), "escapeCharacter", term68793);
        setElement(term68794, 0, "zLMTXDQHYH");
        setElement(term68794, 1, "PqywFWJlpE");
        setElement(term68794, 2, "OzXRsFGTIp");
        setElement(term68794, 3, "TjWpyghUWN");
        setElement(term68794, 4, "dkZFDZxcde");
        setField(term68791, term68791.getClass(), "header", term68794);
        setElement(term68805, 0, "WXcZEtUKlI");
        setField(term68791, term68791.getClass(), "headerComments", term68805);
        setBooleanField(term68791, term68791.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term68791, term68791.getClass(), "ignoreHeaderCase", false);
        setBooleanField(term68791, term68791.getClass(), "ignoreSurroundingSpaces", false);
        setField(term68791, term68791.getClass(), "nullString", "IkpjUOuWQU");
        setField(term68791, term68791.getClass(), "quoteCharacter", term68810);
        setField(term68791, term68791.getClass(), "quoteMode", enum141);
        setField(term68791, term68791.getClass(), "recordSeparator", "boSSpezHeU");
        setBooleanField(term68791, term68791.getClass(), "skipHeaderRecord", false);
        setBooleanField(term68791, term68791.getClass(), "trailingDelimiter", false);
        setBooleanField(term68791, term68791.getClass(), "trim", true);
        term68816 = (Object[]) newArray("java.lang.Object", 4);
        Object term68817 = newInstance(Class.forName("java.lang.Object"));
        Object term68818 = newInstance(Class.forName("java.lang.Object"));
        Object term68819 = newInstance(Class.forName("java.lang.Object"));
        Object term68820 = newInstance(Class.forName("java.lang.Object"));
        setElement(term68816, 0, term68817);
        setElement(term68816, 1, term68818);
        setElement(term68816, 2, term68819);
        setElement(term68816, 3, term68820);
        term68549 = (Object[]) newArray("java.lang.String", 4);
        setElement(term68549, 0, "java.lang.Object@2a7a4f39");
        setElement(term68549, 1, "java.lang.Object@53158bcc");
        setElement(term68549, 2, "java.lang.Object@42094269");
        setElement(term68549, 3, "java.lang.Object@19b9bee1");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term16383;
        Object retValue = callMethod(klass, "toStringArray", argTypes, term16255, args);
        assertTrue(recursiveEquals(term16255, term68791));
        assertTrue(recursiveEquals(term16383, term68816));
        assertTrue(recursiveEquals(retValue, term68549));
    }

};


