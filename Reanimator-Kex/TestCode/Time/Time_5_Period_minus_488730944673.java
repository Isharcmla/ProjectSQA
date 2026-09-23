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

public class Period_minus_488730944673 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term494494;

    public Period_minus_488730944673() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term494494 = newInstance(Class.forName("org.joda.time.Period"));
        Object term494521 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term494358 = (Object[]) newArray("org.joda.time.DurationFieldType", 10);
        setField(term494521, term494521.getClass(), "iTypes", term494358);
        setField(term494494, term494494.getClass(), "iType", term494521);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.ReadablePeriod");
        Object[] args = new Object[1];
        args[0] = term494494;
        try {
            callMethod(klass, "minus", argTypes, term494494, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


