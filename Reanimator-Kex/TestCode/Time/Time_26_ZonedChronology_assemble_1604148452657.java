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

public class ZonedChronology_assemble_1604148452657 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term342091;
     Object term342265;

    public ZonedChronology_assemble_1604148452657() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term342091 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term342165 = newInstance(Class.forName("org.joda.time.tz.FixedDateTimeZone"));
        setField(term342091, term342091.getClass(), "iParam", term342165);
        term342265 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term342369 = newInstance(Class.forName("org.joda.time.chrono.BasicChronology$HalfdayField"));
        Object term342489 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term342605 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField"));
        setField(term342265, term342265.getClass(), "eras", null);
        setField(term342265, term342265.getClass(), "centuries", null);
        setField(term342265, term342265.getClass(), "years", null);
        setField(term342265, term342265.getClass(), "months", null);
        setField(term342265, term342265.getClass(), "weekyears", null);
        setField(term342265, term342265.getClass(), "weeks", null);
        setField(term342265, term342265.getClass(), "days", null);
        setField(term342265, term342265.getClass(), "halfdays", null);
        setField(term342265, term342265.getClass(), "hours", null);
        setField(term342265, term342265.getClass(), "minutes", null);
        setField(term342265, term342265.getClass(), "seconds", null);
        setField(term342265, term342265.getClass(), "millis", null);
        setField(term342265, term342265.getClass(), "year", null);
        setField(term342265, term342265.getClass(), "yearOfEra", null);
        setField(term342369, term342369.getClass(), "iUnitField", null);
        setField(term342369, term342369.getClass(), "iRangeField", null);
        setField(term342369, term342369.getClass(), "iType", term342489);
        setField(term342265, term342265.getClass(), "yearOfCentury", term342369);
        setField(term342265, term342265.getClass(), "centuryOfEra", null);
        setField(term342265, term342265.getClass(), "era", null);
        setField(term342265, term342265.getClass(), "dayOfWeek", null);
        setField(term342265, term342265.getClass(), "dayOfMonth", term342605);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term342265;
        try {
            callMethod(klass, "assemble", argTypes, term342091, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


