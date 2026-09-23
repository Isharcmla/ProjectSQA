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

public class DurationFormatUtils_format_1779347976410 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term338045;

    public DurationFormatUtils_format_1779347976410() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term339366 = new StringBuffer();
        StringBuffer term339538 = new StringBuffer();
        term338045 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 495);
        Object term338602 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term338712 = newInstance(Class.forName("org.vorpal.research.kex.intrinsics.UnknownIntrinsics"));
        Object term338826 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term338978 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object[] term338338 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 0);
        Object term339092 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term339194 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils"));
        Object term339308 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term339480 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term338602, term338602.getClass(), "value", term338712);
        setIntField(term338602, term338602.getClass(), "count", 0);
        setElement(term338045, 0, term338602);
        setField(term338826, term338826.getClass(), "value", "");
        setIntField(term338826, term338826.getClass(), "count", 0);
        setElement(term338045, 1, term338826);
        setField(term338978, term338978.getClass(), "value", term338338);
        setIntField(term338978, term338978.getClass(), "count", 0);
        setElement(term338045, 2, term338978);
        setField(term339092, term339092.getClass(), "value", term339194);
        setIntField(term339092, term339092.getClass(), "count", 0);
        setElement(term338045, 3, term339092);
        setField(term339308, term339308.getClass(), "value", term339366);
        setIntField(term339308, term339308.getClass(), "count", 0);
        setElement(term338045, 4, term339308);
        setElement(term338045, 5, term338826);
        setField(term339480, term339480.getClass(), "value", term339538);
        setIntField(term339480, term339480.getClass(), "count", 0);
        setElement(term338045, 6, term339480);
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
        args[0] = term338045;
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


