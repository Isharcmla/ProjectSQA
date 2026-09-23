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
import java.lang.StringBuffer;

public class DurationFormatUtils_format_1779347976337 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term256081;
     Object term259623;

    public DurationFormatUtils_format_1779347976337() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuilder term256640 = new StringBuilder();
        StringBuffer term256926 = new StringBuffer();
        StringBuffer term257098 = new StringBuffer();
        StringBuffer term257270 = new StringBuffer();
        term256081 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 6);
        Object term256580 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term256754 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term256868 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term257040 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term257212 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term257384 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        char[] term256097 = (char[]) newCharArray(41);
        setField(term256580, term256580.getClass(), "value", term256640);
        setIntField(term256580, term256580.getClass(), "count", 0);
        setElement(term256081, 0, term256580);
        setField(term256754, term256754.getClass(), "value", term256081);
        setIntField(term256754, term256754.getClass(), "count", 0);
        setElement(term256081, 1, term256754);
        setField(term256868, term256868.getClass(), "value", term256926);
        setIntField(term256868, term256868.getClass(), "count", 0);
        setElement(term256081, 2, term256868);
        setField(term257040, term257040.getClass(), "value", term257098);
        setIntField(term257040, term257040.getClass(), "count", 0);
        setElement(term256081, 3, term257040);
        setField(term257212, term257212.getClass(), "value", term257270);
        setIntField(term257212, term257212.getClass(), "count", 0);
        setElement(term256081, 4, term257212);
        setField(term257384, term257384.getClass(), "value", term256097);
        setIntField(term257384, term257384.getClass(), "count", 0);
        setElement(term256081, 5, term257384);
        term259623 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 6);
        Object term259624 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term259625 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term259626 = (byte[]) newByteArray(16);
        Object term259627 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object[] term259628 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 6);
        Object term259629 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term259630 = newInstance(Class.forName("java.lang.StringBuffer"));
        Object term259631 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term259632 = newInstance(Class.forName("java.lang.StringBuffer"));
        Object term259633 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term259634 = newInstance(Class.forName("java.lang.StringBuffer"));
        Object term259635 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        char[] term259636 = (char[]) newCharArray(41);
        setField(term259625, term259625.getClass(), "value", term259626);
        setByteField(term259625, term259625.getClass(), "coder", (byte) 0);
        setIntField(term259625, term259625.getClass(), "count", 0);
        setField(term259624, term259624.getClass(), "value", term259625);
        setIntField(term259624, term259624.getClass(), "count", 0);
        setElement(term259623, 0, term259624);
        setElement(term259628, 0, term259624);
        setElement(term259628, 1, term259627);
        setField(term259630, term259630.getClass(), "toStringCache", null);
        setField(term259630, term259630.getClass(), "value", null);
        setByteField(term259630, term259630.getClass(), "coder", (byte) 0);
        setIntField(term259630, term259630.getClass(), "count", 0);
        setField(term259629, term259629.getClass(), "value", term259630);
        setIntField(term259629, term259629.getClass(), "count", 0);
        setElement(term259628, 2, term259629);
        setField(term259632, term259632.getClass(), "toStringCache", null);
        setField(term259632, term259632.getClass(), "value", null);
        setByteField(term259632, term259632.getClass(), "coder", (byte) 0);
        setIntField(term259632, term259632.getClass(), "count", 0);
        setField(term259631, term259631.getClass(), "value", term259632);
        setIntField(term259631, term259631.getClass(), "count", 0);
        setElement(term259628, 3, term259631);
        setField(term259634, term259634.getClass(), "toStringCache", null);
        setField(term259634, term259634.getClass(), "value", null);
        setByteField(term259634, term259634.getClass(), "coder", (byte) 0);
        setIntField(term259634, term259634.getClass(), "count", 0);
        setField(term259633, term259633.getClass(), "value", term259634);
        setIntField(term259633, term259633.getClass(), "count", 0);
        setElement(term259628, 4, term259633);
        setField(term259635, term259635.getClass(), "value", term259636);
        setIntField(term259635, term259635.getClass(), "count", 0);
        setElement(term259628, 5, term259635);
        setField(term259627, term259627.getClass(), "value", term259628);
        setIntField(term259627, term259627.getClass(), "count", 0);
        setElement(term259623, 1, term259627);
        setElement(term259623, 2, term259629);
        setElement(term259623, 3, term259631);
        setElement(term259623, 4, term259633);
        setElement(term259623, 5, term259635);
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
        args[0] = term256081;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term256081, term259623));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


