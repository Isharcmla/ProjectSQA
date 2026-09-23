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

public class Period_minusHours_917093504547 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term314952;

    public Period_minusHours_917093504547() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term314952 = newInstance(Class.forName("org.joda.time.Period"));
        Object term315006 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term313767 = (Object[]) newArray("org.joda.time.DurationFieldType", 13);
        int[] term313782 = (int[]) newIntArray(75);
        setField(term315006, term315006.getClass(), "iTypes", term313767);
        setField(term314952, term314952.getClass(), "iType", term315006);
        setField(term314952, term314952.getClass(), "iValues", term313782);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = -1;
        try {
            callMethod(klass, "minusHours", argTypes, term314952, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


