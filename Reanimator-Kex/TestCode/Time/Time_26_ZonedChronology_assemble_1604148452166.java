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

public class ZonedChronology_assemble_1604148452166 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term61286;
     Object term61386;

    public ZonedChronology_assemble_1604148452166() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term61286 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        term61386 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term61470 = newInstance(Class.forName("org.joda.time.field.StrictDateTimeField"));
        setField(term61386, term61386.getClass(), "eras", null);
        setField(term61386, term61386.getClass(), "centuries", null);
        setField(term61386, term61386.getClass(), "years", null);
        setField(term61386, term61386.getClass(), "months", null);
        setField(term61386, term61386.getClass(), "weekyears", null);
        setField(term61386, term61386.getClass(), "weeks", null);
        setField(term61386, term61386.getClass(), "days", null);
        setField(term61386, term61386.getClass(), "halfdays", null);
        setField(term61386, term61386.getClass(), "hours", null);
        setField(term61386, term61386.getClass(), "minutes", null);
        setField(term61386, term61386.getClass(), "seconds", null);
        setField(term61386, term61386.getClass(), "millis", null);
        setField(term61386, term61386.getClass(), "year", null);
        setField(term61386, term61386.getClass(), "yearOfEra", null);
        setField(term61386, term61386.getClass(), "yearOfCentury", null);
        setField(term61386, term61386.getClass(), "centuryOfEra", null);
        setField(term61386, term61386.getClass(), "era", null);
        setField(term61386, term61386.getClass(), "dayOfWeek", null);
        setField(term61386, term61386.getClass(), "dayOfMonth", null);
        setField(term61386, term61386.getClass(), "dayOfYear", null);
        setField(term61386, term61386.getClass(), "monthOfYear", null);
        setField(term61386, term61386.getClass(), "weekOfWeekyear", null);
        setField(term61386, term61386.getClass(), "weekyear", null);
        setField(term61386, term61386.getClass(), "weekyearOfCentury", null);
        setField(term61386, term61386.getClass(), "millisOfSecond", null);
        setField(term61386, term61386.getClass(), "millisOfDay", null);
        setField(term61386, term61386.getClass(), "secondOfMinute", null);
        setField(term61386, term61386.getClass(), "secondOfDay", null);
        setField(term61386, term61386.getClass(), "minuteOfHour", null);
        setField(term61386, term61386.getClass(), "minuteOfDay", null);
        setField(term61386, term61386.getClass(), "hourOfDay", null);
        setField(term61386, term61386.getClass(), "hourOfHalfday", null);
        setField(term61386, term61386.getClass(), "clockhourOfDay", term61470);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term61386;
        try {
            callMethod(klass, "assemble", argTypes, term61286, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


