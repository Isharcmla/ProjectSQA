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

public class DurationFormatUtils_format_177934797691 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56972;
     Object term60405;

    public DurationFormatUtils_format_177934797691() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term60002 = new StringBuffer();
        term56972 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 4);
        Object term59830 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term59944 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term60116 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term60230 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term60268 = newInstance(Class.forName("java.lang.Object"));
        setField(term59830, term59830.getClass(), "value", null);
        setIntField(term59830, term59830.getClass(), "count", 0);
        setElement(term56972, 0, term59830);
        setField(term59944, term59944.getClass(), "value", term60002);
        setIntField(term59944, term59944.getClass(), "count", 0);
        setElement(term56972, 1, term59944);
        setField(term60116, term60116.getClass(), "value", null);
        setIntField(term60116, term60116.getClass(), "count", 0);
        setElement(term56972, 2, term60116);
        setField(term60230, term60230.getClass(), "value", term60268);
        setIntField(term60230, term60230.getClass(), "count", 0);
        setElement(term56972, 3, term60230);
        term60405 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 4);
        Object term60406 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term60407 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term60408 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term60411 = (byte[]) newByteArray(16);
        Object term60412 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term60413 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term60414 = newInstance(Class.forName("java.lang.Object"));
        setField(term60406, term60406.getClass(), "value", null);
        setIntField(term60406, term60406.getClass(), "count", 0);
        setElement(term60405, 0, term60406);
        setField(term60408, term60408.getClass(), "toStringCache", "");
        setField(term60408, term60408.getClass(), "value", term60411);
        setByteField(term60408, term60408.getClass(), "coder", (byte) 0);
        setIntField(term60408, term60408.getClass(), "count", 0);
        setField(term60407, term60407.getClass(), "value", term60408);
        setIntField(term60407, term60407.getClass(), "count", 0);
        setElement(term60405, 1, term60407);
        setField(term60412, term60412.getClass(), "value", null);
        setIntField(term60412, term60412.getClass(), "count", 0);
        setElement(term60405, 2, term60412);
        setField(term60413, term60413.getClass(), "value", term60414);
        setIntField(term60413, term60413.getClass(), "count", 0);
        setElement(term60405, 3, term60413);
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
        args[0] = term56972;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term56972, term60405));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


