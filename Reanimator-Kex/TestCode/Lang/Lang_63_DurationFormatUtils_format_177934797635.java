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
import java.lang.StringBuilder;

public class DurationFormatUtils_format_177934797635 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16732;
     Object term17686;

    public DurationFormatUtils_format_177934797635() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuilder term17468 = new StringBuilder();
        term16732 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 2);
        Object term17408 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term17582 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        char[] term17236 = (char[]) newCharArray(0);
        setField(term17408, term17408.getClass(), "value", term17468);
        setIntField(term17408, term17408.getClass(), "count", 0);
        setElement(term16732, 0, term17408);
        setField(term17582, term17582.getClass(), "value", term17236);
        setIntField(term17582, term17582.getClass(), "count", 0);
        setElement(term16732, 1, term17582);
        term17686 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 2);
        Object term17687 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term17688 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term17689 = (byte[]) newByteArray(16);
        Object term17690 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        char[] term17691 = (char[]) newCharArray(0);
        setField(term17688, term17688.getClass(), "value", term17689);
        setByteField(term17688, term17688.getClass(), "coder", (byte) 0);
        setIntField(term17688, term17688.getClass(), "count", 0);
        setField(term17687, term17687.getClass(), "value", term17688);
        setIntField(term17687, term17687.getClass(), "count", 0);
        setElement(term17686, 0, term17687);
        setField(term17690, term17690.getClass(), "value", term17691);
        setIntField(term17690, term17690.getClass(), "count", 0);
        setElement(term17686, 1, term17690);
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
        args[0] = term16732;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term16732, term17686));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


