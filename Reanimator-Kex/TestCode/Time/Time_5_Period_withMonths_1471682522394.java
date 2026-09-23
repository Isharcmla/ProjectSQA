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

public class Period_withMonths_1471682522394 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term198702;

    public Period_withMonths_1471682522394() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term198702 = newInstance(Class.forName("org.joda.time.Period"));
        Object term198756 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term197135 = (Object[]) newArray("org.joda.time.DurationFieldType", 3);
        int[] term197140 = (int[]) newIntArray(489);
        setField(term198756, term198756.getClass(), "iTypes", term197135);
        setField(term198702, term198702.getClass(), "iType", term198756);
        setField(term198702, term198702.getClass(), "iValues", term197140);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        try {
            callMethod(klass, "withMonths", argTypes, term198702, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


