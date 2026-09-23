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

public class Period_minusDays_666754328671 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term493528;

    public Period_minusDays_666754328671() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term493528 = newInstance(Class.forName("org.joda.time.Period"));
        Object term493582 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term493219 = (Object[]) newArray("org.joda.time.DurationFieldType", 11);
        int[] term493232 = (int[]) newIntArray(11);
        setField(term493582, term493582.getClass(), "iTypes", term493219);
        setField(term493528, term493528.getClass(), "iType", term493582);
        setField(term493528, term493528.getClass(), "iValues", term493232);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = -1;
        try {
            callMethod(klass, "minusDays", argTypes, term493528, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


