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

public class DurationFormatUtils_format_1779347976182 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term128130;
     Object term129170;

    public DurationFormatUtils_format_1779347976182() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term128419 = new StringBuffer();
        term128130 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 3);
        Object term128361 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term128533 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        char[] term128174 = (char[]) newCharArray(0);
        Object term128647 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        char[] term128177 = (char[]) newCharArray(0);
        setField(term128361, term128361.getClass(), "value", term128419);
        setIntField(term128361, term128361.getClass(), "count", 0);
        setElement(term128130, 0, term128361);
        setField(term128533, term128533.getClass(), "value", term128174);
        setIntField(term128533, term128533.getClass(), "count", 0);
        setElement(term128130, 1, term128533);
        setField(term128647, term128647.getClass(), "value", term128177);
        setIntField(term128647, term128647.getClass(), "count", 0);
        setElement(term128130, 2, term128647);
        term129170 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 3);
        Object term129171 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term129172 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term129175 = (byte[]) newByteArray(16);
        Object term129176 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        char[] term129177 = (char[]) newCharArray(0);
        Object term129178 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        char[] term129179 = (char[]) newCharArray(0);
        setField(term129172, term129172.getClass(), "toStringCache", "");
        setField(term129172, term129172.getClass(), "value", term129175);
        setByteField(term129172, term129172.getClass(), "coder", (byte) 0);
        setIntField(term129172, term129172.getClass(), "count", 0);
        setField(term129171, term129171.getClass(), "value", term129172);
        setIntField(term129171, term129171.getClass(), "count", 0);
        setElement(term129170, 0, term129171);
        setField(term129176, term129176.getClass(), "value", term129177);
        setIntField(term129176, term129176.getClass(), "count", 0);
        setElement(term129170, 1, term129176);
        setField(term129178, term129178.getClass(), "value", term129179);
        setIntField(term129178, term129178.getClass(), "count", 0);
        setElement(term129170, 2, term129178);
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
        args[0] = term128130;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term128130, term129170));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


