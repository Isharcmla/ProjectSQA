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
import java.lang.Object;

public class LocalDate_isSupported_147917491348 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term178050;
     Object term178170;

    public LocalDate_isSupported_147917491348() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term178050 = newInstance(Class.forName("org.joda.time.LocalDate"));
        setField(term178050, term178050.getClass(), "iChronology", null);
        term178170 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term178290 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        setField(term178170, term178170.getClass(), "iUnitType", term178290);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.LocalDate");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.DateTimeFieldType");
        Object[] args = new Object[1];
        args[0] = term178170;
        try {
            callMethod(klass, "isSupported", argTypes, term178050, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


