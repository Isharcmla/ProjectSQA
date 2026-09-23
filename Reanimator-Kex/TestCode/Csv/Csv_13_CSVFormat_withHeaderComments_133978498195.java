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

public class CSVFormat_withHeaderComments_133978498195 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16104;
     Object term16218;
     Object term73201;
     Object term73224;
     Object term72923;

    public CSVFormat_withHeaderComments_133978498195() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term16106 = new Character('B');
        Class<? extends Object> term73227 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term73226 = ((Class) term73227).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term73226).setAccessible(true);
        Object enum129 = ((Field) term73226).get((Object) null);
        Character term16123 = new Character('a');
        Character term16125 = new Character('J');
        term16104 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term16154 = (Object[]) newArray("java.lang.String", 1);
        Object[] term16167 = (Object[]) newArray("java.lang.String", 4);
        setCharField(term16104, term16104.getClass(), "delimiter", 'W');
        setField(term16104, term16104.getClass(), "quoteCharacter", term16106);
        setField(term16104, term16104.getClass(), "quoteMode", enum129);
        setField(term16104, term16104.getClass(), "commentMarker", term16123);
        setField(term16104, term16104.getClass(), "escapeCharacter", term16125);
        setBooleanField(term16104, term16104.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term16104, term16104.getClass(), "allowMissingColumnNames", true);
        setBooleanField(term16104, term16104.getClass(), "ignoreEmptyLines", true);
        setField(term16104, term16104.getClass(), "recordSeparator", "WXcZEtUKlI");
        setField(term16104, term16104.getClass(), "nullString", "IkpjUOuWQU");
        setElement(term16154, 0, "boSSpezHeU");
        setField(term16104, term16104.getClass(), "header", term16154);
        setElement(term16167, 0, "OUeBWNTQDh");
        setElement(term16167, 1, "gltJarNuUk");
        setElement(term16167, 2, "ZwZIDwYcSW");
        setElement(term16167, 3, "sOdkipUKRu");
        setField(term16104, term16104.getClass(), "headerComments", term16167);
        setBooleanField(term16104, term16104.getClass(), "skipHeaderRecord", false);
        setBooleanField(term16104, term16104.getClass(), "ignoreHeaderCase", true);
        term16218 = (Object[]) newArray("java.lang.Object", 1);
        Object term16219 = newInstance(Class.forName("java.lang.Object"));
        setElement(term16218, 0, term16219);
        Character term73202 = new Character('B');
        Class<? extends Object> term73497 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term73496 = ((Class) term73497).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term73496).setAccessible(true);
        Object enum130 = ((Field) term73496).get((Object) null);
        Character term73206 = new Character('a');
        Character term73207 = new Character('J');
        term73201 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term73212 = (Object[]) newArray("java.lang.String", 1);
        Object[] term73215 = (Object[]) newArray("java.lang.String", 4);
        setCharField(term73201, term73201.getClass(), "delimiter", 'W');
        setField(term73201, term73201.getClass(), "quoteCharacter", term73202);
        setField(term73201, term73201.getClass(), "quoteMode", enum130);
        setField(term73201, term73201.getClass(), "commentMarker", term73206);
        setField(term73201, term73201.getClass(), "escapeCharacter", term73207);
        setBooleanField(term73201, term73201.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term73201, term73201.getClass(), "allowMissingColumnNames", true);
        setBooleanField(term73201, term73201.getClass(), "ignoreEmptyLines", true);
        setField(term73201, term73201.getClass(), "recordSeparator", "WXcZEtUKlI");
        setField(term73201, term73201.getClass(), "nullString", "IkpjUOuWQU");
        setElement(term73212, 0, "boSSpezHeU");
        setField(term73201, term73201.getClass(), "header", term73212);
        setElement(term73215, 0, "OUeBWNTQDh");
        setElement(term73215, 1, "gltJarNuUk");
        setElement(term73215, 2, "ZwZIDwYcSW");
        setElement(term73215, 3, "sOdkipUKRu");
        setField(term73201, term73201.getClass(), "headerComments", term73215);
        setBooleanField(term73201, term73201.getClass(), "skipHeaderRecord", false);
        setBooleanField(term73201, term73201.getClass(), "ignoreHeaderCase", true);
        term73224 = (Object[]) newArray("java.lang.Object", 1);
        Object term73225 = newInstance(Class.forName("java.lang.Object"));
        setElement(term73224, 0, term73225);
        Character term72925 = new Character('B');
        Class<? extends Object> term73767 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term73766 = ((Class) term73767).getDeclaredField((String) "NON_NUMERIC");
        ((Field) term73766).setAccessible(true);
        Object enum131 = ((Field) term73766).get((Object) null);
        Character term72942 = new Character('a');
        Character term72944 = new Character('J');
        term72923 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term72973 = (Object[]) newArray("java.lang.String", 1);
        Object[] term72986 = (Object[]) newArray("java.lang.String", 1);
        setCharField(term72923, term72923.getClass(), "delimiter", 'W');
        setField(term72923, term72923.getClass(), "quoteCharacter", term72925);
        setField(term72923, term72923.getClass(), "quoteMode", enum131);
        setField(term72923, term72923.getClass(), "commentMarker", term72942);
        setField(term72923, term72923.getClass(), "escapeCharacter", term72944);
        setBooleanField(term72923, term72923.getClass(), "ignoreSurroundingSpaces", true);
        setBooleanField(term72923, term72923.getClass(), "allowMissingColumnNames", true);
        setBooleanField(term72923, term72923.getClass(), "ignoreEmptyLines", true);
        setField(term72923, term72923.getClass(), "recordSeparator", "WXcZEtUKlI");
        setField(term72923, term72923.getClass(), "nullString", "IkpjUOuWQU");
        setElement(term72973, 0, "boSSpezHeU");
        setField(term72923, term72923.getClass(), "header", term72973);
        setElement(term72986, 0, "java.lang.Object@240d550");
        setField(term72923, term72923.getClass(), "headerComments", term72986);
        setBooleanField(term72923, term72923.getClass(), "skipHeaderRecord", false);
        setBooleanField(term72923, term72923.getClass(), "ignoreHeaderCase", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term16218;
        Object retValue = callMethod(klass, "withHeaderComments", argTypes, term16104, args);
        assertTrue(recursiveEquals(term16104, term73201));
        assertTrue(recursiveEquals(term16218, term73224));
        assertTrue(recursiveEquals(retValue, term72923));
    }

};


