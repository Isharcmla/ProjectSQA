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

public class ZonedChronology_assemble_1604148452499 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term224983;
     Object term225083;

    public ZonedChronology_assemble_1604148452499() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term224983 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        setField(term224983, term224983.getClass(), "iParam", null);
        term225083 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term225177 = newInstance(Class.forName("org.joda.time.field.UnsupportedDateTimeField"));
        Object term225293 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField"));
        Object term225409 = newInstance(Class.forName("org.joda.time.chrono.LimitChronology$LimitDurationField"));
        setField(term225083, term225083.getClass(), "eras", null);
        setField(term225083, term225083.getClass(), "centuries", null);
        setField(term225083, term225083.getClass(), "years", null);
        setField(term225083, term225083.getClass(), "months", null);
        setField(term225083, term225083.getClass(), "weekyears", null);
        setField(term225083, term225083.getClass(), "weeks", null);
        setField(term225083, term225083.getClass(), "days", null);
        setField(term225083, term225083.getClass(), "halfdays", null);
        setField(term225083, term225083.getClass(), "hours", null);
        setField(term225083, term225083.getClass(), "minutes", null);
        setField(term225083, term225083.getClass(), "seconds", null);
        setField(term225083, term225083.getClass(), "millis", null);
        setField(term225083, term225083.getClass(), "year", null);
        setField(term225083, term225083.getClass(), "yearOfEra", null);
        setField(term225083, term225083.getClass(), "yearOfCentury", null);
        setField(term225083, term225083.getClass(), "centuryOfEra", null);
        setField(term225083, term225083.getClass(), "era", null);
        setField(term225083, term225083.getClass(), "dayOfWeek", null);
        setField(term225083, term225083.getClass(), "dayOfMonth", null);
        setField(term225083, term225083.getClass(), "dayOfYear", null);
        setField(term225083, term225083.getClass(), "monthOfYear", null);
        setField(term225083, term225083.getClass(), "weekOfWeekyear", null);
        setField(term225083, term225083.getClass(), "weekyear", null);
        setField(term225083, term225083.getClass(), "weekyearOfCentury", null);
        setField(term225083, term225083.getClass(), "millisOfSecond", null);
        setField(term225083, term225083.getClass(), "millisOfDay", term225177);
        setField(term225083, term225083.getClass(), "secondOfMinute", null);
        setField(term225083, term225083.getClass(), "secondOfDay", null);
        setField(term225083, term225083.getClass(), "minuteOfHour", null);
        setField(term225293, term225293.getClass(), "iDurationField", null);
        setField(term225293, term225293.getClass(), "iRangeDurationField", term225409);
        setField(term225083, term225083.getClass(), "minuteOfDay", term225293);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term225083;
        try {
            callMethod(klass, "assemble", argTypes, term224983, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


