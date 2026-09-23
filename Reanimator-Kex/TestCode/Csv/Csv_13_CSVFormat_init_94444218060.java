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

public class CSVFormat_init_94444218060 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29;
     Object term31;
     Object enum53;
     Object term40;
     Object term42;
     Object term44;
     Object term46;
     Object term72;
     Object term78;
     Object term127;
     Object term129;
     Object term131;
     Object term24821;
     Object term24852;
     Object term24858;
     Object enum55;
     Object term24862;
     Object term24863;
     Object term24868;

    public CSVFormat_init_94444218060() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29 = new Character('B');
        term31 = new Character('t');
        Class<? extends Object> term24878 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term24877 = ((Class) term24878).getDeclaredField((String) "ALL");
        ((Field) term24877).setAccessible(true);
        enum53 = ((Field) term24877).get((Object) null);
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
        Character term24822 = new Character('t');
        Class<? extends Object> term25114 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term25113 = ((Class) term25114).getDeclaredField((String) "ALL");
        ((Field) term25113).setAccessible(true);
        Object enum54 = ((Field) term25113).get((Object) null);
        Character term24826 = new Character('n');
        Character term24827 = new Character('Z');
        term24821 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term24832 = (Object[]) newArray("java.lang.String", 4);
        Object[] term24841 = (Object[]) newArray("java.lang.String", 5);
        setCharField(term24821, term24821.getClass(), "delimiter", 'B');
        setField(term24821, term24821.getClass(), "quoteCharacter", term24822);
        setField(term24821, term24821.getClass(), "quoteMode", enum54);
        setField(term24821, term24821.getClass(), "commentMarker", term24826);
        setField(term24821, term24821.getClass(), "escapeCharacter", term24827);
        setBooleanField(term24821, term24821.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term24821, term24821.getClass(), "allowMissingColumnNames", false);
        setBooleanField(term24821, term24821.getClass(), "ignoreEmptyLines", false);
        setField(term24821, term24821.getClass(), "recordSeparator", "sjlJAEtRrb");
        setField(term24821, term24821.getClass(), "nullString", "MuLcgQHgqz");
        setElement(term24832, 0, "xxtlPwDYFs");
        setElement(term24832, 1, "jJCZpVmanW");
        setElement(term24832, 2, "EGtDIRbSSb");
        setElement(term24832, 3, "SzjVpOQTyS");
        setField(term24821, term24821.getClass(), "header", term24832);
        setElement(term24841, 0, "java.lang.Object@5ec6d941");
        setElement(term24841, 1, "java.lang.Object@49238879");
        setElement(term24841, 2, "java.lang.Object@7bba409");
        setElement(term24841, 3, "java.lang.Object@2efaf82b");
        setElement(term24841, 4, "java.lang.Object@564b86a2");
        setField(term24821, term24821.getClass(), "headerComments", term24841);
        setBooleanField(term24821, term24821.getClass(), "skipHeaderRecord", false);
        setBooleanField(term24821, term24821.getClass(), "ignoreHeaderCase", true);
        term24852 = (Object[]) newArray("java.lang.Object", 5);
        Object term24853 = newInstance(Class.forName("java.lang.Object"));
        Object term24854 = newInstance(Class.forName("java.lang.Object"));
        Object term24855 = newInstance(Class.forName("java.lang.Object"));
        Object term24856 = newInstance(Class.forName("java.lang.Object"));
        Object term24857 = newInstance(Class.forName("java.lang.Object"));
        setElement(term24852, 0, term24853);
        setElement(term24852, 1, term24854);
        setElement(term24852, 2, term24855);
        setElement(term24852, 3, term24856);
        setElement(term24852, 4, term24857);
        term24858 = new Character('t');
        Class<? extends Object> term25474 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term25473 = ((Class) term25474).getDeclaredField((String) "ALL");
        ((Field) term25473).setAccessible(true);
        enum55 = ((Field) term25473).get((Object) null);
        term24862 = new Character('n');
        term24863 = new Character('Z');
        term24868 = (Object[]) newArray("java.lang.String", 4);
        setElement(term24868, 0, "xxtlPwDYFs");
        setElement(term24868, 1, "jJCZpVmanW");
        setElement(term24868, 2, "EGtDIRbSSb");
        setElement(term24868, 3, "SzjVpOQTyS");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[14];
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
        Object[] args = new Object[14];
        args[0] = term29;
        args[1] = term31;
        args[2] = enum53;
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
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term24821));
        assertTrue(recursiveEquals(term29, term24852));
        assertTrue(recursiveEquals(term31, 'B'));
        assertTrue(recursiveEquals(enum53, term24858));
        assertTrue(recursiveEquals(term40, enum55));
        assertTrue(recursiveEquals(term42, term24862));
        assertTrue(recursiveEquals(term44, term24863));
        assertTrue(recursiveEquals(term46, false));
        assertTrue(recursiveEquals(term72, "MuLcgQHgqz"));
        assertTrue(recursiveEquals(term78, term24868));
        assertTrue(recursiveEquals(term127, false));
        assertTrue(recursiveEquals(term129, false));
        assertTrue(recursiveEquals(term131, true));
    }

};


