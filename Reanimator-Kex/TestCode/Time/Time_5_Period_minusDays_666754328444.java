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

public class Period_minusDays_666754328444 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term230010;

    public Period_minusDays_666754328444() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term230010 = newInstance(Class.forName("org.joda.time.Period"));
        Object term230064 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term229854 = (Object[]) newArray("org.joda.time.DurationFieldType", 4);
        int[] term229860 = (int[]) newIntArray(11);
        setField(term230064, term230064.getClass(), "iTypes", term229854);
        setField(term230010, term230010.getClass(), "iType", term230064);
        setField(term230010, term230010.getClass(), "iValues", term229860);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = -1;
        try {
            callMethod(klass, "minusDays", argTypes, term230010, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


