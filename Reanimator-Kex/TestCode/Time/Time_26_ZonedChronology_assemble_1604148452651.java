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

public class ZonedChronology_assemble_1604148452651 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term338899;
     Object term338999;

    public ZonedChronology_assemble_1604148452651() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term338899 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        setField(term338899, term338899.getClass(), "iParam", null);
        term338999 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term339093 = newInstance(Class.forName("org.joda.time.field.UnsupportedDateTimeField"));
        Object term339209 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField"));
        Object term339303 = newInstance(Class.forName("org.joda.time.field.UnsupportedDurationField"));
        Object term339419 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology$ZonedDurationField"));
        setField(term338999, term338999.getClass(), "eras", null);
        setField(term338999, term338999.getClass(), "centuries", null);
        setField(term338999, term338999.getClass(), "years", null);
        setField(term338999, term338999.getClass(), "months", null);
        setField(term338999, term338999.getClass(), "weekyears", null);
        setField(term338999, term338999.getClass(), "weeks", null);
        setField(term338999, term338999.getClass(), "days", null);
        setField(term338999, term338999.getClass(), "halfdays", null);
        setField(term338999, term338999.getClass(), "hours", null);
        setField(term338999, term338999.getClass(), "minutes", null);
        setField(term338999, term338999.getClass(), "seconds", null);
        setField(term338999, term338999.getClass(), "millis", null);
        setField(term338999, term338999.getClass(), "year", null);
        setField(term338999, term338999.getClass(), "yearOfEra", null);
        setField(term338999, term338999.getClass(), "yearOfCentury", null);
        setField(term338999, term338999.getClass(), "centuryOfEra", null);
        setField(term338999, term338999.getClass(), "era", null);
        setField(term338999, term338999.getClass(), "dayOfWeek", null);
        setField(term338999, term338999.getClass(), "dayOfMonth", null);
        setField(term338999, term338999.getClass(), "dayOfYear", null);
        setField(term338999, term338999.getClass(), "monthOfYear", null);
        setField(term338999, term338999.getClass(), "weekOfWeekyear", null);
        setField(term338999, term338999.getClass(), "weekyear", null);
        setField(term338999, term338999.getClass(), "weekyearOfCentury", null);
        setField(term338999, term338999.getClass(), "millisOfSecond", null);
        setField(term338999, term338999.getClass(), "millisOfDay", term339093);
        setField(term338999, term338999.getClass(), "secondOfMinute", null);
        setField(term338999, term338999.getClass(), "secondOfDay", null);
        setField(term338999, term338999.getClass(), "minuteOfHour", null);
        setField(term338999, term338999.getClass(), "minuteOfDay", null);
        setField(term338999, term338999.getClass(), "hourOfDay", null);
        setField(term338999, term338999.getClass(), "hourOfHalfday", null);
        setField(term338999, term338999.getClass(), "clockhourOfDay", null);
        setField(term339209, term339209.getClass(), "iDurationField", term339303);
        setField(term339209, term339209.getClass(), "iRangeDurationField", term339303);
        setField(term339209, term339209.getClass(), "iLeapDurationField", term339419);
        setField(term338999, term338999.getClass(), "clockhourOfHalfday", term339209);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term338999;
        try {
            callMethod(klass, "assemble", argTypes, term338899, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


