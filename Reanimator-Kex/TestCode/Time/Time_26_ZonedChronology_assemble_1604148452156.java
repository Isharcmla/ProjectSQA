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

public class ZonedChronology_assemble_1604148452156 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53002;
     Object term53102;

    public ZonedChronology_assemble_1604148452156() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53002 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        term53102 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term53182 = newInstance(Class.forName("org.joda.time.field.SkipDateTimeField"));
        setField(term53102, term53102.getClass(), "eras", null);
        setField(term53102, term53102.getClass(), "centuries", null);
        setField(term53102, term53102.getClass(), "years", null);
        setField(term53102, term53102.getClass(), "months", null);
        setField(term53102, term53102.getClass(), "weekyears", null);
        setField(term53102, term53102.getClass(), "weeks", null);
        setField(term53102, term53102.getClass(), "days", null);
        setField(term53102, term53102.getClass(), "halfdays", null);
        setField(term53102, term53102.getClass(), "hours", null);
        setField(term53102, term53102.getClass(), "minutes", null);
        setField(term53102, term53102.getClass(), "seconds", null);
        setField(term53102, term53102.getClass(), "millis", null);
        setField(term53102, term53102.getClass(), "year", null);
        setField(term53102, term53102.getClass(), "yearOfEra", null);
        setField(term53102, term53102.getClass(), "yearOfCentury", null);
        setField(term53102, term53102.getClass(), "centuryOfEra", null);
        setField(term53102, term53102.getClass(), "era", null);
        setField(term53102, term53102.getClass(), "dayOfWeek", null);
        setField(term53102, term53102.getClass(), "dayOfMonth", null);
        setField(term53102, term53102.getClass(), "dayOfYear", null);
        setField(term53102, term53102.getClass(), "monthOfYear", null);
        setField(term53102, term53102.getClass(), "weekOfWeekyear", null);
        setField(term53102, term53102.getClass(), "weekyear", null);
        setField(term53102, term53102.getClass(), "weekyearOfCentury", null);
        setField(term53102, term53102.getClass(), "millisOfSecond", null);
        setField(term53102, term53102.getClass(), "millisOfDay", null);
        setField(term53102, term53102.getClass(), "secondOfMinute", term53182);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term53102;
        try {
            callMethod(klass, "assemble", argTypes, term53002, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


