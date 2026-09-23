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

public class ZonedChronology_assemble_1604148452109 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37185;
     Object term37285;

    public ZonedChronology_assemble_1604148452109() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37185 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        setField(term37185, term37185.getClass(), "iParam", null);
        term37285 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term37401 = newInstance(Class.forName("org.joda.time.chrono.LimitChronology$LimitDateTimeField"));
        Object term37517 = newInstance(Class.forName("org.joda.time.chrono.LimitChronology$LimitDurationField"));
        setField(term37285, term37285.getClass(), "eras", null);
        setField(term37285, term37285.getClass(), "centuries", null);
        setField(term37285, term37285.getClass(), "years", null);
        setField(term37285, term37285.getClass(), "months", null);
        setField(term37285, term37285.getClass(), "weekyears", null);
        setField(term37285, term37285.getClass(), "weeks", null);
        setField(term37285, term37285.getClass(), "days", null);
        setField(term37285, term37285.getClass(), "halfdays", null);
        setField(term37285, term37285.getClass(), "hours", null);
        setField(term37285, term37285.getClass(), "minutes", null);
        setField(term37285, term37285.getClass(), "seconds", null);
        setField(term37285, term37285.getClass(), "millis", null);
        setField(term37285, term37285.getClass(), "year", null);
        setField(term37285, term37285.getClass(), "yearOfEra", null);
        setField(term37285, term37285.getClass(), "yearOfCentury", null);
        setField(term37285, term37285.getClass(), "centuryOfEra", null);
        setField(term37285, term37285.getClass(), "era", null);
        setField(term37285, term37285.getClass(), "dayOfWeek", null);
        setField(term37285, term37285.getClass(), "dayOfMonth", null);
        setField(term37285, term37285.getClass(), "dayOfYear", null);
        setField(term37285, term37285.getClass(), "monthOfYear", null);
        setField(term37285, term37285.getClass(), "weekOfWeekyear", null);
        setField(term37285, term37285.getClass(), "weekyear", null);
        setField(term37285, term37285.getClass(), "weekyearOfCentury", null);
        setField(term37401, term37401.getClass(), "iDurationField", null);
        setField(term37401, term37401.getClass(), "iRangeDurationField", null);
        setField(term37401, term37401.getClass(), "iLeapDurationField", term37517);
        setField(term37285, term37285.getClass(), "millisOfSecond", term37401);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term37285;
        try {
            callMethod(klass, "assemble", argTypes, term37185, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


