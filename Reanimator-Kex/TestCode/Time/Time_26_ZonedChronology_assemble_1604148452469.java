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

public class ZonedChronology_assemble_1604148452469 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term210849;
     Object term210949;

    public ZonedChronology_assemble_1604148452469() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term210849 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        term210949 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term211043 = newInstance(Class.forName("org.joda.time.field.UnsupportedDateTimeField"));
        Object term211131 = newInstance(Class.forName("org.joda.time.field.SkipUndoDateTimeField"));
        setField(term210949, term210949.getClass(), "eras", null);
        setField(term210949, term210949.getClass(), "centuries", null);
        setField(term210949, term210949.getClass(), "years", null);
        setField(term210949, term210949.getClass(), "months", null);
        setField(term210949, term210949.getClass(), "weekyears", null);
        setField(term210949, term210949.getClass(), "weeks", null);
        setField(term210949, term210949.getClass(), "days", null);
        setField(term210949, term210949.getClass(), "halfdays", null);
        setField(term210949, term210949.getClass(), "hours", null);
        setField(term210949, term210949.getClass(), "minutes", null);
        setField(term210949, term210949.getClass(), "seconds", null);
        setField(term210949, term210949.getClass(), "millis", null);
        setField(term210949, term210949.getClass(), "year", null);
        setField(term210949, term210949.getClass(), "yearOfEra", null);
        setField(term210949, term210949.getClass(), "yearOfCentury", null);
        setField(term210949, term210949.getClass(), "centuryOfEra", null);
        setField(term210949, term210949.getClass(), "era", null);
        setField(term210949, term210949.getClass(), "dayOfWeek", null);
        setField(term210949, term210949.getClass(), "dayOfMonth", null);
        setField(term210949, term210949.getClass(), "dayOfYear", null);
        setField(term210949, term210949.getClass(), "monthOfYear", null);
        setField(term210949, term210949.getClass(), "weekOfWeekyear", null);
        setField(term210949, term210949.getClass(), "weekyear", null);
        setField(term210949, term210949.getClass(), "weekyearOfCentury", null);
        setField(term210949, term210949.getClass(), "millisOfSecond", null);
        setField(term210949, term210949.getClass(), "millisOfDay", term211043);
        setField(term210949, term210949.getClass(), "secondOfMinute", null);
        setField(term210949, term210949.getClass(), "secondOfDay", null);
        setField(term210949, term210949.getClass(), "minuteOfHour", null);
        setField(term210949, term210949.getClass(), "minuteOfDay", null);
        setField(term210949, term210949.getClass(), "hourOfDay", null);
        setField(term210949, term210949.getClass(), "hourOfHalfday", null);
        setField(term210949, term210949.getClass(), "clockhourOfDay", null);
        setField(term210949, term210949.getClass(), "clockhourOfHalfday", null);
        setField(term210949, term210949.getClass(), "halfdayOfDay", term211131);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term210949;
        try {
            callMethod(klass, "assemble", argTypes, term210849, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


