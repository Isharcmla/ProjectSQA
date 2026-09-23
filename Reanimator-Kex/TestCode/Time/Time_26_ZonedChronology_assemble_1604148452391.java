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

public class ZonedChronology_assemble_1604148452391 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term170451;
     Object term170665;

    public ZonedChronology_assemble_1604148452391() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term170451 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term170565 = newInstance(Class.forName("org.joda.time.tz.DateTimeZoneBuilder$PrecalculatedZone"));
        setField(term170451, term170451.getClass(), "iParam", term170565);
        term170665 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term170777 = newInstance(Class.forName("org.joda.time.chrono.BasicWeekOfWeekyearDateTimeField"));
        Object term170907 = newInstance(Class.forName("org.joda.time.field.ImpreciseDateTimeField$LinkedDurationField"));
        Object term171027 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        setField(term170665, term170665.getClass(), "eras", null);
        setField(term170665, term170665.getClass(), "centuries", null);
        setField(term170665, term170665.getClass(), "years", null);
        setField(term170665, term170665.getClass(), "months", null);
        setField(term170665, term170665.getClass(), "weekyears", null);
        setField(term170665, term170665.getClass(), "weeks", null);
        setField(term170665, term170665.getClass(), "days", null);
        setField(term170665, term170665.getClass(), "halfdays", null);
        setField(term170665, term170665.getClass(), "hours", null);
        setField(term170665, term170665.getClass(), "minutes", null);
        setField(term170665, term170665.getClass(), "seconds", null);
        setField(term170665, term170665.getClass(), "millis", null);
        setField(term170665, term170665.getClass(), "year", null);
        setField(term170665, term170665.getClass(), "yearOfEra", null);
        setField(term170665, term170665.getClass(), "yearOfCentury", null);
        setField(term170665, term170665.getClass(), "centuryOfEra", null);
        setField(term170665, term170665.getClass(), "era", null);
        setField(term170665, term170665.getClass(), "dayOfWeek", null);
        setField(term170665, term170665.getClass(), "dayOfMonth", null);
        setField(term170665, term170665.getClass(), "dayOfYear", null);
        setField(term170665, term170665.getClass(), "monthOfYear", null);
        setField(term170665, term170665.getClass(), "weekOfWeekyear", null);
        setField(term170665, term170665.getClass(), "weekyear", null);
        setField(term170665, term170665.getClass(), "weekyearOfCentury", null);
        setField(term170665, term170665.getClass(), "millisOfSecond", null);
        setField(term170665, term170665.getClass(), "millisOfDay", null);
        setField(term170665, term170665.getClass(), "secondOfMinute", null);
        setField(term170665, term170665.getClass(), "secondOfDay", null);
        setField(term170665, term170665.getClass(), "minuteOfHour", null);
        setField(term170907, term170907.getClass(), "iType", term171027);
        setField(term170777, term170777.getClass(), "iUnitField", term170907);
        setField(term170665, term170665.getClass(), "minuteOfDay", term170777);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term170665;
        try {
            callMethod(klass, "assemble", argTypes, term170451, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


