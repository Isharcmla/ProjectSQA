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
import java.lang.StringBuffer;

public class DurationFormatUtils_format_177934797631 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14632;
     Object term15482;

    public DurationFormatUtils_format_177934797631() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term15343 = new StringBuffer();
        term14632 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 1);
        Object term15285 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term15285, term15285.getClass(), "value", term15343);
        setIntField(term15285, term15285.getClass(), "count", 0);
        setElement(term14632, 0, term15285);
        term15482 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 1);
        Object term15483 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term15484 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term15487 = (byte[]) newByteArray(16);
        setField(term15484, term15484.getClass(), "toStringCache", "");
        setField(term15484, term15484.getClass(), "value", term15487);
        setByteField(term15484, term15484.getClass(), "coder", (byte) 0);
        setIntField(term15484, term15484.getClass(), "count", 0);
        setField(term15483, term15483.getClass(), "value", term15484);
        setIntField(term15483, term15483.getClass(), "count", 0);
        setElement(term15482, 0, term15483);
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
        args[0] = term14632;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term14632, term15482));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


