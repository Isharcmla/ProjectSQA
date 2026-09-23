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

public class ZonedChronology_assemble_1604148452535 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term244474;
     Object term244688;

    public ZonedChronology_assemble_1604148452535() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term244474 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term244588 = newInstance(Class.forName("org.joda.time.tz.DateTimeZoneBuilder$PrecalculatedZone"));
        setField(term244474, term244474.getClass(), "iParam", term244588);
        term244688 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term244782 = newInstance(Class.forName("org.joda.time.field.UnsupportedDateTimeField"));
        Object term244878 = newInstance(Class.forName("org.joda.time.chrono.GJYearOfEraDateTimeField"));
        setField(term244688, term244688.getClass(), "eras", null);
        setField(term244688, term244688.getClass(), "centuries", null);
        setField(term244688, term244688.getClass(), "years", null);
        setField(term244688, term244688.getClass(), "months", null);
        setField(term244688, term244688.getClass(), "weekyears", null);
        setField(term244688, term244688.getClass(), "weeks", null);
        setField(term244688, term244688.getClass(), "days", null);
        setField(term244688, term244688.getClass(), "halfdays", null);
        setField(term244688, term244688.getClass(), "hours", null);
        setField(term244688, term244688.getClass(), "minutes", null);
        setField(term244688, term244688.getClass(), "seconds", null);
        setField(term244688, term244688.getClass(), "millis", null);
        setField(term244688, term244688.getClass(), "year", null);
        setField(term244688, term244688.getClass(), "yearOfEra", null);
        setField(term244688, term244688.getClass(), "yearOfCentury", null);
        setField(term244688, term244688.getClass(), "centuryOfEra", null);
        setField(term244688, term244688.getClass(), "era", null);
        setField(term244688, term244688.getClass(), "dayOfWeek", null);
        setField(term244688, term244688.getClass(), "dayOfMonth", null);
        setField(term244688, term244688.getClass(), "dayOfYear", null);
        setField(term244688, term244688.getClass(), "monthOfYear", null);
        setField(term244688, term244688.getClass(), "weekOfWeekyear", null);
        setField(term244688, term244688.getClass(), "weekyear", null);
        setField(term244688, term244688.getClass(), "weekyearOfCentury", null);
        setField(term244688, term244688.getClass(), "millisOfSecond", null);
        setField(term244688, term244688.getClass(), "millisOfDay", term244782);
        setField(term244688, term244688.getClass(), "secondOfMinute", null);
        setField(term244688, term244688.getClass(), "secondOfDay", null);
        setField(term244688, term244688.getClass(), "minuteOfHour", null);
        setField(term244688, term244688.getClass(), "minuteOfDay", null);
        setField(term244688, term244688.getClass(), "hourOfDay", null);
        setField(term244688, term244688.getClass(), "hourOfHalfday", null);
        setField(term244688, term244688.getClass(), "clockhourOfDay", null);
        setField(term244688, term244688.getClass(), "clockhourOfHalfday", null);
        setField(term244688, term244688.getClass(), "halfdayOfDay", term244878);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term244688;
        try {
            callMethod(klass, "assemble", argTypes, term244474, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


