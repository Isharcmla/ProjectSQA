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

public class DurationFormatUtils_format_177934797671 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40710;
     Object term42023;

    public DurationFormatUtils_format_177934797671() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuilder term41417 = new StringBuilder();
        term40710 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 5);
        Object term41205 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term41243 = newInstance(Class.forName("java.lang.Object"));
        Object term41357 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term41531 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        char[] term40989 = (char[]) newCharArray(0);
        Object term41645 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term41759 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term41861 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils"));
        setField(term41205, term41205.getClass(), "value", term41243);
        setIntField(term41205, term41205.getClass(), "count", 0);
        setElement(term40710, 0, term41205);
        setField(term41357, term41357.getClass(), "value", term41417);
        setIntField(term41357, term41357.getClass(), "count", 0);
        setElement(term40710, 1, term41357);
        setField(term41531, term41531.getClass(), "value", term40989);
        setIntField(term41531, term41531.getClass(), "count", 0);
        setElement(term40710, 2, term41531);
        setField(term41645, term41645.getClass(), "value", term41531);
        setIntField(term41645, term41645.getClass(), "count", 0);
        setElement(term40710, 3, term41645);
        setField(term41759, term41759.getClass(), "value", term41861);
        setIntField(term41759, term41759.getClass(), "count", 0);
        setElement(term40710, 4, term41759);
        term42023 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 5);
        Object term42024 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term42025 = newInstance(Class.forName("java.lang.Object"));
        Object term42026 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term42027 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term42028 = (byte[]) newByteArray(16);
        Object term42029 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        char[] term42030 = (char[]) newCharArray(0);
        Object term42031 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term42032 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term42033 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils"));
        setField(term42024, term42024.getClass(), "value", term42025);
        setIntField(term42024, term42024.getClass(), "count", 0);
        setElement(term42023, 0, term42024);
        setField(term42027, term42027.getClass(), "value", term42028);
        setByteField(term42027, term42027.getClass(), "coder", (byte) 0);
        setIntField(term42027, term42027.getClass(), "count", 0);
        setField(term42026, term42026.getClass(), "value", term42027);
        setIntField(term42026, term42026.getClass(), "count", 0);
        setElement(term42023, 1, term42026);
        setField(term42029, term42029.getClass(), "value", term42030);
        setIntField(term42029, term42029.getClass(), "count", 0);
        setElement(term42023, 2, term42029);
        setField(term42031, term42031.getClass(), "value", term42029);
        setIntField(term42031, term42031.getClass(), "count", 0);
        setElement(term42023, 3, term42031);
        setField(term42032, term42032.getClass(), "value", term42033);
        setIntField(term42032, term42032.getClass(), "count", 0);
        setElement(term42023, 4, term42032);
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
        args[0] = term40710;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term40710, term42023));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


