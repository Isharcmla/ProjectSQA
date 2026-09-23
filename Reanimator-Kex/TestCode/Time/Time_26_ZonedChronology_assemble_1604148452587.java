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

public class ZonedChronology_assemble_1604148452587 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term266422;
     Object term266598;

    public ZonedChronology_assemble_1604148452587() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term266422 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term266498 = newInstance(Class.forName("org.joda.time.tz.CachedDateTimeZone"));
        setField(term266422, term266422.getClass(), "iParam", term266498);
        term266598 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term266702 = newInstance(Class.forName("org.joda.time.chrono.BasicChronology$HalfdayField"));
        Object term266792 = newInstance(Class.forName("org.joda.time.field.DelegatedDurationField"));
        setField(term266598, term266598.getClass(), "eras", null);
        setField(term266598, term266598.getClass(), "centuries", null);
        setField(term266598, term266598.getClass(), "years", null);
        setField(term266598, term266598.getClass(), "months", null);
        setField(term266598, term266598.getClass(), "weekyears", null);
        setField(term266598, term266598.getClass(), "weeks", null);
        setField(term266598, term266598.getClass(), "days", null);
        setField(term266598, term266598.getClass(), "halfdays", null);
        setField(term266598, term266598.getClass(), "hours", null);
        setField(term266598, term266598.getClass(), "minutes", null);
        setField(term266598, term266598.getClass(), "seconds", null);
        setField(term266598, term266598.getClass(), "millis", null);
        setField(term266598, term266598.getClass(), "year", null);
        setField(term266598, term266598.getClass(), "yearOfEra", null);
        setField(term266598, term266598.getClass(), "yearOfCentury", null);
        setField(term266598, term266598.getClass(), "centuryOfEra", null);
        setField(term266598, term266598.getClass(), "era", null);
        setField(term266598, term266598.getClass(), "dayOfWeek", null);
        setField(term266598, term266598.getClass(), "dayOfMonth", null);
        setField(term266598, term266598.getClass(), "dayOfYear", null);
        setField(term266598, term266598.getClass(), "monthOfYear", null);
        setField(term266702, term266702.getClass(), "iUnitField", null);
        setField(term266702, term266702.getClass(), "iRangeField", term266792);
        setField(term266598, term266598.getClass(), "weekOfWeekyear", term266702);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term266598;
        try {
            callMethod(klass, "assemble", argTypes, term266422, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


