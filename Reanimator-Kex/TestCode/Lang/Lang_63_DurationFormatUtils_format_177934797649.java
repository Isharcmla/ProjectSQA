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

public class DurationFormatUtils_format_177934797649 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25370;
     Object term26595;

    public DurationFormatUtils_format_177934797649() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuilder term25836 = new StringBuilder();
        StringBuilder term26226 = new StringBuilder();
        term25370 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 4);
        Object term25662 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        char[] term25449 = (char[]) newCharArray(0);
        Object term25776 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term25950 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term26052 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils"));
        Object term26166 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term25662, term25662.getClass(), "value", term25449);
        setIntField(term25662, term25662.getClass(), "count", 0);
        setElement(term25370, 0, term25662);
        setField(term25776, term25776.getClass(), "value", term25836);
        setIntField(term25776, term25776.getClass(), "count", 0);
        setElement(term25370, 1, term25776);
        setField(term25950, term25950.getClass(), "value", term26052);
        setIntField(term25950, term25950.getClass(), "count", 0);
        setElement(term25370, 2, term25950);
        setField(term26166, term26166.getClass(), "value", term26226);
        setIntField(term26166, term26166.getClass(), "count", 0);
        setElement(term25370, 3, term26166);
        term26595 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 4);
        Object term26596 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        char[] term26597 = (char[]) newCharArray(0);
        Object term26598 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term26599 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term26600 = (byte[]) newByteArray(16);
        Object term26601 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term26602 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils"));
        Object term26603 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term26604 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term26605 = (byte[]) newByteArray(16);
        setField(term26596, term26596.getClass(), "value", term26597);
        setIntField(term26596, term26596.getClass(), "count", 0);
        setElement(term26595, 0, term26596);
        setField(term26599, term26599.getClass(), "value", term26600);
        setByteField(term26599, term26599.getClass(), "coder", (byte) 0);
        setIntField(term26599, term26599.getClass(), "count", 0);
        setField(term26598, term26598.getClass(), "value", term26599);
        setIntField(term26598, term26598.getClass(), "count", 0);
        setElement(term26595, 1, term26598);
        setField(term26601, term26601.getClass(), "value", term26602);
        setIntField(term26601, term26601.getClass(), "count", 0);
        setElement(term26595, 2, term26601);
        setField(term26604, term26604.getClass(), "value", term26605);
        setByteField(term26604, term26604.getClass(), "coder", (byte) 0);
        setIntField(term26604, term26604.getClass(), "count", 0);
        setField(term26603, term26603.getClass(), "value", term26604);
        setIntField(term26603, term26603.getClass(), "count", 0);
        setElement(term26595, 3, term26603);
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
        args[0] = term25370;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term25370, term26595));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


