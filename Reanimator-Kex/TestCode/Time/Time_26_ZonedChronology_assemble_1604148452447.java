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

public class ZonedChronology_assemble_1604148452447 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term194962;
     Object term195062;

    public ZonedChronology_assemble_1604148452447() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term194962 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        setField(term194962, term194962.getClass(), "iParam", null);
        term195062 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term195156 = newInstance(Class.forName("org.joda.time.field.UnsupportedDateTimeField"));
        Object term195242 = newInstance(Class.forName("org.joda.time.field.PreciseDateTimeField"));
        Object term195326 = newInstance(Class.forName("org.joda.time.field.MillisDurationField"));
        setField(term195062, term195062.getClass(), "eras", null);
        setField(term195062, term195062.getClass(), "centuries", null);
        setField(term195062, term195062.getClass(), "years", null);
        setField(term195062, term195062.getClass(), "months", null);
        setField(term195062, term195062.getClass(), "weekyears", null);
        setField(term195062, term195062.getClass(), "weeks", null);
        setField(term195062, term195062.getClass(), "days", null);
        setField(term195062, term195062.getClass(), "halfdays", null);
        setField(term195062, term195062.getClass(), "hours", null);
        setField(term195062, term195062.getClass(), "minutes", null);
        setField(term195062, term195062.getClass(), "seconds", null);
        setField(term195062, term195062.getClass(), "millis", null);
        setField(term195062, term195062.getClass(), "year", null);
        setField(term195062, term195062.getClass(), "yearOfEra", null);
        setField(term195062, term195062.getClass(), "yearOfCentury", null);
        setField(term195062, term195062.getClass(), "centuryOfEra", null);
        setField(term195062, term195062.getClass(), "era", null);
        setField(term195062, term195062.getClass(), "dayOfWeek", null);
        setField(term195062, term195062.getClass(), "dayOfMonth", null);
        setField(term195062, term195062.getClass(), "dayOfYear", null);
        setField(term195062, term195062.getClass(), "monthOfYear", null);
        setField(term195062, term195062.getClass(), "weekOfWeekyear", null);
        setField(term195062, term195062.getClass(), "weekyear", null);
        setField(term195062, term195062.getClass(), "weekyearOfCentury", null);
        setField(term195062, term195062.getClass(), "millisOfSecond", null);
        setField(term195062, term195062.getClass(), "millisOfDay", term195156);
        setField(term195062, term195062.getClass(), "secondOfMinute", null);
        setField(term195062, term195062.getClass(), "secondOfDay", null);
        setField(term195062, term195062.getClass(), "minuteOfHour", null);
        setField(term195062, term195062.getClass(), "minuteOfDay", null);
        setField(term195242, term195242.getClass(), "iUnitField", term195326);
        setField(term195062, term195062.getClass(), "hourOfDay", term195242);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term195062;
        try {
            callMethod(klass, "assemble", argTypes, term194962, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


