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

public class DurationFormatUtils_format_1779347976164 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term118400;
     Object term121052;

    public DurationFormatUtils_format_1779347976164() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuilder term119097 = new StringBuilder();
        StringBuffer term119269 = new StringBuffer();
        term118400 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 6);
        Object term118695 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term118809 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term118923 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term119037 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term119211 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term119383 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term118695, term118695.getClass(), "value", null);
        setIntField(term118695, term118695.getClass(), "count", 0);
        setElement(term118400, 0, term118695);
        setField(term118809, term118809.getClass(), "value", null);
        setIntField(term118809, term118809.getClass(), "count", 0);
        setElement(term118400, 1, term118809);
        setField(term118923, term118923.getClass(), "value", null);
        setIntField(term118923, term118923.getClass(), "count", 0);
        setElement(term118400, 2, term118923);
        setField(term119037, term119037.getClass(), "value", term119097);
        setIntField(term119037, term119037.getClass(), "count", 0);
        setElement(term118400, 3, term119037);
        setField(term119211, term119211.getClass(), "value", term119269);
        setIntField(term119211, term119211.getClass(), "count", 0);
        setElement(term118400, 4, term119211);
        setField(term119383, term119383.getClass(), "value", "");
        setIntField(term119383, term119383.getClass(), "count", 0);
        setElement(term118400, 5, term119383);
        term121052 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 6);
        Object term121053 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term121054 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term121055 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term121056 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term121057 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term121058 = (byte[]) newByteArray(16);
        Object term121059 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term121060 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term121063 = (byte[]) newByteArray(16);
        Object term121064 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term121053, term121053.getClass(), "value", null);
        setIntField(term121053, term121053.getClass(), "count", 0);
        setElement(term121052, 0, term121053);
        setField(term121054, term121054.getClass(), "value", null);
        setIntField(term121054, term121054.getClass(), "count", 0);
        setElement(term121052, 1, term121054);
        setField(term121055, term121055.getClass(), "value", null);
        setIntField(term121055, term121055.getClass(), "count", 0);
        setElement(term121052, 2, term121055);
        setField(term121057, term121057.getClass(), "value", term121058);
        setByteField(term121057, term121057.getClass(), "coder", (byte) 0);
        setIntField(term121057, term121057.getClass(), "count", 0);
        setField(term121056, term121056.getClass(), "value", term121057);
        setIntField(term121056, term121056.getClass(), "count", 0);
        setElement(term121052, 3, term121056);
        setField(term121060, term121060.getClass(), "toStringCache", "");
        setField(term121060, term121060.getClass(), "value", term121063);
        setByteField(term121060, term121060.getClass(), "coder", (byte) 0);
        setIntField(term121060, term121060.getClass(), "count", 0);
        setField(term121059, term121059.getClass(), "value", term121060);
        setIntField(term121059, term121059.getClass(), "count", 0);
        setElement(term121052, 4, term121059);
        setField(term121064, term121064.getClass(), "value", "");
        setIntField(term121064, term121064.getClass(), "count", 0);
        setElement(term121052, 5, term121064);
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
        args[0] = term118400;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term118400, term121052));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


