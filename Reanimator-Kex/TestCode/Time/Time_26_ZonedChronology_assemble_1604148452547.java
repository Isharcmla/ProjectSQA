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

public class ZonedChronology_assemble_1604148452547 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term249496;
     Object term249690;

    public ZonedChronology_assemble_1604148452547() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term249496 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term249590 = newInstance(Class.forName("org.joda.time.tz.DateTimeZoneBuilder$DSTZone"));
        setField(term249496, term249496.getClass(), "iParam", term249590);
        term249690 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term249794 = newInstance(Class.forName("org.joda.time.chrono.BasicChronology$HalfdayField"));
        Object term249910 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology$ZonedDurationField"));
        setField(term249690, term249690.getClass(), "eras", null);
        setField(term249690, term249690.getClass(), "centuries", null);
        setField(term249690, term249690.getClass(), "years", null);
        setField(term249690, term249690.getClass(), "months", null);
        setField(term249690, term249690.getClass(), "weekyears", null);
        setField(term249690, term249690.getClass(), "weeks", null);
        setField(term249690, term249690.getClass(), "days", null);
        setField(term249690, term249690.getClass(), "halfdays", null);
        setField(term249690, term249690.getClass(), "hours", null);
        setField(term249690, term249690.getClass(), "minutes", null);
        setField(term249690, term249690.getClass(), "seconds", null);
        setField(term249690, term249690.getClass(), "millis", null);
        setField(term249690, term249690.getClass(), "year", null);
        setField(term249690, term249690.getClass(), "yearOfEra", null);
        setField(term249690, term249690.getClass(), "yearOfCentury", null);
        setField(term249690, term249690.getClass(), "centuryOfEra", null);
        setField(term249690, term249690.getClass(), "era", null);
        setField(term249690, term249690.getClass(), "dayOfWeek", null);
        setField(term249690, term249690.getClass(), "dayOfMonth", null);
        setField(term249690, term249690.getClass(), "dayOfYear", null);
        setField(term249690, term249690.getClass(), "monthOfYear", null);
        setField(term249794, term249794.getClass(), "iUnitField", null);
        setField(term249794, term249794.getClass(), "iRangeField", term249910);
        setField(term249690, term249690.getClass(), "weekOfWeekyear", term249794);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term249690;
        try {
            callMethod(klass, "assemble", argTypes, term249496, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


