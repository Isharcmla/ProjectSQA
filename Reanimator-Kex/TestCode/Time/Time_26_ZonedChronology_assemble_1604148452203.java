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
import java.lang.ClassCastException;
import static org.joda.time.chrono.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ZonedChronology_assemble_1604148452203 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term74298;
     Object term74398;

    public ZonedChronology_assemble_1604148452203() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term74298 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        setField(term74298, term74298.getClass(), "iParam", term74298);
        term74398 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term74502 = newInstance(Class.forName("org.joda.time.chrono.BasicDayOfMonthDateTimeField"));
        setField(term74398, term74398.getClass(), "eras", null);
        setField(term74398, term74398.getClass(), "centuries", null);
        setField(term74398, term74398.getClass(), "years", null);
        setField(term74398, term74398.getClass(), "months", null);
        setField(term74398, term74398.getClass(), "weekyears", null);
        setField(term74398, term74398.getClass(), "weeks", null);
        setField(term74398, term74398.getClass(), "days", null);
        setField(term74398, term74398.getClass(), "halfdays", null);
        setField(term74398, term74398.getClass(), "hours", null);
        setField(term74398, term74398.getClass(), "minutes", null);
        setField(term74398, term74398.getClass(), "seconds", null);
        setField(term74398, term74398.getClass(), "millis", null);
        setField(term74398, term74398.getClass(), "year", null);
        setField(term74398, term74398.getClass(), "yearOfEra", null);
        setField(term74398, term74398.getClass(), "yearOfCentury", null);
        setField(term74398, term74398.getClass(), "centuryOfEra", null);
        setField(term74398, term74398.getClass(), "era", null);
        setField(term74398, term74398.getClass(), "dayOfWeek", null);
        setField(term74398, term74398.getClass(), "dayOfMonth", null);
        setField(term74398, term74398.getClass(), "dayOfYear", null);
        setField(term74398, term74398.getClass(), "monthOfYear", null);
        setField(term74398, term74398.getClass(), "weekOfWeekyear", null);
        setField(term74398, term74398.getClass(), "weekyear", null);
        setField(term74398, term74398.getClass(), "weekyearOfCentury", null);
        setField(term74398, term74398.getClass(), "millisOfSecond", null);
        setField(term74398, term74398.getClass(), "millisOfDay", null);
        setField(term74398, term74398.getClass(), "secondOfMinute", null);
        setField(term74398, term74398.getClass(), "secondOfDay", term74502);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term74398;
        try {
            callMethod(klass, "assemble", argTypes, term74298, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


