package org.joda.time.field;

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
import static org.joda.time.field.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.joda.time.field.EqualityUtils.*;

public class UnsupportedDurationField_compareTo_213153975573 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13147;
     Object term13263;
     Object term13684;
     Object term13685;

    public UnsupportedDurationField_compareTo_213153975573() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13147 = newInstance(Class.forName("org.joda.time.field.UnsupportedDurationField"));
        term13263 = newInstance(Class.forName("org.joda.time.chrono.LimitChronology$LimitDurationField"));
        term13684 = newInstance(Class.forName("org.joda.time.field.UnsupportedDurationField"));
        setField(term13684, term13684.getClass(), "iType", null);
        term13685 = newInstance(Class.forName("org.joda.time.chrono.LimitChronology$LimitDurationField"));
        setField(term13685, term13685.getClass(), "this$0", null);
        setField(term13685, term13685.getClass(), "iField", null);
        setField(term13685, term13685.getClass(), "iType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.field.UnsupportedDurationField");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.DurationField");
        Object[] args = new Object[1];
        args[0] = term13263;
        Object retValue = callMethod(klass, "compareTo", argTypes, term13147, args);
        assertTrue(recursiveEquals(term13147, term13684));
        assertTrue(recursiveEquals(term13263, term13685));
        assertTrue(recursiveEquals(retValue, 1));
    }

};
