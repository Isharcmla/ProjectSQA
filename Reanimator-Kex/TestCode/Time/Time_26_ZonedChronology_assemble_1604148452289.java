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

public class ZonedChronology_assemble_1604148452289 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term107125;
     Object term107225;

    public ZonedChronology_assemble_1604148452289() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term107125 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        term107225 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term107311 = newInstance(Class.forName("org.joda.time.field.LenientDateTimeField"));
        setField(term107225, term107225.getClass(), "eras", null);
        setField(term107225, term107225.getClass(), "centuries", null);
        setField(term107225, term107225.getClass(), "years", null);
        setField(term107225, term107225.getClass(), "months", null);
        setField(term107225, term107225.getClass(), "weekyears", null);
        setField(term107225, term107225.getClass(), "weeks", null);
        setField(term107225, term107225.getClass(), "days", null);
        setField(term107225, term107225.getClass(), "halfdays", null);
        setField(term107225, term107225.getClass(), "hours", null);
        setField(term107225, term107225.getClass(), "minutes", null);
        setField(term107225, term107225.getClass(), "seconds", null);
        setField(term107225, term107225.getClass(), "millis", null);
        setField(term107225, term107225.getClass(), "year", null);
        setField(term107225, term107225.getClass(), "yearOfEra", null);
        setField(term107225, term107225.getClass(), "yearOfCentury", null);
        setField(term107225, term107225.getClass(), "centuryOfEra", null);
        setField(term107225, term107225.getClass(), "era", null);
        setField(term107225, term107225.getClass(), "dayOfWeek", null);
        setField(term107225, term107225.getClass(), "dayOfMonth", null);
        setField(term107225, term107225.getClass(), "dayOfYear", null);
        setField(term107225, term107225.getClass(), "monthOfYear", null);
        setField(term107225, term107225.getClass(), "weekOfWeekyear", null);
        setField(term107225, term107225.getClass(), "weekyear", null);
        setField(term107225, term107225.getClass(), "weekyearOfCentury", null);
        setField(term107225, term107225.getClass(), "millisOfSecond", null);
        setField(term107225, term107225.getClass(), "millisOfDay", term107311);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term107225;
        try {
            callMethod(klass, "assemble", argTypes, term107125, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


