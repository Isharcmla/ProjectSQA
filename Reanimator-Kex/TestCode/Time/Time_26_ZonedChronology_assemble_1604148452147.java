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

public class ZonedChronology_assemble_1604148452147 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50608;
     Object term50708;

    public ZonedChronology_assemble_1604148452147() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term50608 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        setField(term50608, term50608.getClass(), "iParam", null);
        term50708 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term50820 = newInstance(Class.forName("org.joda.time.chrono.BasicWeekOfWeekyearDateTimeField"));
        Object term50910 = newInstance(Class.forName("org.joda.time.field.DelegatedDurationField"));
        setField(term50708, term50708.getClass(), "eras", null);
        setField(term50708, term50708.getClass(), "centuries", null);
        setField(term50708, term50708.getClass(), "years", null);
        setField(term50708, term50708.getClass(), "months", null);
        setField(term50708, term50708.getClass(), "weekyears", null);
        setField(term50708, term50708.getClass(), "weeks", null);
        setField(term50708, term50708.getClass(), "days", null);
        setField(term50708, term50708.getClass(), "halfdays", null);
        setField(term50708, term50708.getClass(), "hours", null);
        setField(term50708, term50708.getClass(), "minutes", null);
        setField(term50708, term50708.getClass(), "seconds", null);
        setField(term50708, term50708.getClass(), "millis", null);
        setField(term50708, term50708.getClass(), "year", null);
        setField(term50708, term50708.getClass(), "yearOfEra", null);
        setField(term50708, term50708.getClass(), "yearOfCentury", null);
        setField(term50708, term50708.getClass(), "centuryOfEra", null);
        setField(term50708, term50708.getClass(), "era", null);
        setField(term50708, term50708.getClass(), "dayOfWeek", null);
        setField(term50708, term50708.getClass(), "dayOfMonth", null);
        setField(term50708, term50708.getClass(), "dayOfYear", null);
        setField(term50708, term50708.getClass(), "monthOfYear", null);
        setField(term50708, term50708.getClass(), "weekOfWeekyear", null);
        setField(term50708, term50708.getClass(), "weekyear", null);
        setField(term50708, term50708.getClass(), "weekyearOfCentury", null);
        setField(term50708, term50708.getClass(), "millisOfSecond", null);
        setField(term50708, term50708.getClass(), "millisOfDay", null);
        setField(term50708, term50708.getClass(), "secondOfMinute", null);
        setField(term50708, term50708.getClass(), "secondOfDay", null);
        setField(term50708, term50708.getClass(), "minuteOfHour", null);
        setField(term50820, term50820.getClass(), "iUnitField", term50910);
        setField(term50708, term50708.getClass(), "minuteOfDay", term50820);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term50708;
        try {
            callMethod(klass, "assemble", argTypes, term50608, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


