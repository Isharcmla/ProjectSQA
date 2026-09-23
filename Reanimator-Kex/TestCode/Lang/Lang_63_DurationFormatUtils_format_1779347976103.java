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

public class DurationFormatUtils_format_1779347976103 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term66786;
     Object term67610;

    public DurationFormatUtils_format_1779347976103() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term67366 = new StringBuffer();
        term66786 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 4);
        Object term67042 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term67080 = newInstance(Class.forName("java.lang.Object"));
        Object term67194 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object[] term66855 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 0);
        Object term67308 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term67480 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term67042, term67042.getClass(), "value", term67080);
        setIntField(term67042, term67042.getClass(), "count", 0);
        setElement(term66786, 0, term67042);
        setField(term67194, term67194.getClass(), "value", term66855);
        setIntField(term67194, term67194.getClass(), "count", 0);
        setElement(term66786, 1, term67194);
        setField(term67308, term67308.getClass(), "value", term67366);
        setIntField(term67308, term67308.getClass(), "count", 0);
        setElement(term66786, 2, term67308);
        setElement(term66786, 3, term67480);
        term67610 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 4);
        Object term67611 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term67612 = newInstance(Class.forName("java.lang.Object"));
        Object term67613 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object[] term67614 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 0);
        Object term67615 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term67616 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term67619 = (byte[]) newByteArray(16);
        Object term67620 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term67611, term67611.getClass(), "value", term67612);
        setIntField(term67611, term67611.getClass(), "count", 0);
        setElement(term67610, 0, term67611);
        setField(term67613, term67613.getClass(), "value", term67614);
        setIntField(term67613, term67613.getClass(), "count", 0);
        setElement(term67610, 1, term67613);
        setField(term67616, term67616.getClass(), "toStringCache", "");
        setField(term67616, term67616.getClass(), "value", term67619);
        setByteField(term67616, term67616.getClass(), "coder", (byte) 0);
        setIntField(term67616, term67616.getClass(), "count", 0);
        setField(term67615, term67615.getClass(), "value", term67616);
        setIntField(term67615, term67615.getClass(), "count", 0);
        setElement(term67610, 2, term67615);
        setField(term67620, term67620.getClass(), "value", null);
        setIntField(term67620, term67620.getClass(), "count", 0);
        setElement(term67610, 3, term67620);
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
        args[0] = term66786;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term66786, term67610));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


