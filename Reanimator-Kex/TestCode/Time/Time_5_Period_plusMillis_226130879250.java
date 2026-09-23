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

public class Period_plusMillis_226130879250 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term120086;

    public Period_plusMillis_226130879250() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term120086 = newInstance(Class.forName("org.joda.time.Period"));
        Object term120140 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term119897 = (Object[]) newArray("org.joda.time.DurationFieldType", 1);
        int[] term119900 = (int[]) newIntArray(108);
        setField(term120140, term120140.getClass(), "iTypes", term119897);
        setField(term120086, term120086.getClass(), "iType", term120140);
        setField(term120086, term120086.getClass(), "iValues", term119900);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = -1;
        try {
            callMethod(klass, "plusMillis", argTypes, term120086, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


