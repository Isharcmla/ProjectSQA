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

public class Period_withHours_1143441258724 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1831758;

    public Period_withHours_1143441258724() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1831758 = newInstance(Class.forName("org.joda.time.Period"));
        Object term1831812 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term1745523 = (Object[]) newArray("org.joda.time.DurationFieldType", 167);
        int[] term1745692 = (int[]) newIntArray(505);
        setField(term1831812, term1831812.getClass(), "iTypes", term1745523);
        setField(term1831758, term1831758.getClass(), "iType", term1831812);
        setField(term1831758, term1831758.getClass(), "iValues", term1745692);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        try {
            callMethod(klass, "withHours", argTypes, term1831758, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


