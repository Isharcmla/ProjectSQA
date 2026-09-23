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

public class DurationFormatUtils_format_1779347976271 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term197455;
     Object term198869;

    public DurationFormatUtils_format_1779347976271() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term198040 = new StringBuffer();
        StringBuffer term198212 = new StringBuffer();
        StringBuffer term198384 = new StringBuffer();
        term197455 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 6);
        Object term197716 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term197830 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term197868 = newInstance(Class.forName("java.lang.Object"));
        Object term197982 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term198154 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term198326 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term197830, term197830.getClass(), "value", term197868);
        setIntField(term197830, term197830.getClass(), "count", 0);
        setField(term197716, term197716.getClass(), "value", term197830);
        setIntField(term197716, term197716.getClass(), "count", 0);
        setElement(term197455, 0, term197716);
        setField(term197982, term197982.getClass(), "value", term198040);
        setIntField(term197982, term197982.getClass(), "count", 0);
        setElement(term197455, 1, term197982);
        setField(term198154, term198154.getClass(), "value", term198212);
        setIntField(term198154, term198154.getClass(), "count", 0);
        setElement(term197455, 2, term198154);
        setField(term198326, term198326.getClass(), "value", term198384);
        setIntField(term198326, term198326.getClass(), "count", 0);
        setElement(term197455, 3, term198326);
        setElement(term197455, 4, term198326);
        setElement(term197455, 5, term197830);
        term198869 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 6);
        Object term198870 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term198871 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term198872 = newInstance(Class.forName("java.lang.Object"));
        Object term198873 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term198874 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term198877 = (byte[]) newByteArray(16);
        Object term198878 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term198879 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term198882 = (byte[]) newByteArray(16);
        Object term198883 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term198884 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term198887 = (byte[]) newByteArray(16);
        setField(term198871, term198871.getClass(), "value", term198872);
        setIntField(term198871, term198871.getClass(), "count", 0);
        setField(term198870, term198870.getClass(), "value", term198871);
        setIntField(term198870, term198870.getClass(), "count", 0);
        setElement(term198869, 0, term198870);
        setField(term198874, term198874.getClass(), "toStringCache", "");
        setField(term198874, term198874.getClass(), "value", term198877);
        setByteField(term198874, term198874.getClass(), "coder", (byte) 0);
        setIntField(term198874, term198874.getClass(), "count", 0);
        setField(term198873, term198873.getClass(), "value", term198874);
        setIntField(term198873, term198873.getClass(), "count", 0);
        setElement(term198869, 1, term198873);
        setField(term198879, term198879.getClass(), "toStringCache", "");
        setField(term198879, term198879.getClass(), "value", term198882);
        setByteField(term198879, term198879.getClass(), "coder", (byte) 0);
        setIntField(term198879, term198879.getClass(), "count", 0);
        setField(term198878, term198878.getClass(), "value", term198879);
        setIntField(term198878, term198878.getClass(), "count", 0);
        setElement(term198869, 2, term198878);
        setField(term198884, term198884.getClass(), "toStringCache", "");
        setField(term198884, term198884.getClass(), "value", term198887);
        setByteField(term198884, term198884.getClass(), "coder", (byte) 0);
        setIntField(term198884, term198884.getClass(), "count", 0);
        setField(term198883, term198883.getClass(), "value", term198884);
        setIntField(term198883, term198883.getClass(), "count", 0);
        setElement(term198869, 3, term198883);
        setElement(term198869, 4, term198883);
        setElement(term198869, 5, term198871);
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
        args[0] = term197455;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term197455, term198869));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


