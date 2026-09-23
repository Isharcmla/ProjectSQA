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

public class Period_minusWeeks_1043470448865 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3982768;

    public Period_minusWeeks_1043470448865() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3982768 = newInstance(Class.forName("org.joda.time.Period"));
        Object term3982822 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term3982330 = (Object[]) newArray("org.joda.time.DurationFieldType", 7);
        int[] term3982339 = (int[]) newIntArray(42);
        setField(term3982822, term3982822.getClass(), "iTypes", term3982330);
        setField(term3982768, term3982768.getClass(), "iType", term3982822);
        setField(term3982768, term3982768.getClass(), "iValues", term3982339);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = -1;
        try {
            callMethod(klass, "minusWeeks", argTypes, term3982768, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


