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

public class DurationFormatUtils_format_1779347976196 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term135476;
     Object term137794;

    public DurationFormatUtils_format_1779347976196() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term135957 = new StringBuffer();
        StringBuffer term136129 = new StringBuffer();
        term135476 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 3);
        Object term135747 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term135785 = newInstance(Class.forName("java.lang.Object"));
        Object term135899 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term136071 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term135747, term135747.getClass(), "value", term135785);
        setIntField(term135747, term135747.getClass(), "count", 0);
        setElement(term135476, 0, term135747);
        setField(term135899, term135899.getClass(), "value", term135957);
        setIntField(term135899, term135899.getClass(), "count", 0);
        setElement(term135476, 1, term135899);
        setField(term136071, term136071.getClass(), "value", term136129);
        setIntField(term136071, term136071.getClass(), "count", 0);
        setElement(term135476, 2, term136071);
        term137794 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 3);
        Object term137795 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term137796 = newInstance(Class.forName("java.lang.Object"));
        Object term137797 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term137798 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term137801 = (byte[]) newByteArray(16);
        Object term137802 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term137803 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term137806 = (byte[]) newByteArray(16);
        setField(term137795, term137795.getClass(), "value", term137796);
        setIntField(term137795, term137795.getClass(), "count", 0);
        setElement(term137794, 0, term137795);
        setField(term137798, term137798.getClass(), "toStringCache", "");
        setField(term137798, term137798.getClass(), "value", term137801);
        setByteField(term137798, term137798.getClass(), "coder", (byte) 0);
        setIntField(term137798, term137798.getClass(), "count", 0);
        setField(term137797, term137797.getClass(), "value", term137798);
        setIntField(term137797, term137797.getClass(), "count", 0);
        setElement(term137794, 1, term137797);
        setField(term137803, term137803.getClass(), "toStringCache", "");
        setField(term137803, term137803.getClass(), "value", term137806);
        setByteField(term137803, term137803.getClass(), "coder", (byte) 0);
        setIntField(term137803, term137803.getClass(), "count", 0);
        setField(term137802, term137802.getClass(), "value", term137803);
        setIntField(term137802, term137802.getClass(), "count", 0);
        setElement(term137794, 2, term137802);
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
        args[0] = term135476;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term135476, term137794));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


