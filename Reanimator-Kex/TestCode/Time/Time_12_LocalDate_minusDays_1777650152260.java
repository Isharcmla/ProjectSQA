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

public class LocalDate_minusDays_1777650152260 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term136874;

    public LocalDate_minusDays_1777650152260() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term136874 = newInstance(Class.forName("org.joda.time.LocalDate"));
        Object term136948 = newInstance(Class.forName("org.joda.time.chrono.ISOChronology"));
        Object term137034 = newInstance(Class.forName("org.joda.time.field.PreciseDurationField"));
        Object term137138 = newInstance(Class.forName("org.joda.time.chrono.BasicDayOfMonthDateTimeField"));
        setLongField(term137034, term137034.getClass(), "iUnitMillis", 37006626750255000L);
        setField(term136948, term136948.getClass(), "iDays", term137034);
        setLongField(term137138, term137138.getClass(), "iUnitMillis", -8828181169553524736L);
        setField(term136948, term136948.getClass(), "iDayOfMonth", term137138);
        setField(term136874, term136874.getClass(), "iChronology", term136948);
        setLongField(term136874, term136874.getClass(), "iLocalMillis", 8828181169553524736L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.LocalDate");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 384694016;
        try {
            callMethod(klass, "minusDays", argTypes, term136874, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


