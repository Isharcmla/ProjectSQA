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

public class DurationFormatUtils_format_1779347976486 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term411870;

    public DurationFormatUtils_format_1779347976486() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term412354 = new StringBuffer();
        StringBuffer term412640 = new StringBuffer();
        StringBuffer term412812 = new StringBuffer();
        term411870 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 503);
        Object term412182 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object[] term411950 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 0);
        Object term412296 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term412468 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        char[] term411958 = (char[]) newCharArray(0);
        Object term412582 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term412754 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term412182, term412182.getClass(), "value", term411950);
        setIntField(term412182, term412182.getClass(), "count", 0);
        setElement(term411870, 0, term412182);
        setField(term412296, term412296.getClass(), "value", term412354);
        setIntField(term412296, term412296.getClass(), "count", 0);
        setElement(term411870, 1, term412296);
        setField(term412468, term412468.getClass(), "value", term411958);
        setIntField(term412468, term412468.getClass(), "count", 0);
        setElement(term411870, 2, term412468);
        setField(term412582, term412582.getClass(), "value", term412640);
        setIntField(term412582, term412582.getClass(), "count", 0);
        setElement(term411870, 3, term412582);
        setField(term412754, term412754.getClass(), "value", term412812);
        setIntField(term412754, term412754.getClass(), "count", 0);
        setElement(term411870, 4, term412754);
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
        args[0] = term411870;
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


