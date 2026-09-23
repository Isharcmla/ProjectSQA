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

public class Period_withMillis_377011053270 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term126717;

    public Period_withMillis_377011053270() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term126717 = newInstance(Class.forName("org.joda.time.Period"));
        Object term126771 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term126539 = (Object[]) newArray("org.joda.time.DurationFieldType", 4);
        int[] term126545 = (int[]) newIntArray(17);
        setField(term126771, term126771.getClass(), "iTypes", term126539);
        setField(term126717, term126717.getClass(), "iType", term126771);
        setField(term126717, term126717.getClass(), "iValues", term126545);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        try {
            callMethod(klass, "withMillis", argTypes, term126717, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


