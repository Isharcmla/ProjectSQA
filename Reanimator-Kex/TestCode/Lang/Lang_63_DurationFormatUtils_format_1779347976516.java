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

public class DurationFormatUtils_format_1779347976516 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term435838;

    public DurationFormatUtils_format_1779347976516() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term436676 = new StringBuffer();
        StringBuffer term437072 = new StringBuffer();
        StringBuffer term437244 = new StringBuffer();
        StringBuffer term437416 = new StringBuffer();
        term435838 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 107);
        Object term436618 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term436790 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term436900 = newInstance(Class.forName("org.vorpal.research.kex.intrinsics.UnknownIntrinsics"));
        Object term437014 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term437186 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term437358 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term437530 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object[] term436387 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 0);
        setField(term436618, term436618.getClass(), "value", term436676);
        setIntField(term436618, term436618.getClass(), "count", 0);
        setElement(term435838, 0, term436618);
        setField(term436790, term436790.getClass(), "value", term436900);
        setIntField(term436790, term436790.getClass(), "count", 0);
        setElement(term435838, 1, term436790);
        setField(term437014, term437014.getClass(), "value", term437072);
        setIntField(term437014, term437014.getClass(), "count", 0);
        setElement(term435838, 2, term437014);
        setField(term437186, term437186.getClass(), "value", term437244);
        setIntField(term437186, term437186.getClass(), "count", 0);
        setElement(term435838, 3, term437186);
        setField(term437358, term437358.getClass(), "value", term437416);
        setIntField(term437358, term437358.getClass(), "count", 0);
        setElement(term435838, 4, term437358);
        setField(term437530, term437530.getClass(), "value", term436387);
        setIntField(term437530, term437530.getClass(), "count", 0);
        setElement(term435838, 5, term437530);
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
        args[0] = term435838;
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


