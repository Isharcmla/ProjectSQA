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

public class ZonedChronology_assemble_1604148452283 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term104874;
     Object term104974;

    public ZonedChronology_assemble_1604148452283() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term104874 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        setField(term104874, term104874.getClass(), "iParam", null);
        term104974 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term105090 = newInstance(Class.forName("org.joda.time.chrono.LimitChronology$LimitDateTimeField"));
        Object term105184 = newInstance(Class.forName("org.joda.time.field.UnsupportedDurationField"));
        Object term105278 = newInstance(Class.forName("org.joda.time.field.UnsupportedDurationField"));
        setField(term104974, term104974.getClass(), "eras", null);
        setField(term104974, term104974.getClass(), "centuries", null);
        setField(term104974, term104974.getClass(), "years", null);
        setField(term104974, term104974.getClass(), "months", null);
        setField(term104974, term104974.getClass(), "weekyears", null);
        setField(term104974, term104974.getClass(), "weeks", null);
        setField(term104974, term104974.getClass(), "days", null);
        setField(term104974, term104974.getClass(), "halfdays", null);
        setField(term104974, term104974.getClass(), "hours", null);
        setField(term104974, term104974.getClass(), "minutes", null);
        setField(term104974, term104974.getClass(), "seconds", null);
        setField(term104974, term104974.getClass(), "millis", null);
        setField(term104974, term104974.getClass(), "year", null);
        setField(term104974, term104974.getClass(), "yearOfEra", null);
        setField(term104974, term104974.getClass(), "yearOfCentury", null);
        setField(term104974, term104974.getClass(), "centuryOfEra", null);
        setField(term104974, term104974.getClass(), "era", null);
        setField(term104974, term104974.getClass(), "dayOfWeek", null);
        setField(term104974, term104974.getClass(), "dayOfMonth", null);
        setField(term104974, term104974.getClass(), "dayOfYear", null);
        setField(term104974, term104974.getClass(), "monthOfYear", null);
        setField(term104974, term104974.getClass(), "weekOfWeekyear", null);
        setField(term104974, term104974.getClass(), "weekyear", null);
        setField(term104974, term104974.getClass(), "weekyearOfCentury", null);
        setField(term105090, term105090.getClass(), "iDurationField", term105184);
        setField(term105090, term105090.getClass(), "iRangeDurationField", term105278);
        setField(term104974, term104974.getClass(), "millisOfSecond", term105090);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term104974;
        try {
            callMethod(klass, "assemble", argTypes, term104874, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


