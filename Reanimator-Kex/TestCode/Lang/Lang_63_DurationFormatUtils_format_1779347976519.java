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

public class DurationFormatUtils_format_1779347976519 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term439951;
     Object term444249;

    public DurationFormatUtils_format_1779347976519() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuilder term441724 = new StringBuilder();
        StringBuffer term441896 = new StringBuffer();
        StringBuffer term442182 = new StringBuffer();
        term439951 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 5);
        Object term441664 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term441838 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term442010 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term442124 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term442296 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term442406 = newInstance(Class.forName("org.vorpal.research.kex.intrinsics.UnknownIntrinsics"));
        setField(term441664, term441664.getClass(), "value", term441724);
        setIntField(term441664, term441664.getClass(), "count", 0);
        setElement(term439951, 0, term441664);
        setField(term441838, term441838.getClass(), "value", term441896);
        setIntField(term441838, term441838.getClass(), "count", 0);
        setElement(term439951, 1, term441838);
        setField(term442010, term442010.getClass(), "value", null);
        setIntField(term442010, term442010.getClass(), "count", 0);
        setElement(term439951, 2, term442010);
        setField(term442124, term442124.getClass(), "value", term442182);
        setIntField(term442124, term442124.getClass(), "count", 0);
        setElement(term439951, 3, term442124);
        setField(term442296, term442296.getClass(), "value", term442406);
        setIntField(term442296, term442296.getClass(), "count", 0);
        setElement(term439951, 4, term442296);
        term444249 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 5);
        Object term444250 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term444251 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term444252 = (byte[]) newByteArray(16);
        Object term444253 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term444254 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term444257 = (byte[]) newByteArray(16);
        Object term444258 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term444259 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term444260 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term444263 = (byte[]) newByteArray(16);
        Object term444264 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term444265 = newInstance(Class.forName("org.vorpal.research.kex.intrinsics.UnknownIntrinsics"));
        setField(term444251, term444251.getClass(), "value", term444252);
        setByteField(term444251, term444251.getClass(), "coder", (byte) 0);
        setIntField(term444251, term444251.getClass(), "count", 0);
        setField(term444250, term444250.getClass(), "value", term444251);
        setIntField(term444250, term444250.getClass(), "count", 0);
        setElement(term444249, 0, term444250);
        setField(term444254, term444254.getClass(), "toStringCache", "");
        setField(term444254, term444254.getClass(), "value", term444257);
        setByteField(term444254, term444254.getClass(), "coder", (byte) 0);
        setIntField(term444254, term444254.getClass(), "count", 0);
        setField(term444253, term444253.getClass(), "value", term444254);
        setIntField(term444253, term444253.getClass(), "count", 0);
        setElement(term444249, 1, term444253);
        setField(term444258, term444258.getClass(), "value", null);
        setIntField(term444258, term444258.getClass(), "count", 0);
        setElement(term444249, 2, term444258);
        setField(term444260, term444260.getClass(), "toStringCache", "");
        setField(term444260, term444260.getClass(), "value", term444263);
        setByteField(term444260, term444260.getClass(), "coder", (byte) 0);
        setIntField(term444260, term444260.getClass(), "count", 0);
        setField(term444259, term444259.getClass(), "value", term444260);
        setIntField(term444259, term444259.getClass(), "count", 0);
        setElement(term444249, 3, term444259);
        setField(term444264, term444264.getClass(), "value", term444265);
        setIntField(term444264, term444264.getClass(), "count", 0);
        setElement(term444249, 4, term444264);
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
        args[0] = term439951;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term439951, term444249));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


