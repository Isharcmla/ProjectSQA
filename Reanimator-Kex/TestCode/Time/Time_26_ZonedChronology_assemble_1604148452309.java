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

public class ZonedChronology_assemble_1604148452309 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term113885;
     Object term113985;

    public ZonedChronology_assemble_1604148452309() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term113885 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        setField(term113885, term113885.getClass(), "iParam", term113885);
        term113985 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term114101 = newInstance(Class.forName("org.joda.time.chrono.LimitChronology$LimitDateTimeField"));
        setField(term113985, term113985.getClass(), "eras", null);
        setField(term113985, term113985.getClass(), "centuries", null);
        setField(term113985, term113985.getClass(), "years", null);
        setField(term113985, term113985.getClass(), "months", null);
        setField(term113985, term113985.getClass(), "weekyears", null);
        setField(term113985, term113985.getClass(), "weeks", null);
        setField(term113985, term113985.getClass(), "days", null);
        setField(term113985, term113985.getClass(), "halfdays", null);
        setField(term113985, term113985.getClass(), "hours", null);
        setField(term113985, term113985.getClass(), "minutes", null);
        setField(term113985, term113985.getClass(), "seconds", null);
        setField(term113985, term113985.getClass(), "millis", null);
        setField(term113985, term113985.getClass(), "year", null);
        setField(term113985, term113985.getClass(), "yearOfEra", null);
        setField(term113985, term113985.getClass(), "yearOfCentury", null);
        setField(term113985, term113985.getClass(), "centuryOfEra", null);
        setField(term113985, term113985.getClass(), "era", null);
        setField(term113985, term113985.getClass(), "dayOfWeek", null);
        setField(term113985, term113985.getClass(), "dayOfMonth", null);
        setField(term113985, term113985.getClass(), "dayOfYear", null);
        setField(term113985, term113985.getClass(), "monthOfYear", null);
        setField(term113985, term113985.getClass(), "weekOfWeekyear", null);
        setField(term113985, term113985.getClass(), "weekyear", null);
        setField(term113985, term113985.getClass(), "weekyearOfCentury", null);
        setField(term113985, term113985.getClass(), "millisOfSecond", term114101);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term113985;
        try {
            callMethod(klass, "assemble", argTypes, term113885, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


