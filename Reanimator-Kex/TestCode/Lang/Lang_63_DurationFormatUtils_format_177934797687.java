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

public class DurationFormatUtils_format_177934797687 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55092;
     Object term56178;

    public DurationFormatUtils_format_177934797687() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuilder term55565 = new StringBuilder();
        StringBuilder term55967 = new StringBuilder();
        term55092 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 5);
        Object term55391 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term55505 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term55679 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term55793 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term55907 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term55391, term55391.getClass(), "value", null);
        setIntField(term55391, term55391.getClass(), "count", 0);
        setElement(term55092, 0, term55391);
        setField(term55505, term55505.getClass(), "value", term55565);
        setIntField(term55505, term55505.getClass(), "count", 0);
        setElement(term55092, 1, term55505);
        setField(term55679, term55679.getClass(), "value", null);
        setIntField(term55679, term55679.getClass(), "count", 0);
        setElement(term55092, 2, term55679);
        setField(term55793, term55793.getClass(), "value", null);
        setIntField(term55793, term55793.getClass(), "count", 0);
        setElement(term55092, 3, term55793);
        setField(term55907, term55907.getClass(), "value", term55967);
        setIntField(term55907, term55907.getClass(), "count", 0);
        setElement(term55092, 4, term55907);
        term56178 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 5);
        Object term56179 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term56180 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term56181 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term56182 = (byte[]) newByteArray(16);
        Object term56183 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term56184 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term56185 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term56186 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term56187 = (byte[]) newByteArray(16);
        setField(term56179, term56179.getClass(), "value", null);
        setIntField(term56179, term56179.getClass(), "count", 0);
        setElement(term56178, 0, term56179);
        setField(term56181, term56181.getClass(), "value", term56182);
        setByteField(term56181, term56181.getClass(), "coder", (byte) 0);
        setIntField(term56181, term56181.getClass(), "count", 0);
        setField(term56180, term56180.getClass(), "value", term56181);
        setIntField(term56180, term56180.getClass(), "count", 0);
        setElement(term56178, 1, term56180);
        setField(term56183, term56183.getClass(), "value", null);
        setIntField(term56183, term56183.getClass(), "count", 0);
        setElement(term56178, 2, term56183);
        setField(term56184, term56184.getClass(), "value", null);
        setIntField(term56184, term56184.getClass(), "count", 0);
        setElement(term56178, 3, term56184);
        setField(term56186, term56186.getClass(), "value", term56187);
        setByteField(term56186, term56186.getClass(), "coder", (byte) 0);
        setIntField(term56186, term56186.getClass(), "count", 0);
        setField(term56185, term56185.getClass(), "value", term56186);
        setIntField(term56185, term56185.getClass(), "count", 0);
        setElement(term56178, 4, term56185);
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
        args[0] = term55092;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term55092, term56178));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


