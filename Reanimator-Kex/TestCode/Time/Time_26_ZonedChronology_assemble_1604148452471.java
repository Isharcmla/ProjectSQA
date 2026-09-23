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

public class ZonedChronology_assemble_1604148452471 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term211621;
     Object term211799;

    public ZonedChronology_assemble_1604148452471() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term211621 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term211699 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        setField(term211621, term211621.getClass(), "iParam", term211699);
        term211799 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term211893 = newInstance(Class.forName("org.joda.time.field.UnsupportedDateTimeField"));
        Object term212009 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField"));
        setField(term211799, term211799.getClass(), "eras", null);
        setField(term211799, term211799.getClass(), "centuries", null);
        setField(term211799, term211799.getClass(), "years", null);
        setField(term211799, term211799.getClass(), "months", null);
        setField(term211799, term211799.getClass(), "weekyears", null);
        setField(term211799, term211799.getClass(), "weeks", null);
        setField(term211799, term211799.getClass(), "days", null);
        setField(term211799, term211799.getClass(), "halfdays", null);
        setField(term211799, term211799.getClass(), "hours", null);
        setField(term211799, term211799.getClass(), "minutes", null);
        setField(term211799, term211799.getClass(), "seconds", null);
        setField(term211799, term211799.getClass(), "millis", null);
        setField(term211799, term211799.getClass(), "year", null);
        setField(term211799, term211799.getClass(), "yearOfEra", null);
        setField(term211799, term211799.getClass(), "yearOfCentury", null);
        setField(term211799, term211799.getClass(), "centuryOfEra", null);
        setField(term211799, term211799.getClass(), "era", null);
        setField(term211799, term211799.getClass(), "dayOfWeek", null);
        setField(term211799, term211799.getClass(), "dayOfMonth", null);
        setField(term211799, term211799.getClass(), "dayOfYear", null);
        setField(term211799, term211799.getClass(), "monthOfYear", null);
        setField(term211799, term211799.getClass(), "weekOfWeekyear", null);
        setField(term211799, term211799.getClass(), "weekyear", null);
        setField(term211799, term211799.getClass(), "weekyearOfCentury", null);
        setField(term211799, term211799.getClass(), "millisOfSecond", null);
        setField(term211799, term211799.getClass(), "millisOfDay", term211893);
        setField(term211799, term211799.getClass(), "secondOfMinute", null);
        setField(term211799, term211799.getClass(), "secondOfDay", null);
        setField(term211799, term211799.getClass(), "minuteOfHour", null);
        setField(term211799, term211799.getClass(), "minuteOfDay", null);
        setField(term211799, term211799.getClass(), "hourOfDay", null);
        setField(term211799, term211799.getClass(), "hourOfHalfday", null);
        setField(term211799, term211799.getClass(), "clockhourOfDay", null);
        setField(term211799, term211799.getClass(), "clockhourOfHalfday", term212009);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term211799;
        try {
            callMethod(klass, "assemble", argTypes, term211621, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


