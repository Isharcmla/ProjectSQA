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
import java.lang.Object;

public class Period_init_167289003193 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term91294;
     Object term92847;
     Object term92852;

    public Period_init_167289003193() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term91240 = newInstance(Class.forName("org.joda.time.Period"));
        setField(term91240, term91240.getClass(), "iType", null);
        term91294 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term91156 = (Object[]) newArray("org.joda.time.DurationFieldType", 1);
        Object term91414 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        setElement(term91156, 0, term91414);
        setField(term91294, term91294.getClass(), "iTypes", term91156);
        term92847 = newInstance(Class.forName("org.joda.time.Period"));
        Object term92848 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term92849 = (Object[]) newArray("org.joda.time.DurationFieldType", 1);
        Object term92850 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        int[] term92851 = (int[]) newIntArray(1);
        setField(term92848, term92848.getClass(), "iName", null);
        setByteField(term92850, term92850.getClass(), "iOrdinal", (byte) 0);
        setField(term92850, term92850.getClass(), "iName", null);
        setElement(term92849, 0, term92850);
        setField(term92848, term92848.getClass(), "iTypes", term92849);
        setField(term92848, term92848.getClass(), "iIndices", null);
        setField(term92847, term92847.getClass(), "iType", term92848);
        setField(term92847, term92847.getClass(), "iValues", term92851);
        term92852 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term92853 = (Object[]) newArray("org.joda.time.DurationFieldType", 1);
        Object term92854 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        setField(term92852, term92852.getClass(), "iName", null);
        setByteField(term92854, term92854.getClass(), "iOrdinal", (byte) 0);
        setField(term92854, term92854.getClass(), "iName", null);
        setElement(term92853, 0, term92854);
        setField(term92852, term92852.getClass(), "iTypes", term92853);
        setField(term92852, term92852.getClass(), "iIndices", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[9];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        argTypes[4] = int.class;
        argTypes[5] = int.class;
        argTypes[6] = int.class;
        argTypes[7] = int.class;
        argTypes[8] = Class.forName("org.joda.time.PeriodType");
        Object[] args = new Object[9];
        args[0] = 0;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = term91294;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term92847));
        assertTrue(recursiveEquals(term91294, 0));
    }

};


