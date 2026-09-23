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

public class ZonedChronology_assemble_1604148452325 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term117917;
     Object term118017;

    public ZonedChronology_assemble_1604148452325() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term117917 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        term118017 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term118111 = newInstance(Class.forName("org.joda.time.field.UnsupportedDateTimeField"));
        Object term118195 = newInstance(Class.forName("org.joda.time.field.StrictDateTimeField"));
        setField(term118017, term118017.getClass(), "eras", null);
        setField(term118017, term118017.getClass(), "centuries", null);
        setField(term118017, term118017.getClass(), "years", null);
        setField(term118017, term118017.getClass(), "months", null);
        setField(term118017, term118017.getClass(), "weekyears", null);
        setField(term118017, term118017.getClass(), "weeks", null);
        setField(term118017, term118017.getClass(), "days", null);
        setField(term118017, term118017.getClass(), "halfdays", null);
        setField(term118017, term118017.getClass(), "hours", null);
        setField(term118017, term118017.getClass(), "minutes", null);
        setField(term118017, term118017.getClass(), "seconds", null);
        setField(term118017, term118017.getClass(), "millis", null);
        setField(term118017, term118017.getClass(), "year", null);
        setField(term118017, term118017.getClass(), "yearOfEra", null);
        setField(term118017, term118017.getClass(), "yearOfCentury", null);
        setField(term118017, term118017.getClass(), "centuryOfEra", null);
        setField(term118017, term118017.getClass(), "era", null);
        setField(term118017, term118017.getClass(), "dayOfWeek", null);
        setField(term118017, term118017.getClass(), "dayOfMonth", null);
        setField(term118017, term118017.getClass(), "dayOfYear", null);
        setField(term118017, term118017.getClass(), "monthOfYear", null);
        setField(term118017, term118017.getClass(), "weekOfWeekyear", null);
        setField(term118017, term118017.getClass(), "weekyear", null);
        setField(term118017, term118017.getClass(), "weekyearOfCentury", null);
        setField(term118017, term118017.getClass(), "millisOfSecond", null);
        setField(term118017, term118017.getClass(), "millisOfDay", term118111);
        setField(term118017, term118017.getClass(), "secondOfMinute", term118195);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term118017;
        try {
            callMethod(klass, "assemble", argTypes, term117917, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


