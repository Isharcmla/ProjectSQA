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

public class ZonedChronology_assemble_1604148452557 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term253449;
     Object term253549;

    public ZonedChronology_assemble_1604148452557() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term253449 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        setField(term253449, term253449.getClass(), "iParam", null);
        term253549 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term253643 = newInstance(Class.forName("org.joda.time.field.UnsupportedDateTimeField"));
        Object term253759 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField"));
        Object term253875 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology$ZonedDurationField"));
        Object term253995 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        setField(term253549, term253549.getClass(), "eras", null);
        setField(term253549, term253549.getClass(), "centuries", null);
        setField(term253549, term253549.getClass(), "years", null);
        setField(term253549, term253549.getClass(), "months", null);
        setField(term253549, term253549.getClass(), "weekyears", null);
        setField(term253549, term253549.getClass(), "weeks", null);
        setField(term253549, term253549.getClass(), "days", null);
        setField(term253549, term253549.getClass(), "halfdays", null);
        setField(term253549, term253549.getClass(), "hours", null);
        setField(term253549, term253549.getClass(), "minutes", null);
        setField(term253549, term253549.getClass(), "seconds", null);
        setField(term253549, term253549.getClass(), "millis", null);
        setField(term253549, term253549.getClass(), "year", null);
        setField(term253549, term253549.getClass(), "yearOfEra", null);
        setField(term253549, term253549.getClass(), "yearOfCentury", null);
        setField(term253549, term253549.getClass(), "centuryOfEra", null);
        setField(term253549, term253549.getClass(), "era", null);
        setField(term253549, term253549.getClass(), "dayOfWeek", null);
        setField(term253549, term253549.getClass(), "dayOfMonth", null);
        setField(term253549, term253549.getClass(), "dayOfYear", null);
        setField(term253549, term253549.getClass(), "monthOfYear", null);
        setField(term253549, term253549.getClass(), "weekOfWeekyear", null);
        setField(term253549, term253549.getClass(), "weekyear", null);
        setField(term253549, term253549.getClass(), "weekyearOfCentury", null);
        setField(term253549, term253549.getClass(), "millisOfSecond", null);
        setField(term253549, term253549.getClass(), "millisOfDay", term253643);
        setField(term253549, term253549.getClass(), "secondOfMinute", null);
        setField(term253549, term253549.getClass(), "secondOfDay", null);
        setField(term253549, term253549.getClass(), "minuteOfHour", null);
        setField(term253759, term253759.getClass(), "iDurationField", null);
        setField(term253759, term253759.getClass(), "iRangeDurationField", null);
        setField(term253875, term253875.getClass(), "iType", term253995);
        setField(term253759, term253759.getClass(), "iLeapDurationField", term253875);
        setField(term253549, term253549.getClass(), "minuteOfDay", term253759);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term253549;
        try {
            callMethod(klass, "assemble", argTypes, term253449, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


