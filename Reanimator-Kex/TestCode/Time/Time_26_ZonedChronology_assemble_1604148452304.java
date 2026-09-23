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

public class ZonedChronology_assemble_1604148452304 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term111787;
     Object term111963;

    public ZonedChronology_assemble_1604148452304() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term111787 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term111863 = newInstance(Class.forName("org.joda.time.tz.CachedDateTimeZone"));
        setField(term111787, term111787.getClass(), "iParam", term111863);
        term111963 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term112053 = newInstance(Class.forName("org.joda.time.field.ZeroIsMaxDateTimeField"));
        setField(term111963, term111963.getClass(), "eras", null);
        setField(term111963, term111963.getClass(), "centuries", null);
        setField(term111963, term111963.getClass(), "years", null);
        setField(term111963, term111963.getClass(), "months", null);
        setField(term111963, term111963.getClass(), "weekyears", null);
        setField(term111963, term111963.getClass(), "weeks", null);
        setField(term111963, term111963.getClass(), "days", null);
        setField(term111963, term111963.getClass(), "halfdays", null);
        setField(term111963, term111963.getClass(), "hours", null);
        setField(term111963, term111963.getClass(), "minutes", null);
        setField(term111963, term111963.getClass(), "seconds", null);
        setField(term111963, term111963.getClass(), "millis", null);
        setField(term111963, term111963.getClass(), "year", null);
        setField(term111963, term111963.getClass(), "yearOfEra", null);
        setField(term111963, term111963.getClass(), "yearOfCentury", null);
        setField(term111963, term111963.getClass(), "centuryOfEra", null);
        setField(term111963, term111963.getClass(), "era", null);
        setField(term111963, term111963.getClass(), "dayOfWeek", null);
        setField(term111963, term111963.getClass(), "dayOfMonth", null);
        setField(term111963, term111963.getClass(), "dayOfYear", null);
        setField(term111963, term111963.getClass(), "monthOfYear", null);
        setField(term111963, term111963.getClass(), "weekOfWeekyear", null);
        setField(term111963, term111963.getClass(), "weekyear", null);
        setField(term111963, term111963.getClass(), "weekyearOfCentury", null);
        setField(term111963, term111963.getClass(), "millisOfSecond", null);
        setField(term111963, term111963.getClass(), "millisOfDay", null);
        setField(term111963, term111963.getClass(), "secondOfMinute", null);
        setField(term111963, term111963.getClass(), "secondOfDay", null);
        setField(term111963, term111963.getClass(), "minuteOfHour", null);
        setField(term111963, term111963.getClass(), "minuteOfDay", null);
        setField(term111963, term111963.getClass(), "hourOfDay", null);
        setField(term111963, term111963.getClass(), "hourOfHalfday", term112053);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term111963;
        try {
            callMethod(klass, "assemble", argTypes, term111787, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


