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

public class ZonedChronology_assemble_1604148452479 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term215512;
     Object term215726;

    public ZonedChronology_assemble_1604148452479() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term215512 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term215626 = newInstance(Class.forName("org.joda.time.tz.DateTimeZoneBuilder$PrecalculatedZone"));
        setField(term215512, term215512.getClass(), "iParam", term215626);
        term215726 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term215842 = newInstance(Class.forName("org.joda.time.chrono.LimitChronology$LimitDateTimeField"));
        Object term215926 = newInstance(Class.forName("org.joda.time.field.ScaledDurationField"));
        setField(term215726, term215726.getClass(), "eras", null);
        setField(term215726, term215726.getClass(), "centuries", null);
        setField(term215726, term215726.getClass(), "years", null);
        setField(term215726, term215726.getClass(), "months", null);
        setField(term215726, term215726.getClass(), "weekyears", null);
        setField(term215726, term215726.getClass(), "weeks", null);
        setField(term215726, term215726.getClass(), "days", null);
        setField(term215726, term215726.getClass(), "halfdays", null);
        setField(term215726, term215726.getClass(), "hours", null);
        setField(term215726, term215726.getClass(), "minutes", null);
        setField(term215726, term215726.getClass(), "seconds", null);
        setField(term215726, term215726.getClass(), "millis", null);
        setField(term215726, term215726.getClass(), "year", null);
        setField(term215726, term215726.getClass(), "yearOfEra", null);
        setField(term215726, term215726.getClass(), "yearOfCentury", null);
        setField(term215726, term215726.getClass(), "centuryOfEra", null);
        setField(term215726, term215726.getClass(), "era", null);
        setField(term215726, term215726.getClass(), "dayOfWeek", null);
        setField(term215726, term215726.getClass(), "dayOfMonth", null);
        setField(term215726, term215726.getClass(), "dayOfYear", null);
        setField(term215726, term215726.getClass(), "monthOfYear", null);
        setField(term215726, term215726.getClass(), "weekOfWeekyear", null);
        setField(term215726, term215726.getClass(), "weekyear", null);
        setField(term215726, term215726.getClass(), "weekyearOfCentury", null);
        setField(term215842, term215842.getClass(), "iDurationField", term215926);
        setField(term215726, term215726.getClass(), "millisOfSecond", term215842);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term215726;
        try {
            callMethod(klass, "assemble", argTypes, term215512, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


