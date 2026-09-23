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

public class ZonedChronology_assemble_1604148452108 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36688;
     Object term36788;

    public ZonedChronology_assemble_1604148452108() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36688 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        setField(term36688, term36688.getClass(), "iParam", null);
        term36788 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term36900 = newInstance(Class.forName("org.joda.time.chrono.BasicWeekOfWeekyearDateTimeField"));
        Object term36984 = newInstance(Class.forName("org.joda.time.field.ScaledDurationField"));
        setField(term36788, term36788.getClass(), "eras", null);
        setField(term36788, term36788.getClass(), "centuries", null);
        setField(term36788, term36788.getClass(), "years", null);
        setField(term36788, term36788.getClass(), "months", null);
        setField(term36788, term36788.getClass(), "weekyears", null);
        setField(term36788, term36788.getClass(), "weeks", null);
        setField(term36788, term36788.getClass(), "days", null);
        setField(term36788, term36788.getClass(), "halfdays", null);
        setField(term36788, term36788.getClass(), "hours", null);
        setField(term36788, term36788.getClass(), "minutes", null);
        setField(term36788, term36788.getClass(), "seconds", null);
        setField(term36788, term36788.getClass(), "millis", null);
        setField(term36788, term36788.getClass(), "year", null);
        setField(term36788, term36788.getClass(), "yearOfEra", null);
        setField(term36788, term36788.getClass(), "yearOfCentury", null);
        setField(term36788, term36788.getClass(), "centuryOfEra", null);
        setField(term36788, term36788.getClass(), "era", null);
        setField(term36788, term36788.getClass(), "dayOfWeek", null);
        setField(term36788, term36788.getClass(), "dayOfMonth", null);
        setField(term36788, term36788.getClass(), "dayOfYear", null);
        setField(term36788, term36788.getClass(), "monthOfYear", null);
        setField(term36788, term36788.getClass(), "weekOfWeekyear", null);
        setField(term36788, term36788.getClass(), "weekyear", null);
        setField(term36788, term36788.getClass(), "weekyearOfCentury", null);
        setField(term36788, term36788.getClass(), "millisOfSecond", null);
        setField(term36788, term36788.getClass(), "millisOfDay", null);
        setField(term36788, term36788.getClass(), "secondOfMinute", null);
        setField(term36788, term36788.getClass(), "secondOfDay", null);
        setField(term36788, term36788.getClass(), "minuteOfHour", null);
        setField(term36900, term36900.getClass(), "iUnitField", term36984);
        setField(term36788, term36788.getClass(), "minuteOfDay", term36900);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term36788;
        try {
            callMethod(klass, "assemble", argTypes, term36688, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


