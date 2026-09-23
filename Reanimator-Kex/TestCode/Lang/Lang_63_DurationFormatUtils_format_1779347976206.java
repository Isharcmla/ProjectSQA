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

public class DurationFormatUtils_format_1779347976206 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term141724;
     Object term144365;

    public DurationFormatUtils_format_1779347976206() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term142030 = new StringBuffer();
        term141724 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 4);
        Object term141972 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term142144 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term142296 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term142410 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term142524 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term141972, term141972.getClass(), "value", term142030);
        setIntField(term141972, term141972.getClass(), "count", 0);
        setElement(term141724, 0, term141972);
        setField(term142144, term142144.getClass(), "value", "");
        setIntField(term142144, term142144.getClass(), "count", 0);
        setElement(term141724, 1, term142144);
        setField(term142296, term142296.getClass(), "value", term142410);
        setIntField(term142296, term142296.getClass(), "count", 0);
        setElement(term141724, 2, term142296);
        setElement(term141724, 3, term142524);
        term144365 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 4);
        Object term144366 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term144367 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term144370 = (byte[]) newByteArray(16);
        Object term144371 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term144374 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term144375 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term144376 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term144367, term144367.getClass(), "toStringCache", "");
        setField(term144367, term144367.getClass(), "value", term144370);
        setByteField(term144367, term144367.getClass(), "coder", (byte) 0);
        setIntField(term144367, term144367.getClass(), "count", 0);
        setField(term144366, term144366.getClass(), "value", term144367);
        setIntField(term144366, term144366.getClass(), "count", 0);
        setElement(term144365, 0, term144366);
        setField(term144371, term144371.getClass(), "value", "");
        setIntField(term144371, term144371.getClass(), "count", 0);
        setElement(term144365, 1, term144371);
        setField(term144375, term144375.getClass(), "value", null);
        setIntField(term144375, term144375.getClass(), "count", 0);
        setField(term144374, term144374.getClass(), "value", term144375);
        setIntField(term144374, term144374.getClass(), "count", 0);
        setElement(term144365, 2, term144374);
        setField(term144376, term144376.getClass(), "value", null);
        setIntField(term144376, term144376.getClass(), "count", 0);
        setElement(term144365, 3, term144376);
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
        args[0] = term141724;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term141724, term144365));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


