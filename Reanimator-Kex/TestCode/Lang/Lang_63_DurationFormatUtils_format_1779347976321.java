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

public class DurationFormatUtils_format_1779347976321 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term239531;
     Object term241163;

    public DurationFormatUtils_format_1779347976321() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term240343 = new StringBuffer();
        StringBuffer term240629 = new StringBuffer();
        StringBuffer term240801 = new StringBuffer();
        term239531 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 5);
        Object term240285 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term240457 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term240571 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term240743 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term240915 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term240285, term240285.getClass(), "value", term240343);
        setIntField(term240285, term240285.getClass(), "count", 0);
        setElement(term239531, 0, term240285);
        setField(term240457, term240457.getClass(), "value", null);
        setIntField(term240457, term240457.getClass(), "count", 0);
        setElement(term239531, 1, term240457);
        setField(term240571, term240571.getClass(), "value", term240629);
        setIntField(term240571, term240571.getClass(), "count", 0);
        setElement(term239531, 2, term240571);
        setField(term240743, term240743.getClass(), "value", term240801);
        setIntField(term240743, term240743.getClass(), "count", 0);
        setElement(term239531, 3, term240743);
        setElement(term239531, 4, term240915);
        term241163 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 5);
        Object term241164 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term241165 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term241168 = (byte[]) newByteArray(16);
        Object term241169 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term241170 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term241171 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term241174 = (byte[]) newByteArray(16);
        Object term241175 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term241176 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term241179 = (byte[]) newByteArray(16);
        Object term241180 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term241165, term241165.getClass(), "toStringCache", "");
        setField(term241165, term241165.getClass(), "value", term241168);
        setByteField(term241165, term241165.getClass(), "coder", (byte) 0);
        setIntField(term241165, term241165.getClass(), "count", 0);
        setField(term241164, term241164.getClass(), "value", term241165);
        setIntField(term241164, term241164.getClass(), "count", 0);
        setElement(term241163, 0, term241164);
        setField(term241169, term241169.getClass(), "value", null);
        setIntField(term241169, term241169.getClass(), "count", 0);
        setElement(term241163, 1, term241169);
        setField(term241171, term241171.getClass(), "toStringCache", "");
        setField(term241171, term241171.getClass(), "value", term241174);
        setByteField(term241171, term241171.getClass(), "coder", (byte) 0);
        setIntField(term241171, term241171.getClass(), "count", 0);
        setField(term241170, term241170.getClass(), "value", term241171);
        setIntField(term241170, term241170.getClass(), "count", 0);
        setElement(term241163, 2, term241170);
        setField(term241176, term241176.getClass(), "toStringCache", "");
        setField(term241176, term241176.getClass(), "value", term241179);
        setByteField(term241176, term241176.getClass(), "coder", (byte) 0);
        setIntField(term241176, term241176.getClass(), "count", 0);
        setField(term241175, term241175.getClass(), "value", term241176);
        setIntField(term241175, term241175.getClass(), "count", 0);
        setElement(term241163, 3, term241175);
        setField(term241180, term241180.getClass(), "value", null);
        setIntField(term241180, term241180.getClass(), "count", 0);
        setElement(term241163, 4, term241180);
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
        args[0] = term239531;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term239531, term241163));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


