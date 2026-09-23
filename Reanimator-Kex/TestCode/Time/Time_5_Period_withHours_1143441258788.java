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

public class Period_withHours_1143441258788 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2821659;

    public Period_withHours_1143441258788() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2821659 = newInstance(Class.forName("org.joda.time.Period"));
        Object term2821713 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term2817012 = (Object[]) newArray("org.joda.time.DurationFieldType", 35);
        int[] term2817049 = (int[]) newIntArray(120);
        setField(term2821713, term2821713.getClass(), "iTypes", term2817012);
        setField(term2821659, term2821659.getClass(), "iType", term2821713);
        setField(term2821659, term2821659.getClass(), "iValues", term2817049);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        try {
            callMethod(klass, "withHours", argTypes, term2821659, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


