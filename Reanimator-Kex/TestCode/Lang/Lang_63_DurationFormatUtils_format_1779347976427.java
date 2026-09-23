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

public class DurationFormatUtils_format_1779347976427 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term358400;
     Object term359859;

    public DurationFormatUtils_format_1779347976427() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term359340 = new StringBuffer();
        StringBuffer term359626 = new StringBuffer();
        term358400 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 8);
        Object term358826 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term358940 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term359054 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term359168 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term359282 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term359454 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term359568 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term358826, term358826.getClass(), "value", null);
        setIntField(term358826, term358826.getClass(), "count", 0);
        setElement(term358400, 0, term358826);
        setField(term358940, term358940.getClass(), "value", null);
        setIntField(term358940, term358940.getClass(), "count", 0);
        setElement(term358400, 1, term358940);
        setField(term359054, term359054.getClass(), "value", null);
        setIntField(term359054, term359054.getClass(), "count", 0);
        setElement(term358400, 2, term359054);
        setField(term359168, term359168.getClass(), "value", null);
        setIntField(term359168, term359168.getClass(), "count", 0);
        setElement(term358400, 3, term359168);
        setField(term359282, term359282.getClass(), "value", term359340);
        setIntField(term359282, term359282.getClass(), "count", 0);
        setElement(term358400, 4, term359282);
        setField(term359454, term359454.getClass(), "value", null);
        setIntField(term359454, term359454.getClass(), "count", 0);
        setElement(term358400, 5, term359454);
        setField(term359568, term359568.getClass(), "value", term359626);
        setIntField(term359568, term359568.getClass(), "count", 0);
        setElement(term358400, 6, term359568);
        setElement(term358400, 7, term358826);
        term359859 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 8);
        Object term359860 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term359861 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term359862 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term359863 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term359864 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term359865 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term359868 = (byte[]) newByteArray(16);
        Object term359869 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term359870 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term359871 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term359874 = (byte[]) newByteArray(16);
        setField(term359860, term359860.getClass(), "value", null);
        setIntField(term359860, term359860.getClass(), "count", 0);
        setElement(term359859, 0, term359860);
        setField(term359861, term359861.getClass(), "value", null);
        setIntField(term359861, term359861.getClass(), "count", 0);
        setElement(term359859, 1, term359861);
        setField(term359862, term359862.getClass(), "value", null);
        setIntField(term359862, term359862.getClass(), "count", 0);
        setElement(term359859, 2, term359862);
        setField(term359863, term359863.getClass(), "value", null);
        setIntField(term359863, term359863.getClass(), "count", 0);
        setElement(term359859, 3, term359863);
        setField(term359865, term359865.getClass(), "toStringCache", "");
        setField(term359865, term359865.getClass(), "value", term359868);
        setByteField(term359865, term359865.getClass(), "coder", (byte) 0);
        setIntField(term359865, term359865.getClass(), "count", 0);
        setField(term359864, term359864.getClass(), "value", term359865);
        setIntField(term359864, term359864.getClass(), "count", 0);
        setElement(term359859, 4, term359864);
        setField(term359869, term359869.getClass(), "value", null);
        setIntField(term359869, term359869.getClass(), "count", 0);
        setElement(term359859, 5, term359869);
        setField(term359871, term359871.getClass(), "toStringCache", "");
        setField(term359871, term359871.getClass(), "value", term359874);
        setByteField(term359871, term359871.getClass(), "coder", (byte) 0);
        setIntField(term359871, term359871.getClass(), "count", 0);
        setField(term359870, term359870.getClass(), "value", term359871);
        setIntField(term359870, term359870.getClass(), "count", 0);
        setElement(term359859, 6, term359870);
        setElement(term359859, 7, term359860);
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
        args[0] = term358400;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term358400, term359859));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


