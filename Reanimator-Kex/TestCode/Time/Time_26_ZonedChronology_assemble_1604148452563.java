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

public class ZonedChronology_assemble_1604148452563 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term256184;
     Object term256284;

    public ZonedChronology_assemble_1604148452563() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term256184 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        setField(term256184, term256184.getClass(), "iParam", null);
        term256284 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term256378 = newInstance(Class.forName("org.joda.time.field.UnsupportedDateTimeField"));
        Object term256482 = newInstance(Class.forName("org.joda.time.chrono.BasicChronology$HalfdayField"));
        Object term256572 = newInstance(Class.forName("org.joda.time.field.DelegatedDurationField"));
        setField(term256284, term256284.getClass(), "eras", null);
        setField(term256284, term256284.getClass(), "centuries", null);
        setField(term256284, term256284.getClass(), "years", null);
        setField(term256284, term256284.getClass(), "months", null);
        setField(term256284, term256284.getClass(), "weekyears", null);
        setField(term256284, term256284.getClass(), "weeks", null);
        setField(term256284, term256284.getClass(), "days", null);
        setField(term256284, term256284.getClass(), "halfdays", null);
        setField(term256284, term256284.getClass(), "hours", null);
        setField(term256284, term256284.getClass(), "minutes", null);
        setField(term256284, term256284.getClass(), "seconds", null);
        setField(term256284, term256284.getClass(), "millis", null);
        setField(term256284, term256284.getClass(), "year", null);
        setField(term256284, term256284.getClass(), "yearOfEra", null);
        setField(term256284, term256284.getClass(), "yearOfCentury", null);
        setField(term256284, term256284.getClass(), "centuryOfEra", null);
        setField(term256284, term256284.getClass(), "era", null);
        setField(term256284, term256284.getClass(), "dayOfWeek", null);
        setField(term256284, term256284.getClass(), "dayOfMonth", null);
        setField(term256284, term256284.getClass(), "dayOfYear", null);
        setField(term256284, term256284.getClass(), "monthOfYear", null);
        setField(term256284, term256284.getClass(), "weekOfWeekyear", null);
        setField(term256284, term256284.getClass(), "weekyear", null);
        setField(term256284, term256284.getClass(), "weekyearOfCentury", null);
        setField(term256284, term256284.getClass(), "millisOfSecond", null);
        setField(term256284, term256284.getClass(), "millisOfDay", term256378);
        setField(term256284, term256284.getClass(), "secondOfMinute", null);
        setField(term256284, term256284.getClass(), "secondOfDay", null);
        setField(term256482, term256482.getClass(), "iUnitField", term256572);
        setField(term256284, term256284.getClass(), "minuteOfHour", term256482);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term256284;
        try {
            callMethod(klass, "assemble", argTypes, term256184, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


