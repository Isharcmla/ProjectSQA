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

public class ZonedChronology_assemble_1604148452361 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term134690;
     Object term134790;

    public ZonedChronology_assemble_1604148452361() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term134690 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        term134790 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term134884 = newInstance(Class.forName("org.joda.time.field.UnsupportedDateTimeField"));
        Object term134968 = newInstance(Class.forName("org.joda.time.field.StrictDateTimeField"));
        setField(term134790, term134790.getClass(), "eras", null);
        setField(term134790, term134790.getClass(), "centuries", null);
        setField(term134790, term134790.getClass(), "years", null);
        setField(term134790, term134790.getClass(), "months", null);
        setField(term134790, term134790.getClass(), "weekyears", null);
        setField(term134790, term134790.getClass(), "weeks", null);
        setField(term134790, term134790.getClass(), "days", null);
        setField(term134790, term134790.getClass(), "halfdays", null);
        setField(term134790, term134790.getClass(), "hours", null);
        setField(term134790, term134790.getClass(), "minutes", null);
        setField(term134790, term134790.getClass(), "seconds", null);
        setField(term134790, term134790.getClass(), "millis", null);
        setField(term134790, term134790.getClass(), "year", null);
        setField(term134790, term134790.getClass(), "yearOfEra", null);
        setField(term134790, term134790.getClass(), "yearOfCentury", null);
        setField(term134790, term134790.getClass(), "centuryOfEra", null);
        setField(term134790, term134790.getClass(), "era", null);
        setField(term134790, term134790.getClass(), "dayOfWeek", null);
        setField(term134790, term134790.getClass(), "dayOfMonth", null);
        setField(term134790, term134790.getClass(), "dayOfYear", null);
        setField(term134790, term134790.getClass(), "monthOfYear", null);
        setField(term134790, term134790.getClass(), "weekOfWeekyear", null);
        setField(term134790, term134790.getClass(), "weekyear", null);
        setField(term134790, term134790.getClass(), "weekyearOfCentury", null);
        setField(term134790, term134790.getClass(), "millisOfSecond", null);
        setField(term134790, term134790.getClass(), "millisOfDay", term134884);
        setField(term134790, term134790.getClass(), "secondOfMinute", null);
        setField(term134790, term134790.getClass(), "secondOfDay", null);
        setField(term134790, term134790.getClass(), "minuteOfHour", null);
        setField(term134790, term134790.getClass(), "minuteOfDay", null);
        setField(term134790, term134790.getClass(), "hourOfDay", null);
        setField(term134790, term134790.getClass(), "hourOfHalfday", term134968);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term134790;
        try {
            callMethod(klass, "assemble", argTypes, term134690, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


