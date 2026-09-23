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

public class DurationFormatUtils_format_1779347976433 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term363215;
     Object term364920;

    public DurationFormatUtils_format_1779347976433() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term364034 = new StringBuffer();
        StringBuffer term364434 = new StringBuffer();
        term363215 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 5);
        Object term363976 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term364148 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term364262 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term364376 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term364548 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term364658 = newInstance(Class.forName("org.vorpal.research.kex.intrinsics.UnknownIntrinsics"));
        setField(term363976, term363976.getClass(), "value", term364034);
        setIntField(term363976, term363976.getClass(), "count", 0);
        setElement(term363215, 0, term363976);
        setField(term364148, term364148.getClass(), "value", null);
        setIntField(term364148, term364148.getClass(), "count", 0);
        setElement(term363215, 1, term364148);
        setField(term364262, term364262.getClass(), "value", null);
        setIntField(term364262, term364262.getClass(), "count", 0);
        setElement(term363215, 2, term364262);
        setField(term364376, term364376.getClass(), "value", term364434);
        setIntField(term364376, term364376.getClass(), "count", 0);
        setElement(term363215, 3, term364376);
        setField(term364548, term364548.getClass(), "value", term364658);
        setIntField(term364548, term364548.getClass(), "count", 0);
        setElement(term363215, 4, term364548);
        term364920 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 5);
        Object term364921 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term364922 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term364925 = (byte[]) newByteArray(16);
        Object term364926 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term364927 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term364928 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term364929 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term364932 = (byte[]) newByteArray(16);
        Object term364933 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term364934 = newInstance(Class.forName("org.vorpal.research.kex.intrinsics.UnknownIntrinsics"));
        setField(term364922, term364922.getClass(), "toStringCache", "");
        setField(term364922, term364922.getClass(), "value", term364925);
        setByteField(term364922, term364922.getClass(), "coder", (byte) 0);
        setIntField(term364922, term364922.getClass(), "count", 0);
        setField(term364921, term364921.getClass(), "value", term364922);
        setIntField(term364921, term364921.getClass(), "count", 0);
        setElement(term364920, 0, term364921);
        setField(term364926, term364926.getClass(), "value", null);
        setIntField(term364926, term364926.getClass(), "count", 0);
        setElement(term364920, 1, term364926);
        setField(term364927, term364927.getClass(), "value", null);
        setIntField(term364927, term364927.getClass(), "count", 0);
        setElement(term364920, 2, term364927);
        setField(term364929, term364929.getClass(), "toStringCache", "");
        setField(term364929, term364929.getClass(), "value", term364932);
        setByteField(term364929, term364929.getClass(), "coder", (byte) 0);
        setIntField(term364929, term364929.getClass(), "count", 0);
        setField(term364928, term364928.getClass(), "value", term364929);
        setIntField(term364928, term364928.getClass(), "count", 0);
        setElement(term364920, 3, term364928);
        setField(term364933, term364933.getClass(), "value", term364934);
        setIntField(term364933, term364933.getClass(), "count", 0);
        setElement(term364920, 4, term364933);
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
        args[0] = term363215;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term363215, term364920));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


