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

public class ZonedChronology_assemble_1604148452265 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term99115;
     Object term99215;

    public ZonedChronology_assemble_1604148452265() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term99115 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        term99215 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term99299 = newInstance(Class.forName("org.joda.time.field.StrictDateTimeField"));
        setField(term99215, term99215.getClass(), "eras", null);
        setField(term99215, term99215.getClass(), "centuries", null);
        setField(term99215, term99215.getClass(), "years", null);
        setField(term99215, term99215.getClass(), "months", null);
        setField(term99215, term99215.getClass(), "weekyears", null);
        setField(term99215, term99215.getClass(), "weeks", null);
        setField(term99215, term99215.getClass(), "days", null);
        setField(term99215, term99215.getClass(), "halfdays", null);
        setField(term99215, term99215.getClass(), "hours", null);
        setField(term99215, term99215.getClass(), "minutes", null);
        setField(term99215, term99215.getClass(), "seconds", null);
        setField(term99215, term99215.getClass(), "millis", null);
        setField(term99215, term99215.getClass(), "year", null);
        setField(term99215, term99215.getClass(), "yearOfEra", null);
        setField(term99215, term99215.getClass(), "yearOfCentury", null);
        setField(term99215, term99215.getClass(), "centuryOfEra", null);
        setField(term99215, term99215.getClass(), "era", null);
        setField(term99215, term99215.getClass(), "dayOfWeek", null);
        setField(term99215, term99215.getClass(), "dayOfMonth", null);
        setField(term99215, term99215.getClass(), "dayOfYear", null);
        setField(term99215, term99215.getClass(), "monthOfYear", null);
        setField(term99215, term99215.getClass(), "weekOfWeekyear", null);
        setField(term99215, term99215.getClass(), "weekyear", null);
        setField(term99215, term99215.getClass(), "weekyearOfCentury", null);
        setField(term99215, term99215.getClass(), "millisOfSecond", null);
        setField(term99215, term99215.getClass(), "millisOfDay", null);
        setField(term99215, term99215.getClass(), "secondOfMinute", null);
        setField(term99215, term99215.getClass(), "secondOfDay", null);
        setField(term99215, term99215.getClass(), "minuteOfHour", null);
        setField(term99215, term99215.getClass(), "minuteOfDay", null);
        setField(term99215, term99215.getClass(), "hourOfDay", null);
        setField(term99215, term99215.getClass(), "hourOfHalfday", term99299);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term99215;
        try {
            callMethod(klass, "assemble", argTypes, term99115, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


