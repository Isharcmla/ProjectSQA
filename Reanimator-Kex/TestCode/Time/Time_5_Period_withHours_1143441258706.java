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

public class Period_withHours_1143441258706 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1248015;

    public Period_withHours_1143441258706() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1248015 = newInstance(Class.forName("org.joda.time.Period"));
        Object term1248069 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term1191792 = (Object[]) newArray("org.joda.time.DurationFieldType", 216);
        int[] term1192010 = (int[]) newIntArray(249);
        setField(term1248069, term1248069.getClass(), "iTypes", term1191792);
        setField(term1248015, term1248015.getClass(), "iType", term1248069);
        setField(term1248015, term1248015.getClass(), "iValues", term1192010);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        try {
            callMethod(klass, "withHours", argTypes, term1248015, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


