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

public class Period_plusMillis_226130879377 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term185447;
     Object term186721;
     Object term186719;

    public Period_plusMillis_226130879377() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term185447 = newInstance(Class.forName("org.joda.time.Period"));
        term186721 = newInstance(Class.forName("org.joda.time.Period"));
        setField(term186721, term186721.getClass(), "iType", null);
        setField(term186721, term186721.getClass(), "iValues", null);
        term186719 = newInstance(Class.forName("org.joda.time.Period"));
        setField(term186719, term186719.getClass(), "iType", null);
        setField(term186719, term186719.getClass(), "iValues", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        Object retValue = callMethod(klass, "plusMillis", argTypes, term185447, args);
        assertTrue(recursiveEquals(term185447, term186721));
        assertTrue(recursiveEquals(retValue, term186719));
    }

};


