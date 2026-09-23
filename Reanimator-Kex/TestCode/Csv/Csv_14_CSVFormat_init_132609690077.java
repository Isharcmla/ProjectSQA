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
import java.lang.Boolean;

public class CSVFormat_init_132609690077 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29;
     Object term31;
     Object enum71;
     Object term40;
     Object term42;
     Object term44;
     Object term46;
     Object term72;
     Object term78;
     Object term127;
     Object term129;
     Object term131;
     Object term133;
     Object term135;
     Object term32469;
     Object term32500;
     Object term32506;
     Object enum73;
     Object term32510;
     Object term32511;
     Object term32516;

    public CSVFormat_init_132609690077() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29 = new Character('B');
        term31 = new Character('t');
        Class<? extends Object> term32526 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term32525 = ((Class) term32526).getDeclaredField((String) "ALL");
        ((Field) term32525).setAccessible(true);
        enum71 = ((Field) term32525).get((Object) null);
        term40 = new Character('n');
        term42 = new Character('Z');
        term44 = new Boolean(false);
        term46 = new Boolean(false);
        term72 = (Object[]) newArray("java.lang.Object", 5);
        Object term73 = newInstance(Class.forName("java.lang.Object"));
        Object term74 = newInstance(Class.forName("java.lang.Object"));
        Object term75 = newInstance(Class.forName("java.lang.Object"));
        Object term76 = newInstance(Class.forName("java.lang.Object"));
        Object term77 = newInstance(Class.forName("java.lang.Object"));
        setElement(term72, 0, term73);
        setElement(term72, 1, term74);
        setElement(term72, 2, term75);
        setElement(term72, 3, term76);
        setElement(term72, 4, term77);
        term78 = (Object[]) newArray("java.lang.String", 4);
        setElement(term78, 0, "xxtlPwDYFs");
        setElement(term78, 1, "jJCZpVmanW");
        setElement(term78, 2, "EGtDIRbSSb");
        setElement(term78, 3, "SzjVpOQTyS");
        term127 = new Boolean(false);
        term129 = new Boolean(false);
        term131 = new Boolean(true);
        term133 = new Boolean(true);
        term135 = new Boolean(true);
        Character term32470 = new Character('n');
        Character term32471 = new Character('Z');
        Character term32494 = new Character('t');
        Class<? extends Object> term32936 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term32935 = ((Class) term32936).getDeclaredField((String) "ALL");
        ((Field) term32935).setAccessible(true);
        Object enum72 = ((Field) term32935).get((Object) null);
        term32469 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term32472 = (Object[]) newArray("java.lang.String", 4);
        Object[] term32481 = (Object[]) newArray("java.lang.String", 5);
        setBooleanField(term32469, term32469.getClass(), "allowMissingColumnNames", false);
        setField(term32469, term32469.getClass(), "commentMarker", term32470);
        setCharField(term32469, term32469.getClass(), "delimiter", 'B');
        setField(term32469, term32469.getClass(), "escapeCharacter", term32471);
        setElement(term32472, 0, "xxtlPwDYFs");
        setElement(term32472, 1, "jJCZpVmanW");
        setElement(term32472, 2, "EGtDIRbSSb");
        setElement(term32472, 3, "SzjVpOQTyS");
        setField(term32469, term32469.getClass(), "header", term32472);
        setElement(term32481, 0, "java.lang.Object@68987ddf");
        setElement(term32481, 1, "java.lang.Object@4ca85ba2");
        setElement(term32481, 2, "java.lang.Object@87f494e");
        setElement(term32481, 3, "java.lang.Object@3238035a");
        setElement(term32481, 4, "java.lang.Object@63d2e8d3");
        setField(term32469, term32469.getClass(), "headerComments", term32481);
        setBooleanField(term32469, term32469.getClass(), "ignoreEmptyLines", false);
        setBooleanField(term32469, term32469.getClass(), "ignoreHeaderCase", true);
        setBooleanField(term32469, term32469.getClass(), "ignoreSurroundingSpaces", false);
        setField(term32469, term32469.getClass(), "nullString", "MuLcgQHgqz");
        setField(term32469, term32469.getClass(), "quoteCharacter", term32494);
        setField(term32469, term32469.getClass(), "quoteMode", enum72);
        setField(term32469, term32469.getClass(), "recordSeparator", "sjlJAEtRrb");
        setBooleanField(term32469, term32469.getClass(), "skipHeaderRecord", false);
        setBooleanField(term32469, term32469.getClass(), "trailingDelimiter", true);
        setBooleanField(term32469, term32469.getClass(), "trim", true);
        term32500 = (Object[]) newArray("java.lang.Object", 5);
        Object term32501 = newInstance(Class.forName("java.lang.Object"));
        Object term32502 = newInstance(Class.forName("java.lang.Object"));
        Object term32503 = newInstance(Class.forName("java.lang.Object"));
        Object term32504 = newInstance(Class.forName("java.lang.Object"));
        Object term32505 = newInstance(Class.forName("java.lang.Object"));
        setElement(term32500, 0, term32501);
        setElement(term32500, 1, term32502);
        setElement(term32500, 2, term32503);
        setElement(term32500, 3, term32504);
        setElement(term32500, 4, term32505);
        term32506 = new Character('t');
        Class<? extends Object> term33122 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term33121 = ((Class) term33122).getDeclaredField((String) "ALL");
        ((Field) term33121).setAccessible(true);
        enum73 = ((Field) term33121).get((Object) null);
        term32510 = new Character('n');
        term32511 = new Character('Z');
        term32516 = (Object[]) newArray("java.lang.String", 4);
        setElement(term32516, 0, "xxtlPwDYFs");
        setElement(term32516, 1, "jJCZpVmanW");
        setElement(term32516, 2, "EGtDIRbSSb");
        setElement(term32516, 3, "SzjVpOQTyS");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[16];
        argTypes[0] = char.class;
        argTypes[1] = Class.forName("java.lang.Character");
        argTypes[2] = Class.forName("org.apache.commons.csv.QuoteMode");
        argTypes[3] = Class.forName("java.lang.Character");
        argTypes[4] = Class.forName("java.lang.Character");
        argTypes[5] = boolean.class;
        argTypes[6] = boolean.class;
        argTypes[7] = Class.forName("java.lang.String");
        argTypes[8] = Class.forName("java.lang.String");
        argTypes[9] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        argTypes[10] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[11] = boolean.class;
        argTypes[12] = boolean.class;
        argTypes[13] = boolean.class;
        argTypes[14] = boolean.class;
        argTypes[15] = boolean.class;
        Object[] args = new Object[16];
        args[0] = term29;
        args[1] = term31;
        args[2] = enum71;
        args[3] = term40;
        args[4] = term42;
        args[5] = term44;
        args[6] = term46;
        args[7] = "sjlJAEtRrb";
        args[8] = "MuLcgQHgqz";
        args[9] = term72;
        args[10] = term78;
        args[11] = term127;
        args[12] = term129;
        args[13] = term131;
        args[14] = term133;
        args[15] = term135;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term32469));
        assertTrue(recursiveEquals(term29, term32500));
        assertTrue(recursiveEquals(term31, 'B'));
        assertTrue(recursiveEquals(enum71, term32506));
        assertTrue(recursiveEquals(term40, enum73));
        assertTrue(recursiveEquals(term42, term32510));
        assertTrue(recursiveEquals(term44, term32511));
        assertTrue(recursiveEquals(term46, false));
        assertTrue(recursiveEquals(term72, "MuLcgQHgqz"));
        assertTrue(recursiveEquals(term78, term32516));
        assertTrue(recursiveEquals(term127, false));
        assertTrue(recursiveEquals(term129, false));
        assertTrue(recursiveEquals(term131, true));
        assertTrue(recursiveEquals(term133, true));
        assertTrue(recursiveEquals(term135, true));
    }

};


