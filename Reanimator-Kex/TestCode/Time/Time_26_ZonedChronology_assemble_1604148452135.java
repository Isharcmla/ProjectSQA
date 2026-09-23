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

public class ZonedChronology_assemble_1604148452135 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46523;
     Object term46623;

    public ZonedChronology_assemble_1604148452135() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term46523 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        term46623 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term46721 = newInstance(Class.forName("org.joda.time.chrono.GJChronology$CutoverField"));
        setField(term46623, term46623.getClass(), "eras", null);
        setField(term46623, term46623.getClass(), "centuries", null);
        setField(term46623, term46623.getClass(), "years", null);
        setField(term46623, term46623.getClass(), "months", null);
        setField(term46623, term46623.getClass(), "weekyears", null);
        setField(term46623, term46623.getClass(), "weeks", null);
        setField(term46623, term46623.getClass(), "days", null);
        setField(term46623, term46623.getClass(), "halfdays", null);
        setField(term46623, term46623.getClass(), "hours", null);
        setField(term46623, term46623.getClass(), "minutes", null);
        setField(term46623, term46623.getClass(), "seconds", null);
        setField(term46623, term46623.getClass(), "millis", null);
        setField(term46623, term46623.getClass(), "year", null);
        setField(term46623, term46623.getClass(), "yearOfEra", null);
        setField(term46623, term46623.getClass(), "yearOfCentury", null);
        setField(term46623, term46623.getClass(), "centuryOfEra", null);
        setField(term46623, term46623.getClass(), "era", null);
        setField(term46623, term46623.getClass(), "dayOfWeek", null);
        setField(term46623, term46623.getClass(), "dayOfMonth", null);
        setField(term46623, term46623.getClass(), "dayOfYear", null);
        setField(term46623, term46623.getClass(), "monthOfYear", null);
        setField(term46623, term46623.getClass(), "weekOfWeekyear", null);
        setField(term46623, term46623.getClass(), "weekyear", null);
        setField(term46623, term46623.getClass(), "weekyearOfCentury", null);
        setField(term46623, term46623.getClass(), "millisOfSecond", null);
        setField(term46623, term46623.getClass(), "millisOfDay", null);
        setField(term46623, term46623.getClass(), "secondOfMinute", null);
        setField(term46623, term46623.getClass(), "secondOfDay", null);
        setField(term46623, term46623.getClass(), "minuteOfHour", null);
        setField(term46623, term46623.getClass(), "minuteOfDay", null);
        setField(term46623, term46623.getClass(), "hourOfDay", null);
        setField(term46623, term46623.getClass(), "hourOfHalfday", null);
        setField(term46623, term46623.getClass(), "clockhourOfDay", term46721);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term46623;
        try {
            callMethod(klass, "assemble", argTypes, term46523, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


