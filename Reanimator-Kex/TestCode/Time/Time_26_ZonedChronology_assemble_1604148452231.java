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

public class ZonedChronology_assemble_1604148452231 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term84965;
     Object term85139;

    public ZonedChronology_assemble_1604148452231() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term84965 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term85039 = newInstance(Class.forName("org.joda.time.tz.FixedDateTimeZone"));
        setField(term84965, term84965.getClass(), "iParam", term85039);
        term85139 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term85243 = newInstance(Class.forName("org.joda.time.chrono.BasicDayOfMonthDateTimeField"));
        Object term85327 = newInstance(Class.forName("org.joda.time.field.MillisDurationField"));
        setField(term85139, term85139.getClass(), "eras", null);
        setField(term85139, term85139.getClass(), "centuries", null);
        setField(term85139, term85139.getClass(), "years", null);
        setField(term85139, term85139.getClass(), "months", null);
        setField(term85139, term85139.getClass(), "weekyears", null);
        setField(term85139, term85139.getClass(), "weeks", null);
        setField(term85139, term85139.getClass(), "days", null);
        setField(term85139, term85139.getClass(), "halfdays", null);
        setField(term85139, term85139.getClass(), "hours", null);
        setField(term85139, term85139.getClass(), "minutes", null);
        setField(term85139, term85139.getClass(), "seconds", null);
        setField(term85139, term85139.getClass(), "millis", null);
        setField(term85139, term85139.getClass(), "year", null);
        setField(term85139, term85139.getClass(), "yearOfEra", null);
        setField(term85139, term85139.getClass(), "yearOfCentury", null);
        setField(term85139, term85139.getClass(), "centuryOfEra", null);
        setField(term85243, term85243.getClass(), "iUnitField", term85327);
        setField(term85139, term85139.getClass(), "era", term85243);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term85139;
        try {
            callMethod(klass, "assemble", argTypes, term84965, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


