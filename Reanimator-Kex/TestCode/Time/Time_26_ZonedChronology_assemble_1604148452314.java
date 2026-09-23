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

public class ZonedChronology_assemble_1604148452314 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term115936;
     Object term116150;

    public ZonedChronology_assemble_1604148452314() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term115936 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term116050 = newInstance(Class.forName("org.joda.time.tz.DateTimeZoneBuilder$PrecalculatedZone"));
        setField(term115936, term115936.getClass(), "iParam", term116050);
        term116150 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term116252 = newInstance(Class.forName("org.joda.time.chrono.BasicSingleEraDateTimeField"));
        setField(term116150, term116150.getClass(), "eras", null);
        setField(term116150, term116150.getClass(), "centuries", null);
        setField(term116150, term116150.getClass(), "years", null);
        setField(term116150, term116150.getClass(), "months", null);
        setField(term116150, term116150.getClass(), "weekyears", null);
        setField(term116150, term116150.getClass(), "weeks", null);
        setField(term116150, term116150.getClass(), "days", null);
        setField(term116150, term116150.getClass(), "halfdays", null);
        setField(term116150, term116150.getClass(), "hours", null);
        setField(term116150, term116150.getClass(), "minutes", null);
        setField(term116150, term116150.getClass(), "seconds", null);
        setField(term116150, term116150.getClass(), "millis", null);
        setField(term116150, term116150.getClass(), "year", null);
        setField(term116150, term116150.getClass(), "yearOfEra", null);
        setField(term116150, term116150.getClass(), "yearOfCentury", null);
        setField(term116150, term116150.getClass(), "centuryOfEra", null);
        setField(term116150, term116150.getClass(), "era", null);
        setField(term116150, term116150.getClass(), "dayOfWeek", null);
        setField(term116150, term116150.getClass(), "dayOfMonth", null);
        setField(term116150, term116150.getClass(), "dayOfYear", null);
        setField(term116150, term116150.getClass(), "monthOfYear", null);
        setField(term116150, term116150.getClass(), "weekOfWeekyear", null);
        setField(term116150, term116150.getClass(), "weekyear", null);
        setField(term116150, term116150.getClass(), "weekyearOfCentury", null);
        setField(term116150, term116150.getClass(), "millisOfSecond", null);
        setField(term116150, term116150.getClass(), "millisOfDay", null);
        setField(term116150, term116150.getClass(), "secondOfMinute", null);
        setField(term116150, term116150.getClass(), "secondOfDay", null);
        setField(term116150, term116150.getClass(), "minuteOfHour", null);
        setField(term116150, term116150.getClass(), "minuteOfDay", null);
        setField(term116150, term116150.getClass(), "hourOfDay", null);
        setField(term116150, term116150.getClass(), "hourOfHalfday", null);
        setField(term116150, term116150.getClass(), "clockhourOfDay", null);
        setField(term116150, term116150.getClass(), "clockhourOfHalfday", term116252);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term116150;
        try {
            callMethod(klass, "assemble", argTypes, term115936, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


