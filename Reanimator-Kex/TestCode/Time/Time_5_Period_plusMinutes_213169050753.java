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

public class Period_plusMinutes_213169050753 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2226044;

    public Period_plusMinutes_213169050753() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2226044 = newInstance(Class.forName("org.joda.time.Period"));
        Object term2226098 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term2225678 = (Object[]) newArray("org.joda.time.DurationFieldType", 10);
        int[] term2225690 = (int[]) newIntArray(19);
        setField(term2226098, term2226098.getClass(), "iTypes", term2225678);
        setField(term2226044, term2226044.getClass(), "iType", term2226098);
        setField(term2226044, term2226044.getClass(), "iValues", term2225690);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = -1;
        try {
            callMethod(klass, "plusMinutes", argTypes, term2226044, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


