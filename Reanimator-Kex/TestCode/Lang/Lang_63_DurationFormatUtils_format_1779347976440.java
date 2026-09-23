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

public class DurationFormatUtils_format_1779347976440 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term371811;
     Object term374095;

    public DurationFormatUtils_format_1779347976440() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuilder term372143 = new StringBuilder();
        StringBuffer term372315 = new StringBuffer();
        term371811 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 5);
        Object term372083 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term372257 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term372429 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term372543 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term372657 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term372083, term372083.getClass(), "value", term372143);
        setIntField(term372083, term372083.getClass(), "count", 0);
        setElement(term371811, 0, term372083);
        setField(term372257, term372257.getClass(), "value", term372315);
        setIntField(term372257, term372257.getClass(), "count", 0);
        setElement(term371811, 1, term372257);
        setField(term372429, term372429.getClass(), "value", null);
        setIntField(term372429, term372429.getClass(), "count", 0);
        setElement(term371811, 2, term372429);
        setField(term372543, term372543.getClass(), "value", null);
        setIntField(term372543, term372543.getClass(), "count", 0);
        setElement(term371811, 3, term372543);
        setField(term372657, term372657.getClass(), "value", term371811);
        setIntField(term372657, term372657.getClass(), "count", 0);
        setElement(term371811, 4, term372657);
        term374095 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 5);
        Object term374096 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term374097 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term374098 = (byte[]) newByteArray(16);
        Object term374099 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term374100 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term374103 = (byte[]) newByteArray(16);
        Object term374104 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term374105 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term374106 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object[] term374107 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 5);
        setField(term374097, term374097.getClass(), "value", term374098);
        setByteField(term374097, term374097.getClass(), "coder", (byte) 0);
        setIntField(term374097, term374097.getClass(), "count", 0);
        setField(term374096, term374096.getClass(), "value", term374097);
        setIntField(term374096, term374096.getClass(), "count", 0);
        setElement(term374095, 0, term374096);
        setField(term374100, term374100.getClass(), "toStringCache", "");
        setField(term374100, term374100.getClass(), "value", term374103);
        setByteField(term374100, term374100.getClass(), "coder", (byte) 0);
        setIntField(term374100, term374100.getClass(), "count", 0);
        setField(term374099, term374099.getClass(), "value", term374100);
        setIntField(term374099, term374099.getClass(), "count", 0);
        setElement(term374095, 1, term374099);
        setField(term374104, term374104.getClass(), "value", null);
        setIntField(term374104, term374104.getClass(), "count", 0);
        setElement(term374095, 2, term374104);
        setField(term374105, term374105.getClass(), "value", null);
        setIntField(term374105, term374105.getClass(), "count", 0);
        setElement(term374095, 3, term374105);
        setElement(term374107, 0, term374096);
        setElement(term374107, 1, term374099);
        setElement(term374107, 2, term374104);
        setElement(term374107, 3, term374105);
        setElement(term374107, 4, term374106);
        setField(term374106, term374106.getClass(), "value", term374107);
        setIntField(term374106, term374106.getClass(), "count", 0);
        setElement(term374095, 4, term374106);
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
        args[0] = term371811;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term371811, term374095));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


