package org.joda.time.chrono;

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
import static org.joda.time.chrono.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ZonedChronology_assemble_1604148452327 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term118831;
     Object term118931;

    public ZonedChronology_assemble_1604148452327() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term118831 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        setField(term118831, term118831.getClass(), "iParam", null);
        term118931 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term119035 = newInstance(Class.forName("org.joda.time.chrono.BasicDayOfMonthDateTimeField"));
        Object term119125 = newInstance(Class.forName("org.joda.time.field.DelegatedDurationField"));
        setField(term118931, term118931.getClass(), "eras", null);
        setField(term118931, term118931.getClass(), "centuries", null);
        setField(term118931, term118931.getClass(), "years", null);
        setField(term118931, term118931.getClass(), "months", null);
        setField(term118931, term118931.getClass(), "weekyears", null);
        setField(term118931, term118931.getClass(), "weeks", null);
        setField(term118931, term118931.getClass(), "days", null);
        setField(term118931, term118931.getClass(), "halfdays", null);
        setField(term118931, term118931.getClass(), "hours", null);
        setField(term118931, term118931.getClass(), "minutes", null);
        setField(term118931, term118931.getClass(), "seconds", null);
        setField(term118931, term118931.getClass(), "millis", null);
        setField(term118931, term118931.getClass(), "year", null);
        setField(term118931, term118931.getClass(), "yearOfEra", null);
        setField(term118931, term118931.getClass(), "yearOfCentury", null);
        setField(term118931, term118931.getClass(), "centuryOfEra", null);
        setField(term118931, term118931.getClass(), "era", null);
        setField(term118931, term118931.getClass(), "dayOfWeek", null);
        setField(term118931, term118931.getClass(), "dayOfMonth", null);
        setField(term118931, term118931.getClass(), "dayOfYear", null);
        setField(term118931, term118931.getClass(), "monthOfYear", null);
        setField(term118931, term118931.getClass(), "weekOfWeekyear", null);
        setField(term118931, term118931.getClass(), "weekyear", null);
        setField(term118931, term118931.getClass(), "weekyearOfCentury", null);
        setField(term118931, term118931.getClass(), "millisOfSecond", null);
        setField(term118931, term118931.getClass(), "millisOfDay", null);
        setField(term118931, term118931.getClass(), "secondOfMinute", null);
        setField(term119035, term119035.getClass(), "iUnitField", term119125);
        setField(term118931, term118931.getClass(), "secondOfDay", term119035);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term118931;
        try {
            callMethod(klass, "assemble", argTypes, term118831, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


