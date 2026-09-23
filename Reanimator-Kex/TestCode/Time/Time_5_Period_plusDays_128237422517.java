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

public class Period_plusDays_128237422517 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term291189;

    public Period_plusDays_128237422517() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term291189 = newInstance(Class.forName("org.joda.time.Period"));
        Object term291243 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term291060 = (Object[]) newArray("org.joda.time.DurationFieldType", 3);
        int[] term291065 = (int[]) newIntArray(9);
        setField(term291243, term291243.getClass(), "iTypes", term291060);
        setField(term291189, term291189.getClass(), "iType", term291243);
        setField(term291189, term291189.getClass(), "iValues", term291065);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = -1;
        try {
            callMethod(klass, "plusDays", argTypes, term291189, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


