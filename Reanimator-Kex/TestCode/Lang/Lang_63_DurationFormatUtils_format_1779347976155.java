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

public class DurationFormatUtils_format_1779347976155 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term109270;
     Object term111632;

    public DurationFormatUtils_format_1779347976155() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term110373 = new StringBuffer();
        StringBuffer term110887 = new StringBuffer();
        term109270 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 6);
        Object term110315 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term110487 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term110601 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term110715 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term110829 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term111001 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term111115 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term110315, term110315.getClass(), "value", term110373);
        setIntField(term110315, term110315.getClass(), "count", 0);
        setElement(term109270, 0, term110315);
        setField(term110487, term110487.getClass(), "value", null);
        setIntField(term110487, term110487.getClass(), "count", 0);
        setElement(term109270, 1, term110487);
        setField(term110601, term110601.getClass(), "value", null);
        setIntField(term110601, term110601.getClass(), "count", 0);
        setElement(term109270, 2, term110601);
        setField(term110715, term110715.getClass(), "value", null);
        setIntField(term110715, term110715.getClass(), "count", 0);
        setElement(term109270, 3, term110715);
        setField(term110829, term110829.getClass(), "value", term110887);
        setIntField(term110829, term110829.getClass(), "count", 0);
        setElement(term109270, 4, term110829);
        setField(term111001, term111001.getClass(), "value", term111115);
        setIntField(term111001, term111001.getClass(), "count", 0);
        setElement(term109270, 5, term111001);
        term111632 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 6);
        Object term111633 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term111634 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term111637 = (byte[]) newByteArray(16);
        Object term111638 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term111639 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term111640 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term111641 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term111642 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term111645 = (byte[]) newByteArray(16);
        Object term111646 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term111647 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term111634, term111634.getClass(), "toStringCache", "");
        setField(term111634, term111634.getClass(), "value", term111637);
        setByteField(term111634, term111634.getClass(), "coder", (byte) 0);
        setIntField(term111634, term111634.getClass(), "count", 0);
        setField(term111633, term111633.getClass(), "value", term111634);
        setIntField(term111633, term111633.getClass(), "count", 0);
        setElement(term111632, 0, term111633);
        setField(term111638, term111638.getClass(), "value", null);
        setIntField(term111638, term111638.getClass(), "count", 0);
        setElement(term111632, 1, term111638);
        setField(term111639, term111639.getClass(), "value", null);
        setIntField(term111639, term111639.getClass(), "count", 0);
        setElement(term111632, 2, term111639);
        setField(term111640, term111640.getClass(), "value", null);
        setIntField(term111640, term111640.getClass(), "count", 0);
        setElement(term111632, 3, term111640);
        setField(term111642, term111642.getClass(), "toStringCache", "");
        setField(term111642, term111642.getClass(), "value", term111645);
        setByteField(term111642, term111642.getClass(), "coder", (byte) 0);
        setIntField(term111642, term111642.getClass(), "count", 0);
        setField(term111641, term111641.getClass(), "value", term111642);
        setIntField(term111641, term111641.getClass(), "count", 0);
        setElement(term111632, 4, term111641);
        setField(term111647, term111647.getClass(), "value", null);
        setIntField(term111647, term111647.getClass(), "count", 0);
        setField(term111646, term111646.getClass(), "value", term111647);
        setIntField(term111646, term111646.getClass(), "count", 0);
        setElement(term111632, 5, term111646);
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
        args[0] = term109270;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term109270, term111632));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


