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

public class DurationFormatUtils_format_177934797648 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24476;
     Object term26322;

    public DurationFormatUtils_format_177934797648() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term25361 = new StringBuffer();
        term24476 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 2);
        Object term25189 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term25303 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term25189, term25189.getClass(), "value", null);
        setIntField(term25189, term25189.getClass(), "count", 0);
        setElement(term24476, 0, term25189);
        setField(term25303, term25303.getClass(), "value", term25361);
        setIntField(term25303, term25303.getClass(), "count", 0);
        setElement(term24476, 1, term25303);
        term26322 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 2);
        Object term26323 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term26324 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term26325 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term26328 = (byte[]) newByteArray(16);
        setField(term26323, term26323.getClass(), "value", null);
        setIntField(term26323, term26323.getClass(), "count", 0);
        setElement(term26322, 0, term26323);
        setField(term26325, term26325.getClass(), "toStringCache", "");
        setField(term26325, term26325.getClass(), "value", term26328);
        setByteField(term26325, term26325.getClass(), "coder", (byte) 0);
        setIntField(term26325, term26325.getClass(), "count", 0);
        setField(term26324, term26324.getClass(), "value", term26325);
        setIntField(term26324, term26324.getClass(), "count", 0);
        setElement(term26322, 1, term26324);
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
        args[0] = term24476;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term24476, term26322));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


