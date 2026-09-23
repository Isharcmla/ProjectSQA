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

public class Period_plusWeeks_557625350457 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term236928;

    public Period_plusWeeks_557625350457() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term236928 = newInstance(Class.forName("org.joda.time.Period"));
        Object term236982 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term236860 = (Object[]) newArray("org.joda.time.DurationFieldType", 0);
        setField(term236982, term236982.getClass(), "iTypes", term236860);
        setField(term236928, term236928.getClass(), "iType", term236982);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = -1;
        try {
            callMethod(klass, "plusWeeks", argTypes, term236928, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


