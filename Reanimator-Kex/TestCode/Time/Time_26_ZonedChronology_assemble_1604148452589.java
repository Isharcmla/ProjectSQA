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

public class ZonedChronology_assemble_1604148452589 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term267346;
     Object term267446;

    public ZonedChronology_assemble_1604148452589() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term267346 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        setField(term267346, term267346.getClass(), "iParam", null);
        term267446 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term267540 = newInstance(Class.forName("org.joda.time.field.UnsupportedDateTimeField"));
        Object term267656 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField"));
        Object term267776 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term267892 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField"));
        setField(term267446, term267446.getClass(), "eras", null);
        setField(term267446, term267446.getClass(), "centuries", null);
        setField(term267446, term267446.getClass(), "years", null);
        setField(term267446, term267446.getClass(), "months", null);
        setField(term267446, term267446.getClass(), "weekyears", null);
        setField(term267446, term267446.getClass(), "weeks", null);
        setField(term267446, term267446.getClass(), "days", null);
        setField(term267446, term267446.getClass(), "halfdays", null);
        setField(term267446, term267446.getClass(), "hours", null);
        setField(term267446, term267446.getClass(), "minutes", null);
        setField(term267446, term267446.getClass(), "seconds", null);
        setField(term267446, term267446.getClass(), "millis", null);
        setField(term267446, term267446.getClass(), "year", null);
        setField(term267446, term267446.getClass(), "yearOfEra", null);
        setField(term267446, term267446.getClass(), "yearOfCentury", null);
        setField(term267446, term267446.getClass(), "centuryOfEra", null);
        setField(term267446, term267446.getClass(), "era", null);
        setField(term267446, term267446.getClass(), "dayOfWeek", null);
        setField(term267446, term267446.getClass(), "dayOfMonth", null);
        setField(term267446, term267446.getClass(), "dayOfYear", null);
        setField(term267446, term267446.getClass(), "monthOfYear", null);
        setField(term267446, term267446.getClass(), "weekOfWeekyear", null);
        setField(term267446, term267446.getClass(), "weekyear", null);
        setField(term267446, term267446.getClass(), "weekyearOfCentury", null);
        setField(term267446, term267446.getClass(), "millisOfSecond", null);
        setField(term267446, term267446.getClass(), "millisOfDay", term267540);
        setField(term267446, term267446.getClass(), "secondOfMinute", null);
        setField(term267446, term267446.getClass(), "secondOfDay", null);
        setField(term267446, term267446.getClass(), "minuteOfHour", null);
        setField(term267656, term267656.getClass(), "iDurationField", null);
        setField(term267656, term267656.getClass(), "iRangeDurationField", null);
        setField(term267656, term267656.getClass(), "iLeapDurationField", null);
        setField(term267656, term267656.getClass(), "iType", term267776);
        setField(term267446, term267446.getClass(), "minuteOfDay", term267656);
        setField(term267446, term267446.getClass(), "hourOfDay", null);
        setField(term267446, term267446.getClass(), "hourOfHalfday", null);
        setField(term267446, term267446.getClass(), "clockhourOfDay", null);
        setField(term267446, term267446.getClass(), "clockhourOfHalfday", term267892);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term267446;
        try {
            callMethod(klass, "assemble", argTypes, term267346, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


