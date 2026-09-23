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

public class Period_plusMinutes_213169050410 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term205070;
     Object term205271;
     Object term205269;

    public Period_plusMinutes_213169050410() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term205070 = newInstance(Class.forName("org.joda.time.Period"));
        term205271 = newInstance(Class.forName("org.joda.time.Period"));
        setField(term205271, term205271.getClass(), "iType", null);
        setField(term205271, term205271.getClass(), "iValues", null);
        term205269 = newInstance(Class.forName("org.joda.time.Period"));
        setField(term205269, term205269.getClass(), "iType", null);
        setField(term205269, term205269.getClass(), "iValues", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        Object retValue = callMethod(klass, "plusMinutes", argTypes, term205070, args);
        assertTrue(recursiveEquals(term205070, term205271));
        assertTrue(recursiveEquals(retValue, term205269));
    }

};


