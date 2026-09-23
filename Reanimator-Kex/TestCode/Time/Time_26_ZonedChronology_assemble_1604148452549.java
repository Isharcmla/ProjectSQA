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

public class ZonedChronology_assemble_1604148452549 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term250423;
     Object term250637;

    public ZonedChronology_assemble_1604148452549() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term250423 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term250537 = newInstance(Class.forName("org.joda.time.tz.DateTimeZoneBuilder$PrecalculatedZone"));
        setField(term250423, term250423.getClass(), "iParam", term250537);
        term250637 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term250735 = newInstance(Class.forName("org.joda.time.chrono.ISOYearOfEraDateTimeField"));
        setField(term250637, term250637.getClass(), "eras", null);
        setField(term250637, term250637.getClass(), "centuries", null);
        setField(term250637, term250637.getClass(), "years", null);
        setField(term250637, term250637.getClass(), "months", null);
        setField(term250637, term250637.getClass(), "weekyears", null);
        setField(term250637, term250637.getClass(), "weeks", null);
        setField(term250637, term250637.getClass(), "days", null);
        setField(term250637, term250637.getClass(), "halfdays", null);
        setField(term250637, term250637.getClass(), "hours", null);
        setField(term250637, term250637.getClass(), "minutes", null);
        setField(term250637, term250637.getClass(), "seconds", null);
        setField(term250637, term250637.getClass(), "millis", null);
        setField(term250637, term250637.getClass(), "year", null);
        setField(term250637, term250637.getClass(), "yearOfEra", null);
        setField(term250637, term250637.getClass(), "yearOfCentury", null);
        setField(term250637, term250637.getClass(), "centuryOfEra", null);
        setField(term250637, term250637.getClass(), "era", null);
        setField(term250637, term250637.getClass(), "dayOfWeek", null);
        setField(term250637, term250637.getClass(), "dayOfMonth", null);
        setField(term250637, term250637.getClass(), "dayOfYear", null);
        setField(term250637, term250637.getClass(), "monthOfYear", null);
        setField(term250637, term250637.getClass(), "weekOfWeekyear", null);
        setField(term250637, term250637.getClass(), "weekyear", null);
        setField(term250637, term250637.getClass(), "weekyearOfCentury", term250735);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term250637;
        try {
            callMethod(klass, "assemble", argTypes, term250423, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


