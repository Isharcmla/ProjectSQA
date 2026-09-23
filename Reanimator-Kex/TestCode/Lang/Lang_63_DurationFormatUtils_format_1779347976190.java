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

public class DurationFormatUtils_format_1779347976190 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term131646;
     Object term134052;

    public DurationFormatUtils_format_1779347976190() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term132088 = new StringBuffer();
        term131646 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 4);
        Object term131916 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term132030 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term132202 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term132316 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        char[] term131704 = (char[]) newCharArray(0);
        setField(term131916, term131916.getClass(), "value", null);
        setIntField(term131916, term131916.getClass(), "count", 0);
        setElement(term131646, 0, term131916);
        setField(term132030, term132030.getClass(), "value", term132088);
        setIntField(term132030, term132030.getClass(), "count", 0);
        setElement(term131646, 1, term132030);
        setField(term132202, term132202.getClass(), "value", null);
        setIntField(term132202, term132202.getClass(), "count", 0);
        setElement(term131646, 2, term132202);
        setField(term132316, term132316.getClass(), "value", term131704);
        setIntField(term132316, term132316.getClass(), "count", 0);
        setElement(term131646, 3, term132316);
        term134052 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 4);
        Object term134053 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term134054 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term134055 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term134058 = (byte[]) newByteArray(16);
        Object term134059 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term134060 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        char[] term134061 = (char[]) newCharArray(0);
        setField(term134053, term134053.getClass(), "value", null);
        setIntField(term134053, term134053.getClass(), "count", 0);
        setElement(term134052, 0, term134053);
        setField(term134055, term134055.getClass(), "toStringCache", "");
        setField(term134055, term134055.getClass(), "value", term134058);
        setByteField(term134055, term134055.getClass(), "coder", (byte) 0);
        setIntField(term134055, term134055.getClass(), "count", 0);
        setField(term134054, term134054.getClass(), "value", term134055);
        setIntField(term134054, term134054.getClass(), "count", 0);
        setElement(term134052, 1, term134054);
        setField(term134059, term134059.getClass(), "value", null);
        setIntField(term134059, term134059.getClass(), "count", 0);
        setElement(term134052, 2, term134059);
        setField(term134060, term134060.getClass(), "value", term134061);
        setIntField(term134060, term134060.getClass(), "count", 0);
        setElement(term134052, 3, term134060);
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
        args[0] = term131646;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term131646, term134052));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


