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

public class ZonedChronology_assemble_1604148452171 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term62890;
     Object term62990;

    public ZonedChronology_assemble_1604148452171() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term62890 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        setField(term62890, term62890.getClass(), "iParam", null);
        term62990 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term63088 = newInstance(Class.forName("org.joda.time.chrono.GJChronology$CutoverField"));
        Object term63204 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology$ZonedDurationField"));
        setField(term62990, term62990.getClass(), "eras", null);
        setField(term62990, term62990.getClass(), "centuries", null);
        setField(term62990, term62990.getClass(), "years", null);
        setField(term62990, term62990.getClass(), "months", null);
        setField(term62990, term62990.getClass(), "weekyears", null);
        setField(term62990, term62990.getClass(), "weeks", null);
        setField(term62990, term62990.getClass(), "days", null);
        setField(term62990, term62990.getClass(), "halfdays", null);
        setField(term62990, term62990.getClass(), "hours", null);
        setField(term62990, term62990.getClass(), "minutes", null);
        setField(term62990, term62990.getClass(), "seconds", null);
        setField(term62990, term62990.getClass(), "millis", null);
        setField(term62990, term62990.getClass(), "year", null);
        setField(term62990, term62990.getClass(), "yearOfEra", null);
        setField(term62990, term62990.getClass(), "yearOfCentury", null);
        setField(term62990, term62990.getClass(), "centuryOfEra", null);
        setField(term62990, term62990.getClass(), "era", null);
        setField(term62990, term62990.getClass(), "dayOfWeek", null);
        setField(term62990, term62990.getClass(), "dayOfMonth", null);
        setField(term62990, term62990.getClass(), "dayOfYear", null);
        setField(term62990, term62990.getClass(), "monthOfYear", null);
        setField(term62990, term62990.getClass(), "weekOfWeekyear", null);
        setField(term62990, term62990.getClass(), "weekyear", null);
        setField(term62990, term62990.getClass(), "weekyearOfCentury", null);
        setField(term62990, term62990.getClass(), "millisOfSecond", null);
        setField(term62990, term62990.getClass(), "millisOfDay", null);
        setField(term62990, term62990.getClass(), "secondOfMinute", null);
        setField(term62990, term62990.getClass(), "secondOfDay", null);
        setField(term62990, term62990.getClass(), "minuteOfHour", null);
        setField(term62990, term62990.getClass(), "minuteOfDay", null);
        setField(term62990, term62990.getClass(), "hourOfDay", null);
        setField(term62990, term62990.getClass(), "hourOfHalfday", null);
        setField(term63088, term63088.getClass(), "iDurationField", null);
        setField(term63088, term63088.getClass(), "iRangeDurationField", term63204);
        setField(term62990, term62990.getClass(), "clockhourOfDay", term63088);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term62990;
        try {
            callMethod(klass, "assemble", argTypes, term62890, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


