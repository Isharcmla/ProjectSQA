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

public class CSVFormat_init_181340859546 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7;
     Object term9;
     Object enum41;
     Object term18;
     Object term20;
     Object term22;
     Object term24;
     Object term50;
     Object term111;
     Object term113;
     Object term14505;
     Object term14527;
     Object enum43;
     Object term14531;
     Object term14532;
     Object term14537;

    public CSVFormat_init_181340859546() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7 = new Character('B');
        term9 = new Character('t');
        Class<? extends Object> term14549 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term14548 = ((Class) term14549).getDeclaredField((String) "ALL");
        ((Field) term14548).setAccessible(true);
        enum41 = ((Field) term14548).get((Object) null);
        term18 = new Character('n');
        term20 = new Character('Z');
        term22 = new Boolean(false);
        term24 = new Boolean(false);
        term50 = (Object[]) newArray("java.lang.String", 5);
        setElement(term50, 0, "MuLcgQHgqz");
        setElement(term50, 1, "xxtlPwDYFs");
        setElement(term50, 2, "jJCZpVmanW");
        setElement(term50, 3, "EGtDIRbSSb");
        setElement(term50, 4, "SzjVpOQTyS");
        term111 = new Boolean(false);
        term113 = new Boolean(false);
        Character term14506 = new Character('t');
        Class<? extends Object> term14795 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term14794 = ((Class) term14795).getDeclaredField((String) "ALL");
        ((Field) term14794).setAccessible(true);
        Object enum42 = ((Field) term14794).get((Object) null);
        Character term14510 = new Character('n');
        Character term14511 = new Character('Z');
        term14505 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term14516 = (Object[]) newArray("java.lang.String", 5);
        setCharField(term14505, term14505.getClass(), "delimiter", 'B');
        setField(term14505, term14505.getClass(), "quoteCharacter", term14506);
        setField(term14505, term14505.getClass(), "quoteMode", enum42);
        setField(term14505, term14505.getClass(), "commentMarker", term14510);
        setField(term14505, term14505.getClass(), "escapeCharacter", term14511);
        setBooleanField(term14505, term14505.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term14505, term14505.getClass(), "allowMissingColumnNames", false);
        setBooleanField(term14505, term14505.getClass(), "ignoreEmptyLines", false);
        setField(term14505, term14505.getClass(), "recordSeparator", "PAEBtnZtTD");
        setField(term14505, term14505.getClass(), "nullString", "sjlJAEtRrb");
        setElement(term14516, 0, "MuLcgQHgqz");
        setElement(term14516, 1, "xxtlPwDYFs");
        setElement(term14516, 2, "jJCZpVmanW");
        setElement(term14516, 3, "EGtDIRbSSb");
        setElement(term14516, 4, "SzjVpOQTyS");
        setField(term14505, term14505.getClass(), "header", term14516);
        setBooleanField(term14505, term14505.getClass(), "skipHeaderRecord", false);
        term14527 = new Character('t');
        Class<? extends Object> term15041 = Class.forName((String) "org.apache.commons.csv.QuoteMode");
        Field term15040 = ((Class) term15041).getDeclaredField((String) "ALL");
        ((Field) term15040).setAccessible(true);
        enum43 = ((Field) term15040).get((Object) null);
        term14531 = new Character('n');
        term14532 = new Character('Z');
        term14537 = (Object[]) newArray("java.lang.String", 5);
        setElement(term14537, 0, "MuLcgQHgqz");
        setElement(term14537, 1, "xxtlPwDYFs");
        setElement(term14537, 2, "jJCZpVmanW");
        setElement(term14537, 3, "EGtDIRbSSb");
        setElement(term14537, 4, "SzjVpOQTyS");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[12];
        argTypes[0] = char.class;
        argTypes[1] = Class.forName("java.lang.Character");
        argTypes[2] = Class.forName("org.apache.commons.csv.QuoteMode");
        argTypes[3] = Class.forName("java.lang.Character");
        argTypes[4] = Class.forName("java.lang.Character");
        argTypes[5] = boolean.class;
        argTypes[6] = boolean.class;
        argTypes[7] = Class.forName("java.lang.String");
        argTypes[8] = Class.forName("java.lang.String");
        argTypes[9] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[10] = boolean.class;
        argTypes[11] = boolean.class;
        Object[] args = new Object[12];
        args[0] = term7;
        args[1] = term9;
        args[2] = enum41;
        args[3] = term18;
        args[4] = term20;
        args[5] = term22;
        args[6] = term24;
        args[7] = "PAEBtnZtTD";
        args[8] = "sjlJAEtRrb";
        args[9] = term50;
        args[10] = term111;
        args[11] = term113;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term14505));
        assertTrue(recursiveEquals(term7, 'B'));
        assertTrue(recursiveEquals(term9, term14527));
        assertTrue(recursiveEquals(enum41, enum43));
        assertTrue(recursiveEquals(term18, term14531));
        assertTrue(recursiveEquals(term20, term14532));
        assertTrue(recursiveEquals(term22, false));
        assertTrue(recursiveEquals(term24, false));
        assertTrue(recursiveEquals(term50, term14537));
        assertTrue(recursiveEquals(term111, false));
        assertTrue(recursiveEquals(term113, false));
    }

};


