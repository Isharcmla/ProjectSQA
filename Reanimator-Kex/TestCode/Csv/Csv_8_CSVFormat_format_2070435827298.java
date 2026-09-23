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

public class CSVFormat_format_2070435827298 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term162290;
     Object term161664;
     Object term164368;
     Object term164376;

    public CSVFormat_format_2070435827298() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term162342 = new Character((char) 64);
        Character term162394 = new Character((char) 128);
        Character term162446 = new Character((char) 0);
        Class<? extends Object> term164380 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term164379 = ((Class) term164380).getDeclaredField((String) "ALL");
        ((Field) term164379).setAccessible(true);
        Object enum305 = ((Field) term164379).get((Object) null);
        term162290 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term161992 = (Object[]) newArray("java.lang.String", 0);
        setField(term162290, term162290.getClass(), "quoteChar", term162342);
        setCharField(term162290, term162290.getClass(), "delimiter", (char) 44927);
        setField(term162290, term162290.getClass(), "escape", term162394);
        setField(term162290, term162290.getClass(), "commentStart", term162446);
        setField(term162290, term162290.getClass(), "header", term161992);
        setField(term162290, term162290.getClass(), "quotePolicy", enum305);
        term161664 = (Object[]) newArray("java.lang.Object", 2);
        int[] term161665 = (int[]) newIntArray(0);
        Object term162584 = newInstance(Class.forName("java.lang.Object"));
        setElement(term161664, 0, term161665);
        setElement(term161664, 1, term162584);
        Character term164369 = new Character((char) 64);
        Class<? extends Object> term164536 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term164535 = ((Class) term164536).getDeclaredField((String) "ALL");
        ((Field) term164535).setAccessible(true);
        Object enum306 = ((Field) term164535).get((Object) null);
        Character term164373 = new Character((char) 0);
        Character term164374 = new Character((char) 128);
        term164368 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term164375 = (Object[]) newArray("java.lang.String", 0);
        setCharField(term164368, term164368.getClass(), "delimiter", (char) 44927);
        setField(term164368, term164368.getClass(), "quoteChar", term164369);
        setField(term164368, term164368.getClass(), "quotePolicy", enum306);
        setField(term164368, term164368.getClass(), "commentStart", term164373);
        setField(term164368, term164368.getClass(), "escape", term164374);
        setBooleanField(term164368, term164368.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term164368, term164368.getClass(), "ignoreEmptyLines", false);
        setField(term164368, term164368.getClass(), "recordSeparator", null);
        setField(term164368, term164368.getClass(), "nullString", null);
        setField(term164368, term164368.getClass(), "header", term164375);
        setBooleanField(term164368, term164368.getClass(), "skipHeaderRecord", false);
        term164376 = (Object[]) newArray("java.lang.Object", 2);
        int[] term164377 = (int[]) newIntArray(0);
        Object term164378 = newInstance(Class.forName("java.lang.Object"));
        setElement(term164376, 0, term164377);
        setElement(term164376, 1, term164378);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term161664;
        Object retValue = callMethod(klass, "format", argTypes, term162290, args);
        assertTrue(recursiveEquals(term162290, term164368));
        assertTrue(recursiveEquals(term161664, term164376));
        assertTrue(recursiveEquals(retValue, "@ [ I @ @ d 6 0 8 b e c @ \u007F\uFFAF@ j a v a . l a n g . O b j e c t @ @ 6 0 8 0 c 4 a 3 @ "));
    }

};


