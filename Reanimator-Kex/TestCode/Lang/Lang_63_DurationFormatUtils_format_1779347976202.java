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

public class DurationFormatUtils_format_1779347976202 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term138777;
     Object term141355;

    public DurationFormatUtils_format_1779347976202() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term139811 = new StringBuffer();
        StringBuffer term139983 = new StringBuffer();
        term138777 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 4);
        Object term139525 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term139639 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term139753 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term139925 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term139525, term139525.getClass(), "value", null);
        setIntField(term139525, term139525.getClass(), "count", 0);
        setElement(term138777, 0, term139525);
        setField(term139639, term139639.getClass(), "value", null);
        setIntField(term139639, term139639.getClass(), "count", 0);
        setElement(term138777, 1, term139639);
        setField(term139753, term139753.getClass(), "value", term139811);
        setIntField(term139753, term139753.getClass(), "count", 0);
        setElement(term138777, 2, term139753);
        setField(term139925, term139925.getClass(), "value", term139983);
        setIntField(term139925, term139925.getClass(), "count", 0);
        setElement(term138777, 3, term139925);
        term141355 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 4);
        Object term141356 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term141357 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term141358 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term141359 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term141362 = (byte[]) newByteArray(16);
        Object term141363 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term141364 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term141367 = (byte[]) newByteArray(16);
        setField(term141356, term141356.getClass(), "value", null);
        setIntField(term141356, term141356.getClass(), "count", 0);
        setElement(term141355, 0, term141356);
        setField(term141357, term141357.getClass(), "value", null);
        setIntField(term141357, term141357.getClass(), "count", 0);
        setElement(term141355, 1, term141357);
        setField(term141359, term141359.getClass(), "toStringCache", "");
        setField(term141359, term141359.getClass(), "value", term141362);
        setByteField(term141359, term141359.getClass(), "coder", (byte) 0);
        setIntField(term141359, term141359.getClass(), "count", 0);
        setField(term141358, term141358.getClass(), "value", term141359);
        setIntField(term141358, term141358.getClass(), "count", 0);
        setElement(term141355, 2, term141358);
        setField(term141364, term141364.getClass(), "toStringCache", "");
        setField(term141364, term141364.getClass(), "value", term141367);
        setByteField(term141364, term141364.getClass(), "coder", (byte) 0);
        setIntField(term141364, term141364.getClass(), "count", 0);
        setField(term141363, term141363.getClass(), "value", term141364);
        setIntField(term141363, term141363.getClass(), "count", 0);
        setElement(term141355, 3, term141363);
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
        args[0] = term138777;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term138777, term141355));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


