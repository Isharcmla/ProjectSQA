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

public class ZonedChronology_assemble_1604148452659 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term343234;
     Object term343334;

    public ZonedChronology_assemble_1604148452659() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term343234 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        setField(term343234, term343234.getClass(), "iParam", null);
        term343334 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term343450 = newInstance(Class.forName("org.joda.time.chrono.LimitChronology$LimitDateTimeField"));
        Object term343544 = newInstance(Class.forName("org.joda.time.field.UnsupportedDurationField"));
        Object term343664 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term343780 = newInstance(Class.forName("org.joda.time.chrono.LimitChronology$LimitDateTimeField"));
        setField(term343334, term343334.getClass(), "eras", null);
        setField(term343334, term343334.getClass(), "centuries", null);
        setField(term343334, term343334.getClass(), "years", null);
        setField(term343334, term343334.getClass(), "months", null);
        setField(term343334, term343334.getClass(), "weekyears", null);
        setField(term343334, term343334.getClass(), "weeks", null);
        setField(term343334, term343334.getClass(), "days", null);
        setField(term343334, term343334.getClass(), "halfdays", null);
        setField(term343334, term343334.getClass(), "hours", null);
        setField(term343334, term343334.getClass(), "minutes", null);
        setField(term343334, term343334.getClass(), "seconds", null);
        setField(term343334, term343334.getClass(), "millis", null);
        setField(term343334, term343334.getClass(), "year", null);
        setField(term343334, term343334.getClass(), "yearOfEra", null);
        setField(term343334, term343334.getClass(), "yearOfCentury", null);
        setField(term343334, term343334.getClass(), "centuryOfEra", null);
        setField(term343334, term343334.getClass(), "era", null);
        setField(term343334, term343334.getClass(), "dayOfWeek", null);
        setField(term343334, term343334.getClass(), "dayOfMonth", null);
        setField(term343334, term343334.getClass(), "dayOfYear", null);
        setField(term343334, term343334.getClass(), "monthOfYear", null);
        setField(term343334, term343334.getClass(), "weekOfWeekyear", null);
        setField(term343334, term343334.getClass(), "weekyear", null);
        setField(term343334, term343334.getClass(), "weekyearOfCentury", null);
        setField(term343450, term343450.getClass(), "iDurationField", term343544);
        setField(term343450, term343450.getClass(), "iRangeDurationField", null);
        setField(term343450, term343450.getClass(), "iLeapDurationField", null);
        setField(term343450, term343450.getClass(), "iType", term343664);
        setField(term343334, term343334.getClass(), "millisOfSecond", term343450);
        setField(term343334, term343334.getClass(), "millisOfDay", term343780);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term343334;
        try {
            callMethod(klass, "assemble", argTypes, term343234, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


