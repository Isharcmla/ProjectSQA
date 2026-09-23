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

public class ZonedChronology_assemble_1604148452291 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term107765;
     Object term107865;

    public ZonedChronology_assemble_1604148452291() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term107765 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        term107865 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term107949 = newInstance(Class.forName("org.joda.time.field.StrictDateTimeField"));
        setField(term107865, term107865.getClass(), "eras", null);
        setField(term107865, term107865.getClass(), "centuries", null);
        setField(term107865, term107865.getClass(), "years", null);
        setField(term107865, term107865.getClass(), "months", null);
        setField(term107865, term107865.getClass(), "weekyears", null);
        setField(term107865, term107865.getClass(), "weeks", null);
        setField(term107865, term107865.getClass(), "days", null);
        setField(term107865, term107865.getClass(), "halfdays", null);
        setField(term107865, term107865.getClass(), "hours", null);
        setField(term107865, term107865.getClass(), "minutes", null);
        setField(term107865, term107865.getClass(), "seconds", null);
        setField(term107865, term107865.getClass(), "millis", null);
        setField(term107865, term107865.getClass(), "year", null);
        setField(term107865, term107865.getClass(), "yearOfEra", null);
        setField(term107865, term107865.getClass(), "yearOfCentury", null);
        setField(term107865, term107865.getClass(), "centuryOfEra", null);
        setField(term107865, term107865.getClass(), "era", null);
        setField(term107865, term107865.getClass(), "dayOfWeek", null);
        setField(term107865, term107865.getClass(), "dayOfMonth", null);
        setField(term107865, term107865.getClass(), "dayOfYear", null);
        setField(term107865, term107865.getClass(), "monthOfYear", null);
        setField(term107865, term107865.getClass(), "weekOfWeekyear", null);
        setField(term107865, term107865.getClass(), "weekyear", null);
        setField(term107865, term107865.getClass(), "weekyearOfCentury", null);
        setField(term107865, term107865.getClass(), "millisOfSecond", null);
        setField(term107865, term107865.getClass(), "millisOfDay", null);
        setField(term107865, term107865.getClass(), "secondOfMinute", null);
        setField(term107865, term107865.getClass(), "secondOfDay", null);
        setField(term107865, term107865.getClass(), "minuteOfHour", null);
        setField(term107865, term107865.getClass(), "minuteOfDay", null);
        setField(term107865, term107865.getClass(), "hourOfDay", term107949);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term107865;
        try {
            callMethod(klass, "assemble", argTypes, term107765, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


