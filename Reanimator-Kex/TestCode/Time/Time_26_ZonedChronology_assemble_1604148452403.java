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

public class ZonedChronology_assemble_1604148452403 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term176168;
     Object term176362;

    public ZonedChronology_assemble_1604148452403() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term176168 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term176262 = newInstance(Class.forName("org.joda.time.tz.DateTimeZoneBuilder$DSTZone"));
        setField(term176168, term176168.getClass(), "iParam", term176262);
        term176362 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term176458 = newInstance(Class.forName("org.joda.time.chrono.GJDayOfWeekDateTimeField"));
        Object term176542 = newInstance(Class.forName("org.joda.time.field.MillisDurationField"));
        setField(term176362, term176362.getClass(), "eras", null);
        setField(term176362, term176362.getClass(), "centuries", null);
        setField(term176362, term176362.getClass(), "years", null);
        setField(term176362, term176362.getClass(), "months", null);
        setField(term176362, term176362.getClass(), "weekyears", null);
        setField(term176362, term176362.getClass(), "weeks", null);
        setField(term176362, term176362.getClass(), "days", null);
        setField(term176362, term176362.getClass(), "halfdays", null);
        setField(term176362, term176362.getClass(), "hours", null);
        setField(term176362, term176362.getClass(), "minutes", null);
        setField(term176362, term176362.getClass(), "seconds", null);
        setField(term176362, term176362.getClass(), "millis", null);
        setField(term176362, term176362.getClass(), "year", null);
        setField(term176362, term176362.getClass(), "yearOfEra", null);
        setField(term176362, term176362.getClass(), "yearOfCentury", null);
        setField(term176458, term176458.getClass(), "iUnitField", term176542);
        setField(term176362, term176362.getClass(), "centuryOfEra", term176458);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term176362;
        try {
            callMethod(klass, "assemble", argTypes, term176168, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


