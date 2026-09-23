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

public class Period_withHours_1143441258282 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term137249;

    public Period_withHours_1143441258282() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term137249 = newInstance(Class.forName("org.joda.time.Period"));
        Object term137303 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term135682 = (Object[]) newArray("org.joda.time.DurationFieldType", 3);
        int[] term135687 = (int[]) newIntArray(489);
        setField(term137303, term137303.getClass(), "iTypes", term135682);
        setField(term137249, term137249.getClass(), "iType", term137303);
        setField(term137249, term137249.getClass(), "iValues", term135687);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        try {
            callMethod(klass, "withHours", argTypes, term137249, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


