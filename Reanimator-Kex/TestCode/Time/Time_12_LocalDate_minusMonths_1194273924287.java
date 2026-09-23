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

public class LocalDate_minusMonths_1194273924287 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term145017;
     Object term145023;
     Object term145019;

    public LocalDate_minusMonths_1194273924287() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term145017 = newInstance(Class.forName("org.joda.time.LocalDate"));
        term145023 = newInstance(Class.forName("org.joda.time.LocalDate"));
        setLongField(term145023, term145023.getClass(), "iLocalMillis", 0L);
        setField(term145023, term145023.getClass(), "iChronology", null);
        setIntField(term145023, term145023.getClass(), "iHash", 0);
        term145019 = newInstance(Class.forName("org.joda.time.LocalDate"));
        setLongField(term145019, term145019.getClass(), "iLocalMillis", 0L);
        setField(term145019, term145019.getClass(), "iChronology", null);
        setIntField(term145019, term145019.getClass(), "iHash", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.LocalDate");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        Object retValue = callMethod(klass, "minusMonths", argTypes, term145017, args);
        assertTrue(recursiveEquals(term145017, term145023));
        assertTrue(recursiveEquals(retValue, term145019));
    }

};


