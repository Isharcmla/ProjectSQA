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

public class ZonedChronology_assemble_1604148452487 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term219742;
     Object term219916;

    public ZonedChronology_assemble_1604148452487() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term219742 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term219816 = newInstance(Class.forName("org.joda.time.tz.FixedDateTimeZone"));
        setField(term219742, term219742.getClass(), "iParam", term219816);
        term219916 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term220020 = newInstance(Class.forName("org.joda.time.chrono.BasicDayOfMonthDateTimeField"));
        Object term220110 = newInstance(Class.forName("org.joda.time.field.DelegatedDurationField"));
        setField(term219916, term219916.getClass(), "eras", null);
        setField(term219916, term219916.getClass(), "centuries", null);
        setField(term219916, term219916.getClass(), "years", null);
        setField(term219916, term219916.getClass(), "months", null);
        setField(term219916, term219916.getClass(), "weekyears", null);
        setField(term219916, term219916.getClass(), "weeks", null);
        setField(term219916, term219916.getClass(), "days", null);
        setField(term219916, term219916.getClass(), "halfdays", null);
        setField(term219916, term219916.getClass(), "hours", null);
        setField(term219916, term219916.getClass(), "minutes", null);
        setField(term219916, term219916.getClass(), "seconds", null);
        setField(term219916, term219916.getClass(), "millis", null);
        setField(term219916, term219916.getClass(), "year", null);
        setField(term219916, term219916.getClass(), "yearOfEra", null);
        setField(term219916, term219916.getClass(), "yearOfCentury", null);
        setField(term219916, term219916.getClass(), "centuryOfEra", null);
        setField(term219916, term219916.getClass(), "era", null);
        setField(term219916, term219916.getClass(), "dayOfWeek", null);
        setField(term219916, term219916.getClass(), "dayOfMonth", null);
        setField(term219916, term219916.getClass(), "dayOfYear", null);
        setField(term219916, term219916.getClass(), "monthOfYear", null);
        setField(term219916, term219916.getClass(), "weekOfWeekyear", null);
        setField(term219916, term219916.getClass(), "weekyear", null);
        setField(term219916, term219916.getClass(), "weekyearOfCentury", null);
        setField(term219916, term219916.getClass(), "millisOfSecond", null);
        setField(term219916, term219916.getClass(), "millisOfDay", null);
        setField(term219916, term219916.getClass(), "secondOfMinute", null);
        setField(term220020, term220020.getClass(), "iUnitField", term220110);
        setField(term219916, term219916.getClass(), "secondOfDay", term220020);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term219916;
        try {
            callMethod(klass, "assemble", argTypes, term219742, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


