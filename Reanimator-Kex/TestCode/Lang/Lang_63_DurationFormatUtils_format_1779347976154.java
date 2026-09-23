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

public class DurationFormatUtils_format_1779347976154 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term108311;
     Object term111359;

    public DurationFormatUtils_format_1779347976154() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term108611 = new StringBuffer();
        StringBuilder term108785 = new StringBuilder();
        StringBuilder term108959 = new StringBuilder();
        term108311 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 4);
        Object term108553 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term108725 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term108899 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term109073 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term108553, term108553.getClass(), "value", term108611);
        setIntField(term108553, term108553.getClass(), "count", 0);
        setElement(term108311, 0, term108553);
        setField(term108725, term108725.getClass(), "value", term108785);
        setIntField(term108725, term108725.getClass(), "count", 0);
        setElement(term108311, 1, term108725);
        setField(term108899, term108899.getClass(), "value", term108959);
        setIntField(term108899, term108899.getClass(), "count", 0);
        setElement(term108311, 2, term108899);
        setElement(term108311, 3, term109073);
        term111359 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 4);
        Object term111360 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term111361 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term111364 = (byte[]) newByteArray(16);
        Object term111365 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term111366 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term111367 = (byte[]) newByteArray(16);
        Object term111368 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term111369 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term111370 = (byte[]) newByteArray(16);
        Object term111371 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term111361, term111361.getClass(), "toStringCache", "");
        setField(term111361, term111361.getClass(), "value", term111364);
        setByteField(term111361, term111361.getClass(), "coder", (byte) 0);
        setIntField(term111361, term111361.getClass(), "count", 0);
        setField(term111360, term111360.getClass(), "value", term111361);
        setIntField(term111360, term111360.getClass(), "count", 0);
        setElement(term111359, 0, term111360);
        setField(term111366, term111366.getClass(), "value", term111367);
        setByteField(term111366, term111366.getClass(), "coder", (byte) 0);
        setIntField(term111366, term111366.getClass(), "count", 0);
        setField(term111365, term111365.getClass(), "value", term111366);
        setIntField(term111365, term111365.getClass(), "count", 0);
        setElement(term111359, 1, term111365);
        setField(term111369, term111369.getClass(), "value", term111370);
        setByteField(term111369, term111369.getClass(), "coder", (byte) 0);
        setIntField(term111369, term111369.getClass(), "count", 0);
        setField(term111368, term111368.getClass(), "value", term111369);
        setIntField(term111368, term111368.getClass(), "count", 0);
        setElement(term111359, 2, term111368);
        setField(term111371, term111371.getClass(), "value", null);
        setIntField(term111371, term111371.getClass(), "count", 0);
        setElement(term111359, 3, term111371);
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
        args[0] = term108311;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term108311, term111359));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


