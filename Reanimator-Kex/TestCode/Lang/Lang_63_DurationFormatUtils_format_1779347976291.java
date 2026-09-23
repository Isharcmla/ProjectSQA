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

public class DurationFormatUtils_format_1779347976291 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term212992;
     Object term217114;

    public DurationFormatUtils_format_1779347976291() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term216410 = new StringBuffer();
        term212992 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 6);
        Object term216238 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term216352 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term216524 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term216638 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term216740 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils"));
        Object term216854 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term216956 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils"));
        setField(term216238, term216238.getClass(), "value", null);
        setIntField(term216238, term216238.getClass(), "count", 0);
        setElement(term212992, 0, term216238);
        setElement(term212992, 1, term216238);
        setField(term216352, term216352.getClass(), "value", term216410);
        setIntField(term216352, term216352.getClass(), "count", 0);
        setElement(term212992, 2, term216352);
        setField(term216524, term216524.getClass(), "value", null);
        setIntField(term216524, term216524.getClass(), "count", 0);
        setElement(term212992, 3, term216524);
        setField(term216638, term216638.getClass(), "value", term216740);
        setIntField(term216638, term216638.getClass(), "count", 0);
        setElement(term212992, 4, term216638);
        setField(term216854, term216854.getClass(), "value", term216956);
        setIntField(term216854, term216854.getClass(), "count", 0);
        setElement(term212992, 5, term216854);
        term217114 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 6);
        Object term217115 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term217116 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term217117 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term217120 = (byte[]) newByteArray(16);
        Object term217121 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term217122 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term217123 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils"));
        Object term217124 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term217125 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils"));
        setField(term217115, term217115.getClass(), "value", null);
        setIntField(term217115, term217115.getClass(), "count", 0);
        setElement(term217114, 0, term217115);
        setElement(term217114, 1, term217115);
        setField(term217117, term217117.getClass(), "toStringCache", "");
        setField(term217117, term217117.getClass(), "value", term217120);
        setByteField(term217117, term217117.getClass(), "coder", (byte) 0);
        setIntField(term217117, term217117.getClass(), "count", 0);
        setField(term217116, term217116.getClass(), "value", term217117);
        setIntField(term217116, term217116.getClass(), "count", 0);
        setElement(term217114, 2, term217116);
        setField(term217121, term217121.getClass(), "value", null);
        setIntField(term217121, term217121.getClass(), "count", 0);
        setElement(term217114, 3, term217121);
        setField(term217122, term217122.getClass(), "value", term217123);
        setIntField(term217122, term217122.getClass(), "count", 0);
        setElement(term217114, 4, term217122);
        setField(term217124, term217124.getClass(), "value", term217125);
        setIntField(term217124, term217124.getClass(), "count", 0);
        setElement(term217114, 5, term217124);
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
        args[0] = term212992;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term212992, term217114));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


