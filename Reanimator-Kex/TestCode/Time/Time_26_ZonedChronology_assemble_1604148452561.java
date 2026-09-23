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

public class ZonedChronology_assemble_1604148452561 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term255253;
     Object term255427;

    public ZonedChronology_assemble_1604148452561() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term255253 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term255327 = newInstance(Class.forName("org.joda.time.tz.FixedDateTimeZone"));
        setField(term255253, term255253.getClass(), "iParam", term255327);
        term255427 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term255539 = newInstance(Class.forName("org.joda.time.chrono.BasicWeekOfWeekyearDateTimeField"));
        Object term255651 = newInstance(Class.forName("org.joda.time.chrono.GJChronology$LinkedDurationField"));
        setField(term255427, term255427.getClass(), "eras", null);
        setField(term255427, term255427.getClass(), "centuries", null);
        setField(term255427, term255427.getClass(), "years", null);
        setField(term255427, term255427.getClass(), "months", null);
        setField(term255427, term255427.getClass(), "weekyears", null);
        setField(term255427, term255427.getClass(), "weeks", null);
        setField(term255427, term255427.getClass(), "days", null);
        setField(term255427, term255427.getClass(), "halfdays", null);
        setField(term255427, term255427.getClass(), "hours", null);
        setField(term255427, term255427.getClass(), "minutes", null);
        setField(term255427, term255427.getClass(), "seconds", null);
        setField(term255427, term255427.getClass(), "millis", null);
        setField(term255427, term255427.getClass(), "year", null);
        setField(term255427, term255427.getClass(), "yearOfEra", null);
        setField(term255427, term255427.getClass(), "yearOfCentury", null);
        setField(term255427, term255427.getClass(), "centuryOfEra", null);
        setField(term255427, term255427.getClass(), "era", null);
        setField(term255427, term255427.getClass(), "dayOfWeek", null);
        setField(term255427, term255427.getClass(), "dayOfMonth", null);
        setField(term255427, term255427.getClass(), "dayOfYear", null);
        setField(term255427, term255427.getClass(), "monthOfYear", null);
        setField(term255427, term255427.getClass(), "weekOfWeekyear", null);
        setField(term255539, term255539.getClass(), "iUnitField", term255651);
        setField(term255427, term255427.getClass(), "weekyear", term255539);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term255427;
        try {
            callMethod(klass, "assemble", argTypes, term255253, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


