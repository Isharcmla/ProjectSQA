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

public class DurationFormatUtils_format_1779347976251 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term177171;
     Object term178138;

    public DurationFormatUtils_format_1779347976251() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term178028 = new StringBuffer();
        term177171 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 3);
        Object term177856 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term177970 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term177856, term177856.getClass(), "value", null);
        setIntField(term177856, term177856.getClass(), "count", 0);
        setElement(term177171, 0, term177856);
        setElement(term177171, 1, term177856);
        setField(term177970, term177970.getClass(), "value", term178028);
        setIntField(term177970, term177970.getClass(), "count", 0);
        setElement(term177171, 2, term177970);
        term178138 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 3);
        Object term178139 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term178140 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term178141 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term178144 = (byte[]) newByteArray(16);
        setField(term178139, term178139.getClass(), "value", null);
        setIntField(term178139, term178139.getClass(), "count", 0);
        setElement(term178138, 0, term178139);
        setElement(term178138, 1, term178139);
        setField(term178141, term178141.getClass(), "toStringCache", "");
        setField(term178141, term178141.getClass(), "value", term178144);
        setByteField(term178141, term178141.getClass(), "coder", (byte) 0);
        setIntField(term178141, term178141.getClass(), "count", 0);
        setField(term178140, term178140.getClass(), "value", term178141);
        setIntField(term178140, term178140.getClass(), "count", 0);
        setElement(term178138, 2, term178140);
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
        args[0] = term177171;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term177171, term178138));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


