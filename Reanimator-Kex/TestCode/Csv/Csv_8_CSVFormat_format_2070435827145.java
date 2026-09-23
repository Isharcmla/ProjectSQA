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

public class CSVFormat_format_2070435827145 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term68534;
     Object term65787;
     Object term70318;
     Object term70326;

    public CSVFormat_format_2070435827145() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term68586 = new Character((char) 65503);
        Character term68638 = new Character((char) 0);
        Class<? extends Object> term70333 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term70332 = ((Class) term70333).getDeclaredField((String) "MINIMAL");
        ((Field) term70332).setAccessible(true);
        Object enum153 = ((Field) term70332).get((Object) null);
        term68534 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term66084 = (Object[]) newArray("java.lang.String", 0);
        setField(term68534, term68534.getClass(), "quoteChar", term68586);
        setCharField(term68534, term68534.getClass(), "delimiter", 'd');
        setField(term68534, term68534.getClass(), "escape", term68586);
        setField(term68534, term68534.getClass(), "commentStart", term68638);
        setField(term68534, term68534.getClass(), "header", term66084);
        setField(term68534, term68534.getClass(), "quotePolicy", enum153);
        term65787 = (Object[]) newArray("java.lang.Object", 3);
        int[] term65788 = (int[]) newIntArray(0);
        setElement(term65787, 0, term65788);
        setElement(term65787, 1, "d    \uFFDF                   ");
        setElement(term65787, 2, "NONE");
        Character term70319 = new Character((char) 65503);
        Class<? extends Object> term70507 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term70506 = ((Class) term70507).getDeclaredField((String) "MINIMAL");
        ((Field) term70506).setAccessible(true);
        Object enum154 = ((Field) term70506).get((Object) null);
        Character term70323 = new Character((char) 0);
        Character term70324 = new Character((char) 65503);
        term70318 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term70325 = (Object[]) newArray("java.lang.String", 0);
        setCharField(term70318, term70318.getClass(), "delimiter", 'd');
        setField(term70318, term70318.getClass(), "quoteChar", term70319);
        setField(term70318, term70318.getClass(), "quotePolicy", enum154);
        setField(term70318, term70318.getClass(), "commentStart", term70323);
        setField(term70318, term70318.getClass(), "escape", term70324);
        setBooleanField(term70318, term70318.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term70318, term70318.getClass(), "ignoreEmptyLines", false);
        setField(term70318, term70318.getClass(), "recordSeparator", null);
        setField(term70318, term70318.getClass(), "nullString", null);
        setField(term70318, term70318.getClass(), "header", term70325);
        setBooleanField(term70318, term70318.getClass(), "skipHeaderRecord", false);
        term70326 = (Object[]) newArray("java.lang.Object", 3);
        int[] term70327 = (int[]) newIntArray(0);
        setElement(term70326, 0, term70327);
        setElement(term70326, 1, "d         \uFFDF\uFFFF                                      ");
        setElement(term70326, 2, "NONE");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term65787;
        Object retValue = callMethod(klass, "format", argTypes, term68534, args);
        assertTrue(recursiveEquals(term68534, term70318));
        assertTrue(recursiveEquals(term65787, term70326));
        assertTrue(recursiveEquals(retValue, "\uFFDF\uFFFF[ I @ 6 d a 9 e e 5 2 \uFFDF\uFFFFd \uFFDF\uFFFFd         \uFFDF\uFFFF\uFFDF\uFFFF                                      \uFFDF\uFFFFd N O N E "));
    }

};


