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
import java.lang.NullPointerException;
import static org.apache.commons.lang.time.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.StringBuffer;

public class DurationFormatUtils_format_1779347976414 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term341416;

    public DurationFormatUtils_format_1779347976414() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term342804 = new StringBuffer();
        StringBuffer term343204 = new StringBuffer();
        term341416 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 495);
        Object term342746 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term342918 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        char[] term341950 = (char[]) newCharArray(0);
        Object term343032 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term343146 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term343318 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        char[] term341434 = (char[]) newCharArray(512);
        Object term343432 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object[] term342477 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 0);
        Object term343546 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        char[] term342479 = (char[]) newCharArray(0);
        Object term343660 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object[] term342481 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 0);
        setField(term342746, term342746.getClass(), "value", term342804);
        setIntField(term342746, term342746.getClass(), "count", 0);
        setElement(term341416, 0, term342746);
        setField(term342918, term342918.getClass(), "value", term341950);
        setIntField(term342918, term342918.getClass(), "count", 0);
        setElement(term341416, 1, term342918);
        setField(term343032, term343032.getClass(), "value", term342804);
        setIntField(term343032, term343032.getClass(), "count", 0);
        setElement(term341416, 2, term343032);
        setField(term343146, term343146.getClass(), "value", term343204);
        setIntField(term343146, term343146.getClass(), "count", 0);
        setElement(term341416, 3, term343146);
        setField(term343318, term343318.getClass(), "value", term341434);
        setIntField(term343318, term343318.getClass(), "count", 0);
        setElement(term341416, 4, term343318);
        setField(term343432, term343432.getClass(), "value", term342477);
        setIntField(term343432, term343432.getClass(), "count", 0);
        setElement(term341416, 5, term343432);
        setField(term343546, term343546.getClass(), "value", term342479);
        setIntField(term343546, term343546.getClass(), "count", 0);
        setElement(term341416, 6, term343546);
        setField(term343660, term343660.getClass(), "value", term342481);
        setIntField(term343660, term343660.getClass(), "count", 0);
        setElement(term341416, 7, term343660);
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
        args[0] = term341416;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        try {
            callMethod(klass, "format", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


