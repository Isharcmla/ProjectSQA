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

public class DurationFormatUtils_format_177934797643 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22310;
     Object term23210;

    public DurationFormatUtils_format_177934797643() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term22820 = new StringBuffer();
        StringBuilder term22994 = new StringBuilder();
        term22310 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 2);
        Object term22762 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term22934 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term22762, term22762.getClass(), "value", term22820);
        setIntField(term22762, term22762.getClass(), "count", 0);
        setElement(term22310, 0, term22762);
        setField(term22934, term22934.getClass(), "value", term22994);
        setIntField(term22934, term22934.getClass(), "count", 0);
        setElement(term22310, 1, term22934);
        term23210 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 2);
        Object term23211 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term23212 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term23215 = (byte[]) newByteArray(16);
        Object term23216 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term23217 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term23218 = (byte[]) newByteArray(16);
        setField(term23212, term23212.getClass(), "toStringCache", "");
        setField(term23212, term23212.getClass(), "value", term23215);
        setByteField(term23212, term23212.getClass(), "coder", (byte) 0);
        setIntField(term23212, term23212.getClass(), "count", 0);
        setField(term23211, term23211.getClass(), "value", term23212);
        setIntField(term23211, term23211.getClass(), "count", 0);
        setElement(term23210, 0, term23211);
        setField(term23217, term23217.getClass(), "value", term23218);
        setByteField(term23217, term23217.getClass(), "coder", (byte) 0);
        setIntField(term23217, term23217.getClass(), "count", 0);
        setField(term23216, term23216.getClass(), "value", term23217);
        setIntField(term23216, term23216.getClass(), "count", 0);
        setElement(term23210, 1, term23216);
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
        args[0] = term22310;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term22310, term23210));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


