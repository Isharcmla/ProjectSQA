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

public class ZonedChronology_assemble_1604148452341 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term131789;
     Object term131965;

    public ZonedChronology_assemble_1604148452341() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term131789 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term131865 = newInstance(Class.forName("org.joda.time.tz.CachedDateTimeZone"));
        setField(term131789, term131789.getClass(), "iParam", term131865);
        term131965 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term132069 = newInstance(Class.forName("org.joda.time.chrono.BasicChronology$HalfdayField"));
        setField(term131965, term131965.getClass(), "eras", null);
        setField(term131965, term131965.getClass(), "centuries", null);
        setField(term131965, term131965.getClass(), "years", null);
        setField(term131965, term131965.getClass(), "months", null);
        setField(term131965, term131965.getClass(), "weekyears", null);
        setField(term131965, term131965.getClass(), "weeks", null);
        setField(term131965, term131965.getClass(), "days", null);
        setField(term131965, term131965.getClass(), "halfdays", null);
        setField(term131965, term131965.getClass(), "hours", null);
        setField(term131965, term131965.getClass(), "minutes", null);
        setField(term131965, term131965.getClass(), "seconds", null);
        setField(term131965, term131965.getClass(), "millis", null);
        setField(term131965, term131965.getClass(), "year", null);
        setField(term131965, term131965.getClass(), "yearOfEra", null);
        setField(term131965, term131965.getClass(), "yearOfCentury", null);
        setField(term131965, term131965.getClass(), "centuryOfEra", null);
        setField(term131965, term131965.getClass(), "era", null);
        setField(term131965, term131965.getClass(), "dayOfWeek", null);
        setField(term131965, term131965.getClass(), "dayOfMonth", null);
        setField(term131965, term131965.getClass(), "dayOfYear", null);
        setField(term131965, term131965.getClass(), "monthOfYear", null);
        setField(term131965, term131965.getClass(), "weekOfWeekyear", term132069);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term131965;
        try {
            callMethod(klass, "assemble", argTypes, term131789, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


