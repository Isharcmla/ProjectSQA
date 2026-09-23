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

public class LocalDate_equals_910240588255 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term133218;
     Object term133901;
     Object term133902;

    public LocalDate_equals_910240588255() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term133218 = newInstance(Class.forName("org.joda.time.LocalDate"));
        term133901 = newInstance(Class.forName("org.joda.time.LocalDate"));
        setLongField(term133901, term133901.getClass(), "iLocalMillis", 0L);
        setField(term133901, term133901.getClass(), "iChronology", null);
        setIntField(term133901, term133901.getClass(), "iHash", 0);
        term133902 = newInstance(Class.forName("org.joda.time.LocalDate"));
        setLongField(term133902, term133902.getClass(), "iLocalMillis", 0L);
        setField(term133902, term133902.getClass(), "iChronology", null);
        setIntField(term133902, term133902.getClass(), "iHash", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.LocalDate");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term133218;
        Object retValue = callMethod(klass, "equals", argTypes, term133218, args);
        assertTrue(recursiveEquals(term133218, term133901));
        assertTrue(recursiveEquals(term133218, term133902));
        assertTrue(recursiveEquals(retValue, true));
    }

};


