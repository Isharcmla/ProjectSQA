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

public class Period_withMillis_377011053623 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term424311;

    public Period_withMillis_377011053623() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term424311 = newInstance(Class.forName("org.joda.time.Period"));
        Object term424365 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term421807 = (Object[]) newArray("org.joda.time.DurationFieldType", 10);
        int[] term421819 = (int[]) newIntArray(233);
        setField(term424365, term424365.getClass(), "iTypes", term421807);
        setField(term424311, term424311.getClass(), "iType", term424365);
        setField(term424311, term424311.getClass(), "iValues", term421819);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        try {
            callMethod(klass, "withMillis", argTypes, term424311, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


