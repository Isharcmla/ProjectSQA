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

public class DurationFormatUtils_format_1779347976160 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term112577;
     Object term117561;

    public DurationFormatUtils_format_1779347976160() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term114516 = new StringBuffer();
        term112577 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 5);
        Object term114230 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term114344 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term114458 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term114630 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        char[] term113303 = (char[]) newCharArray(0);
        Object term114744 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        char[] term112592 = (char[]) newCharArray(234);
        setField(term114230, term114230.getClass(), "value", null);
        setIntField(term114230, term114230.getClass(), "count", 0);
        setElement(term112577, 0, term114230);
        setField(term114344, term114344.getClass(), "value", null);
        setIntField(term114344, term114344.getClass(), "count", 0);
        setElement(term112577, 1, term114344);
        setField(term114458, term114458.getClass(), "value", term114516);
        setIntField(term114458, term114458.getClass(), "count", 0);
        setElement(term112577, 2, term114458);
        setField(term114630, term114630.getClass(), "value", term113303);
        setIntField(term114630, term114630.getClass(), "count", 0);
        setElement(term112577, 3, term114630);
        setField(term114744, term114744.getClass(), "value", term112592);
        setIntField(term114744, term114744.getClass(), "count", 0);
        setElement(term112577, 4, term114744);
        term117561 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 5);
        Object term117562 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term117563 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term117564 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term117565 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term117568 = (byte[]) newByteArray(16);
        Object term117569 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        char[] term117570 = (char[]) newCharArray(0);
        Object term117571 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        char[] term117572 = (char[]) newCharArray(234);
        setField(term117562, term117562.getClass(), "value", null);
        setIntField(term117562, term117562.getClass(), "count", 0);
        setElement(term117561, 0, term117562);
        setField(term117563, term117563.getClass(), "value", null);
        setIntField(term117563, term117563.getClass(), "count", 0);
        setElement(term117561, 1, term117563);
        setField(term117565, term117565.getClass(), "toStringCache", "");
        setField(term117565, term117565.getClass(), "value", term117568);
        setByteField(term117565, term117565.getClass(), "coder", (byte) 0);
        setIntField(term117565, term117565.getClass(), "count", 0);
        setField(term117564, term117564.getClass(), "value", term117565);
        setIntField(term117564, term117564.getClass(), "count", 0);
        setElement(term117561, 2, term117564);
        setField(term117569, term117569.getClass(), "value", term117570);
        setIntField(term117569, term117569.getClass(), "count", 0);
        setElement(term117561, 3, term117569);
        setField(term117571, term117571.getClass(), "value", term117572);
        setIntField(term117571, term117571.getClass(), "count", 0);
        setElement(term117561, 4, term117571);
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
        args[0] = term112577;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term112577, term117561));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


