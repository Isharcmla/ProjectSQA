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

public class DurationFormatUtils_format_1779347976140 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term99753;
     Object term102448;

    public DurationFormatUtils_format_1779347976140() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term100534 = new StringBuffer();
        term99753 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 5);
        Object term100476 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term100648 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term100686 = newInstance(Class.forName("java.lang.Object"));
        Object term100800 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term100952 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term100476, term100476.getClass(), "value", term100534);
        setIntField(term100476, term100476.getClass(), "count", 0);
        setElement(term99753, 0, term100476);
        setField(term100648, term100648.getClass(), "value", term100686);
        setIntField(term100648, term100648.getClass(), "count", 0);
        setElement(term99753, 1, term100648);
        setField(term100800, term100800.getClass(), "value", "");
        setIntField(term100800, term100800.getClass(), "count", 0);
        setElement(term99753, 2, term100800);
        setElement(term99753, 3, term100952);
        setElement(term99753, 4, term100800);
        term102448 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 5);
        Object term102449 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term102450 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term102453 = (byte[]) newByteArray(16);
        Object term102454 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term102455 = newInstance(Class.forName("java.lang.Object"));
        Object term102456 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term102459 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term102450, term102450.getClass(), "toStringCache", "");
        setField(term102450, term102450.getClass(), "value", term102453);
        setByteField(term102450, term102450.getClass(), "coder", (byte) 0);
        setIntField(term102450, term102450.getClass(), "count", 0);
        setField(term102449, term102449.getClass(), "value", term102450);
        setIntField(term102449, term102449.getClass(), "count", 0);
        setElement(term102448, 0, term102449);
        setField(term102454, term102454.getClass(), "value", term102455);
        setIntField(term102454, term102454.getClass(), "count", 0);
        setElement(term102448, 1, term102454);
        setField(term102456, term102456.getClass(), "value", "");
        setIntField(term102456, term102456.getClass(), "count", 0);
        setElement(term102448, 2, term102456);
        setField(term102459, term102459.getClass(), "value", null);
        setIntField(term102459, term102459.getClass(), "count", 0);
        setElement(term102448, 3, term102459);
        setElement(term102448, 4, term102456);
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
        args[0] = term99753;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term99753, term102448));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


