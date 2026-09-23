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

public class Period_minusDays_666754328896 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4306492;

    public Period_minusDays_666754328896() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4306492 = newInstance(Class.forName("org.joda.time.Period"));
        Object term4306546 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term4305307 = (Object[]) newArray("org.joda.time.DurationFieldType", 13);
        int[] term4305322 = (int[]) newIntArray(75);
        setField(term4306546, term4306546.getClass(), "iTypes", term4305307);
        setField(term4306492, term4306492.getClass(), "iType", term4306546);
        setField(term4306492, term4306492.getClass(), "iValues", term4305322);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = -1;
        try {
            callMethod(klass, "minusDays", argTypes, term4306492, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


