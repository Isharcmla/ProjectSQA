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

public class Period_init_167289003178 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term86856;
     Object term87641;
     Object term87645;

    public Period_init_167289003178() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term86802 = newInstance(Class.forName("org.joda.time.Period"));
        setField(term86802, term86802.getClass(), "iType", null);
        term86856 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term86728 = (Object[]) newArray("org.joda.time.DurationFieldType", 0);
        setField(term86856, term86856.getClass(), "iTypes", term86728);
        term87641 = newInstance(Class.forName("org.joda.time.Period"));
        Object term87642 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term87643 = (Object[]) newArray("org.joda.time.DurationFieldType", 0);
        int[] term87644 = (int[]) newIntArray(0);
        setField(term87642, term87642.getClass(), "iName", null);
        setField(term87642, term87642.getClass(), "iTypes", term87643);
        setField(term87642, term87642.getClass(), "iIndices", null);
        setField(term87641, term87641.getClass(), "iType", term87642);
        setField(term87641, term87641.getClass(), "iValues", term87644);
        term87645 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term87646 = (Object[]) newArray("org.joda.time.DurationFieldType", 0);
        setField(term87645, term87645.getClass(), "iName", null);
        setField(term87645, term87645.getClass(), "iTypes", term87646);
        setField(term87645, term87645.getClass(), "iIndices", null);
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
        args[8] = term86856;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term87641));
        assertTrue(recursiveEquals(term86856, 0));
    }

};


