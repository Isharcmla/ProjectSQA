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

public class DurationFormatUtils_format_1779347976122 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term88745;
     Object term91240;

    public DurationFormatUtils_format_1779347976122() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term89292 = new StringBuffer();
        term88745 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 5);
        Object term89006 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term89120 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term89234 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term89406 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term89520 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term89630 = newInstance(Class.forName("org.vorpal.research.kex.intrinsics.UnknownIntrinsics"));
        setField(term89006, term89006.getClass(), "value", null);
        setIntField(term89006, term89006.getClass(), "count", 0);
        setElement(term88745, 0, term89006);
        setField(term89120, term89120.getClass(), "value", null);
        setIntField(term89120, term89120.getClass(), "count", 0);
        setElement(term88745, 1, term89120);
        setField(term89234, term89234.getClass(), "value", term89292);
        setIntField(term89234, term89234.getClass(), "count", 0);
        setElement(term88745, 2, term89234);
        setField(term89406, term89406.getClass(), "value", null);
        setIntField(term89406, term89406.getClass(), "count", 0);
        setElement(term88745, 3, term89406);
        setField(term89520, term89520.getClass(), "value", term89630);
        setIntField(term89520, term89520.getClass(), "count", 0);
        setElement(term88745, 4, term89520);
        term91240 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 5);
        Object term91241 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term91242 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term91243 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term91244 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term91247 = (byte[]) newByteArray(16);
        Object term91248 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term91249 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term91250 = newInstance(Class.forName("org.vorpal.research.kex.intrinsics.UnknownIntrinsics"));
        setField(term91241, term91241.getClass(), "value", null);
        setIntField(term91241, term91241.getClass(), "count", 0);
        setElement(term91240, 0, term91241);
        setField(term91242, term91242.getClass(), "value", null);
        setIntField(term91242, term91242.getClass(), "count", 0);
        setElement(term91240, 1, term91242);
        setField(term91244, term91244.getClass(), "toStringCache", "");
        setField(term91244, term91244.getClass(), "value", term91247);
        setByteField(term91244, term91244.getClass(), "coder", (byte) 0);
        setIntField(term91244, term91244.getClass(), "count", 0);
        setField(term91243, term91243.getClass(), "value", term91244);
        setIntField(term91243, term91243.getClass(), "count", 0);
        setElement(term91240, 2, term91243);
        setField(term91248, term91248.getClass(), "value", null);
        setIntField(term91248, term91248.getClass(), "count", 0);
        setElement(term91240, 3, term91248);
        setField(term91249, term91249.getClass(), "value", term91250);
        setIntField(term91249, term91249.getClass(), "count", 0);
        setElement(term91240, 4, term91249);
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
        args[0] = term88745;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term88745, term91240));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


