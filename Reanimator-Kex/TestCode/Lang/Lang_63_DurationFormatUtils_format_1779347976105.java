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
import java.lang.StringBuilder;

public class DurationFormatUtils_format_1779347976105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term67803;
     Object term69358;

    public DurationFormatUtils_format_1779347976105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuilder term68979 = new StringBuilder();
        term67803 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 5);
        Object term68577 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term68691 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        char[] term68349 = (char[]) newCharArray(0);
        Object term68805 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term68919 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term69093 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term69203 = newInstance(Class.forName("org.vorpal.research.kex.intrinsics.UnknownIntrinsics"));
        setField(term68577, term68577.getClass(), "value", null);
        setIntField(term68577, term68577.getClass(), "count", 0);
        setElement(term67803, 0, term68577);
        setField(term68691, term68691.getClass(), "value", term68349);
        setIntField(term68691, term68691.getClass(), "count", 0);
        setElement(term67803, 1, term68691);
        setField(term68805, term68805.getClass(), "value", null);
        setIntField(term68805, term68805.getClass(), "count", 0);
        setElement(term67803, 2, term68805);
        setField(term68919, term68919.getClass(), "value", term68979);
        setIntField(term68919, term68919.getClass(), "count", 0);
        setElement(term67803, 3, term68919);
        setField(term69093, term69093.getClass(), "value", term69203);
        setIntField(term69093, term69093.getClass(), "count", 0);
        setElement(term67803, 4, term69093);
        term69358 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 5);
        Object term69359 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term69360 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        char[] term69361 = (char[]) newCharArray(0);
        Object term69362 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term69363 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term69364 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term69365 = (byte[]) newByteArray(16);
        Object term69366 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term69367 = newInstance(Class.forName("org.vorpal.research.kex.intrinsics.UnknownIntrinsics"));
        setField(term69359, term69359.getClass(), "value", null);
        setIntField(term69359, term69359.getClass(), "count", 0);
        setElement(term69358, 0, term69359);
        setField(term69360, term69360.getClass(), "value", term69361);
        setIntField(term69360, term69360.getClass(), "count", 0);
        setElement(term69358, 1, term69360);
        setField(term69362, term69362.getClass(), "value", null);
        setIntField(term69362, term69362.getClass(), "count", 0);
        setElement(term69358, 2, term69362);
        setField(term69364, term69364.getClass(), "value", term69365);
        setByteField(term69364, term69364.getClass(), "coder", (byte) 0);
        setIntField(term69364, term69364.getClass(), "count", 0);
        setField(term69363, term69363.getClass(), "value", term69364);
        setIntField(term69363, term69363.getClass(), "count", 0);
        setElement(term69358, 3, term69363);
        setField(term69366, term69366.getClass(), "value", term69367);
        setIntField(term69366, term69366.getClass(), "count", 0);
        setElement(term69358, 4, term69366);
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
        args[0] = term67803;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term67803, term69358));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


