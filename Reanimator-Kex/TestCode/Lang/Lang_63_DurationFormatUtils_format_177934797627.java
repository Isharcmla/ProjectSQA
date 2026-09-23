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

public class DurationFormatUtils_format_177934797627 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11988;
     Object term13191;

    public DurationFormatUtils_format_177934797627() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuilder term12432 = new StringBuilder();
        StringBuilder term12606 = new StringBuilder();
        StringBuffer term12778 = new StringBuffer();
        term11988 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 5);
        Object term12372 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term12546 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term12720 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term12892 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object[] term12145 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 0);
        setField(term12372, term12372.getClass(), "value", term12432);
        setIntField(term12372, term12372.getClass(), "count", 0);
        setElement(term11988, 0, term12372);
        setField(term12546, term12546.getClass(), "value", term12606);
        setIntField(term12546, term12546.getClass(), "count", 0);
        setElement(term11988, 1, term12546);
        setField(term12720, term12720.getClass(), "value", term12778);
        setIntField(term12720, term12720.getClass(), "count", 0);
        setElement(term11988, 2, term12720);
        setElement(term11988, 3, term12372);
        setField(term12892, term12892.getClass(), "value", term12145);
        setIntField(term12892, term12892.getClass(), "count", 0);
        setElement(term11988, 4, term12892);
        term13191 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 5);
        Object term13192 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term13193 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term13194 = (byte[]) newByteArray(16);
        Object term13195 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term13196 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term13197 = (byte[]) newByteArray(16);
        Object term13198 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term13199 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term13202 = (byte[]) newByteArray(16);
        Object term13203 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object[] term13204 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 0);
        setField(term13193, term13193.getClass(), "value", term13194);
        setByteField(term13193, term13193.getClass(), "coder", (byte) 0);
        setIntField(term13193, term13193.getClass(), "count", 0);
        setField(term13192, term13192.getClass(), "value", term13193);
        setIntField(term13192, term13192.getClass(), "count", 0);
        setElement(term13191, 0, term13192);
        setField(term13196, term13196.getClass(), "value", term13197);
        setByteField(term13196, term13196.getClass(), "coder", (byte) 0);
        setIntField(term13196, term13196.getClass(), "count", 0);
        setField(term13195, term13195.getClass(), "value", term13196);
        setIntField(term13195, term13195.getClass(), "count", 0);
        setElement(term13191, 1, term13195);
        setField(term13199, term13199.getClass(), "toStringCache", "");
        setField(term13199, term13199.getClass(), "value", term13202);
        setByteField(term13199, term13199.getClass(), "coder", (byte) 0);
        setIntField(term13199, term13199.getClass(), "count", 0);
        setField(term13198, term13198.getClass(), "value", term13199);
        setIntField(term13198, term13198.getClass(), "count", 0);
        setElement(term13191, 2, term13198);
        setElement(term13191, 3, term13192);
        setField(term13203, term13203.getClass(), "value", term13204);
        setIntField(term13203, term13203.getClass(), "count", 0);
        setElement(term13191, 4, term13203);
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
        args[0] = term11988;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term11988, term13191));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


