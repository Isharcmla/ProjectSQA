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

public class DurationFormatUtils_format_177934797629 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13849;
     Object term14308;

    public DurationFormatUtils_format_177934797629() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuilder term14221 = new StringBuilder();
        term13849 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 1);
        Object term14161 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term14161, term14161.getClass(), "value", term14221);
        setIntField(term14161, term14161.getClass(), "count", 0);
        setElement(term13849, 0, term14161);
        term14308 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 1);
        Object term14309 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term14310 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term14311 = (byte[]) newByteArray(16);
        setField(term14310, term14310.getClass(), "value", term14311);
        setByteField(term14310, term14310.getClass(), "coder", (byte) 0);
        setIntField(term14310, term14310.getClass(), "count", 0);
        setField(term14309, term14309.getClass(), "value", term14310);
        setIntField(term14309, term14309.getClass(), "count", 0);
        setElement(term14308, 0, term14309);
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
        args[0] = term13849;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term13849, term14308));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


