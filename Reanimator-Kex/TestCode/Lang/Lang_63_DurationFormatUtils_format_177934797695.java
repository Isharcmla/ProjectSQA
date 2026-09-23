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

public class DurationFormatUtils_format_177934797695 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term61961;
     Object term63238;

    public DurationFormatUtils_format_177934797695() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term61961 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 5);
        Object term62626 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term62740 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term62854 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        char[] term62064 = (char[]) newCharArray(0);
        Object term62968 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term63082 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        char[] term62279 = (char[]) newCharArray(0);
        setField(term62626, term62626.getClass(), "value", null);
        setIntField(term62626, term62626.getClass(), "count", 0);
        setElement(term61961, 0, term62626);
        setField(term62854, term62854.getClass(), "value", term62064);
        setIntField(term62854, term62854.getClass(), "count", 0);
        setField(term62740, term62740.getClass(), "value", term62854);
        setIntField(term62740, term62740.getClass(), "count", 0);
        setElement(term61961, 1, term62740);
        setField(term62968, term62968.getClass(), "value", null);
        setIntField(term62968, term62968.getClass(), "count", 0);
        setElement(term61961, 2, term62968);
        setField(term63082, term63082.getClass(), "value", term62279);
        setIntField(term63082, term63082.getClass(), "count", 0);
        setElement(term61961, 3, term63082);
        setElement(term61961, 4, term62854);
        term63238 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 5);
        Object term63239 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term63240 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term63241 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        char[] term63242 = (char[]) newCharArray(0);
        Object term63243 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term63244 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        char[] term63245 = (char[]) newCharArray(0);
        setField(term63239, term63239.getClass(), "value", null);
        setIntField(term63239, term63239.getClass(), "count", 0);
        setElement(term63238, 0, term63239);
        setField(term63241, term63241.getClass(), "value", term63242);
        setIntField(term63241, term63241.getClass(), "count", 0);
        setField(term63240, term63240.getClass(), "value", term63241);
        setIntField(term63240, term63240.getClass(), "count", 0);
        setElement(term63238, 1, term63240);
        setField(term63243, term63243.getClass(), "value", null);
        setIntField(term63243, term63243.getClass(), "count", 0);
        setElement(term63238, 2, term63243);
        setField(term63244, term63244.getClass(), "value", term63245);
        setIntField(term63244, term63244.getClass(), "count", 0);
        setElement(term63238, 3, term63244);
        setElement(term63238, 4, term63241);
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
        args[0] = term61961;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term61961, term63238));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


