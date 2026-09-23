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

public class LocalDate_toDateTime_1984329409221 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term123480;
     Object term123606;

    public LocalDate_toDateTime_1984329409221() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term123480 = newInstance(Class.forName("org.joda.time.LocalDate"));
        Object term123554 = newInstance(Class.forName("org.joda.time.chrono.ISOChronology"));
        setField(term123480, term123480.getClass(), "iChronology", term123554);
        term123606 = newInstance(Class.forName("org.joda.time.LocalTime"));
        Object term123684 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        setField(term123606, term123606.getClass(), "iChronology", term123684);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.LocalDate");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.LocalTime");
        Object[] args = new Object[1];
        args[0] = term123606;
        try {
            callMethod(klass, "toDateTime", argTypes, term123480, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


