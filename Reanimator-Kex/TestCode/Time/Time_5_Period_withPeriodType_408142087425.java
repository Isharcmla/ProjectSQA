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

public class Period_withPeriodType_408142087425 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term216860;
     Object term216968;
     Object term217605;
     Object term217607;
     Object term217597;

    public Period_withPeriodType_408142087425() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term216860 = newInstance(Class.forName("org.joda.time.Period"));
        Object term216914 = newInstance(Class.forName("org.joda.time.PeriodType"));
        setField(term216914, term216914.getClass(), "iTypes", null);
        setField(term216860, term216860.getClass(), "iType", term216914);
        term216968 = newInstance(Class.forName("org.joda.time.PeriodType"));
        setField(term216968, term216968.getClass(), "iTypes", null);
        term217605 = newInstance(Class.forName("org.joda.time.Period"));
        Object term217606 = newInstance(Class.forName("org.joda.time.PeriodType"));
        setField(term217606, term217606.getClass(), "iName", null);
        setField(term217606, term217606.getClass(), "iTypes", null);
        setField(term217606, term217606.getClass(), "iIndices", null);
        setField(term217605, term217605.getClass(), "iType", term217606);
        setField(term217605, term217605.getClass(), "iValues", null);
        term217607 = newInstance(Class.forName("org.joda.time.PeriodType"));
        setField(term217607, term217607.getClass(), "iName", null);
        setField(term217607, term217607.getClass(), "iTypes", null);
        setField(term217607, term217607.getClass(), "iIndices", null);
        term217597 = newInstance(Class.forName("org.joda.time.Period"));
        Object term217598 = newInstance(Class.forName("org.joda.time.PeriodType"));
        setField(term217598, term217598.getClass(), "iName", null);
        setField(term217598, term217598.getClass(), "iTypes", null);
        setField(term217598, term217598.getClass(), "iIndices", null);
        setField(term217597, term217597.getClass(), "iType", term217598);
        setField(term217597, term217597.getClass(), "iValues", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.PeriodType");
        Object[] args = new Object[1];
        args[0] = term216968;
        Object retValue = callMethod(klass, "withPeriodType", argTypes, term216860, args);
        assertTrue(recursiveEquals(term216860, term217605));
        assertTrue(recursiveEquals(term216968, term217607));
        assertTrue(recursiveEquals(retValue, term217597));
    }

};


