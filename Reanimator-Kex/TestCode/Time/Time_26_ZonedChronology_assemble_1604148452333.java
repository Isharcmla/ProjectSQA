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

public class ZonedChronology_assemble_1604148452333 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term125836;
     Object term125936;

    public ZonedChronology_assemble_1604148452333() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term125836 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        setField(term125836, term125836.getClass(), "iParam", null);
        term125936 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term126052 = newInstance(Class.forName("org.joda.time.chrono.LimitChronology$LimitDateTimeField"));
        Object term126146 = newInstance(Class.forName("org.joda.time.field.UnsupportedDurationField"));
        Object term126236 = newInstance(Class.forName("org.joda.time.field.DelegatedDurationField"));
        setField(term125936, term125936.getClass(), "eras", null);
        setField(term125936, term125936.getClass(), "centuries", null);
        setField(term125936, term125936.getClass(), "years", null);
        setField(term125936, term125936.getClass(), "months", null);
        setField(term125936, term125936.getClass(), "weekyears", null);
        setField(term125936, term125936.getClass(), "weeks", null);
        setField(term125936, term125936.getClass(), "days", null);
        setField(term125936, term125936.getClass(), "halfdays", null);
        setField(term125936, term125936.getClass(), "hours", null);
        setField(term125936, term125936.getClass(), "minutes", null);
        setField(term125936, term125936.getClass(), "seconds", null);
        setField(term125936, term125936.getClass(), "millis", null);
        setField(term125936, term125936.getClass(), "year", null);
        setField(term125936, term125936.getClass(), "yearOfEra", null);
        setField(term125936, term125936.getClass(), "yearOfCentury", null);
        setField(term125936, term125936.getClass(), "centuryOfEra", null);
        setField(term125936, term125936.getClass(), "era", null);
        setField(term125936, term125936.getClass(), "dayOfWeek", null);
        setField(term125936, term125936.getClass(), "dayOfMonth", null);
        setField(term125936, term125936.getClass(), "dayOfYear", null);
        setField(term125936, term125936.getClass(), "monthOfYear", null);
        setField(term125936, term125936.getClass(), "weekOfWeekyear", null);
        setField(term125936, term125936.getClass(), "weekyear", null);
        setField(term125936, term125936.getClass(), "weekyearOfCentury", null);
        setField(term126052, term126052.getClass(), "iDurationField", term126146);
        setField(term126052, term126052.getClass(), "iRangeDurationField", null);
        setField(term126052, term126052.getClass(), "iLeapDurationField", term126236);
        setField(term125936, term125936.getClass(), "millisOfSecond", term126052);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term125936;
        try {
            callMethod(klass, "assemble", argTypes, term125836, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


