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
import java.lang.IllegalArgumentException;
import static org.joda.time.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class LocalDate_plus_883071722314 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term155899;
     Object term155947;

    public LocalDate_plus_883071722314() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term155899 = newInstance(Class.forName("org.joda.time.LocalDate"));
        setLongField(term155899, term155899.getClass(), "iLocalMillis", 0L);
        setField(term155899, term155899.getClass(), "iChronology", null);
        term155947 = newInstance(Class.forName("org.joda.time.Minutes"));
        setIntField(term155947, term155947.getClass(), "iPeriod", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.LocalDate");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.ReadablePeriod");
        Object[] args = new Object[1];
        args[0] = term155947;
        try {
            callMethod(klass, "plus", argTypes, term155899, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


