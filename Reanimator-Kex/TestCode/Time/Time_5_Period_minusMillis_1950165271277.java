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

public class Period_minusMillis_1950165271277 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term131981;

    public Period_minusMillis_1950165271277() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term131981 = newInstance(Class.forName("org.joda.time.Period"));
        Object term132035 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term131603 = (Object[]) newArray("org.joda.time.DurationFieldType", 5);
        int[] term131610 = (int[]) newIntArray(51);
        setField(term132035, term132035.getClass(), "iTypes", term131603);
        setField(term131981, term131981.getClass(), "iType", term132035);
        setField(term131981, term131981.getClass(), "iValues", term131610);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = -1;
        try {
            callMethod(klass, "minusMillis", argTypes, term131981, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


