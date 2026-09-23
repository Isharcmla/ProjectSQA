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

public class Period_withWeeks_1269818202558 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term321553;

    public Period_withWeeks_1269818202558() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term321553 = newInstance(Class.forName("org.joda.time.Period"));
        Object term321607 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term321471 = (Object[]) newArray("org.joda.time.DurationFieldType", 1);
        int[] term321474 = (int[]) newIntArray(2);
        setField(term321607, term321607.getClass(), "iTypes", term321471);
        setField(term321553, term321553.getClass(), "iType", term321607);
        setField(term321553, term321553.getClass(), "iValues", term321474);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        try {
            callMethod(klass, "withWeeks", argTypes, term321553, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


