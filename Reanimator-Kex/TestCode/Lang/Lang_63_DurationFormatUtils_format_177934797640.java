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

public class DurationFormatUtils_format_177934797640 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19716;
     Object term21754;

    public DurationFormatUtils_format_177934797640() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuilder term20483 = new StringBuilder();
        term19716 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 3);
        Object term20195 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term20309 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term20423 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term20195, term20195.getClass(), "value", null);
        setIntField(term20195, term20195.getClass(), "count", 0);
        setElement(term19716, 0, term20195);
        setField(term20309, term20309.getClass(), "value", null);
        setIntField(term20309, term20309.getClass(), "count", 0);
        setElement(term19716, 1, term20309);
        setField(term20423, term20423.getClass(), "value", term20483);
        setIntField(term20423, term20423.getClass(), "count", 0);
        setElement(term19716, 2, term20423);
        term21754 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 3);
        Object term21755 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term21756 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term21757 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term21758 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term21759 = (byte[]) newByteArray(16);
        setField(term21755, term21755.getClass(), "value", null);
        setIntField(term21755, term21755.getClass(), "count", 0);
        setElement(term21754, 0, term21755);
        setField(term21756, term21756.getClass(), "value", null);
        setIntField(term21756, term21756.getClass(), "count", 0);
        setElement(term21754, 1, term21756);
        setField(term21758, term21758.getClass(), "value", term21759);
        setByteField(term21758, term21758.getClass(), "coder", (byte) 0);
        setIntField(term21758, term21758.getClass(), "count", 0);
        setField(term21757, term21757.getClass(), "value", term21758);
        setIntField(term21757, term21757.getClass(), "count", 0);
        setElement(term21754, 2, term21757);
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
        args[0] = term19716;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term19716, term21754));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


