package org.apache.commons.lang.time;

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
import static org.apache.commons.lang.time.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang.time.EqualityUtils.*;
import java.lang.Object;
import java.lang.StringBuffer;

public class DurationFormatUtils_format_1779347976143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term102476;
     Object term104092;

    public DurationFormatUtils_format_1779347976143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term103622 = new StringBuffer();
        term102476 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 6);
        Object term103006 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        char[] term102761 = (char[]) newCharArray(0);
        Object term103120 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object[] term102766 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 0);
        Object term103234 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term103348 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term103450 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils"));
        Object term103564 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term103736 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term103006, term103006.getClass(), "value", term102761);
        setIntField(term103006, term103006.getClass(), "count", 0);
        setElement(term102476, 0, term103006);
        setField(term103120, term103120.getClass(), "value", term102766);
        setIntField(term103120, term103120.getClass(), "count", 0);
        setElement(term102476, 1, term103120);
        setField(term103348, term103348.getClass(), "value", term103450);
        setIntField(term103348, term103348.getClass(), "count", 0);
        setField(term103234, term103234.getClass(), "value", term103348);
        setIntField(term103234, term103234.getClass(), "count", 0);
        setElement(term102476, 2, term103234);
        setElement(term102476, 3, term103348);
        setField(term103564, term103564.getClass(), "value", term103622);
        setIntField(term103564, term103564.getClass(), "count", 0);
        setElement(term102476, 4, term103564);
        setField(term103736, term103736.getClass(), "value", "");
        setIntField(term103736, term103736.getClass(), "count", 0);
        setElement(term102476, 5, term103736);
        term104092 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 6);
        Object term104093 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        char[] term104094 = (char[]) newCharArray(0);
        Object term104095 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object[] term104096 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 0);
        Object term104097 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term104098 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term104099 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils"));
        Object term104100 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term104101 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term104104 = (byte[]) newByteArray(16);
        Object term104105 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term104093, term104093.getClass(), "value", term104094);
        setIntField(term104093, term104093.getClass(), "count", 0);
        setElement(term104092, 0, term104093);
        setField(term104095, term104095.getClass(), "value", term104096);
        setIntField(term104095, term104095.getClass(), "count", 0);
        setElement(term104092, 1, term104095);
        setField(term104098, term104098.getClass(), "value", term104099);
        setIntField(term104098, term104098.getClass(), "count", 0);
        setField(term104097, term104097.getClass(), "value", term104098);
        setIntField(term104097, term104097.getClass(), "count", 0);
        setElement(term104092, 2, term104097);
        setElement(term104092, 3, term104098);
        setField(term104101, term104101.getClass(), "toStringCache", "");
        setField(term104101, term104101.getClass(), "value", term104104);
        setByteField(term104101, term104101.getClass(), "coder", (byte) 0);
        setIntField(term104101, term104101.getClass(), "count", 0);
        setField(term104100, term104100.getClass(), "value", term104101);
        setIntField(term104100, term104100.getClass(), "count", 0);
        setElement(term104092, 4, term104100);
        setField(term104105, term104105.getClass(), "value", "");
        setIntField(term104105, term104105.getClass(), "count", 0);
        setElement(term104092, 5, term104105);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.time.DurationFormatUtils");
        Class<?>[] argTypes = new Class<?>[9];
        argTypes[0] = Array.newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"), 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        argTypes[4] = int.class;
        argTypes[5] = int.class;
        argTypes[6] = int.class;
        argTypes[7] = int.class;
        argTypes[8] = boolean.class;
        Object[] args = new Object[9];
        args[0] = term102476;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term102476, term104092));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


