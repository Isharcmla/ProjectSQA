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
import java.lang.ClassCastException;
import static org.joda.time.chrono.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ZonedChronology_assemble_1604148452187 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term68332;
     Object term68510;

    public ZonedChronology_assemble_1604148452187() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term68332 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term68410 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        setField(term68332, term68332.getClass(), "iParam", term68410);
        term68510 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term68600 = newInstance(Class.forName("org.joda.time.field.ZeroIsMaxDateTimeField"));
        setField(term68510, term68510.getClass(), "eras", null);
        setField(term68510, term68510.getClass(), "centuries", null);
        setField(term68510, term68510.getClass(), "years", null);
        setField(term68510, term68510.getClass(), "months", null);
        setField(term68510, term68510.getClass(), "weekyears", null);
        setField(term68510, term68510.getClass(), "weeks", null);
        setField(term68510, term68510.getClass(), "days", null);
        setField(term68510, term68510.getClass(), "halfdays", null);
        setField(term68510, term68510.getClass(), "hours", null);
        setField(term68510, term68510.getClass(), "minutes", null);
        setField(term68510, term68510.getClass(), "seconds", null);
        setField(term68510, term68510.getClass(), "millis", null);
        setField(term68510, term68510.getClass(), "year", null);
        setField(term68510, term68510.getClass(), "yearOfEra", null);
        setField(term68510, term68510.getClass(), "yearOfCentury", null);
        setField(term68510, term68510.getClass(), "centuryOfEra", null);
        setField(term68510, term68510.getClass(), "era", null);
        setField(term68510, term68510.getClass(), "dayOfWeek", null);
        setField(term68510, term68510.getClass(), "dayOfMonth", null);
        setField(term68510, term68510.getClass(), "dayOfYear", null);
        setField(term68510, term68510.getClass(), "monthOfYear", null);
        setField(term68510, term68510.getClass(), "weekOfWeekyear", null);
        setField(term68510, term68510.getClass(), "weekyear", null);
        setField(term68510, term68510.getClass(), "weekyearOfCentury", null);
        setField(term68510, term68510.getClass(), "millisOfSecond", null);
        setField(term68510, term68510.getClass(), "millisOfDay", null);
        setField(term68510, term68510.getClass(), "secondOfMinute", null);
        setField(term68510, term68510.getClass(), "secondOfDay", null);
        setField(term68510, term68510.getClass(), "minuteOfHour", null);
        setField(term68510, term68510.getClass(), "minuteOfDay", null);
        setField(term68510, term68510.getClass(), "hourOfDay", null);
        setField(term68510, term68510.getClass(), "hourOfHalfday", term68600);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term68510;
        try {
            callMethod(klass, "assemble", argTypes, term68332, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


