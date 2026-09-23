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

public class Period_withPeriodType_408142087577 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term335730;
     Object term336670;
     Object term336662;

    public Period_withPeriodType_408142087577() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term335730 = newInstance(Class.forName("org.joda.time.Period"));
        Object term335784 = newInstance(Class.forName("org.joda.time.PeriodType"));
        setField(term335730, term335730.getClass(), "iType", term335784);
        Object term335838 = newInstance(Class.forName("org.joda.time.PeriodType"));
        setField(null, Class.forName("org.joda.time.PeriodType"), "cStandard", term335838);
        term336670 = newInstance(Class.forName("org.joda.time.Period"));
        Object term336671 = newInstance(Class.forName("org.joda.time.PeriodType"));
        setField(term336671, term336671.getClass(), "iName", null);
        setField(term336671, term336671.getClass(), "iTypes", null);
        setField(term336671, term336671.getClass(), "iIndices", null);
        setField(term336670, term336670.getClass(), "iType", term336671);
        setField(term336670, term336670.getClass(), "iValues", null);
        term336662 = newInstance(Class.forName("org.joda.time.Period"));
        Object term336663 = newInstance(Class.forName("org.joda.time.PeriodType"));
        setField(term336663, term336663.getClass(), "iName", null);
        setField(term336663, term336663.getClass(), "iTypes", null);
        setField(term336663, term336663.getClass(), "iIndices", null);
        setField(term336662, term336662.getClass(), "iType", term336663);
        setField(term336662, term336662.getClass(), "iValues", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.PeriodType");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "withPeriodType", argTypes, term335730, args);
        assertTrue(recursiveEquals(term335730, term336670));
        assertTrue(recursiveEquals(retValue, term336662));
    }

};


