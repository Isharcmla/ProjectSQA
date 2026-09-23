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

public class ZonedChronology_assemble_1604148452495 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term223240;
     Object term223340;

    public ZonedChronology_assemble_1604148452495() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term223240 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        setField(term223240, term223240.getClass(), "iParam", null);
        term223340 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term223434 = newInstance(Class.forName("org.joda.time.field.UnsupportedDateTimeField"));
        Object term223520 = newInstance(Class.forName("org.joda.time.field.PreciseDateTimeField"));
        Object term223610 = newInstance(Class.forName("org.joda.time.field.DelegatedDurationField"));
        setField(term223340, term223340.getClass(), "eras", null);
        setField(term223340, term223340.getClass(), "centuries", null);
        setField(term223340, term223340.getClass(), "years", null);
        setField(term223340, term223340.getClass(), "months", null);
        setField(term223340, term223340.getClass(), "weekyears", null);
        setField(term223340, term223340.getClass(), "weeks", null);
        setField(term223340, term223340.getClass(), "days", null);
        setField(term223340, term223340.getClass(), "halfdays", null);
        setField(term223340, term223340.getClass(), "hours", null);
        setField(term223340, term223340.getClass(), "minutes", null);
        setField(term223340, term223340.getClass(), "seconds", null);
        setField(term223340, term223340.getClass(), "millis", null);
        setField(term223340, term223340.getClass(), "year", null);
        setField(term223340, term223340.getClass(), "yearOfEra", null);
        setField(term223340, term223340.getClass(), "yearOfCentury", null);
        setField(term223340, term223340.getClass(), "centuryOfEra", null);
        setField(term223340, term223340.getClass(), "era", null);
        setField(term223340, term223340.getClass(), "dayOfWeek", null);
        setField(term223340, term223340.getClass(), "dayOfMonth", null);
        setField(term223340, term223340.getClass(), "dayOfYear", null);
        setField(term223340, term223340.getClass(), "monthOfYear", null);
        setField(term223340, term223340.getClass(), "weekOfWeekyear", null);
        setField(term223340, term223340.getClass(), "weekyear", null);
        setField(term223340, term223340.getClass(), "weekyearOfCentury", null);
        setField(term223340, term223340.getClass(), "millisOfSecond", null);
        setField(term223340, term223340.getClass(), "millisOfDay", term223434);
        setField(term223340, term223340.getClass(), "secondOfMinute", null);
        setField(term223340, term223340.getClass(), "secondOfDay", null);
        setField(term223340, term223340.getClass(), "minuteOfHour", null);
        setField(term223340, term223340.getClass(), "minuteOfDay", null);
        setField(term223520, term223520.getClass(), "iUnitField", term223610);
        setField(term223340, term223340.getClass(), "hourOfDay", term223520);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term223340;
        try {
            callMethod(klass, "assemble", argTypes, term223240, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


