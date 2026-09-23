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

public class DurationFormatUtils_format_1779347976395 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term322644;
     Object term328109;

    public DurationFormatUtils_format_1779347976395() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term323444 = new StringBuffer();
        term322644 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 7);
        Object term323386 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term323558 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term323672 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term323386, term323386.getClass(), "value", term323444);
        setIntField(term323386, term323386.getClass(), "count", 0);
        setElement(term322644, 0, term323386);
        setField(term323558, term323558.getClass(), "value", null);
        setIntField(term323558, term323558.getClass(), "count", 0);
        setElement(term322644, 1, term323558);
        setElement(term322644, 2, term323386);
        setElement(term322644, 3, term323386);
        setField(term323672, term323672.getClass(), "value", null);
        setIntField(term323672, term323672.getClass(), "count", 0);
        setElement(term322644, 4, term323672);
        setElement(term322644, 5, term323672);
        setElement(term322644, 6, term323672);
        term328109 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 7);
        Object term328110 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term328111 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term328114 = (byte[]) newByteArray(16);
        Object term328115 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term328116 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term328111, term328111.getClass(), "toStringCache", "");
        setField(term328111, term328111.getClass(), "value", term328114);
        setByteField(term328111, term328111.getClass(), "coder", (byte) 0);
        setIntField(term328111, term328111.getClass(), "count", 0);
        setField(term328110, term328110.getClass(), "value", term328111);
        setIntField(term328110, term328110.getClass(), "count", 0);
        setElement(term328109, 0, term328110);
        setField(term328115, term328115.getClass(), "value", null);
        setIntField(term328115, term328115.getClass(), "count", 0);
        setElement(term328109, 1, term328115);
        setElement(term328109, 2, term328110);
        setElement(term328109, 3, term328110);
        setField(term328116, term328116.getClass(), "value", null);
        setIntField(term328116, term328116.getClass(), "count", 0);
        setElement(term328109, 4, term328116);
        setElement(term328109, 5, term328116);
        setElement(term328109, 6, term328116);
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
        args[0] = term322644;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term322644, term328109));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


