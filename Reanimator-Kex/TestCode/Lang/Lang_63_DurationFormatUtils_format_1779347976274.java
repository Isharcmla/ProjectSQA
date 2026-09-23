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

public class DurationFormatUtils_format_1779347976274 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term198943;
     Object term201334;

    public DurationFormatUtils_format_1779347976274() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term199323 = new StringBuffer();
        StringBuilder term199497 = new StringBuilder();
        StringBuilder term200103 = new StringBuilder();
        term198943 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 6);
        Object term199265 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term199437 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term199611 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term199713 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils"));
        Object term199827 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term199929 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils"));
        Object term200043 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term199265, term199265.getClass(), "value", term199323);
        setIntField(term199265, term199265.getClass(), "count", 0);
        setElement(term198943, 0, term199265);
        setField(term199437, term199437.getClass(), "value", term199497);
        setIntField(term199437, term199437.getClass(), "count", 0);
        setElement(term198943, 1, term199437);
        setField(term199611, term199611.getClass(), "value", term199713);
        setIntField(term199611, term199611.getClass(), "count", 0);
        setElement(term198943, 2, term199611);
        setField(term199827, term199827.getClass(), "value", term199929);
        setIntField(term199827, term199827.getClass(), "count", 0);
        setElement(term198943, 3, term199827);
        setElement(term198943, 4, term199611);
        setField(term200043, term200043.getClass(), "value", term200103);
        setIntField(term200043, term200043.getClass(), "count", 0);
        setElement(term198943, 5, term200043);
        term201334 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 6);
        Object term201335 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term201336 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term201339 = (byte[]) newByteArray(16);
        Object term201340 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term201341 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term201342 = (byte[]) newByteArray(16);
        Object term201343 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term201344 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils"));
        Object term201345 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term201346 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils"));
        Object term201347 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term201348 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term201349 = (byte[]) newByteArray(16);
        setField(term201336, term201336.getClass(), "toStringCache", "");
        setField(term201336, term201336.getClass(), "value", term201339);
        setByteField(term201336, term201336.getClass(), "coder", (byte) 0);
        setIntField(term201336, term201336.getClass(), "count", 0);
        setField(term201335, term201335.getClass(), "value", term201336);
        setIntField(term201335, term201335.getClass(), "count", 0);
        setElement(term201334, 0, term201335);
        setField(term201341, term201341.getClass(), "value", term201342);
        setByteField(term201341, term201341.getClass(), "coder", (byte) 0);
        setIntField(term201341, term201341.getClass(), "count", 0);
        setField(term201340, term201340.getClass(), "value", term201341);
        setIntField(term201340, term201340.getClass(), "count", 0);
        setElement(term201334, 1, term201340);
        setField(term201343, term201343.getClass(), "value", term201344);
        setIntField(term201343, term201343.getClass(), "count", 0);
        setElement(term201334, 2, term201343);
        setField(term201345, term201345.getClass(), "value", term201346);
        setIntField(term201345, term201345.getClass(), "count", 0);
        setElement(term201334, 3, term201345);
        setElement(term201334, 4, term201343);
        setField(term201348, term201348.getClass(), "value", term201349);
        setByteField(term201348, term201348.getClass(), "coder", (byte) 0);
        setIntField(term201348, term201348.getClass(), "count", 0);
        setField(term201347, term201347.getClass(), "value", term201348);
        setIntField(term201347, term201347.getClass(), "count", 0);
        setElement(term201334, 5, term201347);
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
        args[0] = term198943;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term198943, term201334));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


