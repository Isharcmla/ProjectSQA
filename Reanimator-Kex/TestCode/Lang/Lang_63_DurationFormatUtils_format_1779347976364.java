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

public class DurationFormatUtils_format_1779347976364 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term285986;

    public DurationFormatUtils_format_1779347976364() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term286934 = new StringBuffer();
        StringBuffer term287106 = new StringBuffer();
        StringBuffer term287278 = new StringBuffer();
        term285986 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 493);
        Object term286496 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term286610 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term286724 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term286762 = newInstance(Class.forName("java.lang.Object"));
        Object term286876 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term287048 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term287220 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term287392 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term287430 = newInstance(Class.forName("java.lang.Object"));
        setField(term286496, term286496.getClass(), "value", null);
        setIntField(term286496, term286496.getClass(), "count", 0);
        setElement(term285986, 0, term286496);
        setField(term286610, term286610.getClass(), "value", null);
        setIntField(term286610, term286610.getClass(), "count", 0);
        setElement(term285986, 1, term286610);
        setField(term286724, term286724.getClass(), "value", term286762);
        setIntField(term286724, term286724.getClass(), "count", 0);
        setElement(term285986, 2, term286724);
        setField(term286876, term286876.getClass(), "value", term286934);
        setIntField(term286876, term286876.getClass(), "count", 0);
        setElement(term285986, 3, term286876);
        setField(term287048, term287048.getClass(), "value", term287106);
        setIntField(term287048, term287048.getClass(), "count", 0);
        setElement(term285986, 4, term287048);
        setField(term287220, term287220.getClass(), "value", term287278);
        setIntField(term287220, term287220.getClass(), "count", 0);
        setElement(term285986, 5, term287220);
        setField(term287392, term287392.getClass(), "value", term287430);
        setIntField(term287392, term287392.getClass(), "count", 0);
        setElement(term285986, 6, term287392);
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
        args[0] = term285986;
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


