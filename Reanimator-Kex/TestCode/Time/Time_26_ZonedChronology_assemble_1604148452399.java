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

public class ZonedChronology_assemble_1604148452399 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term174526;
     Object term174702;

    public ZonedChronology_assemble_1604148452399() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term174526 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term174602 = newInstance(Class.forName("org.joda.time.tz.CachedDateTimeZone"));
        setField(term174526, term174526.getClass(), "iParam", term174602);
        term174702 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term174788 = newInstance(Class.forName("org.joda.time.field.PreciseDateTimeField"));
        setField(term174702, term174702.getClass(), "eras", null);
        setField(term174702, term174702.getClass(), "centuries", null);
        setField(term174702, term174702.getClass(), "years", null);
        setField(term174702, term174702.getClass(), "months", null);
        setField(term174702, term174702.getClass(), "weekyears", null);
        setField(term174702, term174702.getClass(), "weeks", null);
        setField(term174702, term174702.getClass(), "days", null);
        setField(term174702, term174702.getClass(), "halfdays", null);
        setField(term174702, term174702.getClass(), "hours", null);
        setField(term174702, term174702.getClass(), "minutes", null);
        setField(term174702, term174702.getClass(), "seconds", null);
        setField(term174702, term174702.getClass(), "millis", null);
        setField(term174702, term174702.getClass(), "year", null);
        setField(term174702, term174702.getClass(), "yearOfEra", null);
        setField(term174702, term174702.getClass(), "yearOfCentury", null);
        setField(term174702, term174702.getClass(), "centuryOfEra", null);
        setField(term174702, term174702.getClass(), "era", null);
        setField(term174702, term174702.getClass(), "dayOfWeek", null);
        setField(term174702, term174702.getClass(), "dayOfMonth", null);
        setField(term174702, term174702.getClass(), "dayOfYear", null);
        setField(term174702, term174702.getClass(), "monthOfYear", null);
        setField(term174702, term174702.getClass(), "weekOfWeekyear", null);
        setField(term174702, term174702.getClass(), "weekyear", null);
        setField(term174702, term174702.getClass(), "weekyearOfCentury", null);
        setField(term174702, term174702.getClass(), "millisOfSecond", null);
        setField(term174702, term174702.getClass(), "millisOfDay", null);
        setField(term174702, term174702.getClass(), "secondOfMinute", term174788);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term174702;
        try {
            callMethod(klass, "assemble", argTypes, term174526, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


