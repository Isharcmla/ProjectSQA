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

public class ZonedChronology_assemble_1604148452308 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term113322;
     Object term113422;

    public ZonedChronology_assemble_1604148452308() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term113322 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        setField(term113322, term113322.getClass(), "iParam", null);
        term113422 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term113538 = newInstance(Class.forName("org.joda.time.chrono.LimitChronology$LimitDateTimeField"));
        Object term113632 = newInstance(Class.forName("org.joda.time.field.UnsupportedDurationField"));
        Object term113726 = newInstance(Class.forName("org.joda.time.field.UnsupportedDurationField"));
        setField(term113422, term113422.getClass(), "eras", null);
        setField(term113422, term113422.getClass(), "centuries", null);
        setField(term113422, term113422.getClass(), "years", null);
        setField(term113422, term113422.getClass(), "months", null);
        setField(term113422, term113422.getClass(), "weekyears", null);
        setField(term113422, term113422.getClass(), "weeks", null);
        setField(term113422, term113422.getClass(), "days", null);
        setField(term113422, term113422.getClass(), "halfdays", null);
        setField(term113422, term113422.getClass(), "hours", null);
        setField(term113422, term113422.getClass(), "minutes", null);
        setField(term113422, term113422.getClass(), "seconds", null);
        setField(term113422, term113422.getClass(), "millis", null);
        setField(term113422, term113422.getClass(), "year", null);
        setField(term113422, term113422.getClass(), "yearOfEra", null);
        setField(term113422, term113422.getClass(), "yearOfCentury", null);
        setField(term113422, term113422.getClass(), "centuryOfEra", null);
        setField(term113422, term113422.getClass(), "era", null);
        setField(term113422, term113422.getClass(), "dayOfWeek", null);
        setField(term113422, term113422.getClass(), "dayOfMonth", null);
        setField(term113422, term113422.getClass(), "dayOfYear", null);
        setField(term113422, term113422.getClass(), "monthOfYear", null);
        setField(term113422, term113422.getClass(), "weekOfWeekyear", null);
        setField(term113422, term113422.getClass(), "weekyear", null);
        setField(term113422, term113422.getClass(), "weekyearOfCentury", null);
        setField(term113538, term113538.getClass(), "iDurationField", term113632);
        setField(term113538, term113538.getClass(), "iRangeDurationField", term113632);
        setField(term113538, term113538.getClass(), "iLeapDurationField", term113726);
        setField(term113422, term113422.getClass(), "millisOfSecond", term113538);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term113422;
        try {
            callMethod(klass, "assemble", argTypes, term113322, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


