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

public class ZonedChronology_assemble_1604148452655 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term341041;
     Object term341141;

    public ZonedChronology_assemble_1604148452655() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term341041 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        setField(term341041, term341041.getClass(), "iParam", null);
        term341141 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term341235 = newInstance(Class.forName("org.joda.time.field.UnsupportedDateTimeField"));
        Object term341351 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField"));
        Object term341445 = newInstance(Class.forName("org.joda.time.field.UnsupportedDurationField"));
        Object term341535 = newInstance(Class.forName("org.joda.time.field.DelegatedDurationField"));
        setField(term341141, term341141.getClass(), "eras", null);
        setField(term341141, term341141.getClass(), "centuries", null);
        setField(term341141, term341141.getClass(), "years", null);
        setField(term341141, term341141.getClass(), "months", null);
        setField(term341141, term341141.getClass(), "weekyears", null);
        setField(term341141, term341141.getClass(), "weeks", null);
        setField(term341141, term341141.getClass(), "days", null);
        setField(term341141, term341141.getClass(), "halfdays", null);
        setField(term341141, term341141.getClass(), "hours", null);
        setField(term341141, term341141.getClass(), "minutes", null);
        setField(term341141, term341141.getClass(), "seconds", null);
        setField(term341141, term341141.getClass(), "millis", null);
        setField(term341141, term341141.getClass(), "year", null);
        setField(term341141, term341141.getClass(), "yearOfEra", null);
        setField(term341141, term341141.getClass(), "yearOfCentury", null);
        setField(term341141, term341141.getClass(), "centuryOfEra", null);
        setField(term341141, term341141.getClass(), "era", null);
        setField(term341141, term341141.getClass(), "dayOfWeek", null);
        setField(term341141, term341141.getClass(), "dayOfMonth", null);
        setField(term341141, term341141.getClass(), "dayOfYear", null);
        setField(term341141, term341141.getClass(), "monthOfYear", null);
        setField(term341141, term341141.getClass(), "weekOfWeekyear", null);
        setField(term341141, term341141.getClass(), "weekyear", null);
        setField(term341141, term341141.getClass(), "weekyearOfCentury", null);
        setField(term341141, term341141.getClass(), "millisOfSecond", null);
        setField(term341141, term341141.getClass(), "millisOfDay", term341235);
        setField(term341141, term341141.getClass(), "secondOfMinute", null);
        setField(term341141, term341141.getClass(), "secondOfDay", null);
        setField(term341141, term341141.getClass(), "minuteOfHour", null);
        setField(term341141, term341141.getClass(), "minuteOfDay", null);
        setField(term341141, term341141.getClass(), "hourOfDay", null);
        setField(term341141, term341141.getClass(), "hourOfHalfday", null);
        setField(term341141, term341141.getClass(), "clockhourOfDay", null);
        setField(term341351, term341351.getClass(), "iDurationField", term341445);
        setField(term341351, term341351.getClass(), "iRangeDurationField", null);
        setField(term341351, term341351.getClass(), "iLeapDurationField", term341535);
        setField(term341141, term341141.getClass(), "clockhourOfHalfday", term341351);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term341141;
        try {
            callMethod(klass, "assemble", argTypes, term341041, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


