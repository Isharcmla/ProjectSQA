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

public class DurationFormatUtils_format_1779347976179 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term127152;
     Object term128106;

    public DurationFormatUtils_format_1779347976179() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term127518 = new StringBuffer();
        term127152 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 2);
        Object term127460 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term127632 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term127670 = newInstance(Class.forName("java.lang.Object"));
        setField(term127460, term127460.getClass(), "value", term127518);
        setIntField(term127460, term127460.getClass(), "count", 0);
        setElement(term127152, 0, term127460);
        setField(term127632, term127632.getClass(), "value", term127670);
        setIntField(term127632, term127632.getClass(), "count", 0);
        setElement(term127152, 1, term127632);
        term128106 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 2);
        Object term128107 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term128108 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term128111 = (byte[]) newByteArray(16);
        Object term128112 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term128113 = newInstance(Class.forName("java.lang.Object"));
        setField(term128108, term128108.getClass(), "toStringCache", "");
        setField(term128108, term128108.getClass(), "value", term128111);
        setByteField(term128108, term128108.getClass(), "coder", (byte) 0);
        setIntField(term128108, term128108.getClass(), "count", 0);
        setField(term128107, term128107.getClass(), "value", term128108);
        setIntField(term128107, term128107.getClass(), "count", 0);
        setElement(term128106, 0, term128107);
        setField(term128112, term128112.getClass(), "value", term128113);
        setIntField(term128112, term128112.getClass(), "count", 0);
        setElement(term128106, 1, term128112);
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
        args[0] = term127152;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term127152, term128106));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


