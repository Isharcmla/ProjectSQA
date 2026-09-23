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

public class DurationFormatUtils_format_177934797699 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65012;
     Object term65591;

    public DurationFormatUtils_format_177934797699() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term65276 = new StringBuffer();
        term65012 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 2);
        Object term65218 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term65390 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term65492 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils"));
        setField(term65218, term65218.getClass(), "value", term65276);
        setIntField(term65218, term65218.getClass(), "count", 0);
        setElement(term65012, 0, term65218);
        setField(term65390, term65390.getClass(), "value", term65492);
        setIntField(term65390, term65390.getClass(), "count", 0);
        setElement(term65012, 1, term65390);
        term65591 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 2);
        Object term65592 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term65593 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term65596 = (byte[]) newByteArray(16);
        Object term65597 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term65598 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils"));
        setField(term65593, term65593.getClass(), "toStringCache", "");
        setField(term65593, term65593.getClass(), "value", term65596);
        setByteField(term65593, term65593.getClass(), "coder", (byte) 0);
        setIntField(term65593, term65593.getClass(), "count", 0);
        setField(term65592, term65592.getClass(), "value", term65593);
        setIntField(term65592, term65592.getClass(), "count", 0);
        setElement(term65591, 0, term65592);
        setField(term65597, term65597.getClass(), "value", term65598);
        setIntField(term65597, term65597.getClass(), "count", 0);
        setElement(term65591, 1, term65597);
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
        args[0] = term65012;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term65012, term65591));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


