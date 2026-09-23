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

public class ZonedChronology_assemble_1604148452559 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term254475;
     Object term254689;

    public ZonedChronology_assemble_1604148452559() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term254475 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term254589 = newInstance(Class.forName("org.joda.time.tz.DateTimeZoneBuilder$PrecalculatedZone"));
        setField(term254475, term254475.getClass(), "iParam", term254589);
        term254689 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term254773 = newInstance(Class.forName("org.joda.time.field.OffsetDateTimeField"));
        setField(term254689, term254689.getClass(), "eras", null);
        setField(term254689, term254689.getClass(), "centuries", null);
        setField(term254689, term254689.getClass(), "years", null);
        setField(term254689, term254689.getClass(), "months", null);
        setField(term254689, term254689.getClass(), "weekyears", null);
        setField(term254689, term254689.getClass(), "weeks", null);
        setField(term254689, term254689.getClass(), "days", null);
        setField(term254689, term254689.getClass(), "halfdays", null);
        setField(term254689, term254689.getClass(), "hours", null);
        setField(term254689, term254689.getClass(), "minutes", null);
        setField(term254689, term254689.getClass(), "seconds", null);
        setField(term254689, term254689.getClass(), "millis", null);
        setField(term254689, term254689.getClass(), "year", null);
        setField(term254689, term254689.getClass(), "yearOfEra", null);
        setField(term254689, term254689.getClass(), "yearOfCentury", null);
        setField(term254689, term254689.getClass(), "centuryOfEra", null);
        setField(term254689, term254689.getClass(), "era", null);
        setField(term254689, term254689.getClass(), "dayOfWeek", null);
        setField(term254689, term254689.getClass(), "dayOfMonth", null);
        setField(term254689, term254689.getClass(), "dayOfYear", term254773);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term254689;
        try {
            callMethod(klass, "assemble", argTypes, term254475, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


