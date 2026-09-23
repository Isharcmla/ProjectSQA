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

public class ZonedChronology_assemble_1604148452437 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term190515;
     Object term190615;

    public ZonedChronology_assemble_1604148452437() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term190515 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        setField(term190515, term190515.getClass(), "iParam", null);
        term190615 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term190709 = newInstance(Class.forName("org.joda.time.field.UnsupportedDateTimeField"));
        Object term190825 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField"));
        Object term190955 = newInstance(Class.forName("org.joda.time.field.ImpreciseDateTimeField$LinkedDurationField"));
        setField(term190615, term190615.getClass(), "eras", null);
        setField(term190615, term190615.getClass(), "centuries", null);
        setField(term190615, term190615.getClass(), "years", null);
        setField(term190615, term190615.getClass(), "months", null);
        setField(term190615, term190615.getClass(), "weekyears", null);
        setField(term190615, term190615.getClass(), "weeks", null);
        setField(term190615, term190615.getClass(), "days", null);
        setField(term190615, term190615.getClass(), "halfdays", null);
        setField(term190615, term190615.getClass(), "hours", null);
        setField(term190615, term190615.getClass(), "minutes", null);
        setField(term190615, term190615.getClass(), "seconds", null);
        setField(term190615, term190615.getClass(), "millis", null);
        setField(term190615, term190615.getClass(), "year", null);
        setField(term190615, term190615.getClass(), "yearOfEra", null);
        setField(term190615, term190615.getClass(), "yearOfCentury", null);
        setField(term190615, term190615.getClass(), "centuryOfEra", null);
        setField(term190615, term190615.getClass(), "era", null);
        setField(term190615, term190615.getClass(), "dayOfWeek", null);
        setField(term190615, term190615.getClass(), "dayOfMonth", null);
        setField(term190615, term190615.getClass(), "dayOfYear", null);
        setField(term190615, term190615.getClass(), "monthOfYear", null);
        setField(term190615, term190615.getClass(), "weekOfWeekyear", null);
        setField(term190615, term190615.getClass(), "weekyear", null);
        setField(term190615, term190615.getClass(), "weekyearOfCentury", null);
        setField(term190615, term190615.getClass(), "millisOfSecond", null);
        setField(term190615, term190615.getClass(), "millisOfDay", term190709);
        setField(term190615, term190615.getClass(), "secondOfMinute", null);
        setField(term190615, term190615.getClass(), "secondOfDay", null);
        setField(term190615, term190615.getClass(), "minuteOfHour", null);
        setField(term190615, term190615.getClass(), "minuteOfDay", null);
        setField(term190615, term190615.getClass(), "hourOfDay", null);
        setField(term190615, term190615.getClass(), "hourOfHalfday", null);
        setField(term190615, term190615.getClass(), "clockhourOfDay", null);
        setField(term190825, term190825.getClass(), "iDurationField", null);
        setField(term190825, term190825.getClass(), "iRangeDurationField", term190955);
        setField(term190615, term190615.getClass(), "clockhourOfHalfday", term190825);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term190615;
        try {
            callMethod(klass, "assemble", argTypes, term190515, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


