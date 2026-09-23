package org.joda.time;

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
import static org.joda.time.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.joda.time.EqualityUtils.*;
import java.lang.Integer;
import java.lang.Object;

public class Period_init_131580496498 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term111;
     Object term113;
     Object term115;
     Object term117;
     Object term15816;

    public Period_init_131580496498() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term111 = new Integer(-469968304);
        term113 = new Integer(-1145578966);
        term115 = new Integer(679763016);
        term117 = new Integer(1962444399);
        term15816 = newInstance(Class.forName("org.joda.time.Period"));
        Object term15817 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term15820 = (Object[]) newArray("org.joda.time.DurationFieldType", 8);
        Object term15821 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        Object term15823 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        Object term15825 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        Object term15827 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        Object term15829 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        Object term15831 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        Object term15833 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        Object term15835 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        int[] term15837 = (int[]) newIntArray(8);
        int[] term15838 = (int[]) newIntArray(8);
        setField(term15817, term15817.getClass(), "iName", "Standard");
        setByteField(term15821, term15821.getClass(), "iOrdinal", (byte) 4);
        setField(term15821, term15821.getClass(), "iName", "");
        setElement(term15820, 0, term15821);
        setByteField(term15823, term15823.getClass(), "iOrdinal", (byte) 5);
        setField(term15823, term15823.getClass(), "iName", "");
        setElement(term15820, 1, term15823);
        setByteField(term15825, term15825.getClass(), "iOrdinal", (byte) 6);
        setField(term15825, term15825.getClass(), "iName", "");
        setElement(term15820, 2, term15825);
        setByteField(term15827, term15827.getClass(), "iOrdinal", (byte) 7);
        setField(term15827, term15827.getClass(), "iName", "");
        setElement(term15820, 3, term15827);
        setByteField(term15829, term15829.getClass(), "iOrdinal", (byte) 9);
        setField(term15829, term15829.getClass(), "iName", "");
        setElement(term15820, 4, term15829);
        setByteField(term15831, term15831.getClass(), "iOrdinal", (byte) 10);
        setField(term15831, term15831.getClass(), "iName", "");
        setElement(term15820, 5, term15831);
        setByteField(term15833, term15833.getClass(), "iOrdinal", (byte) 11);
        setField(term15833, term15833.getClass(), "iName", "");
        setElement(term15820, 6, term15833);
        setByteField(term15835, term15835.getClass(), "iOrdinal", (byte) 12);
        setField(term15835, term15835.getClass(), "iName", "");
        setElement(term15820, 7, term15835);
        setField(term15817, term15817.getClass(), "iTypes", term15820);
        setIntElement(term15837, 1, 1);
        setIntElement(term15837, 2, 2);
        setIntElement(term15837, 3, 3);
        setIntElement(term15837, 4, 4);
        setIntElement(term15837, 5, 5);
        setIntElement(term15837, 6, 6);
        setIntElement(term15837, 7, 7);
        setField(term15817, term15817.getClass(), "iIndices", term15837);
        setField(term15816, term15816.getClass(), "iType", term15817);
        setIntElement(term15838, 4, -469968304);
        setIntElement(term15838, 5, -1145578966);
        setIntElement(term15838, 6, 679763016);
        setIntElement(term15838, 7, 1962444399);
        setField(term15816, term15816.getClass(), "iValues", term15838);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        Object[] args = new Object[4];
        args[0] = term111;
        args[1] = term113;
        args[2] = term115;
        args[3] = term117;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term15816));
        assertTrue(recursiveEquals(term111, -469968304));
        assertTrue(recursiveEquals(term113, -1145578966));
        assertTrue(recursiveEquals(term115, 679763016));
        assertTrue(recursiveEquals(term117, 1962444399));
    }

};


