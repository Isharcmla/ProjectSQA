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

public class DurationFormatUtils_format_1779347976275 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term200104;
     Object term201607;

    public DurationFormatUtils_format_1779347976275() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term200542 = new StringBuffer();
        StringBuffer term200828 = new StringBuffer();
        term200104 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 5);
        Object term200484 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term200656 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term200770 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term200942 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term201056 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        char[] term200263 = (char[]) newCharArray(0);
        setField(term200484, term200484.getClass(), "value", term200542);
        setIntField(term200484, term200484.getClass(), "count", 0);
        setElement(term200104, 0, term200484);
        setField(term200656, term200656.getClass(), "value", null);
        setIntField(term200656, term200656.getClass(), "count", 0);
        setElement(term200104, 1, term200656);
        setField(term200770, term200770.getClass(), "value", term200828);
        setIntField(term200770, term200770.getClass(), "count", 0);
        setElement(term200104, 2, term200770);
        setField(term200942, term200942.getClass(), "value", null);
        setIntField(term200942, term200942.getClass(), "count", 0);
        setElement(term200104, 3, term200942);
        setField(term201056, term201056.getClass(), "value", term200263);
        setIntField(term201056, term201056.getClass(), "count", 0);
        setElement(term200104, 4, term201056);
        term201607 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 5);
        Object term201608 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term201609 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term201612 = (byte[]) newByteArray(16);
        Object term201613 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term201614 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term201615 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term201618 = (byte[]) newByteArray(16);
        Object term201619 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term201620 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        char[] term201621 = (char[]) newCharArray(0);
        setField(term201609, term201609.getClass(), "toStringCache", "");
        setField(term201609, term201609.getClass(), "value", term201612);
        setByteField(term201609, term201609.getClass(), "coder", (byte) 0);
        setIntField(term201609, term201609.getClass(), "count", 0);
        setField(term201608, term201608.getClass(), "value", term201609);
        setIntField(term201608, term201608.getClass(), "count", 0);
        setElement(term201607, 0, term201608);
        setField(term201613, term201613.getClass(), "value", null);
        setIntField(term201613, term201613.getClass(), "count", 0);
        setElement(term201607, 1, term201613);
        setField(term201615, term201615.getClass(), "toStringCache", "");
        setField(term201615, term201615.getClass(), "value", term201618);
        setByteField(term201615, term201615.getClass(), "coder", (byte) 0);
        setIntField(term201615, term201615.getClass(), "count", 0);
        setField(term201614, term201614.getClass(), "value", term201615);
        setIntField(term201614, term201614.getClass(), "count", 0);
        setElement(term201607, 2, term201614);
        setField(term201619, term201619.getClass(), "value", null);
        setIntField(term201619, term201619.getClass(), "count", 0);
        setElement(term201607, 3, term201619);
        setField(term201620, term201620.getClass(), "value", term201621);
        setIntField(term201620, term201620.getClass(), "count", 0);
        setElement(term201607, 4, term201620);
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
        args[0] = term200104;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term200104, term201607));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


