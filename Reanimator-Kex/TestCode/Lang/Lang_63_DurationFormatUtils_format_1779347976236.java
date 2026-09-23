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

public class DurationFormatUtils_format_1779347976236 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term160183;
     Object term162750;

    public DurationFormatUtils_format_1779347976236() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term160980 = new StringBuffer();
        StringBuffer term161266 = new StringBuffer();
        term160183 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 4);
        Object term160922 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term161094 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        char[] term160717 = (char[]) newCharArray(0);
        Object term161208 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term161380 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object[] term160716 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 0);
        setField(term160922, term160922.getClass(), "value", term160980);
        setIntField(term160922, term160922.getClass(), "count", 0);
        setElement(term160183, 0, term160922);
        setField(term161094, term161094.getClass(), "value", term160717);
        setIntField(term161094, term161094.getClass(), "count", 0);
        setElement(term160183, 1, term161094);
        setField(term161208, term161208.getClass(), "value", term161266);
        setIntField(term161208, term161208.getClass(), "count", 0);
        setElement(term160183, 2, term161208);
        setField(term161380, term161380.getClass(), "value", term160716);
        setIntField(term161380, term161380.getClass(), "count", 0);
        setElement(term160183, 3, term161380);
        term162750 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 4);
        Object term162751 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term162752 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term162755 = (byte[]) newByteArray(16);
        Object term162756 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        char[] term162757 = (char[]) newCharArray(0);
        Object term162758 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term162759 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term162762 = (byte[]) newByteArray(16);
        Object term162763 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object[] term162764 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 0);
        setField(term162752, term162752.getClass(), "toStringCache", "");
        setField(term162752, term162752.getClass(), "value", term162755);
        setByteField(term162752, term162752.getClass(), "coder", (byte) 0);
        setIntField(term162752, term162752.getClass(), "count", 0);
        setField(term162751, term162751.getClass(), "value", term162752);
        setIntField(term162751, term162751.getClass(), "count", 0);
        setElement(term162750, 0, term162751);
        setField(term162756, term162756.getClass(), "value", term162757);
        setIntField(term162756, term162756.getClass(), "count", 0);
        setElement(term162750, 1, term162756);
        setField(term162759, term162759.getClass(), "toStringCache", "");
        setField(term162759, term162759.getClass(), "value", term162762);
        setByteField(term162759, term162759.getClass(), "coder", (byte) 0);
        setIntField(term162759, term162759.getClass(), "count", 0);
        setField(term162758, term162758.getClass(), "value", term162759);
        setIntField(term162758, term162758.getClass(), "count", 0);
        setElement(term162750, 2, term162758);
        setField(term162763, term162763.getClass(), "value", term162764);
        setIntField(term162763, term162763.getClass(), "count", 0);
        setElement(term162750, 3, term162763);
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
        args[0] = term160183;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term160183, term162750));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


