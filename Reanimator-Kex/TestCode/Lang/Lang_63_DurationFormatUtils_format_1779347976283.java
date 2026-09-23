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
import java.lang.StringBuilder;

public class DurationFormatUtils_format_1779347976283 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term205790;
     Object term207515;

    public DurationFormatUtils_format_1779347976283() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term206606 = new StringBuffer();
        StringBuilder term206894 = new StringBuilder();
        term205790 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 6);
        Object term206320 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        char[] term206073 = (char[]) newCharArray(0);
        Object term206434 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term206548 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term206720 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term206834 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term207008 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term207110 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils"));
        setField(term206320, term206320.getClass(), "value", term206073);
        setIntField(term206320, term206320.getClass(), "count", 0);
        setElement(term205790, 0, term206320);
        setField(term206434, term206434.getClass(), "value", null);
        setIntField(term206434, term206434.getClass(), "count", 0);
        setElement(term205790, 1, term206434);
        setField(term206548, term206548.getClass(), "value", term206606);
        setIntField(term206548, term206548.getClass(), "count", 0);
        setElement(term205790, 2, term206548);
        setField(term206720, term206720.getClass(), "value", null);
        setIntField(term206720, term206720.getClass(), "count", 0);
        setElement(term205790, 3, term206720);
        setField(term206834, term206834.getClass(), "value", term206894);
        setIntField(term206834, term206834.getClass(), "count", 0);
        setElement(term205790, 4, term206834);
        setField(term207008, term207008.getClass(), "value", term207110);
        setIntField(term207008, term207008.getClass(), "count", 0);
        setElement(term205790, 5, term207008);
        term207515 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 6);
        Object term207516 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        char[] term207517 = (char[]) newCharArray(0);
        Object term207518 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term207519 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term207520 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term207523 = (byte[]) newByteArray(16);
        Object term207524 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term207525 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term207526 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term207527 = (byte[]) newByteArray(16);
        Object term207528 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term207529 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils"));
        setField(term207516, term207516.getClass(), "value", term207517);
        setIntField(term207516, term207516.getClass(), "count", 0);
        setElement(term207515, 0, term207516);
        setField(term207518, term207518.getClass(), "value", null);
        setIntField(term207518, term207518.getClass(), "count", 0);
        setElement(term207515, 1, term207518);
        setField(term207520, term207520.getClass(), "toStringCache", "");
        setField(term207520, term207520.getClass(), "value", term207523);
        setByteField(term207520, term207520.getClass(), "coder", (byte) 0);
        setIntField(term207520, term207520.getClass(), "count", 0);
        setField(term207519, term207519.getClass(), "value", term207520);
        setIntField(term207519, term207519.getClass(), "count", 0);
        setElement(term207515, 2, term207519);
        setField(term207524, term207524.getClass(), "value", null);
        setIntField(term207524, term207524.getClass(), "count", 0);
        setElement(term207515, 3, term207524);
        setField(term207526, term207526.getClass(), "value", term207527);
        setByteField(term207526, term207526.getClass(), "coder", (byte) 0);
        setIntField(term207526, term207526.getClass(), "count", 0);
        setField(term207525, term207525.getClass(), "value", term207526);
        setIntField(term207525, term207525.getClass(), "count", 0);
        setElement(term207515, 4, term207525);
        setField(term207528, term207528.getClass(), "value", term207529);
        setIntField(term207528, term207528.getClass(), "count", 0);
        setElement(term207515, 5, term207528);
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
        args[0] = term205790;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term205790, term207515));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


