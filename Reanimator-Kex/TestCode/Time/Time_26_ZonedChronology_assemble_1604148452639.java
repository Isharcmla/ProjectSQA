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

public class ZonedChronology_assemble_1604148452639 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term331823;
     Object term331923;

    public ZonedChronology_assemble_1604148452639() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term331823 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        setField(term331823, term331823.getClass(), "iParam", null);
        term331923 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term332017 = newInstance(Class.forName("org.joda.time.field.UnsupportedDateTimeField"));
        Object term332133 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField"));
        Object term332253 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term332369 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField"));
        Object term332485 = newInstance(Class.forName("org.joda.time.chrono.LimitChronology$LimitDurationField"));
        setField(term331923, term331923.getClass(), "eras", null);
        setField(term331923, term331923.getClass(), "centuries", null);
        setField(term331923, term331923.getClass(), "years", null);
        setField(term331923, term331923.getClass(), "months", null);
        setField(term331923, term331923.getClass(), "weekyears", null);
        setField(term331923, term331923.getClass(), "weeks", null);
        setField(term331923, term331923.getClass(), "days", null);
        setField(term331923, term331923.getClass(), "halfdays", null);
        setField(term331923, term331923.getClass(), "hours", null);
        setField(term331923, term331923.getClass(), "minutes", null);
        setField(term331923, term331923.getClass(), "seconds", null);
        setField(term331923, term331923.getClass(), "millis", null);
        setField(term331923, term331923.getClass(), "year", null);
        setField(term331923, term331923.getClass(), "yearOfEra", null);
        setField(term331923, term331923.getClass(), "yearOfCentury", null);
        setField(term331923, term331923.getClass(), "centuryOfEra", null);
        setField(term331923, term331923.getClass(), "era", null);
        setField(term331923, term331923.getClass(), "dayOfWeek", null);
        setField(term331923, term331923.getClass(), "dayOfMonth", null);
        setField(term331923, term331923.getClass(), "dayOfYear", null);
        setField(term331923, term331923.getClass(), "monthOfYear", null);
        setField(term331923, term331923.getClass(), "weekOfWeekyear", null);
        setField(term331923, term331923.getClass(), "weekyear", null);
        setField(term331923, term331923.getClass(), "weekyearOfCentury", null);
        setField(term331923, term331923.getClass(), "millisOfSecond", null);
        setField(term331923, term331923.getClass(), "millisOfDay", term332017);
        setField(term331923, term331923.getClass(), "secondOfMinute", null);
        setField(term331923, term331923.getClass(), "secondOfDay", null);
        setField(term331923, term331923.getClass(), "minuteOfHour", null);
        setField(term332133, term332133.getClass(), "iDurationField", null);
        setField(term332133, term332133.getClass(), "iRangeDurationField", null);
        setField(term332133, term332133.getClass(), "iLeapDurationField", null);
        setField(term332133, term332133.getClass(), "iType", term332253);
        setField(term331923, term331923.getClass(), "minuteOfDay", term332133);
        setField(term331923, term331923.getClass(), "hourOfDay", null);
        setField(term331923, term331923.getClass(), "hourOfHalfday", null);
        setField(term331923, term331923.getClass(), "clockhourOfDay", null);
        setField(term332369, term332369.getClass(), "iDurationField", null);
        setField(term332369, term332369.getClass(), "iRangeDurationField", term332485);
        setField(term331923, term331923.getClass(), "clockhourOfHalfday", term332369);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term331923;
        try {
            callMethod(klass, "assemble", argTypes, term331823, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


