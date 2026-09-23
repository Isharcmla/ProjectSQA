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

public class DurationFormatUtils_format_1779347976297 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term219527;
     Object term220810;

    public DurationFormatUtils_format_1779347976297() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term220155 = new StringBuffer();
        StringBuffer term220441 = new StringBuffer();
        term219527 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 6);
        Object term219869 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term219983 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term220097 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term220269 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term220383 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term220555 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term219869, term219869.getClass(), "value", null);
        setIntField(term219869, term219869.getClass(), "count", 0);
        setElement(term219527, 0, term219869);
        setField(term219983, term219983.getClass(), "value", null);
        setIntField(term219983, term219983.getClass(), "count", 0);
        setElement(term219527, 1, term219983);
        setField(term220097, term220097.getClass(), "value", term220155);
        setIntField(term220097, term220097.getClass(), "count", 0);
        setElement(term219527, 2, term220097);
        setField(term220269, term220269.getClass(), "value", null);
        setIntField(term220269, term220269.getClass(), "count", 0);
        setElement(term219527, 3, term220269);
        setField(term220383, term220383.getClass(), "value", term220441);
        setIntField(term220383, term220383.getClass(), "count", 0);
        setElement(term219527, 4, term220383);
        setField(term220555, term220555.getClass(), "value", term220383);
        setIntField(term220555, term220555.getClass(), "count", 0);
        setElement(term219527, 5, term220555);
        term220810 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 6);
        Object term220811 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term220812 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term220813 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term220814 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term220817 = (byte[]) newByteArray(16);
        Object term220818 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term220819 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term220820 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term220823 = (byte[]) newByteArray(16);
        Object term220824 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term220811, term220811.getClass(), "value", null);
        setIntField(term220811, term220811.getClass(), "count", 0);
        setElement(term220810, 0, term220811);
        setField(term220812, term220812.getClass(), "value", null);
        setIntField(term220812, term220812.getClass(), "count", 0);
        setElement(term220810, 1, term220812);
        setField(term220814, term220814.getClass(), "toStringCache", "");
        setField(term220814, term220814.getClass(), "value", term220817);
        setByteField(term220814, term220814.getClass(), "coder", (byte) 0);
        setIntField(term220814, term220814.getClass(), "count", 0);
        setField(term220813, term220813.getClass(), "value", term220814);
        setIntField(term220813, term220813.getClass(), "count", 0);
        setElement(term220810, 2, term220813);
        setField(term220818, term220818.getClass(), "value", null);
        setIntField(term220818, term220818.getClass(), "count", 0);
        setElement(term220810, 3, term220818);
        setField(term220820, term220820.getClass(), "toStringCache", "");
        setField(term220820, term220820.getClass(), "value", term220823);
        setByteField(term220820, term220820.getClass(), "coder", (byte) 0);
        setIntField(term220820, term220820.getClass(), "count", 0);
        setField(term220819, term220819.getClass(), "value", term220820);
        setIntField(term220819, term220819.getClass(), "count", 0);
        setElement(term220810, 4, term220819);
        setField(term220824, term220824.getClass(), "value", term220819);
        setIntField(term220824, term220824.getClass(), "count", 0);
        setElement(term220810, 5, term220824);
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
        args[0] = term219527;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term219527, term220810));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


