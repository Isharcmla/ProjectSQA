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

public class Period_minusYears_1479975033247 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term119270;

    public Period_minusYears_1479975033247() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term119270 = newInstance(Class.forName("org.joda.time.Period"));
        Object term119324 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term119140 = (Object[]) newArray("org.joda.time.DurationFieldType", 3);
        int[] term119145 = (int[]) newIntArray(9);
        setField(term119324, term119324.getClass(), "iTypes", term119140);
        setField(term119270, term119270.getClass(), "iType", term119324);
        setField(term119270, term119270.getClass(), "iValues", term119145);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = -1;
        try {
            callMethod(klass, "minusYears", argTypes, term119270, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


