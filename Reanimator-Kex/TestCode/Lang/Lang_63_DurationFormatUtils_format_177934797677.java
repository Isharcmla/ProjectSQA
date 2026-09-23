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

public class DurationFormatUtils_format_177934797677 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45010;
     Object term46006;

    public DurationFormatUtils_format_177934797677() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term45763 = new StringBuffer();
        term45010 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 3);
        Object term45477 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term45591 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term45705 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term45477, term45477.getClass(), "value", null);
        setIntField(term45477, term45477.getClass(), "count", 0);
        setElement(term45010, 0, term45477);
        setField(term45591, term45591.getClass(), "value", null);
        setIntField(term45591, term45591.getClass(), "count", 0);
        setElement(term45010, 1, term45591);
        setField(term45705, term45705.getClass(), "value", term45763);
        setIntField(term45705, term45705.getClass(), "count", 0);
        setElement(term45010, 2, term45705);
        term46006 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 3);
        Object term46007 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term46008 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term46009 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term46010 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term46013 = (byte[]) newByteArray(16);
        setField(term46007, term46007.getClass(), "value", null);
        setIntField(term46007, term46007.getClass(), "count", 0);
        setElement(term46006, 0, term46007);
        setField(term46008, term46008.getClass(), "value", null);
        setIntField(term46008, term46008.getClass(), "count", 0);
        setElement(term46006, 1, term46008);
        setField(term46010, term46010.getClass(), "toStringCache", "");
        setField(term46010, term46010.getClass(), "value", term46013);
        setByteField(term46010, term46010.getClass(), "coder", (byte) 0);
        setIntField(term46010, term46010.getClass(), "count", 0);
        setField(term46009, term46009.getClass(), "value", term46010);
        setIntField(term46009, term46009.getClass(), "count", 0);
        setElement(term46006, 2, term46009);
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
        args[0] = term45010;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term45010, term46006));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


