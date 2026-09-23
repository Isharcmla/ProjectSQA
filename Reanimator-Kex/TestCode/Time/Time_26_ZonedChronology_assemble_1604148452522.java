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

public class ZonedChronology_assemble_1604148452522 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term238211;
     Object term238389;

    public ZonedChronology_assemble_1604148452522() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term238211 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term238289 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        setField(term238211, term238211.getClass(), "iParam", term238289);
        term238389 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term238483 = newInstance(Class.forName("org.joda.time.field.UnsupportedDateTimeField"));
        Object term238587 = newInstance(Class.forName("org.joda.time.chrono.BasicChronology$HalfdayField"));
        setField(term238389, term238389.getClass(), "eras", null);
        setField(term238389, term238389.getClass(), "centuries", null);
        setField(term238389, term238389.getClass(), "years", null);
        setField(term238389, term238389.getClass(), "months", null);
        setField(term238389, term238389.getClass(), "weekyears", null);
        setField(term238389, term238389.getClass(), "weeks", null);
        setField(term238389, term238389.getClass(), "days", null);
        setField(term238389, term238389.getClass(), "halfdays", null);
        setField(term238389, term238389.getClass(), "hours", null);
        setField(term238389, term238389.getClass(), "minutes", null);
        setField(term238389, term238389.getClass(), "seconds", null);
        setField(term238389, term238389.getClass(), "millis", null);
        setField(term238389, term238389.getClass(), "year", null);
        setField(term238389, term238389.getClass(), "yearOfEra", null);
        setField(term238389, term238389.getClass(), "yearOfCentury", null);
        setField(term238389, term238389.getClass(), "centuryOfEra", null);
        setField(term238389, term238389.getClass(), "era", null);
        setField(term238389, term238389.getClass(), "dayOfWeek", null);
        setField(term238389, term238389.getClass(), "dayOfMonth", null);
        setField(term238389, term238389.getClass(), "dayOfYear", null);
        setField(term238389, term238389.getClass(), "monthOfYear", null);
        setField(term238389, term238389.getClass(), "weekOfWeekyear", null);
        setField(term238389, term238389.getClass(), "weekyear", null);
        setField(term238389, term238389.getClass(), "weekyearOfCentury", null);
        setField(term238389, term238389.getClass(), "millisOfSecond", null);
        setField(term238389, term238389.getClass(), "millisOfDay", term238483);
        setField(term238389, term238389.getClass(), "secondOfMinute", null);
        setField(term238389, term238389.getClass(), "secondOfDay", null);
        setField(term238389, term238389.getClass(), "minuteOfHour", term238587);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term238389;
        try {
            callMethod(klass, "assemble", argTypes, term238211, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


