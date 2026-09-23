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

public class DurationFormatUtils_format_1779347976240 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term163168;
     Object term165057;

    public DurationFormatUtils_format_1779347976240() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term163820 = new StringBuffer();
        term163168 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 4);
        Object term163534 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term163648 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term163762 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term163934 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term164044 = newInstance(Class.forName("org.vorpal.research.kex.intrinsics.UnknownIntrinsics"));
        setField(term163534, term163534.getClass(), "value", null);
        setIntField(term163534, term163534.getClass(), "count", 0);
        setElement(term163168, 0, term163534);
        setField(term163648, term163648.getClass(), "value", null);
        setIntField(term163648, term163648.getClass(), "count", 0);
        setElement(term163168, 1, term163648);
        setField(term163762, term163762.getClass(), "value", term163820);
        setIntField(term163762, term163762.getClass(), "count", 0);
        setElement(term163168, 2, term163762);
        setField(term163934, term163934.getClass(), "value", term164044);
        setIntField(term163934, term163934.getClass(), "count", 0);
        setElement(term163168, 3, term163934);
        term165057 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 4);
        Object term165058 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term165059 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term165060 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term165061 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term165064 = (byte[]) newByteArray(16);
        Object term165065 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term165066 = newInstance(Class.forName("org.vorpal.research.kex.intrinsics.UnknownIntrinsics"));
        setField(term165058, term165058.getClass(), "value", null);
        setIntField(term165058, term165058.getClass(), "count", 0);
        setElement(term165057, 0, term165058);
        setField(term165059, term165059.getClass(), "value", null);
        setIntField(term165059, term165059.getClass(), "count", 0);
        setElement(term165057, 1, term165059);
        setField(term165061, term165061.getClass(), "toStringCache", "");
        setField(term165061, term165061.getClass(), "value", term165064);
        setByteField(term165061, term165061.getClass(), "coder", (byte) 0);
        setIntField(term165061, term165061.getClass(), "count", 0);
        setField(term165060, term165060.getClass(), "value", term165061);
        setIntField(term165060, term165060.getClass(), "count", 0);
        setElement(term165057, 2, term165060);
        setField(term165065, term165065.getClass(), "value", term165066);
        setIntField(term165065, term165065.getClass(), "count", 0);
        setElement(term165057, 3, term165065);
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
        args[0] = term163168;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term163168, term165057));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


