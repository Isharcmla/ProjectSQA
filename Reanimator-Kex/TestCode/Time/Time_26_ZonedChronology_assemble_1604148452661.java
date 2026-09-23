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

public class ZonedChronology_assemble_1604148452661 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term344336;
     Object term344510;

    public ZonedChronology_assemble_1604148452661() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term344336 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term344410 = newInstance(Class.forName("org.joda.time.tz.FixedDateTimeZone"));
        setField(term344336, term344336.getClass(), "iParam", term344410);
        term344510 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term344604 = newInstance(Class.forName("org.joda.time.field.UnsupportedDateTimeField"));
        Object term344720 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField"));
        Object term344810 = newInstance(Class.forName("org.joda.time.field.DelegatedDurationField"));
        setField(term344510, term344510.getClass(), "eras", null);
        setField(term344510, term344510.getClass(), "centuries", null);
        setField(term344510, term344510.getClass(), "years", null);
        setField(term344510, term344510.getClass(), "months", null);
        setField(term344510, term344510.getClass(), "weekyears", null);
        setField(term344510, term344510.getClass(), "weeks", null);
        setField(term344510, term344510.getClass(), "days", null);
        setField(term344510, term344510.getClass(), "halfdays", null);
        setField(term344510, term344510.getClass(), "hours", null);
        setField(term344510, term344510.getClass(), "minutes", null);
        setField(term344510, term344510.getClass(), "seconds", null);
        setField(term344510, term344510.getClass(), "millis", null);
        setField(term344510, term344510.getClass(), "year", null);
        setField(term344510, term344510.getClass(), "yearOfEra", null);
        setField(term344510, term344510.getClass(), "yearOfCentury", null);
        setField(term344510, term344510.getClass(), "centuryOfEra", null);
        setField(term344510, term344510.getClass(), "era", null);
        setField(term344510, term344510.getClass(), "dayOfWeek", null);
        setField(term344510, term344510.getClass(), "dayOfMonth", null);
        setField(term344510, term344510.getClass(), "dayOfYear", null);
        setField(term344510, term344510.getClass(), "monthOfYear", null);
        setField(term344510, term344510.getClass(), "weekOfWeekyear", null);
        setField(term344510, term344510.getClass(), "weekyear", null);
        setField(term344510, term344510.getClass(), "weekyearOfCentury", null);
        setField(term344510, term344510.getClass(), "millisOfSecond", null);
        setField(term344510, term344510.getClass(), "millisOfDay", term344604);
        setField(term344510, term344510.getClass(), "secondOfMinute", null);
        setField(term344510, term344510.getClass(), "secondOfDay", null);
        setField(term344510, term344510.getClass(), "minuteOfHour", null);
        setField(term344720, term344720.getClass(), "iDurationField", null);
        setField(term344720, term344720.getClass(), "iRangeDurationField", null);
        setField(term344720, term344720.getClass(), "iLeapDurationField", term344810);
        setField(term344510, term344510.getClass(), "minuteOfDay", term344720);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term344510;
        try {
            callMethod(klass, "assemble", argTypes, term344336, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


