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

public class ZonedChronology_assemble_160414845289 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25341;
     Object term25441;

    public ZonedChronology_assemble_160414845289() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25341 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        term25441 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term25529 = newInstance(Class.forName("org.joda.time.field.SkipUndoDateTimeField"));
        setField(term25441, term25441.getClass(), "eras", null);
        setField(term25441, term25441.getClass(), "centuries", null);
        setField(term25441, term25441.getClass(), "years", null);
        setField(term25441, term25441.getClass(), "months", null);
        setField(term25441, term25441.getClass(), "weekyears", null);
        setField(term25441, term25441.getClass(), "weeks", null);
        setField(term25441, term25441.getClass(), "days", null);
        setField(term25441, term25441.getClass(), "halfdays", null);
        setField(term25441, term25441.getClass(), "hours", null);
        setField(term25441, term25441.getClass(), "minutes", null);
        setField(term25441, term25441.getClass(), "seconds", null);
        setField(term25441, term25441.getClass(), "millis", null);
        setField(term25441, term25441.getClass(), "year", null);
        setField(term25441, term25441.getClass(), "yearOfEra", null);
        setField(term25441, term25441.getClass(), "yearOfCentury", null);
        setField(term25441, term25441.getClass(), "centuryOfEra", null);
        setField(term25441, term25441.getClass(), "era", null);
        setField(term25441, term25441.getClass(), "dayOfWeek", null);
        setField(term25441, term25441.getClass(), "dayOfMonth", null);
        setField(term25441, term25441.getClass(), "dayOfYear", null);
        setField(term25441, term25441.getClass(), "monthOfYear", null);
        setField(term25441, term25441.getClass(), "weekOfWeekyear", null);
        setField(term25441, term25441.getClass(), "weekyear", null);
        setField(term25441, term25441.getClass(), "weekyearOfCentury", null);
        setField(term25441, term25441.getClass(), "millisOfSecond", null);
        setField(term25441, term25441.getClass(), "millisOfDay", null);
        setField(term25441, term25441.getClass(), "secondOfMinute", null);
        setField(term25441, term25441.getClass(), "secondOfDay", null);
        setField(term25441, term25441.getClass(), "minuteOfHour", null);
        setField(term25441, term25441.getClass(), "minuteOfDay", null);
        setField(term25441, term25441.getClass(), "hourOfDay", term25529);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term25441;
        try {
            callMethod(klass, "assemble", argTypes, term25341, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


