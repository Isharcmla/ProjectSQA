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

public class Period_minusMinutes_1467465136600 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term379737;

    public Period_minusMinutes_1467465136600() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term379737 = newInstance(Class.forName("org.joda.time.Period"));
        Object term379791 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term379668 = (Object[]) newArray("org.joda.time.DurationFieldType", 0);
        setField(term379791, term379791.getClass(), "iTypes", term379668);
        setField(term379737, term379737.getClass(), "iType", term379791);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = -1;
        try {
            callMethod(klass, "minusMinutes", argTypes, term379737, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


