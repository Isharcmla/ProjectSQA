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

public class DurationFormatUtils_format_177934797685 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54138;
     Object term55033;

    public DurationFormatUtils_format_177934797685() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term54696 = new StringBuffer();
        StringBuffer term54868 = new StringBuffer();
        term54138 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 3);
        Object term54524 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term54638 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term54810 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term54524, term54524.getClass(), "value", null);
        setIntField(term54524, term54524.getClass(), "count", 0);
        setElement(term54138, 0, term54524);
        setField(term54638, term54638.getClass(), "value", term54696);
        setIntField(term54638, term54638.getClass(), "count", 0);
        setElement(term54138, 1, term54638);
        setField(term54810, term54810.getClass(), "value", term54868);
        setIntField(term54810, term54810.getClass(), "count", 0);
        setElement(term54138, 2, term54810);
        term55033 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 3);
        Object term55034 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term55035 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term55036 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term55039 = (byte[]) newByteArray(16);
        Object term55040 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term55041 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term55044 = (byte[]) newByteArray(16);
        setField(term55034, term55034.getClass(), "value", null);
        setIntField(term55034, term55034.getClass(), "count", 0);
        setElement(term55033, 0, term55034);
        setField(term55036, term55036.getClass(), "toStringCache", "");
        setField(term55036, term55036.getClass(), "value", term55039);
        setByteField(term55036, term55036.getClass(), "coder", (byte) 0);
        setIntField(term55036, term55036.getClass(), "count", 0);
        setField(term55035, term55035.getClass(), "value", term55036);
        setIntField(term55035, term55035.getClass(), "count", 0);
        setElement(term55033, 1, term55035);
        setField(term55041, term55041.getClass(), "toStringCache", "");
        setField(term55041, term55041.getClass(), "value", term55044);
        setByteField(term55041, term55041.getClass(), "coder", (byte) 0);
        setIntField(term55041, term55041.getClass(), "count", 0);
        setField(term55040, term55040.getClass(), "value", term55041);
        setIntField(term55040, term55040.getClass(), "count", 0);
        setElement(term55033, 2, term55040);
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
        args[0] = term54138;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term54138, term55033));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


