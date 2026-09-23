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

public class ZonedChronology_assemble_1604148452627 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term324337;
     Object term324437;

    public ZonedChronology_assemble_1604148452627() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term324337 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        setField(term324337, term324337.getClass(), "iParam", null);
        term324437 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term324531 = newInstance(Class.forName("org.joda.time.field.UnsupportedDateTimeField"));
        Object term324647 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField"));
        Object term324737 = newInstance(Class.forName("org.joda.time.field.DelegatedDurationField"));
        setField(term324437, term324437.getClass(), "eras", null);
        setField(term324437, term324437.getClass(), "centuries", null);
        setField(term324437, term324437.getClass(), "years", null);
        setField(term324437, term324437.getClass(), "months", null);
        setField(term324437, term324437.getClass(), "weekyears", null);
        setField(term324437, term324437.getClass(), "weeks", null);
        setField(term324437, term324437.getClass(), "days", null);
        setField(term324437, term324437.getClass(), "halfdays", null);
        setField(term324437, term324437.getClass(), "hours", null);
        setField(term324437, term324437.getClass(), "minutes", null);
        setField(term324437, term324437.getClass(), "seconds", null);
        setField(term324437, term324437.getClass(), "millis", null);
        setField(term324437, term324437.getClass(), "year", null);
        setField(term324437, term324437.getClass(), "yearOfEra", null);
        setField(term324437, term324437.getClass(), "yearOfCentury", null);
        setField(term324437, term324437.getClass(), "centuryOfEra", null);
        setField(term324437, term324437.getClass(), "era", null);
        setField(term324437, term324437.getClass(), "dayOfWeek", null);
        setField(term324437, term324437.getClass(), "dayOfMonth", null);
        setField(term324437, term324437.getClass(), "dayOfYear", null);
        setField(term324437, term324437.getClass(), "monthOfYear", null);
        setField(term324437, term324437.getClass(), "weekOfWeekyear", null);
        setField(term324437, term324437.getClass(), "weekyear", null);
        setField(term324437, term324437.getClass(), "weekyearOfCentury", null);
        setField(term324437, term324437.getClass(), "millisOfSecond", null);
        setField(term324437, term324437.getClass(), "millisOfDay", term324531);
        setField(term324437, term324437.getClass(), "secondOfMinute", null);
        setField(term324437, term324437.getClass(), "secondOfDay", null);
        setField(term324437, term324437.getClass(), "minuteOfHour", null);
        setField(term324647, term324647.getClass(), "iDurationField", null);
        setField(term324647, term324647.getClass(), "iRangeDurationField", term324737);
        setField(term324437, term324437.getClass(), "minuteOfDay", term324647);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term324437;
        try {
            callMethod(klass, "assemble", argTypes, term324337, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


