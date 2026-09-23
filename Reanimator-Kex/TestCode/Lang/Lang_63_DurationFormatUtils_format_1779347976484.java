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
import java.lang.StringBuilder;

public class DurationFormatUtils_format_1779347976484 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term410785;
     Object term413037;

    public DurationFormatUtils_format_1779347976484() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term411523 = new StringBuffer();
        StringBuffer term411695 = new StringBuffer();
        StringBuilder term411869 = new StringBuilder();
        term410785 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 3);
        Object term411465 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term411637 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term411809 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term411465, term411465.getClass(), "value", term411523);
        setIntField(term411465, term411465.getClass(), "count", 0);
        setElement(term410785, 0, term411465);
        setField(term411637, term411637.getClass(), "value", term411695);
        setIntField(term411637, term411637.getClass(), "count", 0);
        setElement(term410785, 1, term411637);
        setField(term411809, term411809.getClass(), "value", term411869);
        setIntField(term411809, term411809.getClass(), "count", 0);
        setElement(term410785, 2, term411809);
        term413037 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 3);
        Object term413038 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term413039 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term413042 = (byte[]) newByteArray(16);
        Object term413043 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term413044 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term413047 = (byte[]) newByteArray(16);
        Object term413048 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term413049 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term413050 = (byte[]) newByteArray(16);
        setField(term413039, term413039.getClass(), "toStringCache", "");
        setField(term413039, term413039.getClass(), "value", term413042);
        setByteField(term413039, term413039.getClass(), "coder", (byte) 0);
        setIntField(term413039, term413039.getClass(), "count", 0);
        setField(term413038, term413038.getClass(), "value", term413039);
        setIntField(term413038, term413038.getClass(), "count", 0);
        setElement(term413037, 0, term413038);
        setField(term413044, term413044.getClass(), "toStringCache", "");
        setField(term413044, term413044.getClass(), "value", term413047);
        setByteField(term413044, term413044.getClass(), "coder", (byte) 0);
        setIntField(term413044, term413044.getClass(), "count", 0);
        setField(term413043, term413043.getClass(), "value", term413044);
        setIntField(term413043, term413043.getClass(), "count", 0);
        setElement(term413037, 1, term413043);
        setField(term413049, term413049.getClass(), "value", term413050);
        setByteField(term413049, term413049.getClass(), "coder", (byte) 0);
        setIntField(term413049, term413049.getClass(), "count", 0);
        setField(term413048, term413048.getClass(), "value", term413049);
        setIntField(term413048, term413048.getClass(), "count", 0);
        setElement(term413037, 2, term413048);
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
        args[0] = term410785;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term410785, term413037));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


