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

public class ZonedChronology_assemble_1604148452209 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term76655;
     Object term76833;

    public ZonedChronology_assemble_1604148452209() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term76655 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term76733 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        setField(term76655, term76655.getClass(), "iParam", term76733);
        term76833 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term76931 = newInstance(Class.forName("org.joda.time.chrono.ISOYearOfEraDateTimeField"));
        setField(term76833, term76833.getClass(), "eras", null);
        setField(term76833, term76833.getClass(), "centuries", null);
        setField(term76833, term76833.getClass(), "years", null);
        setField(term76833, term76833.getClass(), "months", null);
        setField(term76833, term76833.getClass(), "weekyears", null);
        setField(term76833, term76833.getClass(), "weeks", null);
        setField(term76833, term76833.getClass(), "days", null);
        setField(term76833, term76833.getClass(), "halfdays", null);
        setField(term76833, term76833.getClass(), "hours", null);
        setField(term76833, term76833.getClass(), "minutes", null);
        setField(term76833, term76833.getClass(), "seconds", null);
        setField(term76833, term76833.getClass(), "millis", null);
        setField(term76833, term76833.getClass(), "year", null);
        setField(term76833, term76833.getClass(), "yearOfEra", null);
        setField(term76833, term76833.getClass(), "yearOfCentury", null);
        setField(term76833, term76833.getClass(), "centuryOfEra", null);
        setField(term76833, term76833.getClass(), "era", null);
        setField(term76833, term76833.getClass(), "dayOfWeek", null);
        setField(term76833, term76833.getClass(), "dayOfMonth", null);
        setField(term76833, term76833.getClass(), "dayOfYear", null);
        setField(term76833, term76833.getClass(), "monthOfYear", null);
        setField(term76833, term76833.getClass(), "weekOfWeekyear", null);
        setField(term76833, term76833.getClass(), "weekyear", null);
        setField(term76833, term76833.getClass(), "weekyearOfCentury", null);
        setField(term76833, term76833.getClass(), "millisOfSecond", null);
        setField(term76833, term76833.getClass(), "millisOfDay", null);
        setField(term76833, term76833.getClass(), "secondOfMinute", null);
        setField(term76833, term76833.getClass(), "secondOfDay", null);
        setField(term76833, term76833.getClass(), "minuteOfHour", null);
        setField(term76833, term76833.getClass(), "minuteOfDay", null);
        setField(term76833, term76833.getClass(), "hourOfDay", null);
        setField(term76833, term76833.getClass(), "hourOfHalfday", null);
        setField(term76833, term76833.getClass(), "clockhourOfDay", null);
        setField(term76833, term76833.getClass(), "clockhourOfHalfday", null);
        setField(term76833, term76833.getClass(), "halfdayOfDay", term76931);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term76833;
        try {
            callMethod(klass, "assemble", argTypes, term76655, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


