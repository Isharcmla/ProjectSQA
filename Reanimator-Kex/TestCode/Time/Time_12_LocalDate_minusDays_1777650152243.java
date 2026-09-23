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
import java.lang.NullPointerException;
import static org.joda.time.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class LocalDate_minusDays_1777650152243 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term130439;

    public LocalDate_minusDays_1777650152243() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term130439 = newInstance(Class.forName("org.joda.time.LocalDate"));
        Object term130513 = newInstance(Class.forName("org.joda.time.chrono.ISOChronology"));
        Object term130599 = newInstance(Class.forName("org.joda.time.field.PreciseDurationField"));
        setLongField(term130599, term130599.getClass(), "iUnitMillis", 1180275985L);
        setField(term130513, term130513.getClass(), "iDays", term130599);
        setField(term130439, term130439.getClass(), "iChronology", term130513);
        setLongField(term130439, term130439.getClass(), "iLocalMillis", 1L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.LocalDate");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 1865851879;
        try {
            callMethod(klass, "minusDays", argTypes, term130439, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


