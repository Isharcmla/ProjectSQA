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
import java.lang.StringBuilder;

public class DurationFormatUtils_format_177934797637 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17781;
     Object term19539;

    public DurationFormatUtils_format_177934797637() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term19001 = new StringBuffer();
        StringBuilder term19289 = new StringBuilder();
        term17781 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 5);
        Object term18715 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term18829 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object[] term18078 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 0);
        Object term18943 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term19115 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term19229 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term18715, term18715.getClass(), "value", null);
        setIntField(term18715, term18715.getClass(), "count", 0);
        setElement(term17781, 0, term18715);
        setField(term18829, term18829.getClass(), "value", term18078);
        setIntField(term18829, term18829.getClass(), "count", 0);
        setElement(term17781, 1, term18829);
        setField(term18943, term18943.getClass(), "value", term19001);
        setIntField(term18943, term18943.getClass(), "count", 0);
        setElement(term17781, 2, term18943);
        setField(term19115, term19115.getClass(), "value", null);
        setIntField(term19115, term19115.getClass(), "count", 0);
        setElement(term17781, 3, term19115);
        setField(term19229, term19229.getClass(), "value", term19289);
        setIntField(term19229, term19229.getClass(), "count", 0);
        setElement(term17781, 4, term19229);
        term19539 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 5);
        Object term19540 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term19541 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object[] term19542 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 0);
        Object term19543 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term19544 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term19547 = (byte[]) newByteArray(16);
        Object term19548 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term19549 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term19550 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term19551 = (byte[]) newByteArray(16);
        setField(term19540, term19540.getClass(), "value", null);
        setIntField(term19540, term19540.getClass(), "count", 0);
        setElement(term19539, 0, term19540);
        setField(term19541, term19541.getClass(), "value", term19542);
        setIntField(term19541, term19541.getClass(), "count", 0);
        setElement(term19539, 1, term19541);
        setField(term19544, term19544.getClass(), "toStringCache", "");
        setField(term19544, term19544.getClass(), "value", term19547);
        setByteField(term19544, term19544.getClass(), "coder", (byte) 0);
        setIntField(term19544, term19544.getClass(), "count", 0);
        setField(term19543, term19543.getClass(), "value", term19544);
        setIntField(term19543, term19543.getClass(), "count", 0);
        setElement(term19539, 2, term19543);
        setField(term19548, term19548.getClass(), "value", null);
        setIntField(term19548, term19548.getClass(), "count", 0);
        setElement(term19539, 3, term19548);
        setField(term19550, term19550.getClass(), "value", term19551);
        setByteField(term19550, term19550.getClass(), "coder", (byte) 0);
        setIntField(term19550, term19550.getClass(), "count", 0);
        setField(term19549, term19549.getClass(), "value", term19550);
        setIntField(term19549, term19549.getClass(), "count", 0);
        setElement(term19539, 4, term19549);
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
        args[0] = term17781;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term17781, term19539));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


