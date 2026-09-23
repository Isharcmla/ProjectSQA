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

public class Period_withHours_1143441258534 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term304856;

    public Period_withHours_1143441258534() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term304856 = newInstance(Class.forName("org.joda.time.Period"));
        Object term304910 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term304544 = (Object[]) newArray("org.joda.time.DurationFieldType", 8);
        int[] term304554 = (int[]) newIntArray(20);
        setField(term304910, term304910.getClass(), "iTypes", term304544);
        setField(term304856, term304856.getClass(), "iType", term304910);
        setField(term304856, term304856.getClass(), "iValues", term304554);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        try {
            callMethod(klass, "withHours", argTypes, term304856, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


