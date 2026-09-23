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

public class ZonedChronology_assemble_1604148452465 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term207705;
     Object term207805;

    public ZonedChronology_assemble_1604148452465() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term207705 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        setField(term207705, term207705.getClass(), "iParam", null);
        term207805 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term207899 = newInstance(Class.forName("org.joda.time.field.UnsupportedDateTimeField"));
        Object term208015 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField"));
        Object term208105 = newInstance(Class.forName("org.joda.time.field.DelegatedDurationField"));
        setField(term207805, term207805.getClass(), "eras", null);
        setField(term207805, term207805.getClass(), "centuries", null);
        setField(term207805, term207805.getClass(), "years", null);
        setField(term207805, term207805.getClass(), "months", null);
        setField(term207805, term207805.getClass(), "weekyears", null);
        setField(term207805, term207805.getClass(), "weeks", null);
        setField(term207805, term207805.getClass(), "days", null);
        setField(term207805, term207805.getClass(), "halfdays", null);
        setField(term207805, term207805.getClass(), "hours", null);
        setField(term207805, term207805.getClass(), "minutes", null);
        setField(term207805, term207805.getClass(), "seconds", null);
        setField(term207805, term207805.getClass(), "millis", null);
        setField(term207805, term207805.getClass(), "year", null);
        setField(term207805, term207805.getClass(), "yearOfEra", null);
        setField(term207805, term207805.getClass(), "yearOfCentury", null);
        setField(term207805, term207805.getClass(), "centuryOfEra", null);
        setField(term207805, term207805.getClass(), "era", null);
        setField(term207805, term207805.getClass(), "dayOfWeek", null);
        setField(term207805, term207805.getClass(), "dayOfMonth", null);
        setField(term207805, term207805.getClass(), "dayOfYear", null);
        setField(term207805, term207805.getClass(), "monthOfYear", null);
        setField(term207805, term207805.getClass(), "weekOfWeekyear", null);
        setField(term207805, term207805.getClass(), "weekyear", null);
        setField(term207805, term207805.getClass(), "weekyearOfCentury", null);
        setField(term207805, term207805.getClass(), "millisOfSecond", null);
        setField(term207805, term207805.getClass(), "millisOfDay", term207899);
        setField(term207805, term207805.getClass(), "secondOfMinute", null);
        setField(term207805, term207805.getClass(), "secondOfDay", null);
        setField(term207805, term207805.getClass(), "minuteOfHour", null);
        setField(term207805, term207805.getClass(), "minuteOfDay", null);
        setField(term207805, term207805.getClass(), "hourOfDay", null);
        setField(term207805, term207805.getClass(), "hourOfHalfday", null);
        setField(term207805, term207805.getClass(), "clockhourOfDay", null);
        setField(term208015, term208015.getClass(), "iDurationField", null);
        setField(term208015, term208015.getClass(), "iRangeDurationField", null);
        setField(term208015, term208015.getClass(), "iLeapDurationField", term208105);
        setField(term207805, term207805.getClass(), "clockhourOfHalfday", term208015);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term207805;
        try {
            callMethod(klass, "assemble", argTypes, term207705, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


