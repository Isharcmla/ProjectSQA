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

public class DurationFormatUtils_format_1779347976213 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term146193;
     Object term147253;

    public DurationFormatUtils_format_1779347976213() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term146576 = new StringBuffer();
        term146193 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 3);
        Object term146518 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term146690 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term146804 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term146914 = newInstance(Class.forName("org.vorpal.research.kex.intrinsics.UnknownIntrinsics"));
        setField(term146518, term146518.getClass(), "value", term146576);
        setIntField(term146518, term146518.getClass(), "count", 0);
        setElement(term146193, 0, term146518);
        setField(term146690, term146690.getClass(), "value", null);
        setIntField(term146690, term146690.getClass(), "count", 0);
        setElement(term146193, 1, term146690);
        setField(term146804, term146804.getClass(), "value", term146914);
        setIntField(term146804, term146804.getClass(), "count", 0);
        setElement(term146193, 2, term146804);
        term147253 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 3);
        Object term147254 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term147255 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term147258 = (byte[]) newByteArray(16);
        Object term147259 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term147260 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term147261 = newInstance(Class.forName("org.vorpal.research.kex.intrinsics.UnknownIntrinsics"));
        setField(term147255, term147255.getClass(), "toStringCache", "");
        setField(term147255, term147255.getClass(), "value", term147258);
        setByteField(term147255, term147255.getClass(), "coder", (byte) 0);
        setIntField(term147255, term147255.getClass(), "count", 0);
        setField(term147254, term147254.getClass(), "value", term147255);
        setIntField(term147254, term147254.getClass(), "count", 0);
        setElement(term147253, 0, term147254);
        setField(term147259, term147259.getClass(), "value", null);
        setIntField(term147259, term147259.getClass(), "count", 0);
        setElement(term147253, 1, term147259);
        setField(term147260, term147260.getClass(), "value", term147261);
        setIntField(term147260, term147260.getClass(), "count", 0);
        setElement(term147253, 2, term147260);
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
        args[0] = term146193;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term146193, term147253));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


