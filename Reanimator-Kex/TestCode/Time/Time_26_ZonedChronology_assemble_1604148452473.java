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

public class ZonedChronology_assemble_1604148452473 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term212738;
     Object term212932;

    public ZonedChronology_assemble_1604148452473() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term212738 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term212832 = newInstance(Class.forName("org.joda.time.tz.DateTimeZoneBuilder$DSTZone"));
        setField(term212738, term212738.getClass(), "iParam", term212832);
        term212932 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term213044 = newInstance(Class.forName("org.joda.time.chrono.BasicWeekOfWeekyearDateTimeField"));
        setField(term212932, term212932.getClass(), "eras", null);
        setField(term212932, term212932.getClass(), "centuries", null);
        setField(term212932, term212932.getClass(), "years", null);
        setField(term212932, term212932.getClass(), "months", null);
        setField(term212932, term212932.getClass(), "weekyears", null);
        setField(term212932, term212932.getClass(), "weeks", null);
        setField(term212932, term212932.getClass(), "days", null);
        setField(term212932, term212932.getClass(), "halfdays", null);
        setField(term212932, term212932.getClass(), "hours", null);
        setField(term212932, term212932.getClass(), "minutes", null);
        setField(term212932, term212932.getClass(), "seconds", null);
        setField(term212932, term212932.getClass(), "millis", null);
        setField(term212932, term212932.getClass(), "year", null);
        setField(term212932, term212932.getClass(), "yearOfEra", null);
        setField(term212932, term212932.getClass(), "yearOfCentury", null);
        setField(term212932, term212932.getClass(), "centuryOfEra", null);
        setField(term212932, term212932.getClass(), "era", null);
        setField(term212932, term212932.getClass(), "dayOfWeek", null);
        setField(term212932, term212932.getClass(), "dayOfMonth", null);
        setField(term212932, term212932.getClass(), "dayOfYear", null);
        setField(term212932, term212932.getClass(), "monthOfYear", null);
        setField(term212932, term212932.getClass(), "weekOfWeekyear", null);
        setField(term212932, term212932.getClass(), "weekyear", term213044);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term212932;
        try {
            callMethod(klass, "assemble", argTypes, term212738, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


