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

public class CSVFormat_withNullString_522006170104 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20198;
     Object term86605;
     Object term86230;

    public CSVFormat_withNullString_522006170104() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term20200 = new Character('S');
        Class<? extends Object> term86633 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term86632 = ((Class) term86633).getDeclaredField((String) "MINIMAL");
        ((Field) term86632).setAccessible(true);
        Object enum154 = ((Field) term86632).get((Object) null);
        Character term20213 = new Character('Q');
        Character term20215 = new Character('Y');
        term20198 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term20244 = (Object[]) newArray("java.lang.String", 1);
        Object[] term20257 = (Object[]) newArray("java.lang.String", 5);
        setCharField(term20198, term20198.getClass(), "delimiter", 'b');
        setField(term20198, term20198.getClass(), "quoteCharacter", term20200);
        setField(term20198, term20198.getClass(), "quoteMode", enum154);
        setField(term20198, term20198.getClass(), "commentMarker", term20213);
        setField(term20198, term20198.getClass(), "escapeCharacter", term20215);
        setBooleanField(term20198, term20198.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term20198, term20198.getClass(), "allowMissingColumnNames", true);
        setBooleanField(term20198, term20198.getClass(), "ignoreEmptyLines", false);
        setField(term20198, term20198.getClass(), "recordSeparator", "jiCGTTzKGB");
        setField(term20198, term20198.getClass(), "nullString", "MqICFYzDJj");
        setElement(term20244, 0, "YgQvdcBQKw");
        setField(term20198, term20198.getClass(), "header", term20244);
        setElement(term20257, 0, "FiYYLuailz");
        setElement(term20257, 1, "XebAeSnCKZ");
        setElement(term20257, 2, "GeddnXjHGy");
        setElement(term20257, 3, "vLTbaoAxBm");
        setElement(term20257, 4, "BXTjEyEZxD");
        setField(term20198, term20198.getClass(), "headerComments", term20257);
        setBooleanField(term20198, term20198.getClass(), "skipHeaderRecord", false);
        setBooleanField(term20198, term20198.getClass(), "ignoreHeaderCase", true);
        Character term86606 = new Character('S');
        Class<? extends Object> term86911 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term86910 = ((Class) term86911).getDeclaredField((String) "MINIMAL");
        ((Field) term86910).setAccessible(true);
        Object enum155 = ((Field) term86910).get((Object) null);
        Character term86610 = new Character('Q');
        Character term86611 = new Character('Y');
        term86605 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term86616 = (Object[]) newArray("java.lang.String", 1);
        Object[] term86619 = (Object[]) newArray("java.lang.String", 5);
        setCharField(term86605, term86605.getClass(), "delimiter", 'b');
        setField(term86605, term86605.getClass(), "quoteCharacter", term86606);
        setField(term86605, term86605.getClass(), "quoteMode", enum155);
        setField(term86605, term86605.getClass(), "commentMarker", term86610);
        setField(term86605, term86605.getClass(), "escapeCharacter", term86611);
        setBooleanField(term86605, term86605.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term86605, term86605.getClass(), "allowMissingColumnNames", true);
        setBooleanField(term86605, term86605.getClass(), "ignoreEmptyLines", false);
        setField(term86605, term86605.getClass(), "recordSeparator", "jiCGTTzKGB");
        setField(term86605, term86605.getClass(), "nullString", "MqICFYzDJj");
        setElement(term86616, 0, "YgQvdcBQKw");
        setField(term86605, term86605.getClass(), "header", term86616);
        setElement(term86619, 0, "FiYYLuailz");
        setElement(term86619, 1, "XebAeSnCKZ");
        setElement(term86619, 2, "GeddnXjHGy");
        setElement(term86619, 3, "vLTbaoAxBm");
        setElement(term86619, 4, "BXTjEyEZxD");
        setField(term86605, term86605.getClass(), "headerComments", term86619);
        setBooleanField(term86605, term86605.getClass(), "skipHeaderRecord", false);
        setBooleanField(term86605, term86605.getClass(), "ignoreHeaderCase", true);
        Character term86232 = new Character('S');
        Class<? extends Object> term87189 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term87188 = ((Class) term87189).getDeclaredField((String) "MINIMAL");
        ((Field) term87188).setAccessible(true);
        Object enum156 = ((Field) term87188).get((Object) null);
        Character term86245 = new Character('Q');
        Character term86247 = new Character('Y');
        term86230 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term86276 = (Object[]) newArray("java.lang.String", 1);
        Object[] term86289 = (Object[]) newArray("java.lang.String", 5);
        setCharField(term86230, term86230.getClass(), "delimiter", 'b');
        setField(term86230, term86230.getClass(), "quoteCharacter", term86232);
        setField(term86230, term86230.getClass(), "quoteMode", enum156);
        setField(term86230, term86230.getClass(), "commentMarker", term86245);
        setField(term86230, term86230.getClass(), "escapeCharacter", term86247);
        setBooleanField(term86230, term86230.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term86230, term86230.getClass(), "allowMissingColumnNames", true);
        setBooleanField(term86230, term86230.getClass(), "ignoreEmptyLines", false);
        setField(term86230, term86230.getClass(), "recordSeparator", "jiCGTTzKGB");
        setField(term86230, term86230.getClass(), "nullString", "oKhVzOKUFW");
        setElement(term86276, 0, "YgQvdcBQKw");
        setField(term86230, term86230.getClass(), "header", term86276);
        setElement(term86289, 0, "FiYYLuailz");
        setElement(term86289, 1, "XebAeSnCKZ");
        setElement(term86289, 2, "GeddnXjHGy");
        setElement(term86289, 3, "vLTbaoAxBm");
        setElement(term86289, 4, "BXTjEyEZxD");
        setField(term86230, term86230.getClass(), "headerComments", term86289);
        setBooleanField(term86230, term86230.getClass(), "skipHeaderRecord", false);
        setBooleanField(term86230, term86230.getClass(), "ignoreHeaderCase", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "oKhVzOKUFW";
        Object retValue = callMethod(klass, "withNullString", argTypes, term20198, args);
        assertTrue(recursiveEquals(term20198, term86605));
        assertTrue(recursiveEquals(retValue, term86230));
    }

};


