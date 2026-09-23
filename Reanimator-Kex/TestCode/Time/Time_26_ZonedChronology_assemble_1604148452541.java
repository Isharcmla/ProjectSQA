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

public class ZonedChronology_assemble_1604148452541 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term246729;
     Object term246829;

    public ZonedChronology_assemble_1604148452541() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term246729 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        setField(term246729, term246729.getClass(), "iParam", null);
        term246829 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term246915 = newInstance(Class.forName("org.joda.time.field.PreciseDateTimeField"));
        Object term247045 = newInstance(Class.forName("org.joda.time.field.ImpreciseDateTimeField$LinkedDurationField"));
        Object term247165 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        setField(term246829, term246829.getClass(), "eras", null);
        setField(term246829, term246829.getClass(), "centuries", null);
        setField(term246829, term246829.getClass(), "years", null);
        setField(term246829, term246829.getClass(), "months", null);
        setField(term246829, term246829.getClass(), "weekyears", null);
        setField(term246829, term246829.getClass(), "weeks", null);
        setField(term246829, term246829.getClass(), "days", null);
        setField(term246829, term246829.getClass(), "halfdays", null);
        setField(term246829, term246829.getClass(), "hours", null);
        setField(term246829, term246829.getClass(), "minutes", null);
        setField(term246829, term246829.getClass(), "seconds", null);
        setField(term246829, term246829.getClass(), "millis", null);
        setField(term246829, term246829.getClass(), "year", null);
        setField(term246829, term246829.getClass(), "yearOfEra", null);
        setField(term246829, term246829.getClass(), "yearOfCentury", null);
        setField(term246829, term246829.getClass(), "centuryOfEra", null);
        setField(term246829, term246829.getClass(), "era", null);
        setField(term246829, term246829.getClass(), "dayOfWeek", null);
        setField(term246829, term246829.getClass(), "dayOfMonth", null);
        setField(term246829, term246829.getClass(), "dayOfYear", null);
        setField(term246829, term246829.getClass(), "monthOfYear", null);
        setField(term246829, term246829.getClass(), "weekOfWeekyear", null);
        setField(term246829, term246829.getClass(), "weekyear", null);
        setField(term246829, term246829.getClass(), "weekyearOfCentury", null);
        setField(term246829, term246829.getClass(), "millisOfSecond", null);
        setField(term246829, term246829.getClass(), "millisOfDay", null);
        setField(term246915, term246915.getClass(), "iUnitField", null);
        setField(term247045, term247045.getClass(), "iType", term247165);
        setField(term246915, term246915.getClass(), "iRangeField", term247045);
        setField(term246829, term246829.getClass(), "secondOfMinute", term246915);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term246829;
        try {
            callMethod(klass, "assemble", argTypes, term246729, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


