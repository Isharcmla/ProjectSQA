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

public class DurationFormatUtils_format_1779347976212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term145463;
     Object term147098;

    public DurationFormatUtils_format_1779347976212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term145904 = new StringBuffer();
        StringBuilder term146192 = new StringBuilder();
        term145463 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 4);
        Object term145732 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term145846 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term146018 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term146132 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term145732, term145732.getClass(), "value", null);
        setIntField(term145732, term145732.getClass(), "count", 0);
        setElement(term145463, 0, term145732);
        setField(term145846, term145846.getClass(), "value", term145904);
        setIntField(term145846, term145846.getClass(), "count", 0);
        setElement(term145463, 1, term145846);
        setField(term146018, term146018.getClass(), "value", null);
        setIntField(term146018, term146018.getClass(), "count", 0);
        setElement(term145463, 2, term146018);
        setField(term146132, term146132.getClass(), "value", term146192);
        setIntField(term146132, term146132.getClass(), "count", 0);
        setElement(term145463, 3, term146132);
        term147098 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 4);
        Object term147099 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term147100 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term147101 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term147104 = (byte[]) newByteArray(16);
        Object term147105 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term147106 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term147107 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term147108 = (byte[]) newByteArray(16);
        setField(term147099, term147099.getClass(), "value", null);
        setIntField(term147099, term147099.getClass(), "count", 0);
        setElement(term147098, 0, term147099);
        setField(term147101, term147101.getClass(), "toStringCache", "");
        setField(term147101, term147101.getClass(), "value", term147104);
        setByteField(term147101, term147101.getClass(), "coder", (byte) 0);
        setIntField(term147101, term147101.getClass(), "count", 0);
        setField(term147100, term147100.getClass(), "value", term147101);
        setIntField(term147100, term147100.getClass(), "count", 0);
        setElement(term147098, 1, term147100);
        setField(term147105, term147105.getClass(), "value", null);
        setIntField(term147105, term147105.getClass(), "count", 0);
        setElement(term147098, 2, term147105);
        setField(term147107, term147107.getClass(), "value", term147108);
        setByteField(term147107, term147107.getClass(), "coder", (byte) 0);
        setIntField(term147107, term147107.getClass(), "count", 0);
        setField(term147106, term147106.getClass(), "value", term147107);
        setIntField(term147106, term147106.getClass(), "count", 0);
        setElement(term147098, 3, term147106);
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
        args[0] = term145463;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term145463, term147098));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


