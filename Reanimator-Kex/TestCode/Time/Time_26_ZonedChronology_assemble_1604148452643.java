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

public class ZonedChronology_assemble_1604148452643 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term334205;
     Object term334419;

    public ZonedChronology_assemble_1604148452643() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term334205 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term334319 = newInstance(Class.forName("org.joda.time.tz.DateTimeZoneBuilder$PrecalculatedZone"));
        setField(term334205, term334205.getClass(), "iParam", term334319);
        term334419 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term334513 = newInstance(Class.forName("org.joda.time.field.UnsupportedDateTimeField"));
        Object term334629 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField"));
        Object term334745 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology$ZonedDurationField"));
        setField(term334419, term334419.getClass(), "eras", null);
        setField(term334419, term334419.getClass(), "centuries", null);
        setField(term334419, term334419.getClass(), "years", null);
        setField(term334419, term334419.getClass(), "months", null);
        setField(term334419, term334419.getClass(), "weekyears", null);
        setField(term334419, term334419.getClass(), "weeks", null);
        setField(term334419, term334419.getClass(), "days", null);
        setField(term334419, term334419.getClass(), "halfdays", null);
        setField(term334419, term334419.getClass(), "hours", null);
        setField(term334419, term334419.getClass(), "minutes", null);
        setField(term334419, term334419.getClass(), "seconds", null);
        setField(term334419, term334419.getClass(), "millis", null);
        setField(term334419, term334419.getClass(), "year", null);
        setField(term334419, term334419.getClass(), "yearOfEra", null);
        setField(term334419, term334419.getClass(), "yearOfCentury", null);
        setField(term334419, term334419.getClass(), "centuryOfEra", null);
        setField(term334419, term334419.getClass(), "era", null);
        setField(term334419, term334419.getClass(), "dayOfWeek", null);
        setField(term334419, term334419.getClass(), "dayOfMonth", null);
        setField(term334419, term334419.getClass(), "dayOfYear", null);
        setField(term334419, term334419.getClass(), "monthOfYear", null);
        setField(term334419, term334419.getClass(), "weekOfWeekyear", null);
        setField(term334419, term334419.getClass(), "weekyear", null);
        setField(term334419, term334419.getClass(), "weekyearOfCentury", null);
        setField(term334419, term334419.getClass(), "millisOfSecond", null);
        setField(term334419, term334419.getClass(), "millisOfDay", term334513);
        setField(term334419, term334419.getClass(), "secondOfMinute", null);
        setField(term334419, term334419.getClass(), "secondOfDay", null);
        setField(term334419, term334419.getClass(), "minuteOfHour", null);
        setField(term334419, term334419.getClass(), "minuteOfDay", null);
        setField(term334419, term334419.getClass(), "hourOfDay", null);
        setField(term334419, term334419.getClass(), "hourOfHalfday", null);
        setField(term334419, term334419.getClass(), "clockhourOfDay", null);
        setField(term334629, term334629.getClass(), "iDurationField", null);
        setField(term334629, term334629.getClass(), "iRangeDurationField", null);
        setField(term334629, term334629.getClass(), "iLeapDurationField", term334745);
        setField(term334419, term334419.getClass(), "clockhourOfHalfday", term334629);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term334419;
        try {
            callMethod(klass, "assemble", argTypes, term334205, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


