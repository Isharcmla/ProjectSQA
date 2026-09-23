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

public class Period_plusHours_431248406370 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term182008;
     Object term182154;
     Object term182152;

    public Period_plusHours_431248406370() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term182008 = newInstance(Class.forName("org.joda.time.Period"));
        term182154 = newInstance(Class.forName("org.joda.time.Period"));
        setField(term182154, term182154.getClass(), "iType", null);
        setField(term182154, term182154.getClass(), "iValues", null);
        term182152 = newInstance(Class.forName("org.joda.time.Period"));
        setField(term182152, term182152.getClass(), "iType", null);
        setField(term182152, term182152.getClass(), "iValues", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        Object retValue = callMethod(klass, "plusHours", argTypes, term182008, args);
        assertTrue(recursiveEquals(term182008, term182154));
        assertTrue(recursiveEquals(retValue, term182152));
    }

};


