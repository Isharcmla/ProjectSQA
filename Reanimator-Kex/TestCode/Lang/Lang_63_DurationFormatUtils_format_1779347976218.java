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
import java.lang.StringBuilder;

public class DurationFormatUtils_format_1779347976218 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term148118;
     Object term151689;

    public DurationFormatUtils_format_1779347976218() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term148977 = new StringBuffer();
        StringBuilder term149151 = new StringBuilder();
        term148118 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 5);
        Object term148805 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object[] term148368 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 0);
        Object term148919 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term149091 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term149265 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        char[] term148133 = (char[]) newCharArray(234);
        Object term149379 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term148805, term148805.getClass(), "value", term148368);
        setIntField(term148805, term148805.getClass(), "count", 0);
        setElement(term148118, 0, term148805);
        setField(term148919, term148919.getClass(), "value", term148977);
        setIntField(term148919, term148919.getClass(), "count", 0);
        setElement(term148118, 1, term148919);
        setField(term149091, term149091.getClass(), "value", term149151);
        setIntField(term149091, term149091.getClass(), "count", 0);
        setElement(term148118, 2, term149091);
        setField(term149265, term149265.getClass(), "value", term148133);
        setIntField(term149265, term149265.getClass(), "count", 0);
        setElement(term148118, 3, term149265);
        setElement(term148118, 4, term149379);
        term151689 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 5);
        Object term151690 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object[] term151691 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 0);
        Object term151692 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term151693 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term151696 = (byte[]) newByteArray(16);
        Object term151697 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term151698 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term151699 = (byte[]) newByteArray(16);
        Object term151700 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        char[] term151701 = (char[]) newCharArray(234);
        Object term151702 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term151690, term151690.getClass(), "value", term151691);
        setIntField(term151690, term151690.getClass(), "count", 0);
        setElement(term151689, 0, term151690);
        setField(term151693, term151693.getClass(), "toStringCache", "");
        setField(term151693, term151693.getClass(), "value", term151696);
        setByteField(term151693, term151693.getClass(), "coder", (byte) 0);
        setIntField(term151693, term151693.getClass(), "count", 0);
        setField(term151692, term151692.getClass(), "value", term151693);
        setIntField(term151692, term151692.getClass(), "count", 0);
        setElement(term151689, 1, term151692);
        setField(term151698, term151698.getClass(), "value", term151699);
        setByteField(term151698, term151698.getClass(), "coder", (byte) 0);
        setIntField(term151698, term151698.getClass(), "count", 0);
        setField(term151697, term151697.getClass(), "value", term151698);
        setIntField(term151697, term151697.getClass(), "count", 0);
        setElement(term151689, 2, term151697);
        setField(term151700, term151700.getClass(), "value", term151701);
        setIntField(term151700, term151700.getClass(), "count", 0);
        setElement(term151689, 3, term151700);
        setField(term151702, term151702.getClass(), "value", null);
        setIntField(term151702, term151702.getClass(), "count", 0);
        setElement(term151689, 4, term151702);
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
        args[0] = term148118;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term148118, term151689));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


