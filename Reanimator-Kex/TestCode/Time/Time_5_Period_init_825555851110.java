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

public class Period_init_825555851110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term326;
     Object term39952;
     Object term39959;

    public Period_init_825555851110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term326 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term339 = (Object[]) newArray("org.joda.time.DurationFieldType", 5);
        int[] term340 = (int[]) newIntArray(6);
        setField(term326, term326.getClass(), "iName", "oVcInYnLWB");
        setField(term326, term326.getClass(), "iTypes", term339);
        setIntElement(term340, 0, 287287233);
        setIntElement(term340, 1, 962840079);
        setIntElement(term340, 2, 1540719661);
        setIntElement(term340, 3, 1265463001);
        setIntElement(term340, 4, 335112684);
        setIntElement(term340, 5, 1551099402);
        setField(term326, term326.getClass(), "iIndices", term340);
        term39952 = newInstance(Class.forName("org.joda.time.Period"));
        Object term39953 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term39956 = (Object[]) newArray("org.joda.time.DurationFieldType", 5);
        int[] term39957 = (int[]) newIntArray(6);
        int[] term39958 = (int[]) newIntArray(5);
        setField(term39953, term39953.getClass(), "iName", "oVcInYnLWB");
        setField(term39953, term39953.getClass(), "iTypes", term39956);
        setIntElement(term39957, 0, 287287233);
        setIntElement(term39957, 1, 962840079);
        setIntElement(term39957, 2, 1540719661);
        setIntElement(term39957, 3, 1265463001);
        setIntElement(term39957, 4, 335112684);
        setIntElement(term39957, 5, 1551099402);
        setField(term39953, term39953.getClass(), "iIndices", term39957);
        setField(term39952, term39952.getClass(), "iType", term39953);
        setField(term39952, term39952.getClass(), "iValues", term39958);
        term39959 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term39962 = (Object[]) newArray("org.joda.time.DurationFieldType", 5);
        int[] term39963 = (int[]) newIntArray(6);
        setField(term39959, term39959.getClass(), "iName", "oVcInYnLWB");
        setField(term39959, term39959.getClass(), "iTypes", term39962);
        setIntElement(term39963, 0, 287287233);
        setIntElement(term39963, 1, 962840079);
        setIntElement(term39963, 2, 1540719661);
        setIntElement(term39963, 3, 1265463001);
        setIntElement(term39963, 4, 335112684);
        setIntElement(term39963, 5, 1551099402);
        setField(term39959, term39959.getClass(), "iIndices", term39963);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.joda.time.ReadableInstant");
        argTypes[1] = Class.forName("org.joda.time.ReadableInstant");
        argTypes[2] = Class.forName("org.joda.time.PeriodType");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = term326;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term39952));
        assertTrue(recursiveEquals(term326, null));
    }

};


