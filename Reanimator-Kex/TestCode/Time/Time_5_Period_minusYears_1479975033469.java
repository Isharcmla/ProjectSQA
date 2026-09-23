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

public class Period_minusYears_1479975033469 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term250944;

    public Period_minusYears_1479975033469() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term250944 = newInstance(Class.forName("org.joda.time.Period"));
        Object term250998 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term250566 = (Object[]) newArray("org.joda.time.DurationFieldType", 5);
        int[] term250573 = (int[]) newIntArray(51);
        setField(term250998, term250998.getClass(), "iTypes", term250566);
        setField(term250944, term250944.getClass(), "iType", term250998);
        setField(term250944, term250944.getClass(), "iValues", term250573);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = -1;
        try {
            callMethod(klass, "minusYears", argTypes, term250944, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


