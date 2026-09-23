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

public class DurationFormatUtils_format_1779347976372 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term292258;
     Object term299139;

    public DurationFormatUtils_format_1779347976372() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuilder term292827 = new StringBuilder();
        StringBuffer term292999 = new StringBuffer();
        StringBuffer term293547 = new StringBuffer();
        term292258 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 7);
        Object term292767 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term292941 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term293113 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term293223 = newInstance(Class.forName("org.vorpal.research.kex.intrinsics.UnknownIntrinsics"));
        Object term293337 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term293375 = newInstance(Class.forName("java.lang.Object"));
        Object term293489 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term293661 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term292767, term292767.getClass(), "value", term292827);
        setIntField(term292767, term292767.getClass(), "count", 0);
        setElement(term292258, 0, term292767);
        setField(term292941, term292941.getClass(), "value", term292999);
        setIntField(term292941, term292941.getClass(), "count", 0);
        setElement(term292258, 1, term292941);
        setField(term293113, term293113.getClass(), "value", term293223);
        setIntField(term293113, term293113.getClass(), "count", 0);
        setElement(term292258, 2, term293113);
        setField(term293337, term293337.getClass(), "value", term293375);
        setIntField(term293337, term293337.getClass(), "count", 0);
        setElement(term292258, 3, term293337);
        setElement(term292258, 4, term292941);
        setField(term293489, term293489.getClass(), "value", term293547);
        setIntField(term293489, term293489.getClass(), "count", 0);
        setElement(term292258, 5, term293489);
        setField(term293661, term293661.getClass(), "value", null);
        setIntField(term293661, term293661.getClass(), "count", 0);
        setElement(term292258, 6, term293661);
        term299139 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 7);
        Object term299140 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term299141 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term299142 = (byte[]) newByteArray(16);
        Object term299143 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term299144 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term299147 = (byte[]) newByteArray(16);
        Object term299148 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term299149 = newInstance(Class.forName("org.vorpal.research.kex.intrinsics.UnknownIntrinsics"));
        Object term299150 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term299151 = newInstance(Class.forName("java.lang.Object"));
        Object term299152 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term299153 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term299156 = (byte[]) newByteArray(16);
        Object term299157 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term299141, term299141.getClass(), "value", term299142);
        setByteField(term299141, term299141.getClass(), "coder", (byte) 0);
        setIntField(term299141, term299141.getClass(), "count", 0);
        setField(term299140, term299140.getClass(), "value", term299141);
        setIntField(term299140, term299140.getClass(), "count", 0);
        setElement(term299139, 0, term299140);
        setField(term299144, term299144.getClass(), "toStringCache", "");
        setField(term299144, term299144.getClass(), "value", term299147);
        setByteField(term299144, term299144.getClass(), "coder", (byte) 0);
        setIntField(term299144, term299144.getClass(), "count", 0);
        setField(term299143, term299143.getClass(), "value", term299144);
        setIntField(term299143, term299143.getClass(), "count", 0);
        setElement(term299139, 1, term299143);
        setField(term299148, term299148.getClass(), "value", term299149);
        setIntField(term299148, term299148.getClass(), "count", 0);
        setElement(term299139, 2, term299148);
        setField(term299150, term299150.getClass(), "value", term299151);
        setIntField(term299150, term299150.getClass(), "count", 0);
        setElement(term299139, 3, term299150);
        setElement(term299139, 4, term299143);
        setField(term299153, term299153.getClass(), "toStringCache", "");
        setField(term299153, term299153.getClass(), "value", term299156);
        setByteField(term299153, term299153.getClass(), "coder", (byte) 0);
        setIntField(term299153, term299153.getClass(), "count", 0);
        setField(term299152, term299152.getClass(), "value", term299153);
        setIntField(term299152, term299152.getClass(), "count", 0);
        setElement(term299139, 5, term299152);
        setField(term299157, term299157.getClass(), "value", null);
        setIntField(term299157, term299157.getClass(), "count", 0);
        setElement(term299139, 6, term299157);
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
        args[0] = term292258;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term292258, term299139));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


