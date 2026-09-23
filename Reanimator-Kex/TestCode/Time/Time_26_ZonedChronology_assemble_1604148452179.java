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

public class ZonedChronology_assemble_1604148452179 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65746;
     Object term65846;

    public ZonedChronology_assemble_1604148452179() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term65746 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        setField(term65746, term65746.getClass(), "iParam", null);
        term65846 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term65944 = newInstance(Class.forName("org.joda.time.chrono.GJChronology$CutoverField"));
        Object term66028 = newInstance(Class.forName("org.joda.time.field.MillisDurationField"));
        setField(term65846, term65846.getClass(), "eras", null);
        setField(term65846, term65846.getClass(), "centuries", null);
        setField(term65846, term65846.getClass(), "years", null);
        setField(term65846, term65846.getClass(), "months", null);
        setField(term65846, term65846.getClass(), "weekyears", null);
        setField(term65846, term65846.getClass(), "weeks", null);
        setField(term65846, term65846.getClass(), "days", null);
        setField(term65846, term65846.getClass(), "halfdays", null);
        setField(term65846, term65846.getClass(), "hours", null);
        setField(term65846, term65846.getClass(), "minutes", null);
        setField(term65846, term65846.getClass(), "seconds", null);
        setField(term65846, term65846.getClass(), "millis", null);
        setField(term65846, term65846.getClass(), "year", null);
        setField(term65846, term65846.getClass(), "yearOfEra", null);
        setField(term65846, term65846.getClass(), "yearOfCentury", null);
        setField(term65846, term65846.getClass(), "centuryOfEra", null);
        setField(term65846, term65846.getClass(), "era", null);
        setField(term65846, term65846.getClass(), "dayOfWeek", null);
        setField(term65846, term65846.getClass(), "dayOfMonth", null);
        setField(term65846, term65846.getClass(), "dayOfYear", null);
        setField(term65846, term65846.getClass(), "monthOfYear", null);
        setField(term65846, term65846.getClass(), "weekOfWeekyear", null);
        setField(term65846, term65846.getClass(), "weekyear", null);
        setField(term65846, term65846.getClass(), "weekyearOfCentury", null);
        setField(term65846, term65846.getClass(), "millisOfSecond", null);
        setField(term65846, term65846.getClass(), "millisOfDay", null);
        setField(term65846, term65846.getClass(), "secondOfMinute", null);
        setField(term65846, term65846.getClass(), "secondOfDay", null);
        setField(term65846, term65846.getClass(), "minuteOfHour", null);
        setField(term65846, term65846.getClass(), "minuteOfDay", null);
        setField(term65846, term65846.getClass(), "hourOfDay", null);
        setField(term65846, term65846.getClass(), "hourOfHalfday", null);
        setField(term65944, term65944.getClass(), "iDurationField", term66028);
        setField(term65846, term65846.getClass(), "clockhourOfDay", term65944);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term65846;
        try {
            callMethod(klass, "assemble", argTypes, term65746, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


