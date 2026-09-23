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

public class DurationFormatUtils_format_1779347976261 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term189017;
     Object term190274;

    public DurationFormatUtils_format_1779347976261() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term189804 = new StringBuffer();
        StringBuffer term189976 = new StringBuffer();
        term189017 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 5);
        Object term189746 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term189918 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term189746, term189746.getClass(), "value", term189804);
        setIntField(term189746, term189746.getClass(), "count", 0);
        setElement(term189017, 0, term189746);
        setField(term189918, term189918.getClass(), "value", term189976);
        setIntField(term189918, term189918.getClass(), "count", 0);
        setElement(term189017, 1, term189918);
        setElement(term189017, 2, term189918);
        setElement(term189017, 3, term189918);
        setElement(term189017, 4, term189918);
        term190274 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 5);
        Object term190275 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term190276 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term190279 = (byte[]) newByteArray(16);
        Object term190280 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term190281 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term190284 = (byte[]) newByteArray(16);
        setField(term190276, term190276.getClass(), "toStringCache", "");
        setField(term190276, term190276.getClass(), "value", term190279);
        setByteField(term190276, term190276.getClass(), "coder", (byte) 0);
        setIntField(term190276, term190276.getClass(), "count", 0);
        setField(term190275, term190275.getClass(), "value", term190276);
        setIntField(term190275, term190275.getClass(), "count", 0);
        setElement(term190274, 0, term190275);
        setField(term190281, term190281.getClass(), "toStringCache", "");
        setField(term190281, term190281.getClass(), "value", term190284);
        setByteField(term190281, term190281.getClass(), "coder", (byte) 0);
        setIntField(term190281, term190281.getClass(), "count", 0);
        setField(term190280, term190280.getClass(), "value", term190281);
        setIntField(term190280, term190280.getClass(), "count", 0);
        setElement(term190274, 1, term190280);
        setElement(term190274, 2, term190280);
        setElement(term190274, 3, term190280);
        setElement(term190274, 4, term190280);
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
        args[0] = term189017;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term189017, term190274));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


