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

public class Period_plusDays_128237422226 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term114055;
     Object term114183;
     Object term114181;

    public Period_plusDays_128237422226() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term114055 = newInstance(Class.forName("org.joda.time.Period"));
        term114183 = newInstance(Class.forName("org.joda.time.Period"));
        setField(term114183, term114183.getClass(), "iType", null);
        setField(term114183, term114183.getClass(), "iValues", null);
        term114181 = newInstance(Class.forName("org.joda.time.Period"));
        setField(term114181, term114181.getClass(), "iType", null);
        setField(term114181, term114181.getClass(), "iValues", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        Object retValue = callMethod(klass, "plusDays", argTypes, term114055, args);
        assertTrue(recursiveEquals(term114055, term114183));
        assertTrue(recursiveEquals(retValue, term114181));
    }

};


