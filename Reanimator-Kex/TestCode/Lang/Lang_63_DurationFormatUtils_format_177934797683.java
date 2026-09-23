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

public class DurationFormatUtils_format_177934797683 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48221;
     Object term52180;

    public DurationFormatUtils_format_177934797683() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term49977 = new StringBuffer();
        term48221 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 4);
        Object term49463 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        char[] term48235 = (char[]) newCharArray(513);
        Object term49577 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term49691 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term49805 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term49919 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term49463, term49463.getClass(), "value", term48235);
        setIntField(term49463, term49463.getClass(), "count", 0);
        setElement(term48221, 0, term49463);
        setField(term49691, term49691.getClass(), "value", term49805);
        setIntField(term49691, term49691.getClass(), "count", 0);
        setField(term49577, term49577.getClass(), "value", term49691);
        setIntField(term49577, term49577.getClass(), "count", 0);
        setElement(term48221, 1, term49577);
        setField(term49919, term49919.getClass(), "value", term49977);
        setIntField(term49919, term49919.getClass(), "count", 0);
        setElement(term48221, 2, term49919);
        setElement(term48221, 3, term49691);
        term52180 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 4);
        Object term52181 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        char[] term52182 = (char[]) newCharArray(513);
        Object term52183 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term52184 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term52185 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term52186 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term52187 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term52190 = (byte[]) newByteArray(16);
        setField(term52181, term52181.getClass(), "value", term52182);
        setIntField(term52181, term52181.getClass(), "count", 0);
        setElement(term52180, 0, term52181);
        setField(term52185, term52185.getClass(), "value", null);
        setIntField(term52185, term52185.getClass(), "count", 0);
        setField(term52184, term52184.getClass(), "value", term52185);
        setIntField(term52184, term52184.getClass(), "count", 0);
        setField(term52183, term52183.getClass(), "value", term52184);
        setIntField(term52183, term52183.getClass(), "count", 0);
        setElement(term52180, 1, term52183);
        setField(term52187, term52187.getClass(), "toStringCache", "");
        setField(term52187, term52187.getClass(), "value", term52190);
        setByteField(term52187, term52187.getClass(), "coder", (byte) 0);
        setIntField(term52187, term52187.getClass(), "count", 0);
        setField(term52186, term52186.getClass(), "value", term52187);
        setIntField(term52186, term52186.getClass(), "count", 0);
        setElement(term52180, 2, term52186);
        setElement(term52180, 3, term52184);
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
        args[0] = term48221;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term48221, term52180));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


