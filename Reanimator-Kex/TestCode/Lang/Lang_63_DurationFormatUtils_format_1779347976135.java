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

public class DurationFormatUtils_format_1779347976135 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term97086;
     Object term99329;

    public DurationFormatUtils_format_1779347976135() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term97538 = new StringBuffer();
        term97086 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 3);
        Object term97366 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term97480 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term97652 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        char[] term97170 = (char[]) newCharArray(0);
        setField(term97366, term97366.getClass(), "value", null);
        setIntField(term97366, term97366.getClass(), "count", 0);
        setElement(term97086, 0, term97366);
        setField(term97480, term97480.getClass(), "value", term97538);
        setIntField(term97480, term97480.getClass(), "count", 0);
        setElement(term97086, 1, term97480);
        setField(term97652, term97652.getClass(), "value", term97170);
        setIntField(term97652, term97652.getClass(), "count", 0);
        setElement(term97086, 2, term97652);
        term99329 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 3);
        Object term99330 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term99331 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term99332 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term99335 = (byte[]) newByteArray(16);
        Object term99336 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        char[] term99337 = (char[]) newCharArray(0);
        setField(term99330, term99330.getClass(), "value", null);
        setIntField(term99330, term99330.getClass(), "count", 0);
        setElement(term99329, 0, term99330);
        setField(term99332, term99332.getClass(), "toStringCache", "");
        setField(term99332, term99332.getClass(), "value", term99335);
        setByteField(term99332, term99332.getClass(), "coder", (byte) 0);
        setIntField(term99332, term99332.getClass(), "count", 0);
        setField(term99331, term99331.getClass(), "value", term99332);
        setIntField(term99331, term99331.getClass(), "count", 0);
        setElement(term99329, 1, term99331);
        setField(term99336, term99336.getClass(), "value", term99337);
        setIntField(term99336, term99336.getClass(), "count", 0);
        setElement(term99329, 2, term99336);
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
        args[0] = term97086;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term97086, term99329));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


