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

public class ZonedChronology_assemble_1604148452459 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term200502;
     Object term200602;

    public ZonedChronology_assemble_1604148452459() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term200502 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        term200602 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term200696 = newInstance(Class.forName("org.joda.time.field.UnsupportedDateTimeField"));
        Object term200776 = newInstance(Class.forName("org.joda.time.field.SkipDateTimeField"));
        setField(term200602, term200602.getClass(), "eras", null);
        setField(term200602, term200602.getClass(), "centuries", null);
        setField(term200602, term200602.getClass(), "years", null);
        setField(term200602, term200602.getClass(), "months", null);
        setField(term200602, term200602.getClass(), "weekyears", null);
        setField(term200602, term200602.getClass(), "weeks", null);
        setField(term200602, term200602.getClass(), "days", null);
        setField(term200602, term200602.getClass(), "halfdays", null);
        setField(term200602, term200602.getClass(), "hours", null);
        setField(term200602, term200602.getClass(), "minutes", null);
        setField(term200602, term200602.getClass(), "seconds", null);
        setField(term200602, term200602.getClass(), "millis", null);
        setField(term200602, term200602.getClass(), "year", null);
        setField(term200602, term200602.getClass(), "yearOfEra", null);
        setField(term200602, term200602.getClass(), "yearOfCentury", null);
        setField(term200602, term200602.getClass(), "centuryOfEra", null);
        setField(term200602, term200602.getClass(), "era", null);
        setField(term200602, term200602.getClass(), "dayOfWeek", null);
        setField(term200602, term200602.getClass(), "dayOfMonth", null);
        setField(term200602, term200602.getClass(), "dayOfYear", null);
        setField(term200602, term200602.getClass(), "monthOfYear", null);
        setField(term200602, term200602.getClass(), "weekOfWeekyear", null);
        setField(term200602, term200602.getClass(), "weekyear", null);
        setField(term200602, term200602.getClass(), "weekyearOfCentury", null);
        setField(term200602, term200602.getClass(), "millisOfSecond", null);
        setField(term200602, term200602.getClass(), "millisOfDay", term200696);
        setField(term200602, term200602.getClass(), "secondOfMinute", null);
        setField(term200602, term200602.getClass(), "secondOfDay", null);
        setField(term200602, term200602.getClass(), "minuteOfHour", null);
        setField(term200602, term200602.getClass(), "minuteOfDay", null);
        setField(term200602, term200602.getClass(), "hourOfDay", null);
        setField(term200602, term200602.getClass(), "hourOfHalfday", null);
        setField(term200602, term200602.getClass(), "clockhourOfDay", null);
        setField(term200602, term200602.getClass(), "clockhourOfHalfday", null);
        setField(term200602, term200602.getClass(), "halfdayOfDay", term200776);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term200602;
        try {
            callMethod(klass, "assemble", argTypes, term200502, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


