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

public class ZonedChronology_assemble_1604148452132 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45082;
     Object term45182;

    public ZonedChronology_assemble_1604148452132() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45082 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        setField(term45082, term45082.getClass(), "iParam", null);
        term45182 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term45298 = newInstance(Class.forName("org.joda.time.chrono.LimitChronology$LimitDateTimeField"));
        Object term45392 = newInstance(Class.forName("org.joda.time.field.UnsupportedDurationField"));
        setField(term45182, term45182.getClass(), "eras", null);
        setField(term45182, term45182.getClass(), "centuries", null);
        setField(term45182, term45182.getClass(), "years", null);
        setField(term45182, term45182.getClass(), "months", null);
        setField(term45182, term45182.getClass(), "weekyears", null);
        setField(term45182, term45182.getClass(), "weeks", null);
        setField(term45182, term45182.getClass(), "days", null);
        setField(term45182, term45182.getClass(), "halfdays", null);
        setField(term45182, term45182.getClass(), "hours", null);
        setField(term45182, term45182.getClass(), "minutes", null);
        setField(term45182, term45182.getClass(), "seconds", null);
        setField(term45182, term45182.getClass(), "millis", null);
        setField(term45182, term45182.getClass(), "year", null);
        setField(term45182, term45182.getClass(), "yearOfEra", null);
        setField(term45182, term45182.getClass(), "yearOfCentury", null);
        setField(term45182, term45182.getClass(), "centuryOfEra", null);
        setField(term45182, term45182.getClass(), "era", null);
        setField(term45182, term45182.getClass(), "dayOfWeek", null);
        setField(term45182, term45182.getClass(), "dayOfMonth", null);
        setField(term45182, term45182.getClass(), "dayOfYear", null);
        setField(term45182, term45182.getClass(), "monthOfYear", null);
        setField(term45182, term45182.getClass(), "weekOfWeekyear", null);
        setField(term45182, term45182.getClass(), "weekyear", null);
        setField(term45182, term45182.getClass(), "weekyearOfCentury", null);
        setField(term45298, term45298.getClass(), "iDurationField", term45392);
        setField(term45182, term45182.getClass(), "millisOfSecond", term45298);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term45182;
        try {
            callMethod(klass, "assemble", argTypes, term45082, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


