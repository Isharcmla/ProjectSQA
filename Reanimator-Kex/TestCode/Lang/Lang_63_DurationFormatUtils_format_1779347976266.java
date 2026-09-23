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
import java.lang.NullPointerException;
import static org.apache.commons.lang.time.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.StringBuffer;

public class DurationFormatUtils_format_1779347976266 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term192012;

    public DurationFormatUtils_format_1779347976266() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term192834 = new StringBuffer();
        StringBuffer term193158 = new StringBuffer();
        term192012 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 110);
        Object term192776 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term192948 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term193100 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term193272 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term193310 = newInstance(Class.forName("java.lang.Object"));
        Object term193424 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term192776, term192776.getClass(), "value", term192834);
        setIntField(term192776, term192776.getClass(), "count", 0);
        setElement(term192012, 0, term192776);
        setField(term192948, term192948.getClass(), "value", "");
        setIntField(term192948, term192948.getClass(), "count", 0);
        setElement(term192012, 1, term192948);
        setField(term193100, term193100.getClass(), "value", term193158);
        setIntField(term193100, term193100.getClass(), "count", 0);
        setElement(term192012, 2, term193100);
        setField(term193272, term193272.getClass(), "value", term193310);
        setIntField(term193272, term193272.getClass(), "count", 0);
        setElement(term192012, 3, term193272);
        setField(term193424, term193424.getClass(), "value", "");
        setIntField(term193424, term193424.getClass(), "count", 0);
        setElement(term192012, 4, term193424);
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
        args[0] = term192012;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        try {
            callMethod(klass, "format", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


