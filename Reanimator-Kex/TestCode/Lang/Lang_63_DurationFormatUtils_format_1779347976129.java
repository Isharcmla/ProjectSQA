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

public class DurationFormatUtils_format_1779347976129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term93005;
     Object term96577;

    public DurationFormatUtils_format_1779347976129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term93899 = new StringBuffer();
        StringBuffer term94185 = new StringBuffer();
        term93005 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 5);
        Object term93511 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term93625 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term93727 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils"));
        Object term93841 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term94013 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term94127 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term93511, term93511.getClass(), "value", null);
        setIntField(term93511, term93511.getClass(), "count", 0);
        setElement(term93005, 0, term93511);
        setField(term93625, term93625.getClass(), "value", term93727);
        setIntField(term93625, term93625.getClass(), "count", 0);
        setElement(term93005, 1, term93625);
        setField(term93841, term93841.getClass(), "value", term93899);
        setIntField(term93841, term93841.getClass(), "count", 0);
        setElement(term93005, 2, term93841);
        setField(term94013, term94013.getClass(), "value", null);
        setIntField(term94013, term94013.getClass(), "count", 0);
        setElement(term93005, 3, term94013);
        setField(term94127, term94127.getClass(), "value", term94185);
        setIntField(term94127, term94127.getClass(), "count", 0);
        setElement(term93005, 4, term94127);
        term96577 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 5);
        Object term96578 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term96579 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term96580 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils"));
        Object term96581 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term96582 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term96585 = (byte[]) newByteArray(16);
        Object term96586 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term96587 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term96588 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term96591 = (byte[]) newByteArray(16);
        setField(term96578, term96578.getClass(), "value", null);
        setIntField(term96578, term96578.getClass(), "count", 0);
        setElement(term96577, 0, term96578);
        setField(term96579, term96579.getClass(), "value", term96580);
        setIntField(term96579, term96579.getClass(), "count", 0);
        setElement(term96577, 1, term96579);
        setField(term96582, term96582.getClass(), "toStringCache", "");
        setField(term96582, term96582.getClass(), "value", term96585);
        setByteField(term96582, term96582.getClass(), "coder", (byte) 0);
        setIntField(term96582, term96582.getClass(), "count", 0);
        setField(term96581, term96581.getClass(), "value", term96582);
        setIntField(term96581, term96581.getClass(), "count", 0);
        setElement(term96577, 2, term96581);
        setField(term96586, term96586.getClass(), "value", null);
        setIntField(term96586, term96586.getClass(), "count", 0);
        setElement(term96577, 3, term96586);
        setField(term96588, term96588.getClass(), "toStringCache", "");
        setField(term96588, term96588.getClass(), "value", term96591);
        setByteField(term96588, term96588.getClass(), "coder", (byte) 0);
        setIntField(term96588, term96588.getClass(), "count", 0);
        setField(term96587, term96587.getClass(), "value", term96588);
        setIntField(term96587, term96587.getClass(), "count", 0);
        setElement(term96577, 4, term96587);
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
        args[0] = term93005;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term93005, term96577));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


