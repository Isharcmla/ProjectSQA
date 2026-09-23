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

public class CSVFormat_getIgnoreSurroundingSpaces_97078270555 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3136;
     Object term24994;

    public CSVFormat_getIgnoreSurroundingSpaces_97078270555() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term3138 = new Character('j');
        Class<? extends Object> term25019 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term25018 = ((Class) term25019).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term25018).setAccessible(true);
        Object enum60 = ((Field) term25018).get((Object) null);
        Character term3155 = new Character('J');
        Character term3157 = new Character('C');
        term3136 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term3186 = (Object[]) newArray("java.lang.String", 6);
        setCharField(term3136, term3136.getClass(), "delimiter", 's');
        setField(term3136, term3136.getClass(), "quoteCharacter", term3138);
        setField(term3136, term3136.getClass(), "quoteMode", enum60);
        setField(term3136, term3136.getClass(), "commentMarker", term3155);
        setField(term3136, term3136.getClass(), "escapeCharacter", term3157);
        setBooleanField(term3136, term3136.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term3136, term3136.getClass(), "allowMissingColumnNames", true);
        setBooleanField(term3136, term3136.getClass(), "ignoreEmptyLines", true);
        setField(term3136, term3136.getClass(), "recordSeparator", "JDswTTCZHV");
        setField(term3136, term3136.getClass(), "nullString", "onpbIeEKoi");
        setElement(term3186, 0, "YRHGsAkhxb");
        setElement(term3186, 1, "ffYhPOzlUs");
        setElement(term3186, 2, "MLqYREekMl");
        setElement(term3186, 3, "ytSBIKXogI");
        setElement(term3186, 4, "nHXjMycHlU");
        setElement(term3186, 5, "ieCtQFdkii");
        setField(term3136, term3136.getClass(), "header", term3186);
        setBooleanField(term3136, term3136.getClass(), "skipHeaderRecord", false);
        Character term24995 = new Character('j');
        Class<? extends Object> term25299 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term25298 = ((Class) term25299).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term25298).setAccessible(true);
        Object enum61 = ((Field) term25298).get((Object) null);
        Character term24999 = new Character('J');
        Character term25000 = new Character('C');
        term24994 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term25005 = (Object[]) newArray("java.lang.String", 6);
        setCharField(term24994, term24994.getClass(), "delimiter", 's');
        setField(term24994, term24994.getClass(), "quoteCharacter", term24995);
        setField(term24994, term24994.getClass(), "quoteMode", enum61);
        setField(term24994, term24994.getClass(), "commentMarker", term24999);
        setField(term24994, term24994.getClass(), "escapeCharacter", term25000);
        setBooleanField(term24994, term24994.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term24994, term24994.getClass(), "allowMissingColumnNames", true);
        setBooleanField(term24994, term24994.getClass(), "ignoreEmptyLines", true);
        setField(term24994, term24994.getClass(), "recordSeparator", "JDswTTCZHV");
        setField(term24994, term24994.getClass(), "nullString", "onpbIeEKoi");
        setElement(term25005, 0, "YRHGsAkhxb");
        setElement(term25005, 1, "ffYhPOzlUs");
        setElement(term25005, 2, "MLqYREekMl");
        setElement(term25005, 3, "ytSBIKXogI");
        setElement(term25005, 4, "nHXjMycHlU");
        setElement(term25005, 5, "ieCtQFdkii");
        setField(term24994, term24994.getClass(), "header", term25005);
        setBooleanField(term24994, term24994.getClass(), "skipHeaderRecord", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getIgnoreSurroundingSpaces", argTypes, term3136, args);
        assertTrue(recursiveEquals(term3136, term24994));
    }

};


