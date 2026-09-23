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

public class Period_plusMinutes_213169050361 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term179080;

    public Period_plusMinutes_213169050361() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term179080 = newInstance(Class.forName("org.joda.time.Period"));
        Object term179134 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term178703 = (Object[]) newArray("org.joda.time.DurationFieldType", 5);
        int[] term178710 = (int[]) newIntArray(51);
        setField(term179134, term179134.getClass(), "iTypes", term178703);
        setField(term179080, term179080.getClass(), "iType", term179134);
        setField(term179080, term179080.getClass(), "iValues", term178710);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = -1;
        try {
            callMethod(klass, "plusMinutes", argTypes, term179080, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


