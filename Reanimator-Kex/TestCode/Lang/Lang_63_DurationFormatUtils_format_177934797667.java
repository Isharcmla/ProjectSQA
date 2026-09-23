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

public class DurationFormatUtils_format_177934797667 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38151;
     Object term39311;

    public DurationFormatUtils_format_177934797667() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term39151 = new StringBuffer();
        term38151 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 5);
        Object term38637 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term38751 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term38865 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object[] term38419 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 0);
        Object term38979 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        char[] term38422 = (char[]) newCharArray(0);
        Object term39093 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term38865, term38865.getClass(), "value", term38419);
        setIntField(term38865, term38865.getClass(), "count", 0);
        setField(term38751, term38751.getClass(), "value", term38865);
        setIntField(term38751, term38751.getClass(), "count", 0);
        setField(term38637, term38637.getClass(), "value", term38751);
        setIntField(term38637, term38637.getClass(), "count", 0);
        setElement(term38151, 0, term38637);
        setElement(term38151, 1, term38865);
        setElement(term38151, 2, term38751);
        setField(term38979, term38979.getClass(), "value", term38422);
        setIntField(term38979, term38979.getClass(), "count", 0);
        setElement(term38151, 3, term38979);
        setField(term39093, term39093.getClass(), "value", term39151);
        setIntField(term39093, term39093.getClass(), "count", 0);
        setElement(term38151, 4, term39093);
        term39311 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 5);
        Object term39312 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term39313 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term39314 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object[] term39315 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 0);
        Object term39316 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        char[] term39317 = (char[]) newCharArray(0);
        Object term39318 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term39319 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term39322 = (byte[]) newByteArray(16);
        setField(term39314, term39314.getClass(), "value", term39315);
        setIntField(term39314, term39314.getClass(), "count", 0);
        setField(term39313, term39313.getClass(), "value", term39314);
        setIntField(term39313, term39313.getClass(), "count", 0);
        setField(term39312, term39312.getClass(), "value", term39313);
        setIntField(term39312, term39312.getClass(), "count", 0);
        setElement(term39311, 0, term39312);
        setElement(term39311, 1, term39314);
        setElement(term39311, 2, term39313);
        setField(term39316, term39316.getClass(), "value", term39317);
        setIntField(term39316, term39316.getClass(), "count", 0);
        setElement(term39311, 3, term39316);
        setField(term39319, term39319.getClass(), "toStringCache", "");
        setField(term39319, term39319.getClass(), "value", term39322);
        setByteField(term39319, term39319.getClass(), "coder", (byte) 0);
        setIntField(term39319, term39319.getClass(), "count", 0);
        setField(term39318, term39318.getClass(), "value", term39319);
        setIntField(term39318, term39318.getClass(), "count", 0);
        setElement(term39311, 4, term39318);
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
        args[0] = term38151;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term38151, term39311));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


