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

public class ZonedChronology_assemble_1604148452599 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term272049;
     Object term272223;

    public ZonedChronology_assemble_1604148452599() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term272049 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term272123 = newInstance(Class.forName("org.joda.time.tz.FixedDateTimeZone"));
        setField(term272049, term272049.getClass(), "iParam", term272123);
        term272223 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term272317 = newInstance(Class.forName("org.joda.time.field.UnsupportedDateTimeField"));
        Object term272421 = newInstance(Class.forName("org.joda.time.chrono.BasicChronology$HalfdayField"));
        setField(term272223, term272223.getClass(), "eras", null);
        setField(term272223, term272223.getClass(), "centuries", null);
        setField(term272223, term272223.getClass(), "years", null);
        setField(term272223, term272223.getClass(), "months", null);
        setField(term272223, term272223.getClass(), "weekyears", null);
        setField(term272223, term272223.getClass(), "weeks", null);
        setField(term272223, term272223.getClass(), "days", null);
        setField(term272223, term272223.getClass(), "halfdays", null);
        setField(term272223, term272223.getClass(), "hours", null);
        setField(term272223, term272223.getClass(), "minutes", null);
        setField(term272223, term272223.getClass(), "seconds", null);
        setField(term272223, term272223.getClass(), "millis", null);
        setField(term272223, term272223.getClass(), "year", null);
        setField(term272223, term272223.getClass(), "yearOfEra", null);
        setField(term272223, term272223.getClass(), "yearOfCentury", null);
        setField(term272223, term272223.getClass(), "centuryOfEra", null);
        setField(term272223, term272223.getClass(), "era", null);
        setField(term272223, term272223.getClass(), "dayOfWeek", null);
        setField(term272223, term272223.getClass(), "dayOfMonth", null);
        setField(term272223, term272223.getClass(), "dayOfYear", null);
        setField(term272223, term272223.getClass(), "monthOfYear", null);
        setField(term272223, term272223.getClass(), "weekOfWeekyear", null);
        setField(term272223, term272223.getClass(), "weekyear", null);
        setField(term272223, term272223.getClass(), "weekyearOfCentury", null);
        setField(term272223, term272223.getClass(), "millisOfSecond", null);
        setField(term272223, term272223.getClass(), "millisOfDay", term272317);
        setField(term272223, term272223.getClass(), "secondOfMinute", null);
        setField(term272223, term272223.getClass(), "secondOfDay", null);
        setField(term272223, term272223.getClass(), "minuteOfHour", term272421);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term272223;
        try {
            callMethod(klass, "assemble", argTypes, term272049, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


