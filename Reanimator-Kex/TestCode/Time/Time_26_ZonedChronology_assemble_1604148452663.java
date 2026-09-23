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

public class ZonedChronology_assemble_1604148452663 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term345399;
     Object term345499;

    public ZonedChronology_assemble_1604148452663() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term345399 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        setField(term345399, term345399.getClass(), "iParam", null);
        term345499 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term345593 = newInstance(Class.forName("org.joda.time.field.UnsupportedDateTimeField"));
        Object term345709 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField"));
        Object term345829 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term345917 = newInstance(Class.forName("org.joda.time.field.SkipUndoDateTimeField"));
        setField(term345499, term345499.getClass(), "eras", null);
        setField(term345499, term345499.getClass(), "centuries", null);
        setField(term345499, term345499.getClass(), "years", null);
        setField(term345499, term345499.getClass(), "months", null);
        setField(term345499, term345499.getClass(), "weekyears", null);
        setField(term345499, term345499.getClass(), "weeks", null);
        setField(term345499, term345499.getClass(), "days", null);
        setField(term345499, term345499.getClass(), "halfdays", null);
        setField(term345499, term345499.getClass(), "hours", null);
        setField(term345499, term345499.getClass(), "minutes", null);
        setField(term345499, term345499.getClass(), "seconds", null);
        setField(term345499, term345499.getClass(), "millis", null);
        setField(term345499, term345499.getClass(), "year", null);
        setField(term345499, term345499.getClass(), "yearOfEra", null);
        setField(term345499, term345499.getClass(), "yearOfCentury", null);
        setField(term345499, term345499.getClass(), "centuryOfEra", null);
        setField(term345499, term345499.getClass(), "era", null);
        setField(term345499, term345499.getClass(), "dayOfWeek", null);
        setField(term345499, term345499.getClass(), "dayOfMonth", null);
        setField(term345499, term345499.getClass(), "dayOfYear", null);
        setField(term345499, term345499.getClass(), "monthOfYear", null);
        setField(term345499, term345499.getClass(), "weekOfWeekyear", null);
        setField(term345499, term345499.getClass(), "weekyear", null);
        setField(term345499, term345499.getClass(), "weekyearOfCentury", null);
        setField(term345499, term345499.getClass(), "millisOfSecond", null);
        setField(term345499, term345499.getClass(), "millisOfDay", term345593);
        setField(term345499, term345499.getClass(), "secondOfMinute", null);
        setField(term345499, term345499.getClass(), "secondOfDay", null);
        setField(term345499, term345499.getClass(), "minuteOfHour", null);
        setField(term345709, term345709.getClass(), "iDurationField", null);
        setField(term345709, term345709.getClass(), "iRangeDurationField", null);
        setField(term345709, term345709.getClass(), "iLeapDurationField", null);
        setField(term345709, term345709.getClass(), "iType", term345829);
        setField(term345499, term345499.getClass(), "minuteOfDay", term345709);
        setField(term345499, term345499.getClass(), "hourOfDay", null);
        setField(term345499, term345499.getClass(), "hourOfHalfday", null);
        setField(term345499, term345499.getClass(), "clockhourOfDay", null);
        setField(term345499, term345499.getClass(), "clockhourOfHalfday", term345917);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term345499;
        try {
            callMethod(klass, "assemble", argTypes, term345399, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


