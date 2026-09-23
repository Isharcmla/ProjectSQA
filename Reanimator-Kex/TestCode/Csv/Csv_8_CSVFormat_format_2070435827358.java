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

public class CSVFormat_format_2070435827358 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term251851;
     Object term251501;
     Object term254738;
     Object term254746;

    public CSVFormat_format_2070435827358() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term251903 = new Character((char) 1);
        Character term251955 = new Character((char) 128);
        Character term252007 = new Character((char) 0);
        Class<? extends Object> term254749 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term254748 = ((Class) term254749).getDeclaredField((String) "ALL");
        ((Field) term254748).setAccessible(true);
        Object enum401 = ((Field) term254748).get((Object) null);
        term251851 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term251608 = (Object[]) newArray("java.lang.String", 0);
        setField(term251851, term251851.getClass(), "quoteChar", term251903);
        setCharField(term251851, term251851.getClass(), "delimiter", (char) 65526);
        setField(term251851, term251851.getClass(), "escape", term251955);
        setField(term251851, term251851.getClass(), "commentStart", term252007);
        setField(term251851, term251851.getClass(), "header", term251608);
        setField(term251851, term251851.getClass(), "quotePolicy", enum401);
        term251501 = (Object[]) newArray("java.lang.Object", 16);
        int[] term251502 = (int[]) newIntArray(0);
        setElement(term251501, 0, term251502);
        Character term254739 = new Character((char) 1);
        Class<? extends Object> term254905 = Class.forName((String) "org.apache.commons.csv.Quote");
        Field term254904 = ((Class) term254905).getDeclaredField((String) "ALL");
        ((Field) term254904).setAccessible(true);
        Object enum402 = ((Field) term254904).get((Object) null);
        Character term254743 = new Character((char) 0);
        Character term254744 = new Character((char) 128);
        term254738 = newInstance(Class.forName("org.apache.commons.csv.CSVFormat"));
        Object[] term254745 = (Object[]) newArray("java.lang.String", 0);
        setCharField(term254738, term254738.getClass(), "delimiter", (char) 65526);
        setField(term254738, term254738.getClass(), "quoteChar", term254739);
        setField(term254738, term254738.getClass(), "quotePolicy", enum402);
        setField(term254738, term254738.getClass(), "commentStart", term254743);
        setField(term254738, term254738.getClass(), "escape", term254744);
        setBooleanField(term254738, term254738.getClass(), "ignoreSurroundingSpaces", false);
        setBooleanField(term254738, term254738.getClass(), "ignoreEmptyLines", false);
        setField(term254738, term254738.getClass(), "recordSeparator", null);
        setField(term254738, term254738.getClass(), "nullString", null);
        setField(term254738, term254738.getClass(), "header", term254745);
        setBooleanField(term254738, term254738.getClass(), "skipHeaderRecord", false);
        term254746 = (Object[]) newArray("java.lang.Object", 16);
        int[] term254747 = (int[]) newIntArray(0);
        setElement(term254746, 0, term254747);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term251501;
        Object retValue = callMethod(klass, "format", argTypes, term251851, args);
        assertTrue(recursiveEquals(term251851, term254738));
        assertTrue(recursiveEquals(term251501, term254746));
        assertTrue(recursiveEquals(retValue, "[ I @ 8 e 6 0 6 3 4 \u0001 \uFFF6\uFFFF\u0001 \u0001 \uFFF6\uFFFF\u0001 \u0001 \uFFF6\uFFFF\u0001 \u0001 \uFFF6\uFFFF\u0001 \u0001 \uFFF6\uFFFF\u0001 \u0001 \uFFF6\uFFFF\u0001 \u0001 \uFFF6\uFFFF\u0001 \u0001 \uFFF6\uFFFF\u0001 \u0001 \uFFF6\uFFFF\u0001 \u0001 \uFFF6\uFFFF\u0001 \u0001 \uFFF6\uFFFF\u0001 \u0001 \uFFF6\uFFFF\u0001 \u0001 \uFFF6\uFFFF\u0001 \u0001 \uFFF6\uFFFF\u0001 \u0001 \uFFF6\uFFFF"));
    }

};


