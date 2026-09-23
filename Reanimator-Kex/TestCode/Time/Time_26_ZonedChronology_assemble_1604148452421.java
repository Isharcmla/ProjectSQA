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

public class ZonedChronology_assemble_1604148452421 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term183928;
     Object term184028;

    public ZonedChronology_assemble_1604148452421() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term183928 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        setField(term183928, term183928.getClass(), "iParam", null);
        term184028 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term184144 = newInstance(Class.forName("org.joda.time.chrono.LimitChronology$LimitDateTimeField"));
        Object term184238 = newInstance(Class.forName("org.joda.time.field.UnsupportedDurationField"));
        Object term184328 = newInstance(Class.forName("org.joda.time.field.DelegatedDurationField"));
        setField(term184028, term184028.getClass(), "eras", null);
        setField(term184028, term184028.getClass(), "centuries", null);
        setField(term184028, term184028.getClass(), "years", null);
        setField(term184028, term184028.getClass(), "months", null);
        setField(term184028, term184028.getClass(), "weekyears", null);
        setField(term184028, term184028.getClass(), "weeks", null);
        setField(term184028, term184028.getClass(), "days", null);
        setField(term184028, term184028.getClass(), "halfdays", null);
        setField(term184028, term184028.getClass(), "hours", null);
        setField(term184028, term184028.getClass(), "minutes", null);
        setField(term184028, term184028.getClass(), "seconds", null);
        setField(term184028, term184028.getClass(), "millis", null);
        setField(term184028, term184028.getClass(), "year", null);
        setField(term184028, term184028.getClass(), "yearOfEra", null);
        setField(term184028, term184028.getClass(), "yearOfCentury", null);
        setField(term184028, term184028.getClass(), "centuryOfEra", null);
        setField(term184028, term184028.getClass(), "era", null);
        setField(term184028, term184028.getClass(), "dayOfWeek", null);
        setField(term184028, term184028.getClass(), "dayOfMonth", null);
        setField(term184028, term184028.getClass(), "dayOfYear", null);
        setField(term184028, term184028.getClass(), "monthOfYear", null);
        setField(term184028, term184028.getClass(), "weekOfWeekyear", null);
        setField(term184028, term184028.getClass(), "weekyear", null);
        setField(term184028, term184028.getClass(), "weekyearOfCentury", null);
        setField(term184144, term184144.getClass(), "iDurationField", term184238);
        setField(term184144, term184144.getClass(), "iRangeDurationField", term184238);
        setField(term184144, term184144.getClass(), "iLeapDurationField", term184328);
        setField(term184028, term184028.getClass(), "millisOfSecond", term184144);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term184028;
        try {
            callMethod(klass, "assemble", argTypes, term183928, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


