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
import java.lang.StringBuilder;
import java.lang.StringBuffer;

public class DurationFormatUtils_format_1779347976243 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term165083;
     Object term166759;

    public DurationFormatUtils_format_1779347976243() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuilder term165839 = new StringBuilder();
        StringBuffer term166011 = new StringBuffer();
        term165083 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 4);
        Object term165779 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term165953 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term166125 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term166235 = newInstance(Class.forName("org.vorpal.research.kex.intrinsics.UnknownIntrinsics"));
        setField(term165779, term165779.getClass(), "value", term165839);
        setIntField(term165779, term165779.getClass(), "count", 0);
        setElement(term165083, 0, term165779);
        setField(term165953, term165953.getClass(), "value", term166011);
        setIntField(term165953, term165953.getClass(), "count", 0);
        setElement(term165083, 1, term165953);
        setField(term166125, term166125.getClass(), "value", term166235);
        setIntField(term166125, term166125.getClass(), "count", 0);
        setElement(term165083, 2, term166125);
        setElement(term165083, 3, term165779);
        term166759 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 4);
        Object term166760 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term166761 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term166762 = (byte[]) newByteArray(16);
        Object term166763 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term166764 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term166767 = (byte[]) newByteArray(16);
        Object term166768 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term166769 = newInstance(Class.forName("org.vorpal.research.kex.intrinsics.UnknownIntrinsics"));
        setField(term166761, term166761.getClass(), "value", term166762);
        setByteField(term166761, term166761.getClass(), "coder", (byte) 0);
        setIntField(term166761, term166761.getClass(), "count", 0);
        setField(term166760, term166760.getClass(), "value", term166761);
        setIntField(term166760, term166760.getClass(), "count", 0);
        setElement(term166759, 0, term166760);
        setField(term166764, term166764.getClass(), "toStringCache", "");
        setField(term166764, term166764.getClass(), "value", term166767);
        setByteField(term166764, term166764.getClass(), "coder", (byte) 0);
        setIntField(term166764, term166764.getClass(), "count", 0);
        setField(term166763, term166763.getClass(), "value", term166764);
        setIntField(term166763, term166763.getClass(), "count", 0);
        setElement(term166759, 1, term166763);
        setField(term166768, term166768.getClass(), "value", term166769);
        setIntField(term166768, term166768.getClass(), "count", 0);
        setElement(term166759, 2, term166768);
        setElement(term166759, 3, term166760);
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
        args[0] = term165083;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term165083, term166759));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


