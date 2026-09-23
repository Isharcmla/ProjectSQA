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

public class ZonedChronology_assemble_1604148452455 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term198795;
     Object term198969;

    public ZonedChronology_assemble_1604148452455() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term198795 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term198869 = newInstance(Class.forName("org.joda.time.tz.FixedDateTimeZone"));
        setField(term198795, term198795.getClass(), "iParam", term198869);
        term198969 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term199055 = newInstance(Class.forName("org.joda.time.field.PreciseDateTimeField"));
        Object term199141 = newInstance(Class.forName("org.joda.time.field.PreciseDurationField"));
        setField(term198969, term198969.getClass(), "eras", null);
        setField(term198969, term198969.getClass(), "centuries", null);
        setField(term198969, term198969.getClass(), "years", null);
        setField(term198969, term198969.getClass(), "months", null);
        setField(term198969, term198969.getClass(), "weekyears", null);
        setField(term198969, term198969.getClass(), "weeks", null);
        setField(term198969, term198969.getClass(), "days", null);
        setField(term198969, term198969.getClass(), "halfdays", null);
        setField(term198969, term198969.getClass(), "hours", null);
        setField(term198969, term198969.getClass(), "minutes", null);
        setField(term198969, term198969.getClass(), "seconds", null);
        setField(term198969, term198969.getClass(), "millis", null);
        setField(term198969, term198969.getClass(), "year", null);
        setField(term198969, term198969.getClass(), "yearOfEra", null);
        setField(term198969, term198969.getClass(), "yearOfCentury", null);
        setField(term198969, term198969.getClass(), "centuryOfEra", null);
        setField(term198969, term198969.getClass(), "era", null);
        setField(term198969, term198969.getClass(), "dayOfWeek", null);
        setField(term198969, term198969.getClass(), "dayOfMonth", null);
        setField(term198969, term198969.getClass(), "dayOfYear", null);
        setField(term198969, term198969.getClass(), "monthOfYear", null);
        setField(term198969, term198969.getClass(), "weekOfWeekyear", null);
        setField(term198969, term198969.getClass(), "weekyear", null);
        setField(term198969, term198969.getClass(), "weekyearOfCentury", null);
        setField(term198969, term198969.getClass(), "millisOfSecond", null);
        setField(term198969, term198969.getClass(), "millisOfDay", null);
        setField(term199055, term199055.getClass(), "iUnitField", term199141);
        setField(term198969, term198969.getClass(), "secondOfMinute", term199055);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term198969;
        try {
            callMethod(klass, "assemble", argTypes, term198795, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


