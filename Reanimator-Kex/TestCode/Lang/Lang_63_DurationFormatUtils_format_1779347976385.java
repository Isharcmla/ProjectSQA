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

public class DurationFormatUtils_format_1779347976385 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term315559;
     Object term316613;

    public DurationFormatUtils_format_1779347976385() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term316330 = new StringBuffer();
        term315559 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 5);
        Object term316272 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term316444 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term316272, term316272.getClass(), "value", term316330);
        setIntField(term316272, term316272.getClass(), "count", 0);
        setElement(term315559, 0, term316272);
        setField(term316444, term316444.getClass(), "value", null);
        setIntField(term316444, term316444.getClass(), "count", 0);
        setElement(term315559, 1, term316444);
        setElement(term315559, 2, term316444);
        setElement(term315559, 3, term316444);
        setElement(term315559, 4, term316272);
        term316613 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 5);
        Object term316614 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term316615 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term316618 = (byte[]) newByteArray(16);
        Object term316619 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term316615, term316615.getClass(), "toStringCache", "");
        setField(term316615, term316615.getClass(), "value", term316618);
        setByteField(term316615, term316615.getClass(), "coder", (byte) 0);
        setIntField(term316615, term316615.getClass(), "count", 0);
        setField(term316614, term316614.getClass(), "value", term316615);
        setIntField(term316614, term316614.getClass(), "count", 0);
        setElement(term316613, 0, term316614);
        setField(term316619, term316619.getClass(), "value", null);
        setIntField(term316619, term316619.getClass(), "count", 0);
        setElement(term316613, 1, term316619);
        setElement(term316613, 2, term316619);
        setElement(term316613, 3, term316619);
        setElement(term316613, 4, term316614);
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
        args[0] = term315559;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term315559, term316613));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


