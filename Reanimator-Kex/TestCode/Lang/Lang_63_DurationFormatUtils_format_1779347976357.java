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
import java.lang.StringBuilder;

public class DurationFormatUtils_format_1779347976357 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term276363;

    public DurationFormatUtils_format_1779347976357() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term276838 = new StringBuffer();
        StringBuffer term277162 = new StringBuffer();
        StringBuffer term277486 = new StringBuffer();
        StringBuilder term277660 = new StringBuilder();
        term276363 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 493);
        Object term276780 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term276952 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term276990 = newInstance(Class.forName("java.lang.Object"));
        Object term277104 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term277276 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term277314 = newInstance(Class.forName("java.lang.Object"));
        Object term277428 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term277600 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term276780, term276780.getClass(), "value", term276838);
        setIntField(term276780, term276780.getClass(), "count", 0);
        setElement(term276363, 0, term276780);
        setField(term276952, term276952.getClass(), "value", term276990);
        setIntField(term276952, term276952.getClass(), "count", 0);
        setElement(term276363, 1, term276952);
        setField(term277104, term277104.getClass(), "value", term277162);
        setIntField(term277104, term277104.getClass(), "count", 0);
        setElement(term276363, 2, term277104);
        setField(term277276, term277276.getClass(), "value", term277314);
        setIntField(term277276, term277276.getClass(), "count", 0);
        setElement(term276363, 3, term277276);
        setField(term277428, term277428.getClass(), "value", term277486);
        setIntField(term277428, term277428.getClass(), "count", 0);
        setElement(term276363, 4, term277428);
        setField(term277600, term277600.getClass(), "value", term277660);
        setIntField(term277600, term277600.getClass(), "count", 0);
        setElement(term276363, 5, term277600);
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
        args[0] = term276363;
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


