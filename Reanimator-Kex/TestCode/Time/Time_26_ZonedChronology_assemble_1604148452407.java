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
import java.lang.IllegalArgumentException;
import static org.joda.time.chrono.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ZonedChronology_assemble_1604148452407 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term177984;
     Object term178084;

    public ZonedChronology_assemble_1604148452407() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term177984 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        setField(term177984, term177984.getClass(), "iParam", null);
        term178084 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term178178 = newInstance(Class.forName("org.joda.time.field.UnsupportedDateTimeField"));
        Object term178290 = newInstance(Class.forName("org.joda.time.chrono.BasicWeekOfWeekyearDateTimeField"));
        Object term178420 = newInstance(Class.forName("org.joda.time.field.ImpreciseDateTimeField$LinkedDurationField"));
        setField(term178084, term178084.getClass(), "eras", null);
        setField(term178084, term178084.getClass(), "centuries", null);
        setField(term178084, term178084.getClass(), "years", null);
        setField(term178084, term178084.getClass(), "months", null);
        setField(term178084, term178084.getClass(), "weekyears", null);
        setField(term178084, term178084.getClass(), "weeks", null);
        setField(term178084, term178084.getClass(), "days", null);
        setField(term178084, term178084.getClass(), "halfdays", null);
        setField(term178084, term178084.getClass(), "hours", null);
        setField(term178084, term178084.getClass(), "minutes", null);
        setField(term178084, term178084.getClass(), "seconds", null);
        setField(term178084, term178084.getClass(), "millis", null);
        setField(term178084, term178084.getClass(), "year", null);
        setField(term178084, term178084.getClass(), "yearOfEra", null);
        setField(term178084, term178084.getClass(), "yearOfCentury", null);
        setField(term178084, term178084.getClass(), "centuryOfEra", null);
        setField(term178084, term178084.getClass(), "era", null);
        setField(term178084, term178084.getClass(), "dayOfWeek", null);
        setField(term178084, term178084.getClass(), "dayOfMonth", null);
        setField(term178084, term178084.getClass(), "dayOfYear", null);
        setField(term178084, term178084.getClass(), "monthOfYear", null);
        setField(term178084, term178084.getClass(), "weekOfWeekyear", null);
        setField(term178084, term178084.getClass(), "weekyear", null);
        setField(term178084, term178084.getClass(), "weekyearOfCentury", null);
        setField(term178084, term178084.getClass(), "millisOfSecond", null);
        setField(term178084, term178084.getClass(), "millisOfDay", term178178);
        setField(term178084, term178084.getClass(), "secondOfMinute", null);
        setField(term178084, term178084.getClass(), "secondOfDay", null);
        setField(term178084, term178084.getClass(), "minuteOfHour", null);
        setField(term178084, term178084.getClass(), "minuteOfDay", null);
        setField(term178084, term178084.getClass(), "hourOfDay", null);
        setField(term178084, term178084.getClass(), "hourOfHalfday", null);
        setField(term178290, term178290.getClass(), "iUnitField", term178420);
        setField(term178084, term178084.getClass(), "clockhourOfDay", term178290);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term178084;
        try {
            callMethod(klass, "assemble", argTypes, term177984, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


