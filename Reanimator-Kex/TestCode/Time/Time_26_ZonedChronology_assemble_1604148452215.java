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

public class ZonedChronology_assemble_1604148452215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term78990;
     Object term79204;

    public ZonedChronology_assemble_1604148452215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term78990 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term79104 = newInstance(Class.forName("org.joda.time.tz.DateTimeZoneBuilder$PrecalculatedZone"));
        setField(term78990, term78990.getClass(), "iParam", term79104);
        term79204 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term79308 = newInstance(Class.forName("org.joda.time.chrono.BasicDayOfMonthDateTimeField"));
        setField(term79204, term79204.getClass(), "eras", null);
        setField(term79204, term79204.getClass(), "centuries", null);
        setField(term79204, term79204.getClass(), "years", null);
        setField(term79204, term79204.getClass(), "months", null);
        setField(term79204, term79204.getClass(), "weekyears", null);
        setField(term79204, term79204.getClass(), "weeks", null);
        setField(term79204, term79204.getClass(), "days", null);
        setField(term79204, term79204.getClass(), "halfdays", null);
        setField(term79204, term79204.getClass(), "hours", null);
        setField(term79204, term79204.getClass(), "minutes", null);
        setField(term79204, term79204.getClass(), "seconds", null);
        setField(term79204, term79204.getClass(), "millis", null);
        setField(term79204, term79204.getClass(), "year", null);
        setField(term79204, term79204.getClass(), "yearOfEra", null);
        setField(term79204, term79204.getClass(), "yearOfCentury", null);
        setField(term79204, term79204.getClass(), "centuryOfEra", null);
        setField(term79204, term79204.getClass(), "era", term79308);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term79204;
        try {
            callMethod(klass, "assemble", argTypes, term78990, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


