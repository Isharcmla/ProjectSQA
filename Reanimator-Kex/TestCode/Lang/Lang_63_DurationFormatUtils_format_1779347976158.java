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

public class DurationFormatUtils_format_1779347976158 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term111680;
     Object term115108;

    public DurationFormatUtils_format_1779347976158() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term112424 = new StringBuffer();
        term111680 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 4);
        Object term112138 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term112252 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term112366 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term112538 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term112138, term112138.getClass(), "value", null);
        setIntField(term112138, term112138.getClass(), "count", 0);
        setElement(term111680, 0, term112138);
        setField(term112252, term112252.getClass(), "value", null);
        setIntField(term112252, term112252.getClass(), "count", 0);
        setElement(term111680, 1, term112252);
        setField(term112366, term112366.getClass(), "value", term112424);
        setIntField(term112366, term112366.getClass(), "count", 0);
        setElement(term111680, 2, term112366);
        setField(term112538, term112538.getClass(), "value", "");
        setIntField(term112538, term112538.getClass(), "count", 0);
        setElement(term111680, 3, term112538);
        term115108 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 4);
        Object term115109 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term115110 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term115111 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term115112 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term115115 = (byte[]) newByteArray(16);
        Object term115116 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term115109, term115109.getClass(), "value", null);
        setIntField(term115109, term115109.getClass(), "count", 0);
        setElement(term115108, 0, term115109);
        setField(term115110, term115110.getClass(), "value", null);
        setIntField(term115110, term115110.getClass(), "count", 0);
        setElement(term115108, 1, term115110);
        setField(term115112, term115112.getClass(), "toStringCache", "");
        setField(term115112, term115112.getClass(), "value", term115115);
        setByteField(term115112, term115112.getClass(), "coder", (byte) 0);
        setIntField(term115112, term115112.getClass(), "count", 0);
        setField(term115111, term115111.getClass(), "value", term115112);
        setIntField(term115111, term115111.getClass(), "count", 0);
        setElement(term115108, 2, term115111);
        setField(term115116, term115116.getClass(), "value", "");
        setIntField(term115116, term115116.getClass(), "count", 0);
        setElement(term115108, 3, term115116);
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
        args[0] = term111680;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term111680, term115108));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


