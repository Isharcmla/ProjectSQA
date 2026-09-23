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

public class ZonedChronology_assemble_1604148452235 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term86649;
     Object term86749;

    public ZonedChronology_assemble_1604148452235() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term86649 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        setField(term86649, term86649.getClass(), "iParam", null);
        term86749 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term86865 = newInstance(Class.forName("org.joda.time.chrono.LimitChronology$LimitDateTimeField"));
        Object term86959 = newInstance(Class.forName("org.joda.time.field.UnsupportedDurationField"));
        Object term87043 = newInstance(Class.forName("org.joda.time.field.MillisDurationField"));
        setField(term86749, term86749.getClass(), "eras", null);
        setField(term86749, term86749.getClass(), "centuries", null);
        setField(term86749, term86749.getClass(), "years", null);
        setField(term86749, term86749.getClass(), "months", null);
        setField(term86749, term86749.getClass(), "weekyears", null);
        setField(term86749, term86749.getClass(), "weeks", null);
        setField(term86749, term86749.getClass(), "days", null);
        setField(term86749, term86749.getClass(), "halfdays", null);
        setField(term86749, term86749.getClass(), "hours", null);
        setField(term86749, term86749.getClass(), "minutes", null);
        setField(term86749, term86749.getClass(), "seconds", null);
        setField(term86749, term86749.getClass(), "millis", null);
        setField(term86749, term86749.getClass(), "year", null);
        setField(term86749, term86749.getClass(), "yearOfEra", null);
        setField(term86749, term86749.getClass(), "yearOfCentury", null);
        setField(term86749, term86749.getClass(), "centuryOfEra", null);
        setField(term86749, term86749.getClass(), "era", null);
        setField(term86749, term86749.getClass(), "dayOfWeek", null);
        setField(term86749, term86749.getClass(), "dayOfMonth", null);
        setField(term86749, term86749.getClass(), "dayOfYear", null);
        setField(term86749, term86749.getClass(), "monthOfYear", null);
        setField(term86749, term86749.getClass(), "weekOfWeekyear", null);
        setField(term86749, term86749.getClass(), "weekyear", null);
        setField(term86749, term86749.getClass(), "weekyearOfCentury", null);
        setField(term86865, term86865.getClass(), "iDurationField", null);
        setField(term86865, term86865.getClass(), "iRangeDurationField", term86959);
        setField(term86865, term86865.getClass(), "iLeapDurationField", term87043);
        setField(term86749, term86749.getClass(), "millisOfSecond", term86865);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term86749;
        try {
            callMethod(klass, "assemble", argTypes, term86649, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


