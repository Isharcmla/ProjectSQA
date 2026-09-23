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

public class ZonedChronology_assemble_1604148452441 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term192365;
     Object term192539;

    public ZonedChronology_assemble_1604148452441() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term192365 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term192439 = newInstance(Class.forName("org.joda.time.tz.FixedDateTimeZone"));
        setField(term192365, term192365.getClass(), "iParam", term192439);
        term192539 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term192625 = newInstance(Class.forName("org.joda.time.field.PreciseDateTimeField"));
        Object term192715 = newInstance(Class.forName("org.joda.time.field.DecoratedDurationField"));
        setField(term192539, term192539.getClass(), "eras", null);
        setField(term192539, term192539.getClass(), "centuries", null);
        setField(term192539, term192539.getClass(), "years", null);
        setField(term192539, term192539.getClass(), "months", null);
        setField(term192539, term192539.getClass(), "weekyears", null);
        setField(term192539, term192539.getClass(), "weeks", null);
        setField(term192539, term192539.getClass(), "days", null);
        setField(term192539, term192539.getClass(), "halfdays", null);
        setField(term192539, term192539.getClass(), "hours", null);
        setField(term192539, term192539.getClass(), "minutes", null);
        setField(term192539, term192539.getClass(), "seconds", null);
        setField(term192539, term192539.getClass(), "millis", null);
        setField(term192539, term192539.getClass(), "year", null);
        setField(term192539, term192539.getClass(), "yearOfEra", null);
        setField(term192539, term192539.getClass(), "yearOfCentury", null);
        setField(term192539, term192539.getClass(), "centuryOfEra", null);
        setField(term192539, term192539.getClass(), "era", null);
        setField(term192539, term192539.getClass(), "dayOfWeek", null);
        setField(term192539, term192539.getClass(), "dayOfMonth", null);
        setField(term192539, term192539.getClass(), "dayOfYear", null);
        setField(term192539, term192539.getClass(), "monthOfYear", null);
        setField(term192539, term192539.getClass(), "weekOfWeekyear", null);
        setField(term192539, term192539.getClass(), "weekyear", null);
        setField(term192539, term192539.getClass(), "weekyearOfCentury", null);
        setField(term192539, term192539.getClass(), "millisOfSecond", null);
        setField(term192539, term192539.getClass(), "millisOfDay", null);
        setField(term192625, term192625.getClass(), "iUnitField", null);
        setField(term192625, term192625.getClass(), "iRangeField", term192715);
        setField(term192539, term192539.getClass(), "secondOfMinute", term192625);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term192539;
        try {
            callMethod(klass, "assemble", argTypes, term192365, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


