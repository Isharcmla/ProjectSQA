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
import java.lang.String;
import java.lang.Object;

public class CSVFormat_isEscapeCharacterSet_26689031663 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5704;
     Object term29876;

    public CSVFormat_isEscapeCharacterSet_26689031663() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term5706 = new Character('G');
        Class<? extends Object> term29906 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term29905 = ((Class) term29906).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term29905).setAccessible(true);
        Object enum77 = ((Field) term29905).get((Object) null);
        Character term5723 = new Character('Y');
        Character term5725 = new Character('S');
        term5704 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term5754 = (Object[]) newArray("java.lang.String", 8);
        setCharField(term5704, term5704.getClass(), "delimiter", 'j');
        setField(term5704, term5704.getClass(), "quoteCharacter", term5706);
        setField(term5704, term5704.getClass(), "quoteMode", enum77);
        setField(term5704, term5704.getClass(), "commentMarker", term5723);
        setField(term5704, term5704.getClass(), "escapeCharacter", term5725);
        setBooleanField(term5704, term5704.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term5704, term5704.getClass(), "allowMissingColumnNames", false);
        setBooleanField(term5704, term5704.getClass(), "ignoreEmptyLines", false);
        setField(term5704, term5704.getClass(), "recordSeparator", "JqXGgAhZPl");
        setField(term5704, term5704.getClass(), "nullString", "jiKYgYHqIS");
        setElement(term5754, 0, "DfISiziTgG");
        setElement(term5754, 1, "XqgfKFvPSD");
        setElement(term5754, 2, "JiVRgTZvKc");
        setElement(term5754, 3, "XPKmummaqg");
        setElement(term5754, 4, "BKLfkLiZTH");
        setElement(term5754, 5, "SPpkrGcPRr");
        setElement(term5754, 6, "sEccwbJKYE");
        setElement(term5754, 7, "AWRooQKkdW");
        setField(term5704, term5704.getClass(), "header", term5754);
        setBooleanField(term5704, term5704.getClass(), "skipHeaderRecord", false);
        Character term29877 = new Character('G');
        Class<? extends Object> term30206 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term30205 = ((Class) term30206).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term30205).setAccessible(true);
        Object enum78 = ((Field) term30205).get((Object) null);
        Character term29881 = new Character('Y');
        Character term29882 = new Character('S');
        term29876 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term29887 = (Object[]) newArray("java.lang.String", 8);
        setCharField(term29876, term29876.getClass(), "delimiter", 'j');
        setField(term29876, term29876.getClass(), "quoteCharacter", term29877);
        setField(term29876, term29876.getClass(), "quoteMode", enum78);
        setField(term29876, term29876.getClass(), "commentMarker", term29881);
        setField(term29876, term29876.getClass(), "escapeCharacter", term29882);
        setBooleanField(term29876, term29876.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term29876, term29876.getClass(), "allowMissingColumnNames", false);
        setBooleanField(term29876, term29876.getClass(), "ignoreEmptyLines", false);
        setField(term29876, term29876.getClass(), "recordSeparator", "JqXGgAhZPl");
        setField(term29876, term29876.getClass(), "nullString", "jiKYgYHqIS");
        setElement(term29887, 0, "DfISiziTgG");
        setElement(term29887, 1, "XqgfKFvPSD");
        setElement(term29887, 2, "JiVRgTZvKc");
        setElement(term29887, 3, "XPKmummaqg");
        setElement(term29887, 4, "BKLfkLiZTH");
        setElement(term29887, 5, "SPpkrGcPRr");
        setElement(term29887, 6, "sEccwbJKYE");
        setElement(term29887, 7, "AWRooQKkdW");
        setField(term29876, term29876.getClass(), "header", term29887);
        setBooleanField(term29876, term29876.getClass(), "skipHeaderRecord", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isEscapeCharacterSet", argTypes, term5704, args);
        assertTrue(recursiveEquals(term5704, term29876));
        assertTrue(recursiveEquals(retValue, true));
    }

};


