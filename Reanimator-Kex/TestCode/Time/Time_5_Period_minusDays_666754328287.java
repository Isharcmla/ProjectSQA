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
import static org.joda.time.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.joda.time.EqualityUtils.*;

public class Period_minusDays_666754328287 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term140948;
     Object term141306;
     Object term141303;

    public Period_minusDays_666754328287() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term140948 = newInstance(Class.forName("org.joda.time.Period"));
        term141306 = newInstance(Class.forName("org.joda.time.Period"));
        setField(term141306, term141306.getClass(), "iType", null);
        setField(term141306, term141306.getClass(), "iValues", null);
        term141303 = newInstance(Class.forName("org.joda.time.Period"));
        setField(term141303, term141303.getClass(), "iType", null);
        setField(term141303, term141303.getClass(), "iValues", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        Object retValue = callMethod(klass, "minusDays", argTypes, term140948, args);
        assertTrue(recursiveEquals(term140948, term141306));
        assertTrue(recursiveEquals(retValue, term141303));
    }

};


