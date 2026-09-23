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

public class Period_minusDays_666754328388 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term189155;

    public Period_minusDays_666754328388() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term189155 = newInstance(Class.forName("org.joda.time.Period"));
        Object term189209 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term188965 = (Object[]) newArray("org.joda.time.DurationFieldType", 1);
        int[] term188968 = (int[]) newIntArray(108);
        setField(term189209, term189209.getClass(), "iTypes", term188965);
        setField(term189155, term189155.getClass(), "iType", term189209);
        setField(term189155, term189155.getClass(), "iValues", term188968);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = -1;
        try {
            callMethod(klass, "minusDays", argTypes, term189155, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


