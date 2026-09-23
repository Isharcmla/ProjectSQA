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

public class DurationFormatUtils_format_1779347976454 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term383169;

    public DurationFormatUtils_format_1779347976454() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term384061 = new StringBuffer();
        StringBuffer term384233 = new StringBuffer();
        term383169 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 495);
        Object term383471 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term383585 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term383699 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term383737 = newInstance(Class.forName("java.lang.Object"));
        Object term383851 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term383889 = newInstance(Class.forName("java.lang.Object"));
        Object term384003 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term384175 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term384347 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term384449 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils"));
        setField(term383471, term383471.getClass(), "value", term383585);
        setIntField(term383471, term383471.getClass(), "count", 0);
        setElement(term383169, 0, term383471);
        setField(term383699, term383699.getClass(), "value", term383737);
        setIntField(term383699, term383699.getClass(), "count", 0);
        setElement(term383169, 1, term383699);
        setField(term383851, term383851.getClass(), "value", term383889);
        setIntField(term383851, term383851.getClass(), "count", 0);
        setElement(term383169, 2, term383851);
        setField(term384003, term384003.getClass(), "value", term384061);
        setIntField(term384003, term384003.getClass(), "count", 0);
        setElement(term383169, 3, term384003);
        setField(term384175, term384175.getClass(), "value", term384233);
        setIntField(term384175, term384175.getClass(), "count", 0);
        setElement(term383169, 4, term384175);
        setField(term384347, term384347.getClass(), "value", term384449);
        setIntField(term384347, term384347.getClass(), "count", 0);
        setElement(term383169, 5, term384347);
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
        args[0] = term383169;
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


