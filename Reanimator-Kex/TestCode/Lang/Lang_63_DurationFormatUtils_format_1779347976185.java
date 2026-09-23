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

public class DurationFormatUtils_format_1779347976185 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term129196;
     Object term130587;

    public DurationFormatUtils_format_1779347976185() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term129973 = new StringBuffer();
        StringBuffer term130297 = new StringBuffer();
        term129196 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 3);
        Object term129915 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term130087 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term130125 = newInstance(Class.forName("java.lang.Object"));
        Object term130239 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term129915, term129915.getClass(), "value", term129973);
        setIntField(term129915, term129915.getClass(), "count", 0);
        setElement(term129196, 0, term129915);
        setField(term130087, term130087.getClass(), "value", term130125);
        setIntField(term130087, term130087.getClass(), "count", 0);
        setElement(term129196, 1, term130087);
        setField(term130239, term130239.getClass(), "value", term130297);
        setIntField(term130239, term130239.getClass(), "count", 0);
        setElement(term129196, 2, term130239);
        term130587 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 3);
        Object term130588 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term130589 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term130592 = (byte[]) newByteArray(16);
        Object term130593 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term130594 = newInstance(Class.forName("java.lang.Object"));
        Object term130595 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term130596 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term130599 = (byte[]) newByteArray(16);
        setField(term130589, term130589.getClass(), "toStringCache", "");
        setField(term130589, term130589.getClass(), "value", term130592);
        setByteField(term130589, term130589.getClass(), "coder", (byte) 0);
        setIntField(term130589, term130589.getClass(), "count", 0);
        setField(term130588, term130588.getClass(), "value", term130589);
        setIntField(term130588, term130588.getClass(), "count", 0);
        setElement(term130587, 0, term130588);
        setField(term130593, term130593.getClass(), "value", term130594);
        setIntField(term130593, term130593.getClass(), "count", 0);
        setElement(term130587, 1, term130593);
        setField(term130596, term130596.getClass(), "toStringCache", "");
        setField(term130596, term130596.getClass(), "value", term130599);
        setByteField(term130596, term130596.getClass(), "coder", (byte) 0);
        setIntField(term130596, term130596.getClass(), "count", 0);
        setField(term130595, term130595.getClass(), "value", term130596);
        setIntField(term130595, term130595.getClass(), "count", 0);
        setElement(term130587, 2, term130595);
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
        args[0] = term129196;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term129196, term130587));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


