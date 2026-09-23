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
import java.lang.ClassCastException;
import static org.joda.time.chrono.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ZonedChronology_assemble_1604148452485 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term218637;
     Object term218815;

    public ZonedChronology_assemble_1604148452485() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term218637 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term218715 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        setField(term218637, term218637.getClass(), "iParam", term218715);
        term218815 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term218909 = newInstance(Class.forName("org.joda.time.field.UnsupportedDateTimeField"));
        Object term219005 = newInstance(Class.forName("org.joda.time.chrono.GJYearOfEraDateTimeField"));
        setField(term218815, term218815.getClass(), "eras", null);
        setField(term218815, term218815.getClass(), "centuries", null);
        setField(term218815, term218815.getClass(), "years", null);
        setField(term218815, term218815.getClass(), "months", null);
        setField(term218815, term218815.getClass(), "weekyears", null);
        setField(term218815, term218815.getClass(), "weeks", null);
        setField(term218815, term218815.getClass(), "days", null);
        setField(term218815, term218815.getClass(), "halfdays", null);
        setField(term218815, term218815.getClass(), "hours", null);
        setField(term218815, term218815.getClass(), "minutes", null);
        setField(term218815, term218815.getClass(), "seconds", null);
        setField(term218815, term218815.getClass(), "millis", null);
        setField(term218815, term218815.getClass(), "year", null);
        setField(term218815, term218815.getClass(), "yearOfEra", null);
        setField(term218815, term218815.getClass(), "yearOfCentury", null);
        setField(term218815, term218815.getClass(), "centuryOfEra", null);
        setField(term218815, term218815.getClass(), "era", null);
        setField(term218815, term218815.getClass(), "dayOfWeek", null);
        setField(term218815, term218815.getClass(), "dayOfMonth", null);
        setField(term218815, term218815.getClass(), "dayOfYear", null);
        setField(term218815, term218815.getClass(), "monthOfYear", null);
        setField(term218815, term218815.getClass(), "weekOfWeekyear", null);
        setField(term218815, term218815.getClass(), "weekyear", null);
        setField(term218815, term218815.getClass(), "weekyearOfCentury", null);
        setField(term218815, term218815.getClass(), "millisOfSecond", null);
        setField(term218815, term218815.getClass(), "millisOfDay", term218909);
        setField(term218815, term218815.getClass(), "secondOfMinute", null);
        setField(term218815, term218815.getClass(), "secondOfDay", term219005);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term218815;
        try {
            callMethod(klass, "assemble", argTypes, term218637, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


