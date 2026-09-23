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

public class ZonedChronology_assemble_1604148452491 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term221391;
     Object term221567;

    public ZonedChronology_assemble_1604148452491() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term221391 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term221467 = newInstance(Class.forName("org.joda.time.tz.CachedDateTimeZone"));
        setField(term221391, term221391.getClass(), "iParam", term221467);
        term221567 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term221683 = newInstance(Class.forName("org.joda.time.chrono.LimitChronology$LimitDateTimeField"));
        Object term221773 = newInstance(Class.forName("org.joda.time.field.DecoratedDurationField"));
        setField(term221567, term221567.getClass(), "eras", null);
        setField(term221567, term221567.getClass(), "centuries", null);
        setField(term221567, term221567.getClass(), "years", null);
        setField(term221567, term221567.getClass(), "months", null);
        setField(term221567, term221567.getClass(), "weekyears", null);
        setField(term221567, term221567.getClass(), "weeks", null);
        setField(term221567, term221567.getClass(), "days", null);
        setField(term221567, term221567.getClass(), "halfdays", null);
        setField(term221567, term221567.getClass(), "hours", null);
        setField(term221567, term221567.getClass(), "minutes", null);
        setField(term221567, term221567.getClass(), "seconds", null);
        setField(term221567, term221567.getClass(), "millis", null);
        setField(term221567, term221567.getClass(), "year", null);
        setField(term221567, term221567.getClass(), "yearOfEra", null);
        setField(term221567, term221567.getClass(), "yearOfCentury", null);
        setField(term221567, term221567.getClass(), "centuryOfEra", null);
        setField(term221567, term221567.getClass(), "era", null);
        setField(term221567, term221567.getClass(), "dayOfWeek", null);
        setField(term221567, term221567.getClass(), "dayOfMonth", null);
        setField(term221567, term221567.getClass(), "dayOfYear", null);
        setField(term221567, term221567.getClass(), "monthOfYear", null);
        setField(term221567, term221567.getClass(), "weekOfWeekyear", null);
        setField(term221567, term221567.getClass(), "weekyear", null);
        setField(term221567, term221567.getClass(), "weekyearOfCentury", null);
        setField(term221683, term221683.getClass(), "iDurationField", null);
        setField(term221683, term221683.getClass(), "iRangeDurationField", term221773);
        setField(term221567, term221567.getClass(), "millisOfSecond", term221683);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term221567;
        try {
            callMethod(klass, "assemble", argTypes, term221391, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


