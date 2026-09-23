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

public class ZonedChronology_assemble_1604148452277 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term102897;
     Object term102997;

    public ZonedChronology_assemble_1604148452277() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term102897 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        setField(term102897, term102897.getClass(), "iParam", null);
        term102997 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term103113 = newInstance(Class.forName("org.joda.time.chrono.LimitChronology$LimitDateTimeField"));
        Object term103207 = newInstance(Class.forName("org.joda.time.field.UnsupportedDurationField"));
        Object term103293 = newInstance(Class.forName("org.joda.time.field.PreciseDurationField"));
        setField(term102997, term102997.getClass(), "eras", null);
        setField(term102997, term102997.getClass(), "centuries", null);
        setField(term102997, term102997.getClass(), "years", null);
        setField(term102997, term102997.getClass(), "months", null);
        setField(term102997, term102997.getClass(), "weekyears", null);
        setField(term102997, term102997.getClass(), "weeks", null);
        setField(term102997, term102997.getClass(), "days", null);
        setField(term102997, term102997.getClass(), "halfdays", null);
        setField(term102997, term102997.getClass(), "hours", null);
        setField(term102997, term102997.getClass(), "minutes", null);
        setField(term102997, term102997.getClass(), "seconds", null);
        setField(term102997, term102997.getClass(), "millis", null);
        setField(term102997, term102997.getClass(), "year", null);
        setField(term102997, term102997.getClass(), "yearOfEra", null);
        setField(term102997, term102997.getClass(), "yearOfCentury", null);
        setField(term102997, term102997.getClass(), "centuryOfEra", null);
        setField(term102997, term102997.getClass(), "era", null);
        setField(term102997, term102997.getClass(), "dayOfWeek", null);
        setField(term102997, term102997.getClass(), "dayOfMonth", null);
        setField(term102997, term102997.getClass(), "dayOfYear", null);
        setField(term102997, term102997.getClass(), "monthOfYear", null);
        setField(term102997, term102997.getClass(), "weekOfWeekyear", null);
        setField(term102997, term102997.getClass(), "weekyear", null);
        setField(term102997, term102997.getClass(), "weekyearOfCentury", null);
        setField(term103113, term103113.getClass(), "iDurationField", term103207);
        setField(term103113, term103113.getClass(), "iRangeDurationField", null);
        setField(term103113, term103113.getClass(), "iLeapDurationField", term103293);
        setField(term102997, term102997.getClass(), "millisOfSecond", term103113);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term102997;
        try {
            callMethod(klass, "assemble", argTypes, term102897, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


