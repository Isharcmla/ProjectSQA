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

public class ZonedChronology_assemble_1604148452553 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term251998;
     Object term252174;

    public ZonedChronology_assemble_1604148452553() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term251998 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term252074 = newInstance(Class.forName("org.joda.time.tz.CachedDateTimeZone"));
        setField(term251998, term251998.getClass(), "iParam", term252074);
        term252174 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term252290 = newInstance(Class.forName("org.joda.time.chrono.LimitChronology$LimitDateTimeField"));
        Object term252380 = newInstance(Class.forName("org.joda.time.field.DelegatedDurationField"));
        setField(term252174, term252174.getClass(), "eras", null);
        setField(term252174, term252174.getClass(), "centuries", null);
        setField(term252174, term252174.getClass(), "years", null);
        setField(term252174, term252174.getClass(), "months", null);
        setField(term252174, term252174.getClass(), "weekyears", null);
        setField(term252174, term252174.getClass(), "weeks", null);
        setField(term252174, term252174.getClass(), "days", null);
        setField(term252174, term252174.getClass(), "halfdays", null);
        setField(term252174, term252174.getClass(), "hours", null);
        setField(term252174, term252174.getClass(), "minutes", null);
        setField(term252174, term252174.getClass(), "seconds", null);
        setField(term252174, term252174.getClass(), "millis", null);
        setField(term252174, term252174.getClass(), "year", null);
        setField(term252174, term252174.getClass(), "yearOfEra", null);
        setField(term252174, term252174.getClass(), "yearOfCentury", null);
        setField(term252174, term252174.getClass(), "centuryOfEra", null);
        setField(term252174, term252174.getClass(), "era", null);
        setField(term252174, term252174.getClass(), "dayOfWeek", null);
        setField(term252174, term252174.getClass(), "dayOfMonth", null);
        setField(term252174, term252174.getClass(), "dayOfYear", null);
        setField(term252174, term252174.getClass(), "monthOfYear", null);
        setField(term252174, term252174.getClass(), "weekOfWeekyear", null);
        setField(term252174, term252174.getClass(), "weekyear", null);
        setField(term252174, term252174.getClass(), "weekyearOfCentury", null);
        setField(term252290, term252290.getClass(), "iDurationField", null);
        setField(term252290, term252290.getClass(), "iRangeDurationField", term252380);
        setField(term252174, term252174.getClass(), "millisOfSecond", term252290);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term252174;
        try {
            callMethod(klass, "assemble", argTypes, term251998, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


