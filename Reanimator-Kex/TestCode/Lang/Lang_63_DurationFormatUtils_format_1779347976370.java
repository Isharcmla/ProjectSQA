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

public class DurationFormatUtils_format_1779347976370 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term291355;
     Object term293879;

    public DurationFormatUtils_format_1779347976370() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term292257 = new StringBuffer();
        term291355 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 6);
        Object term292085 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term292199 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term292085, term292085.getClass(), "value", null);
        setIntField(term292085, term292085.getClass(), "count", 0);
        setElement(term291355, 0, term292085);
        setField(term292199, term292199.getClass(), "value", term292257);
        setIntField(term292199, term292199.getClass(), "count", 0);
        setElement(term291355, 1, term292199);
        setElement(term291355, 2, term292085);
        setElement(term291355, 3, term292085);
        setElement(term291355, 4, term292199);
        setElement(term291355, 5, term292199);
        term293879 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 6);
        Object term293880 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term293881 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term293882 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term293885 = (byte[]) newByteArray(16);
        setField(term293880, term293880.getClass(), "value", null);
        setIntField(term293880, term293880.getClass(), "count", 0);
        setElement(term293879, 0, term293880);
        setField(term293882, term293882.getClass(), "toStringCache", "");
        setField(term293882, term293882.getClass(), "value", term293885);
        setByteField(term293882, term293882.getClass(), "coder", (byte) 0);
        setIntField(term293882, term293882.getClass(), "count", 0);
        setField(term293881, term293881.getClass(), "value", term293882);
        setIntField(term293881, term293881.getClass(), "count", 0);
        setElement(term293879, 1, term293881);
        setElement(term293879, 2, term293880);
        setElement(term293879, 3, term293880);
        setElement(term293879, 4, term293881);
        setElement(term293879, 5, term293881);
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
        args[0] = term291355;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term291355, term293879));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


