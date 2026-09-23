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

public class DurationFormatUtils_format_177934797645 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23312;
     Object term24376;

    public DurationFormatUtils_format_177934797645() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuilder term23651 = new StringBuilder();
        StringBuilder term23825 = new StringBuilder();
        term23312 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 5);
        Object term23591 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term23765 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term23939 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        char[] term23383 = (char[]) newCharArray(0);
        Object term24053 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term24091 = newInstance(Class.forName("java.lang.Object"));
        setField(term23591, term23591.getClass(), "value", term23651);
        setIntField(term23591, term23591.getClass(), "count", 0);
        setElement(term23312, 0, term23591);
        setField(term23765, term23765.getClass(), "value", term23825);
        setIntField(term23765, term23765.getClass(), "count", 0);
        setElement(term23312, 1, term23765);
        setField(term23939, term23939.getClass(), "value", term23383);
        setIntField(term23939, term23939.getClass(), "count", 0);
        setElement(term23312, 2, term23939);
        setField(term24053, term24053.getClass(), "value", term24091);
        setIntField(term24053, term24053.getClass(), "count", 0);
        setElement(term23312, 3, term24053);
        setElement(term23312, 4, term24053);
        term24376 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 5);
        Object term24377 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term24378 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term24379 = (byte[]) newByteArray(16);
        Object term24380 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term24381 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term24382 = (byte[]) newByteArray(16);
        Object term24383 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        char[] term24384 = (char[]) newCharArray(0);
        Object term24385 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term24386 = newInstance(Class.forName("java.lang.Object"));
        setField(term24378, term24378.getClass(), "value", term24379);
        setByteField(term24378, term24378.getClass(), "coder", (byte) 0);
        setIntField(term24378, term24378.getClass(), "count", 0);
        setField(term24377, term24377.getClass(), "value", term24378);
        setIntField(term24377, term24377.getClass(), "count", 0);
        setElement(term24376, 0, term24377);
        setField(term24381, term24381.getClass(), "value", term24382);
        setByteField(term24381, term24381.getClass(), "coder", (byte) 0);
        setIntField(term24381, term24381.getClass(), "count", 0);
        setField(term24380, term24380.getClass(), "value", term24381);
        setIntField(term24380, term24380.getClass(), "count", 0);
        setElement(term24376, 1, term24380);
        setField(term24383, term24383.getClass(), "value", term24384);
        setIntField(term24383, term24383.getClass(), "count", 0);
        setElement(term24376, 2, term24383);
        setField(term24385, term24385.getClass(), "value", term24386);
        setIntField(term24385, term24385.getClass(), "count", 0);
        setElement(term24376, 3, term24385);
        setElement(term24376, 4, term24385);
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
        args[0] = term23312;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term23312, term24376));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


