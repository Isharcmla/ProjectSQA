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

public class ZonedChronology_assemble_160414845256 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14816;
     Object term14916;

    public ZonedChronology_assemble_160414845256() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14816 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        term14916 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term15028 = newInstance(Class.forName("org.joda.time.chrono.BasicWeekOfWeekyearDateTimeField"));
        setField(term14916, term14916.getClass(), "eras", null);
        setField(term14916, term14916.getClass(), "centuries", null);
        setField(term14916, term14916.getClass(), "years", null);
        setField(term14916, term14916.getClass(), "months", null);
        setField(term14916, term14916.getClass(), "weekyears", null);
        setField(term14916, term14916.getClass(), "weeks", null);
        setField(term14916, term14916.getClass(), "days", null);
        setField(term14916, term14916.getClass(), "halfdays", null);
        setField(term14916, term14916.getClass(), "hours", null);
        setField(term14916, term14916.getClass(), "minutes", null);
        setField(term14916, term14916.getClass(), "seconds", null);
        setField(term14916, term14916.getClass(), "millis", null);
        setField(term14916, term14916.getClass(), "year", null);
        setField(term14916, term14916.getClass(), "yearOfEra", null);
        setField(term14916, term14916.getClass(), "yearOfCentury", null);
        setField(term14916, term14916.getClass(), "centuryOfEra", null);
        setField(term14916, term14916.getClass(), "era", null);
        setField(term14916, term14916.getClass(), "dayOfWeek", null);
        setField(term14916, term14916.getClass(), "dayOfMonth", null);
        setField(term14916, term14916.getClass(), "dayOfYear", null);
        setField(term14916, term14916.getClass(), "monthOfYear", null);
        setField(term14916, term14916.getClass(), "weekOfWeekyear", null);
        setField(term14916, term14916.getClass(), "weekyear", null);
        setField(term14916, term14916.getClass(), "weekyearOfCentury", null);
        setField(term14916, term14916.getClass(), "millisOfSecond", null);
        setField(term14916, term14916.getClass(), "millisOfDay", null);
        setField(term14916, term14916.getClass(), "secondOfMinute", null);
        setField(term14916, term14916.getClass(), "secondOfDay", null);
        setField(term14916, term14916.getClass(), "minuteOfHour", null);
        setField(term14916, term14916.getClass(), "minuteOfDay", term15028);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term14916;
        try {
            callMethod(klass, "assemble", argTypes, term14816, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


