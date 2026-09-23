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

public class CSVFormat_init_139945256443 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7;
     Object term9;
     Object enum38;
     Object term18;
     Object term20;
     Object term22;
     Object term24;
     Object term50;
     Object term111;
     Object term12443;
     Object term12465;
     Object enum40;
     Object term12469;
     Object term12470;
     Object term12475;

    public CSVFormat_init_139945256443() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7 = new Character('B');
        term9 = new Character('t');
        Class<? extends Object> term12487 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term12486 = ((Class) term12487).getDeclaredField((String) "ALL");
        ((Field) term12486).setAccessible(true);
        enum38 = ((Field) term12486).get((Object) null);
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
        Character term12444 = new Character('t');
        Class<? extends Object> term12713 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term12712 = ((Class) term12713).getDeclaredField((String) "ALL");
        ((Field) term12712).setAccessible(true);
        Object enum39 = ((Field) term12712).get((Object) null);
        Character term12448 = new Character('n');
        Character term12449 = new Character('Z');
        term12443 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term12454 = (Object[]) newArray("java.lang.String", 5);
        setCharField(term12443, term12443.getClass(), "delimiter", 'B');
        setField(term12443, term12443.getClass(), "quoteChar", term12444);
        setField(term12443, term12443.getClass(), "quotePolicy", enum39);
        setField(term12443, term12443.getClass(), "commentStart", term12448);
        setField(term12443, term12443.getClass(), "escape", term12449);
        setBooleanField(term12443, term12443.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term12443, term12443.getClass(), "ignoreEmptyLines", false);
        setField(term12443, term12443.getClass(), "recordSeparator", "PAEBtnZtTD");
        setField(term12443, term12443.getClass(), "nullString", "sjlJAEtRrb");
        setElement(term12454, 0, "MuLcgQHgqz");
        setElement(term12454, 1, "xxtlPwDYFs");
        setElement(term12454, 2, "jJCZpVmanW");
        setElement(term12454, 3, "EGtDIRbSSb");
        setElement(term12454, 4, "SzjVpOQTyS");
        setField(term12443, term12443.getClass(), "header", term12454);
        setBooleanField(term12443, term12443.getClass(), "skipHeaderRecord", false);
        term12465 = new Character('t');
        Class<? extends Object> term12939 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term12938 = ((Class) term12939).getDeclaredField((String) "ALL");
        ((Field) term12938).setAccessible(true);
        enum40 = ((Field) term12938).get((Object) null);
        term12469 = new Character('n');
        term12470 = new Character('Z');
        term12475 = (Object[]) newArray("java.lang.String", 5);
        setElement(term12475, 0, "MuLcgQHgqz");
        setElement(term12475, 1, "xxtlPwDYFs");
        setElement(term12475, 2, "jJCZpVmanW");
        setElement(term12475, 3, "EGtDIRbSSb");
        setElement(term12475, 4, "SzjVpOQTyS");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[11];
        argTypes[0] = char.class;
        argTypes[1] = Class.forName("java.lang.Character");
        argTypes[2] = Class.forName("org.apache.commons.csv.Quote");
        argTypes[3] = Class.forName("java.lang.Character");
        argTypes[4] = Class.forName("java.lang.Character");
        argTypes[5] = boolean.class;
        argTypes[6] = boolean.class;
        argTypes[7] = Class.forName("java.lang.String");
        argTypes[8] = Class.forName("java.lang.String");
        argTypes[9] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[10] = boolean.class;
        Object[] args = new Object[11];
        args[0] = term7;
        args[1] = term9;
        args[2] = enum38;
        args[3] = term18;
        args[4] = term20;
        args[5] = term22;
        args[6] = term24;
        args[7] = "PAEBtnZtTD";
        args[8] = "sjlJAEtRrb";
        args[9] = term50;
        args[10] = term111;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term12443));
        assertTrue(recursiveEquals(term7, 'B'));
        assertTrue(recursiveEquals(term9, term12465));
        assertTrue(recursiveEquals(enum38, enum40));
        assertTrue(recursiveEquals(term18, term12469));
        assertTrue(recursiveEquals(term20, term12470));
        assertTrue(recursiveEquals(term22, false));
        assertTrue(recursiveEquals(term24, false));
        assertTrue(recursiveEquals(term50, term12475));
        assertTrue(recursiveEquals(term111, false));
    }

};


