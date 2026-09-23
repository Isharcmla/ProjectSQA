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

public class ZonedChronology_assemble_1604148452368 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term138156;
     Object term138334;

    public ZonedChronology_assemble_1604148452368() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term138156 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term138234 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        setField(term138156, term138156.getClass(), "iParam", term138234);
        term138334 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term138428 = newInstance(Class.forName("org.joda.time.field.UnsupportedDateTimeField"));
        Object term138512 = newInstance(Class.forName("org.joda.time.chrono.GJEraDateTimeField"));
        setField(term138334, term138334.getClass(), "eras", null);
        setField(term138334, term138334.getClass(), "centuries", null);
        setField(term138334, term138334.getClass(), "years", null);
        setField(term138334, term138334.getClass(), "months", null);
        setField(term138334, term138334.getClass(), "weekyears", null);
        setField(term138334, term138334.getClass(), "weeks", null);
        setField(term138334, term138334.getClass(), "days", null);
        setField(term138334, term138334.getClass(), "halfdays", null);
        setField(term138334, term138334.getClass(), "hours", null);
        setField(term138334, term138334.getClass(), "minutes", null);
        setField(term138334, term138334.getClass(), "seconds", null);
        setField(term138334, term138334.getClass(), "millis", null);
        setField(term138334, term138334.getClass(), "year", null);
        setField(term138334, term138334.getClass(), "yearOfEra", null);
        setField(term138334, term138334.getClass(), "yearOfCentury", null);
        setField(term138334, term138334.getClass(), "centuryOfEra", null);
        setField(term138334, term138334.getClass(), "era", null);
        setField(term138334, term138334.getClass(), "dayOfWeek", null);
        setField(term138334, term138334.getClass(), "dayOfMonth", null);
        setField(term138334, term138334.getClass(), "dayOfYear", null);
        setField(term138334, term138334.getClass(), "monthOfYear", null);
        setField(term138334, term138334.getClass(), "weekOfWeekyear", null);
        setField(term138334, term138334.getClass(), "weekyear", null);
        setField(term138334, term138334.getClass(), "weekyearOfCentury", null);
        setField(term138334, term138334.getClass(), "millisOfSecond", null);
        setField(term138334, term138334.getClass(), "millisOfDay", term138428);
        setField(term138334, term138334.getClass(), "secondOfMinute", term138512);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term138334;
        try {
            callMethod(klass, "assemble", argTypes, term138156, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


