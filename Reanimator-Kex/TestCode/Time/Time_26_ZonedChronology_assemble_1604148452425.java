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

public class ZonedChronology_assemble_1604148452425 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term185763;
     Object term185977;

    public ZonedChronology_assemble_1604148452425() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term185763 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term185877 = newInstance(Class.forName("org.joda.time.tz.DateTimeZoneBuilder$PrecalculatedZone"));
        setField(term185763, term185763.getClass(), "iParam", term185877);
        term185977 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term186081 = newInstance(Class.forName("org.joda.time.chrono.BasicChronology$HalfdayField"));
        Object term186167 = newInstance(Class.forName("org.joda.time.field.PreciseDurationField"));
        setField(term185977, term185977.getClass(), "eras", null);
        setField(term185977, term185977.getClass(), "centuries", null);
        setField(term185977, term185977.getClass(), "years", null);
        setField(term185977, term185977.getClass(), "months", null);
        setField(term185977, term185977.getClass(), "weekyears", null);
        setField(term185977, term185977.getClass(), "weeks", null);
        setField(term185977, term185977.getClass(), "days", null);
        setField(term185977, term185977.getClass(), "halfdays", null);
        setField(term185977, term185977.getClass(), "hours", null);
        setField(term185977, term185977.getClass(), "minutes", null);
        setField(term185977, term185977.getClass(), "seconds", null);
        setField(term185977, term185977.getClass(), "millis", null);
        setField(term185977, term185977.getClass(), "year", null);
        setField(term185977, term185977.getClass(), "yearOfEra", null);
        setField(term185977, term185977.getClass(), "yearOfCentury", null);
        setField(term185977, term185977.getClass(), "centuryOfEra", null);
        setField(term185977, term185977.getClass(), "era", null);
        setField(term185977, term185977.getClass(), "dayOfWeek", null);
        setField(term185977, term185977.getClass(), "dayOfMonth", null);
        setField(term185977, term185977.getClass(), "dayOfYear", null);
        setField(term185977, term185977.getClass(), "monthOfYear", null);
        setField(term186081, term186081.getClass(), "iUnitField", term186167);
        setField(term185977, term185977.getClass(), "weekOfWeekyear", term186081);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term185977;
        try {
            callMethod(klass, "assemble", argTypes, term185763, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


