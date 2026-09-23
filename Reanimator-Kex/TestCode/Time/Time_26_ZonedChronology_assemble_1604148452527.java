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

public class ZonedChronology_assemble_1604148452527 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term241128;
     Object term241302;

    public ZonedChronology_assemble_1604148452527() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term241128 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term241202 = newInstance(Class.forName("org.joda.time.tz.FixedDateTimeZone"));
        setField(term241128, term241128.getClass(), "iParam", term241202);
        term241302 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term241418 = newInstance(Class.forName("org.joda.time.chrono.LimitChronology$LimitDateTimeField"));
        Object term241508 = newInstance(Class.forName("org.joda.time.field.DecoratedDurationField"));
        setField(term241302, term241302.getClass(), "eras", null);
        setField(term241302, term241302.getClass(), "centuries", null);
        setField(term241302, term241302.getClass(), "years", null);
        setField(term241302, term241302.getClass(), "months", null);
        setField(term241302, term241302.getClass(), "weekyears", null);
        setField(term241302, term241302.getClass(), "weeks", null);
        setField(term241302, term241302.getClass(), "days", null);
        setField(term241302, term241302.getClass(), "halfdays", null);
        setField(term241302, term241302.getClass(), "hours", null);
        setField(term241302, term241302.getClass(), "minutes", null);
        setField(term241302, term241302.getClass(), "seconds", null);
        setField(term241302, term241302.getClass(), "millis", null);
        setField(term241302, term241302.getClass(), "year", null);
        setField(term241302, term241302.getClass(), "yearOfEra", null);
        setField(term241302, term241302.getClass(), "yearOfCentury", null);
        setField(term241302, term241302.getClass(), "centuryOfEra", null);
        setField(term241302, term241302.getClass(), "era", null);
        setField(term241302, term241302.getClass(), "dayOfWeek", null);
        setField(term241302, term241302.getClass(), "dayOfMonth", null);
        setField(term241302, term241302.getClass(), "dayOfYear", null);
        setField(term241302, term241302.getClass(), "monthOfYear", null);
        setField(term241302, term241302.getClass(), "weekOfWeekyear", null);
        setField(term241302, term241302.getClass(), "weekyear", null);
        setField(term241302, term241302.getClass(), "weekyearOfCentury", null);
        setField(term241418, term241418.getClass(), "iDurationField", null);
        setField(term241418, term241418.getClass(), "iRangeDurationField", null);
        setField(term241418, term241418.getClass(), "iLeapDurationField", term241508);
        setField(term241302, term241302.getClass(), "millisOfSecond", term241418);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term241302;
        try {
            callMethod(klass, "assemble", argTypes, term241128, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


