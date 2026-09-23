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

public class DurationFormatUtils_format_1779347976303 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term224572;
     Object term226161;

    public DurationFormatUtils_format_1779347976303() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term224946 = new StringBuffer();
        StringBuffer term225118 = new StringBuffer();
        StringBuffer term225290 = new StringBuffer();
        StringBuffer term225576 = new StringBuffer();
        term224572 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 6);
        Object term224888 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term225060 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term225232 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term225404 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term225518 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term225690 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term225800 = newInstance(Class.forName("org.vorpal.research.kex.intrinsics.UnknownIntrinsics"));
        setField(term224888, term224888.getClass(), "value", term224946);
        setIntField(term224888, term224888.getClass(), "count", 0);
        setElement(term224572, 0, term224888);
        setField(term225060, term225060.getClass(), "value", term225118);
        setIntField(term225060, term225060.getClass(), "count", 0);
        setElement(term224572, 1, term225060);
        setField(term225232, term225232.getClass(), "value", term225290);
        setIntField(term225232, term225232.getClass(), "count", 0);
        setElement(term224572, 2, term225232);
        setField(term225404, term225404.getClass(), "value", term225118);
        setIntField(term225404, term225404.getClass(), "count", 0);
        setElement(term224572, 3, term225404);
        setField(term225518, term225518.getClass(), "value", term225576);
        setIntField(term225518, term225518.getClass(), "count", 0);
        setElement(term224572, 4, term225518);
        setField(term225690, term225690.getClass(), "value", term225800);
        setIntField(term225690, term225690.getClass(), "count", 0);
        setElement(term224572, 5, term225690);
        term226161 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 6);
        Object term226162 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term226163 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term226166 = (byte[]) newByteArray(16);
        Object term226167 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term226168 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term226171 = (byte[]) newByteArray(16);
        Object term226172 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term226173 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term226176 = (byte[]) newByteArray(16);
        Object term226177 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term226178 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term226179 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term226182 = (byte[]) newByteArray(16);
        Object term226183 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term226184 = newInstance(Class.forName("org.vorpal.research.kex.intrinsics.UnknownIntrinsics"));
        setField(term226163, term226163.getClass(), "toStringCache", "");
        setField(term226163, term226163.getClass(), "value", term226166);
        setByteField(term226163, term226163.getClass(), "coder", (byte) 0);
        setIntField(term226163, term226163.getClass(), "count", 0);
        setField(term226162, term226162.getClass(), "value", term226163);
        setIntField(term226162, term226162.getClass(), "count", 0);
        setElement(term226161, 0, term226162);
        setField(term226168, term226168.getClass(), "toStringCache", "");
        setField(term226168, term226168.getClass(), "value", term226171);
        setByteField(term226168, term226168.getClass(), "coder", (byte) 0);
        setIntField(term226168, term226168.getClass(), "count", 0);
        setField(term226167, term226167.getClass(), "value", term226168);
        setIntField(term226167, term226167.getClass(), "count", 0);
        setElement(term226161, 1, term226167);
        setField(term226173, term226173.getClass(), "toStringCache", "");
        setField(term226173, term226173.getClass(), "value", term226176);
        setByteField(term226173, term226173.getClass(), "coder", (byte) 0);
        setIntField(term226173, term226173.getClass(), "count", 0);
        setField(term226172, term226172.getClass(), "value", term226173);
        setIntField(term226172, term226172.getClass(), "count", 0);
        setElement(term226161, 2, term226172);
        setField(term226177, term226177.getClass(), "value", term226168);
        setIntField(term226177, term226177.getClass(), "count", 0);
        setElement(term226161, 3, term226177);
        setField(term226179, term226179.getClass(), "toStringCache", "");
        setField(term226179, term226179.getClass(), "value", term226182);
        setByteField(term226179, term226179.getClass(), "coder", (byte) 0);
        setIntField(term226179, term226179.getClass(), "count", 0);
        setField(term226178, term226178.getClass(), "value", term226179);
        setIntField(term226178, term226178.getClass(), "count", 0);
        setElement(term226161, 4, term226178);
        setField(term226183, term226183.getClass(), "value", term226184);
        setIntField(term226183, term226183.getClass(), "count", 0);
        setElement(term226161, 5, term226183);
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
        args[0] = term224572;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term224572, term226161));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


