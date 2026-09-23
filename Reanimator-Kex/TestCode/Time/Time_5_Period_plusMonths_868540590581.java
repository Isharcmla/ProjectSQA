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
import java.lang.NullPointerException;
import static org.joda.time.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Period_plusMonths_868540590581 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term343769;

    public Period_plusMonths_868540590581() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term343769 = newInstance(Class.forName("org.joda.time.Period"));
        Object term343823 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term336675 = (Object[]) newArray("org.joda.time.DurationFieldType", 14);
        int[] term336691 = (int[]) newIntArray(491);
        setField(term343823, term343823.getClass(), "iTypes", term336675);
        setField(term343769, term343769.getClass(), "iType", term343823);
        setField(term343769, term343769.getClass(), "iValues", term336691);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = -1;
        try {
            callMethod(klass, "plusMonths", argTypes, term343769, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


