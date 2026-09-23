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

public class ZonedChronology_assemble_1604148452311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term115154;
     Object term115254;

    public ZonedChronology_assemble_1604148452311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term115154 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        term115254 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term115348 = newInstance(Class.forName("org.joda.time.field.UnsupportedDateTimeField"));
        Object term115460 = newInstance(Class.forName("org.joda.time.chrono.BasicWeekOfWeekyearDateTimeField"));
        setField(term115254, term115254.getClass(), "eras", null);
        setField(term115254, term115254.getClass(), "centuries", null);
        setField(term115254, term115254.getClass(), "years", null);
        setField(term115254, term115254.getClass(), "months", null);
        setField(term115254, term115254.getClass(), "weekyears", null);
        setField(term115254, term115254.getClass(), "weeks", null);
        setField(term115254, term115254.getClass(), "days", null);
        setField(term115254, term115254.getClass(), "halfdays", null);
        setField(term115254, term115254.getClass(), "hours", null);
        setField(term115254, term115254.getClass(), "minutes", null);
        setField(term115254, term115254.getClass(), "seconds", null);
        setField(term115254, term115254.getClass(), "millis", null);
        setField(term115254, term115254.getClass(), "year", null);
        setField(term115254, term115254.getClass(), "yearOfEra", null);
        setField(term115254, term115254.getClass(), "yearOfCentury", null);
        setField(term115254, term115254.getClass(), "centuryOfEra", null);
        setField(term115254, term115254.getClass(), "era", null);
        setField(term115254, term115254.getClass(), "dayOfWeek", null);
        setField(term115254, term115254.getClass(), "dayOfMonth", null);
        setField(term115254, term115254.getClass(), "dayOfYear", null);
        setField(term115254, term115254.getClass(), "monthOfYear", null);
        setField(term115254, term115254.getClass(), "weekOfWeekyear", null);
        setField(term115254, term115254.getClass(), "weekyear", null);
        setField(term115254, term115254.getClass(), "weekyearOfCentury", null);
        setField(term115254, term115254.getClass(), "millisOfSecond", null);
        setField(term115254, term115254.getClass(), "millisOfDay", term115348);
        setField(term115254, term115254.getClass(), "secondOfMinute", null);
        setField(term115254, term115254.getClass(), "secondOfDay", null);
        setField(term115254, term115254.getClass(), "minuteOfHour", null);
        setField(term115254, term115254.getClass(), "minuteOfDay", null);
        setField(term115254, term115254.getClass(), "hourOfDay", null);
        setField(term115254, term115254.getClass(), "hourOfHalfday", null);
        setField(term115254, term115254.getClass(), "clockhourOfDay", term115460);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term115254;
        try {
            callMethod(klass, "assemble", argTypes, term115154, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


