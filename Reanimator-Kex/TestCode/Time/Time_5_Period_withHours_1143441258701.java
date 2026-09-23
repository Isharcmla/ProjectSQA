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

public class Period_withHours_1143441258701 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1182218;

    public Period_withHours_1143441258701() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1182218 = newInstance(Class.forName("org.joda.time.Period"));
        Object term1182272 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term1103587 = (Object[]) newArray("org.joda.time.DurationFieldType", 122);
        int[] term1103711 = (int[]) newIntArray(633);
        setField(term1182272, term1182272.getClass(), "iTypes", term1103587);
        setField(term1182218, term1182218.getClass(), "iType", term1182272);
        setField(term1182218, term1182218.getClass(), "iValues", term1103711);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        try {
            callMethod(klass, "withHours", argTypes, term1182218, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


