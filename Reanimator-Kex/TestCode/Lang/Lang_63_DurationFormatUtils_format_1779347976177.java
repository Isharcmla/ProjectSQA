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

public class DurationFormatUtils_format_1779347976177 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term126087;
     Object term127826;

    public DurationFormatUtils_format_1779347976177() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term126372 = new StringBuffer();
        StringBuilder term126546 = new StringBuilder();
        term126087 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 2);
        Object term126314 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term126486 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term126314, term126314.getClass(), "value", term126372);
        setIntField(term126314, term126314.getClass(), "count", 0);
        setElement(term126087, 0, term126314);
        setField(term126486, term126486.getClass(), "value", term126546);
        setIntField(term126486, term126486.getClass(), "count", 0);
        setElement(term126087, 1, term126486);
        term127826 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 2);
        Object term127827 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term127828 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term127831 = (byte[]) newByteArray(16);
        Object term127832 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term127833 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term127834 = (byte[]) newByteArray(16);
        setField(term127828, term127828.getClass(), "toStringCache", "");
        setField(term127828, term127828.getClass(), "value", term127831);
        setByteField(term127828, term127828.getClass(), "coder", (byte) 0);
        setIntField(term127828, term127828.getClass(), "count", 0);
        setField(term127827, term127827.getClass(), "value", term127828);
        setIntField(term127827, term127827.getClass(), "count", 0);
        setElement(term127826, 0, term127827);
        setField(term127833, term127833.getClass(), "value", term127834);
        setByteField(term127833, term127833.getClass(), "coder", (byte) 0);
        setIntField(term127833, term127833.getClass(), "count", 0);
        setField(term127832, term127832.getClass(), "value", term127833);
        setIntField(term127832, term127832.getClass(), "count", 0);
        setElement(term127826, 1, term127832);
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
        args[0] = term126087;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term126087, term127826));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


