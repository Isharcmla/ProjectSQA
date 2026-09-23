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

public class DurationFormatUtils_format_1779347976234 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term159552;
     Object term161499;

    public DurationFormatUtils_format_1779347976234() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term159954 = new StringBuffer();
        term159552 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 3);
        Object term159782 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        char[] term159584 = (char[]) newCharArray(0);
        Object term159896 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term160068 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term160182 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term159782, term159782.getClass(), "value", term159584);
        setIntField(term159782, term159782.getClass(), "count", 0);
        setElement(term159552, 0, term159782);
        setField(term159896, term159896.getClass(), "value", term159954);
        setIntField(term159896, term159896.getClass(), "count", 0);
        setElement(term159552, 1, term159896);
        setField(term160068, term160068.getClass(), "value", term160182);
        setIntField(term160068, term160068.getClass(), "count", 0);
        setElement(term159552, 2, term160068);
        term161499 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 3);
        Object term161500 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        char[] term161501 = (char[]) newCharArray(0);
        Object term161502 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term161503 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term161506 = (byte[]) newByteArray(16);
        Object term161507 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term161508 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term161500, term161500.getClass(), "value", term161501);
        setIntField(term161500, term161500.getClass(), "count", 0);
        setElement(term161499, 0, term161500);
        setField(term161503, term161503.getClass(), "toStringCache", "");
        setField(term161503, term161503.getClass(), "value", term161506);
        setByteField(term161503, term161503.getClass(), "coder", (byte) 0);
        setIntField(term161503, term161503.getClass(), "count", 0);
        setField(term161502, term161502.getClass(), "value", term161503);
        setIntField(term161502, term161502.getClass(), "count", 0);
        setElement(term161499, 1, term161502);
        setField(term161508, term161508.getClass(), "value", null);
        setIntField(term161508, term161508.getClass(), "count", 0);
        setField(term161507, term161507.getClass(), "value", term161508);
        setIntField(term161507, term161507.getClass(), "count", 0);
        setElement(term161499, 2, term161507);
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
        args[0] = term159552;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term159552, term161499));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


