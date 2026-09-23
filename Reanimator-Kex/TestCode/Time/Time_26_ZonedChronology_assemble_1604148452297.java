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

public class ZonedChronology_assemble_1604148452297 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term109671;
     Object term109771;

    public ZonedChronology_assemble_1604148452297() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term109671 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        term109771 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term109865 = newInstance(Class.forName("org.joda.time.field.UnsupportedDateTimeField"));
        Object term109949 = newInstance(Class.forName("org.joda.time.chrono.GJEraDateTimeField"));
        setField(term109771, term109771.getClass(), "eras", null);
        setField(term109771, term109771.getClass(), "centuries", null);
        setField(term109771, term109771.getClass(), "years", null);
        setField(term109771, term109771.getClass(), "months", null);
        setField(term109771, term109771.getClass(), "weekyears", null);
        setField(term109771, term109771.getClass(), "weeks", null);
        setField(term109771, term109771.getClass(), "days", null);
        setField(term109771, term109771.getClass(), "halfdays", null);
        setField(term109771, term109771.getClass(), "hours", null);
        setField(term109771, term109771.getClass(), "minutes", null);
        setField(term109771, term109771.getClass(), "seconds", null);
        setField(term109771, term109771.getClass(), "millis", null);
        setField(term109771, term109771.getClass(), "year", null);
        setField(term109771, term109771.getClass(), "yearOfEra", null);
        setField(term109771, term109771.getClass(), "yearOfCentury", null);
        setField(term109771, term109771.getClass(), "centuryOfEra", null);
        setField(term109771, term109771.getClass(), "era", null);
        setField(term109771, term109771.getClass(), "dayOfWeek", null);
        setField(term109771, term109771.getClass(), "dayOfMonth", null);
        setField(term109771, term109771.getClass(), "dayOfYear", null);
        setField(term109771, term109771.getClass(), "monthOfYear", null);
        setField(term109771, term109771.getClass(), "weekOfWeekyear", null);
        setField(term109771, term109771.getClass(), "weekyear", null);
        setField(term109771, term109771.getClass(), "weekyearOfCentury", null);
        setField(term109771, term109771.getClass(), "millisOfSecond", null);
        setField(term109771, term109771.getClass(), "millisOfDay", term109865);
        setField(term109771, term109771.getClass(), "secondOfMinute", term109949);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term109771;
        try {
            callMethod(klass, "assemble", argTypes, term109671, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


