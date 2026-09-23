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

public class DurationFormatUtils_format_1779347976230 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term156702;
     Object term159145;

    public DurationFormatUtils_format_1779347976230() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term156979 = new StringBuffer();
        term156702 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 3);
        Object term156921 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term157093 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term157207 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term156921, term156921.getClass(), "value", term156979);
        setIntField(term156921, term156921.getClass(), "count", 0);
        setElement(term156702, 0, term156921);
        setField(term157093, term157093.getClass(), "value", null);
        setIntField(term157093, term157093.getClass(), "count", 0);
        setElement(term156702, 1, term157093);
        setElement(term156702, 2, term157207);
        term159145 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 3);
        Object term159146 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term159147 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term159150 = (byte[]) newByteArray(16);
        Object term159151 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term159152 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term159147, term159147.getClass(), "toStringCache", "");
        setField(term159147, term159147.getClass(), "value", term159150);
        setByteField(term159147, term159147.getClass(), "coder", (byte) 0);
        setIntField(term159147, term159147.getClass(), "count", 0);
        setField(term159146, term159146.getClass(), "value", term159147);
        setIntField(term159146, term159146.getClass(), "count", 0);
        setElement(term159145, 0, term159146);
        setField(term159151, term159151.getClass(), "value", null);
        setIntField(term159151, term159151.getClass(), "count", 0);
        setElement(term159145, 1, term159151);
        setField(term159152, term159152.getClass(), "value", null);
        setIntField(term159152, term159152.getClass(), "count", 0);
        setElement(term159145, 2, term159152);
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
        args[0] = term156702;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term156702, term159145));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


