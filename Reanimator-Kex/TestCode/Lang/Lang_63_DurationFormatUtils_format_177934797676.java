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

public class DurationFormatUtils_format_177934797676 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44459;
     Object term45865;

    public DurationFormatUtils_format_177934797676() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term44771 = new StringBuffer();
        term44459 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 2);
        Object term44713 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term44885 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term44999 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term44713, term44713.getClass(), "value", term44771);
        setIntField(term44713, term44713.getClass(), "count", 0);
        setElement(term44459, 0, term44713);
        setField(term44885, term44885.getClass(), "value", term44999);
        setIntField(term44885, term44885.getClass(), "count", 0);
        setElement(term44459, 1, term44885);
        term45865 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 2);
        Object term45866 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term45867 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term45870 = (byte[]) newByteArray(16);
        Object term45871 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term45872 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term45867, term45867.getClass(), "toStringCache", "");
        setField(term45867, term45867.getClass(), "value", term45870);
        setByteField(term45867, term45867.getClass(), "coder", (byte) 0);
        setIntField(term45867, term45867.getClass(), "count", 0);
        setField(term45866, term45866.getClass(), "value", term45867);
        setIntField(term45866, term45866.getClass(), "count", 0);
        setElement(term45865, 0, term45866);
        setField(term45872, term45872.getClass(), "value", null);
        setIntField(term45872, term45872.getClass(), "count", 0);
        setField(term45871, term45871.getClass(), "value", term45872);
        setIntField(term45871, term45871.getClass(), "count", 0);
        setElement(term45865, 1, term45871);
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
        args[0] = term44459;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term44459, term45865));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


