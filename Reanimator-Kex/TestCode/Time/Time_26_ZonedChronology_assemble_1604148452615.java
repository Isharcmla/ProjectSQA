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

public class ZonedChronology_assemble_1604148452615 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term279101;
     Object term279295;

    public ZonedChronology_assemble_1604148452615() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term279101 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term279195 = newInstance(Class.forName("org.joda.time.tz.DateTimeZoneBuilder$DSTZone"));
        setField(term279101, term279101.getClass(), "iParam", term279195);
        term279295 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term279411 = newInstance(Class.forName("org.joda.time.chrono.LimitChronology$LimitDateTimeField"));
        Object term279501 = newInstance(Class.forName("org.joda.time.field.DelegatedDurationField"));
        setField(term279295, term279295.getClass(), "eras", null);
        setField(term279295, term279295.getClass(), "centuries", null);
        setField(term279295, term279295.getClass(), "years", null);
        setField(term279295, term279295.getClass(), "months", null);
        setField(term279295, term279295.getClass(), "weekyears", null);
        setField(term279295, term279295.getClass(), "weeks", null);
        setField(term279295, term279295.getClass(), "days", null);
        setField(term279295, term279295.getClass(), "halfdays", null);
        setField(term279295, term279295.getClass(), "hours", null);
        setField(term279295, term279295.getClass(), "minutes", null);
        setField(term279295, term279295.getClass(), "seconds", null);
        setField(term279295, term279295.getClass(), "millis", null);
        setField(term279295, term279295.getClass(), "year", null);
        setField(term279295, term279295.getClass(), "yearOfEra", null);
        setField(term279295, term279295.getClass(), "yearOfCentury", null);
        setField(term279295, term279295.getClass(), "centuryOfEra", null);
        setField(term279295, term279295.getClass(), "era", null);
        setField(term279295, term279295.getClass(), "dayOfWeek", null);
        setField(term279295, term279295.getClass(), "dayOfMonth", null);
        setField(term279295, term279295.getClass(), "dayOfYear", null);
        setField(term279295, term279295.getClass(), "monthOfYear", null);
        setField(term279295, term279295.getClass(), "weekOfWeekyear", null);
        setField(term279295, term279295.getClass(), "weekyear", null);
        setField(term279295, term279295.getClass(), "weekyearOfCentury", null);
        setField(term279411, term279411.getClass(), "iDurationField", null);
        setField(term279411, term279411.getClass(), "iRangeDurationField", null);
        setField(term279411, term279411.getClass(), "iLeapDurationField", term279501);
        setField(term279295, term279295.getClass(), "millisOfSecond", term279411);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term279295;
        try {
            callMethod(klass, "assemble", argTypes, term279101, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


