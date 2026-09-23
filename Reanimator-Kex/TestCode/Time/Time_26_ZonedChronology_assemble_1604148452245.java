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

public class ZonedChronology_assemble_1604148452245 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term91071;
     Object term91171;

    public ZonedChronology_assemble_1604148452245() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term91071 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        setField(term91071, term91071.getClass(), "iParam", null);
        term91171 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term91257 = newInstance(Class.forName("org.joda.time.field.PreciseDateTimeField"));
        Object term91387 = newInstance(Class.forName("org.joda.time.field.ImpreciseDateTimeField$LinkedDurationField"));
        setField(term91171, term91171.getClass(), "eras", null);
        setField(term91171, term91171.getClass(), "centuries", null);
        setField(term91171, term91171.getClass(), "years", null);
        setField(term91171, term91171.getClass(), "months", null);
        setField(term91171, term91171.getClass(), "weekyears", null);
        setField(term91171, term91171.getClass(), "weeks", null);
        setField(term91171, term91171.getClass(), "days", null);
        setField(term91171, term91171.getClass(), "halfdays", null);
        setField(term91171, term91171.getClass(), "hours", null);
        setField(term91171, term91171.getClass(), "minutes", null);
        setField(term91171, term91171.getClass(), "seconds", null);
        setField(term91171, term91171.getClass(), "millis", null);
        setField(term91171, term91171.getClass(), "year", null);
        setField(term91171, term91171.getClass(), "yearOfEra", null);
        setField(term91171, term91171.getClass(), "yearOfCentury", null);
        setField(term91171, term91171.getClass(), "centuryOfEra", null);
        setField(term91171, term91171.getClass(), "era", null);
        setField(term91171, term91171.getClass(), "dayOfWeek", null);
        setField(term91171, term91171.getClass(), "dayOfMonth", null);
        setField(term91171, term91171.getClass(), "dayOfYear", null);
        setField(term91171, term91171.getClass(), "monthOfYear", null);
        setField(term91171, term91171.getClass(), "weekOfWeekyear", null);
        setField(term91171, term91171.getClass(), "weekyear", null);
        setField(term91171, term91171.getClass(), "weekyearOfCentury", null);
        setField(term91171, term91171.getClass(), "millisOfSecond", null);
        setField(term91171, term91171.getClass(), "millisOfDay", null);
        setField(term91257, term91257.getClass(), "iUnitField", null);
        setField(term91257, term91257.getClass(), "iRangeField", term91387);
        setField(term91171, term91171.getClass(), "secondOfMinute", term91257);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term91171;
        try {
            callMethod(klass, "assemble", argTypes, term91071, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


