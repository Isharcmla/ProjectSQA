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

public class DurationFormatUtils_format_1779347976326 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term242435;

    public DurationFormatUtils_format_1779347976326() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term243231 = new StringBuffer();
        StringBuffer term243403 = new StringBuffer();
        StringBuffer term243575 = new StringBuffer();
        StringBuffer term243861 = new StringBuffer();
        term242435 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 495);
        Object term243173 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term243345 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term243517 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term243689 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term243803 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term243975 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term243173, term243173.getClass(), "value", term243231);
        setIntField(term243173, term243173.getClass(), "count", 0);
        setElement(term242435, 0, term243173);
        setField(term243345, term243345.getClass(), "value", term243403);
        setIntField(term243345, term243345.getClass(), "count", 0);
        setElement(term242435, 1, term243345);
        setField(term243517, term243517.getClass(), "value", term243575);
        setIntField(term243517, term243517.getClass(), "count", 0);
        setElement(term242435, 2, term243517);
        setField(term243689, term243689.getClass(), "value", term243231);
        setIntField(term243689, term243689.getClass(), "count", 0);
        setElement(term242435, 3, term243689);
        setField(term243803, term243803.getClass(), "value", term243861);
        setIntField(term243803, term243803.getClass(), "count", 0);
        setElement(term242435, 4, term243803);
        setField(term243975, term243975.getClass(), "value", term243861);
        setIntField(term243975, term243975.getClass(), "count", 0);
        setElement(term242435, 5, term243975);
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
        args[0] = term242435;
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


