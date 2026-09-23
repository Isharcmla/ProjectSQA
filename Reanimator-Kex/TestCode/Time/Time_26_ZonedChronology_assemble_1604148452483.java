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

public class ZonedChronology_assemble_1604148452483 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term217693;
     Object term217793;

    public ZonedChronology_assemble_1604148452483() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term217693 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        setField(term217693, term217693.getClass(), "iParam", null);
        term217793 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term217887 = newInstance(Class.forName("org.joda.time.field.UnsupportedDateTimeField"));
        Object term218003 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField"));
        Object term218119 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology$ZonedDurationField"));
        setField(term217793, term217793.getClass(), "eras", null);
        setField(term217793, term217793.getClass(), "centuries", null);
        setField(term217793, term217793.getClass(), "years", null);
        setField(term217793, term217793.getClass(), "months", null);
        setField(term217793, term217793.getClass(), "weekyears", null);
        setField(term217793, term217793.getClass(), "weeks", null);
        setField(term217793, term217793.getClass(), "days", null);
        setField(term217793, term217793.getClass(), "halfdays", null);
        setField(term217793, term217793.getClass(), "hours", null);
        setField(term217793, term217793.getClass(), "minutes", null);
        setField(term217793, term217793.getClass(), "seconds", null);
        setField(term217793, term217793.getClass(), "millis", null);
        setField(term217793, term217793.getClass(), "year", null);
        setField(term217793, term217793.getClass(), "yearOfEra", null);
        setField(term217793, term217793.getClass(), "yearOfCentury", null);
        setField(term217793, term217793.getClass(), "centuryOfEra", null);
        setField(term217793, term217793.getClass(), "era", null);
        setField(term217793, term217793.getClass(), "dayOfWeek", null);
        setField(term217793, term217793.getClass(), "dayOfMonth", null);
        setField(term217793, term217793.getClass(), "dayOfYear", null);
        setField(term217793, term217793.getClass(), "monthOfYear", null);
        setField(term217793, term217793.getClass(), "weekOfWeekyear", null);
        setField(term217793, term217793.getClass(), "weekyear", null);
        setField(term217793, term217793.getClass(), "weekyearOfCentury", null);
        setField(term217793, term217793.getClass(), "millisOfSecond", null);
        setField(term217793, term217793.getClass(), "millisOfDay", term217887);
        setField(term217793, term217793.getClass(), "secondOfMinute", null);
        setField(term217793, term217793.getClass(), "secondOfDay", null);
        setField(term217793, term217793.getClass(), "minuteOfHour", null);
        setField(term218003, term218003.getClass(), "iDurationField", term218119);
        setField(term217793, term217793.getClass(), "minuteOfDay", term218003);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term217793;
        try {
            callMethod(klass, "assemble", argTypes, term217693, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


