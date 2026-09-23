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

public class ZonedChronology_assemble_1604148452243 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term90096;
     Object term90310;

    public ZonedChronology_assemble_1604148452243() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term90096 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term90210 = newInstance(Class.forName("org.joda.time.tz.DateTimeZoneBuilder$PrecalculatedZone"));
        setField(term90096, term90096.getClass(), "iParam", term90210);
        term90310 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term90422 = newInstance(Class.forName("org.joda.time.chrono.BasicWeekOfWeekyearDateTimeField"));
        Object term90552 = newInstance(Class.forName("org.joda.time.field.ImpreciseDateTimeField$LinkedDurationField"));
        setField(term90310, term90310.getClass(), "eras", null);
        setField(term90310, term90310.getClass(), "centuries", null);
        setField(term90310, term90310.getClass(), "years", null);
        setField(term90310, term90310.getClass(), "months", null);
        setField(term90310, term90310.getClass(), "weekyears", null);
        setField(term90310, term90310.getClass(), "weeks", null);
        setField(term90310, term90310.getClass(), "days", null);
        setField(term90310, term90310.getClass(), "halfdays", null);
        setField(term90310, term90310.getClass(), "hours", null);
        setField(term90310, term90310.getClass(), "minutes", null);
        setField(term90310, term90310.getClass(), "seconds", null);
        setField(term90310, term90310.getClass(), "millis", null);
        setField(term90310, term90310.getClass(), "year", null);
        setField(term90310, term90310.getClass(), "yearOfEra", null);
        setField(term90310, term90310.getClass(), "yearOfCentury", null);
        setField(term90310, term90310.getClass(), "centuryOfEra", null);
        setField(term90310, term90310.getClass(), "era", null);
        setField(term90310, term90310.getClass(), "dayOfWeek", null);
        setField(term90310, term90310.getClass(), "dayOfMonth", null);
        setField(term90310, term90310.getClass(), "dayOfYear", null);
        setField(term90310, term90310.getClass(), "monthOfYear", null);
        setField(term90310, term90310.getClass(), "weekOfWeekyear", null);
        setField(term90310, term90310.getClass(), "weekyear", null);
        setField(term90310, term90310.getClass(), "weekyearOfCentury", null);
        setField(term90310, term90310.getClass(), "millisOfSecond", null);
        setField(term90310, term90310.getClass(), "millisOfDay", null);
        setField(term90310, term90310.getClass(), "secondOfMinute", null);
        setField(term90310, term90310.getClass(), "secondOfDay", null);
        setField(term90310, term90310.getClass(), "minuteOfHour", null);
        setField(term90422, term90422.getClass(), "iUnitField", term90552);
        setField(term90310, term90310.getClass(), "minuteOfDay", term90422);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term90310;
        try {
            callMethod(klass, "assemble", argTypes, term90096, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


