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

public class Period_plusDays_128237422622 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term421642;

    public Period_plusDays_128237422622() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term421642 = newInstance(Class.forName("org.joda.time.Period"));
        Object term421696 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term420160 = (Object[]) newArray("org.joda.time.DurationFieldType", 12);
        int[] term420174 = (int[]) newIntArray(107);
        setField(term421696, term421696.getClass(), "iTypes", term420160);
        setField(term421642, term421642.getClass(), "iType", term421696);
        setField(term421642, term421642.getClass(), "iValues", term420174);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = -1;
        try {
            callMethod(klass, "plusDays", argTypes, term421642, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


