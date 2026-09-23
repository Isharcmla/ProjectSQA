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

public class ZonedChronology_assemble_1604148452219 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80284;
     Object term80384;

    public ZonedChronology_assemble_1604148452219() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term80284 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        term80384 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term80464 = newInstance(Class.forName("org.joda.time.field.SkipDateTimeField"));
        setField(term80384, term80384.getClass(), "eras", null);
        setField(term80384, term80384.getClass(), "centuries", null);
        setField(term80384, term80384.getClass(), "years", null);
        setField(term80384, term80384.getClass(), "months", null);
        setField(term80384, term80384.getClass(), "weekyears", null);
        setField(term80384, term80384.getClass(), "weeks", null);
        setField(term80384, term80384.getClass(), "days", null);
        setField(term80384, term80384.getClass(), "halfdays", null);
        setField(term80384, term80384.getClass(), "hours", null);
        setField(term80384, term80384.getClass(), "minutes", null);
        setField(term80384, term80384.getClass(), "seconds", null);
        setField(term80384, term80384.getClass(), "millis", null);
        setField(term80384, term80384.getClass(), "year", null);
        setField(term80384, term80384.getClass(), "yearOfEra", null);
        setField(term80384, term80384.getClass(), "yearOfCentury", null);
        setField(term80384, term80384.getClass(), "centuryOfEra", null);
        setField(term80384, term80384.getClass(), "era", null);
        setField(term80384, term80384.getClass(), "dayOfWeek", null);
        setField(term80384, term80384.getClass(), "dayOfMonth", null);
        setField(term80384, term80384.getClass(), "dayOfYear", null);
        setField(term80384, term80384.getClass(), "monthOfYear", null);
        setField(term80384, term80384.getClass(), "weekOfWeekyear", null);
        setField(term80384, term80384.getClass(), "weekyear", null);
        setField(term80384, term80384.getClass(), "weekyearOfCentury", null);
        setField(term80384, term80384.getClass(), "millisOfSecond", null);
        setField(term80384, term80384.getClass(), "millisOfDay", null);
        setField(term80384, term80384.getClass(), "secondOfMinute", null);
        setField(term80384, term80384.getClass(), "secondOfDay", null);
        setField(term80384, term80384.getClass(), "minuteOfHour", term80464);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term80384;
        try {
            callMethod(klass, "assemble", argTypes, term80284, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


