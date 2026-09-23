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

public class ZonedChronology_assemble_1604148452477 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term214615;
     Object term214715;

    public ZonedChronology_assemble_1604148452477() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term214615 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        setField(term214615, term214615.getClass(), "iParam", null);
        term214715 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term214809 = newInstance(Class.forName("org.joda.time.field.UnsupportedDateTimeField"));
        Object term214913 = newInstance(Class.forName("org.joda.time.chrono.BasicChronology$HalfdayField"));
        Object term215003 = newInstance(Class.forName("org.joda.time.field.DecoratedDurationField"));
        setField(term214715, term214715.getClass(), "eras", null);
        setField(term214715, term214715.getClass(), "centuries", null);
        setField(term214715, term214715.getClass(), "years", null);
        setField(term214715, term214715.getClass(), "months", null);
        setField(term214715, term214715.getClass(), "weekyears", null);
        setField(term214715, term214715.getClass(), "weeks", null);
        setField(term214715, term214715.getClass(), "days", null);
        setField(term214715, term214715.getClass(), "halfdays", null);
        setField(term214715, term214715.getClass(), "hours", null);
        setField(term214715, term214715.getClass(), "minutes", null);
        setField(term214715, term214715.getClass(), "seconds", null);
        setField(term214715, term214715.getClass(), "millis", null);
        setField(term214715, term214715.getClass(), "year", null);
        setField(term214715, term214715.getClass(), "yearOfEra", null);
        setField(term214715, term214715.getClass(), "yearOfCentury", null);
        setField(term214715, term214715.getClass(), "centuryOfEra", null);
        setField(term214715, term214715.getClass(), "era", null);
        setField(term214715, term214715.getClass(), "dayOfWeek", null);
        setField(term214715, term214715.getClass(), "dayOfMonth", null);
        setField(term214715, term214715.getClass(), "dayOfYear", null);
        setField(term214715, term214715.getClass(), "monthOfYear", null);
        setField(term214715, term214715.getClass(), "weekOfWeekyear", null);
        setField(term214715, term214715.getClass(), "weekyear", null);
        setField(term214715, term214715.getClass(), "weekyearOfCentury", null);
        setField(term214715, term214715.getClass(), "millisOfSecond", null);
        setField(term214715, term214715.getClass(), "millisOfDay", term214809);
        setField(term214715, term214715.getClass(), "secondOfMinute", null);
        setField(term214715, term214715.getClass(), "secondOfDay", null);
        setField(term214913, term214913.getClass(), "iUnitField", term215003);
        setField(term214715, term214715.getClass(), "minuteOfHour", term214913);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term214715;
        try {
            callMethod(klass, "assemble", argTypes, term214615, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


