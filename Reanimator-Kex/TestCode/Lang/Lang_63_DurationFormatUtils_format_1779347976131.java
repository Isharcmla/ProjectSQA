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

public class DurationFormatUtils_format_1779347976131 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term95254;
     Object term97037;

    public DurationFormatUtils_format_1779347976131() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term96057 = new StringBuffer();
        StringBuffer term96229 = new StringBuffer();
        term95254 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 7);
        Object term95771 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        char[] term95538 = (char[]) newCharArray(0);
        Object term95885 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term95999 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term96171 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term96343 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term95771, term95771.getClass(), "value", term95538);
        setIntField(term95771, term95771.getClass(), "count", 0);
        setElement(term95254, 0, term95771);
        setField(term95885, term95885.getClass(), "value", null);
        setIntField(term95885, term95885.getClass(), "count", 0);
        setElement(term95254, 1, term95885);
        setField(term95999, term95999.getClass(), "value", term96057);
        setIntField(term95999, term95999.getClass(), "count", 0);
        setElement(term95254, 2, term95999);
        setField(term96171, term96171.getClass(), "value", term96229);
        setIntField(term96171, term96171.getClass(), "count", 0);
        setElement(term95254, 3, term96171);
        setField(term96343, term96343.getClass(), "value", "");
        setIntField(term96343, term96343.getClass(), "count", 0);
        setElement(term95254, 4, term96343);
        setElement(term95254, 5, term95771);
        setElement(term95254, 6, term96343);
        term97037 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 7);
        Object term97038 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        char[] term97039 = (char[]) newCharArray(0);
        Object term97040 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term97041 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term97042 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term97045 = (byte[]) newByteArray(16);
        Object term97046 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term97047 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term97050 = (byte[]) newByteArray(16);
        Object term97051 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term97038, term97038.getClass(), "value", term97039);
        setIntField(term97038, term97038.getClass(), "count", 0);
        setElement(term97037, 0, term97038);
        setField(term97040, term97040.getClass(), "value", null);
        setIntField(term97040, term97040.getClass(), "count", 0);
        setElement(term97037, 1, term97040);
        setField(term97042, term97042.getClass(), "toStringCache", "");
        setField(term97042, term97042.getClass(), "value", term97045);
        setByteField(term97042, term97042.getClass(), "coder", (byte) 0);
        setIntField(term97042, term97042.getClass(), "count", 0);
        setField(term97041, term97041.getClass(), "value", term97042);
        setIntField(term97041, term97041.getClass(), "count", 0);
        setElement(term97037, 2, term97041);
        setField(term97047, term97047.getClass(), "toStringCache", "");
        setField(term97047, term97047.getClass(), "value", term97050);
        setByteField(term97047, term97047.getClass(), "coder", (byte) 0);
        setIntField(term97047, term97047.getClass(), "count", 0);
        setField(term97046, term97046.getClass(), "value", term97047);
        setIntField(term97046, term97046.getClass(), "count", 0);
        setElement(term97037, 3, term97046);
        setField(term97051, term97051.getClass(), "value", "");
        setIntField(term97051, term97051.getClass(), "count", 0);
        setElement(term97037, 4, term97051);
        setElement(term97037, 5, term97038);
        setElement(term97037, 6, term97051);
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
        args[0] = term95254;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term95254, term97037));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


