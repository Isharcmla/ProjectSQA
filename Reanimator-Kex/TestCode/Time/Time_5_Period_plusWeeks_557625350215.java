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

public class Period_plusWeeks_557625350215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term108778;

    public Period_plusWeeks_557625350215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term108778 = newInstance(Class.forName("org.joda.time.Period"));
        Object term108832 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term107709 = (Object[]) newArray("org.joda.time.DurationFieldType", 2);
        int[] term107713 = (int[]) newIntArray(489);
        setField(term108832, term108832.getClass(), "iTypes", term107709);
        setField(term108778, term108778.getClass(), "iType", term108832);
        setField(term108778, term108778.getClass(), "iValues", term107713);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = -1;
        try {
            callMethod(klass, "plusWeeks", argTypes, term108778, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


