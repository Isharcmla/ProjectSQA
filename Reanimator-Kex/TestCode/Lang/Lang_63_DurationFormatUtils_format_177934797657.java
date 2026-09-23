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

public class DurationFormatUtils_format_177934797657 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29589;
     Object term30362;

    public DurationFormatUtils_format_177934797657() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term29926 = new StringBuffer();
        term29589 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 3);
        Object term29868 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term30040 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term30078 = newInstance(Class.forName("java.lang.Object"));
        Object term30192 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term29868, term29868.getClass(), "value", term29926);
        setIntField(term29868, term29868.getClass(), "count", 0);
        setElement(term29589, 0, term29868);
        setField(term30040, term30040.getClass(), "value", term30078);
        setIntField(term30040, term30040.getClass(), "count", 0);
        setElement(term29589, 1, term30040);
        setField(term30192, term30192.getClass(), "value", null);
        setIntField(term30192, term30192.getClass(), "count", 0);
        setElement(term29589, 2, term30192);
        term30362 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 3);
        Object term30363 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term30364 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term30367 = (byte[]) newByteArray(16);
        Object term30368 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term30369 = newInstance(Class.forName("java.lang.Object"));
        Object term30370 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term30364, term30364.getClass(), "toStringCache", "");
        setField(term30364, term30364.getClass(), "value", term30367);
        setByteField(term30364, term30364.getClass(), "coder", (byte) 0);
        setIntField(term30364, term30364.getClass(), "count", 0);
        setField(term30363, term30363.getClass(), "value", term30364);
        setIntField(term30363, term30363.getClass(), "count", 0);
        setElement(term30362, 0, term30363);
        setField(term30368, term30368.getClass(), "value", term30369);
        setIntField(term30368, term30368.getClass(), "count", 0);
        setElement(term30362, 1, term30368);
        setField(term30370, term30370.getClass(), "value", null);
        setIntField(term30370, term30370.getClass(), "count", 0);
        setElement(term30362, 2, term30370);
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
        args[0] = term29589;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term29589, term30362));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


