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

public class Period_minusWeeks_1043470448271 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term126982;

    public Period_minusWeeks_1043470448271() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term126982 = newInstance(Class.forName("org.joda.time.Period"));
        Object term127036 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term126792 = (Object[]) newArray("org.joda.time.DurationFieldType", 1);
        int[] term126795 = (int[]) newIntArray(108);
        setField(term127036, term127036.getClass(), "iTypes", term126792);
        setField(term126982, term126982.getClass(), "iType", term127036);
        setField(term126982, term126982.getClass(), "iValues", term126795);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = -1;
        try {
            callMethod(klass, "minusWeeks", argTypes, term126982, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


