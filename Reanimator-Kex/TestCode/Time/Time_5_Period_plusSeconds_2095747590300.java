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

public class Period_plusSeconds_2095747590300 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term145306;
     Object term148684;
     Object term148682;

    public Period_plusSeconds_2095747590300() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term145306 = newInstance(Class.forName("org.joda.time.Period"));
        term148684 = newInstance(Class.forName("org.joda.time.Period"));
        setField(term148684, term148684.getClass(), "iType", null);
        setField(term148684, term148684.getClass(), "iValues", null);
        term148682 = newInstance(Class.forName("org.joda.time.Period"));
        setField(term148682, term148682.getClass(), "iType", null);
        setField(term148682, term148682.getClass(), "iValues", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        Object retValue = callMethod(klass, "plusSeconds", argTypes, term145306, args);
        assertTrue(recursiveEquals(term145306, term148684));
        assertTrue(recursiveEquals(retValue, term148682));
    }

};


