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

public class Period_withHours_1143441258311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term152657;

    public Period_withHours_1143441258311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term152657 = newInstance(Class.forName("org.joda.time.Period"));
        Object term152711 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term151583 = (Object[]) newArray("org.joda.time.DurationFieldType", 2);
        int[] term151587 = (int[]) newIntArray(492);
        setField(term152711, term152711.getClass(), "iTypes", term151583);
        setField(term152657, term152657.getClass(), "iType", term152711);
        setField(term152657, term152657.getClass(), "iValues", term151587);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        try {
            callMethod(klass, "withHours", argTypes, term152657, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


