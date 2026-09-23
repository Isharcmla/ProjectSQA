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

public class ZonedChronology_assemble_1604148452225 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term82353;
     Object term82453;

    public ZonedChronology_assemble_1604148452225() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term82353 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        setField(term82353, term82353.getClass(), "iParam", null);
        term82453 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term82557 = newInstance(Class.forName("org.joda.time.chrono.BasicDayOfMonthDateTimeField"));
        Object term82669 = newInstance(Class.forName("org.joda.time.chrono.GJChronology$LinkedDurationField"));
        setField(term82453, term82453.getClass(), "eras", null);
        setField(term82453, term82453.getClass(), "centuries", null);
        setField(term82453, term82453.getClass(), "years", null);
        setField(term82453, term82453.getClass(), "months", null);
        setField(term82453, term82453.getClass(), "weekyears", null);
        setField(term82453, term82453.getClass(), "weeks", null);
        setField(term82453, term82453.getClass(), "days", null);
        setField(term82453, term82453.getClass(), "halfdays", null);
        setField(term82453, term82453.getClass(), "hours", null);
        setField(term82453, term82453.getClass(), "minutes", null);
        setField(term82453, term82453.getClass(), "seconds", null);
        setField(term82453, term82453.getClass(), "millis", null);
        setField(term82453, term82453.getClass(), "year", null);
        setField(term82453, term82453.getClass(), "yearOfEra", null);
        setField(term82453, term82453.getClass(), "yearOfCentury", null);
        setField(term82453, term82453.getClass(), "centuryOfEra", null);
        setField(term82453, term82453.getClass(), "era", null);
        setField(term82453, term82453.getClass(), "dayOfWeek", null);
        setField(term82453, term82453.getClass(), "dayOfMonth", null);
        setField(term82453, term82453.getClass(), "dayOfYear", null);
        setField(term82453, term82453.getClass(), "monthOfYear", null);
        setField(term82453, term82453.getClass(), "weekOfWeekyear", null);
        setField(term82453, term82453.getClass(), "weekyear", null);
        setField(term82453, term82453.getClass(), "weekyearOfCentury", null);
        setField(term82453, term82453.getClass(), "millisOfSecond", null);
        setField(term82453, term82453.getClass(), "millisOfDay", null);
        setField(term82453, term82453.getClass(), "secondOfMinute", null);
        setField(term82557, term82557.getClass(), "iUnitField", term82669);
        setField(term82453, term82453.getClass(), "secondOfDay", term82557);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term82453;
        try {
            callMethod(klass, "assemble", argTypes, term82353, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


