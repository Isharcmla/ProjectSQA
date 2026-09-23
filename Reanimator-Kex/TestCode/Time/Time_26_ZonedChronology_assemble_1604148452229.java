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

public class ZonedChronology_assemble_1604148452229 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term83963;
     Object term84141;

    public ZonedChronology_assemble_1604148452229() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term83963 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term84041 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        setField(term83963, term83963.getClass(), "iParam", term84041);
        term84141 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term84243 = newInstance(Class.forName("org.joda.time.chrono.BasicSingleEraDateTimeField"));
        setField(term84141, term84141.getClass(), "eras", null);
        setField(term84141, term84141.getClass(), "centuries", null);
        setField(term84141, term84141.getClass(), "years", null);
        setField(term84141, term84141.getClass(), "months", null);
        setField(term84141, term84141.getClass(), "weekyears", null);
        setField(term84141, term84141.getClass(), "weeks", null);
        setField(term84141, term84141.getClass(), "days", null);
        setField(term84141, term84141.getClass(), "halfdays", null);
        setField(term84141, term84141.getClass(), "hours", null);
        setField(term84141, term84141.getClass(), "minutes", null);
        setField(term84141, term84141.getClass(), "seconds", null);
        setField(term84141, term84141.getClass(), "millis", null);
        setField(term84141, term84141.getClass(), "year", null);
        setField(term84141, term84141.getClass(), "yearOfEra", null);
        setField(term84141, term84141.getClass(), "yearOfCentury", null);
        setField(term84141, term84141.getClass(), "centuryOfEra", null);
        setField(term84141, term84141.getClass(), "era", null);
        setField(term84141, term84141.getClass(), "dayOfWeek", null);
        setField(term84141, term84141.getClass(), "dayOfMonth", null);
        setField(term84141, term84141.getClass(), "dayOfYear", null);
        setField(term84141, term84141.getClass(), "monthOfYear", null);
        setField(term84141, term84141.getClass(), "weekOfWeekyear", null);
        setField(term84141, term84141.getClass(), "weekyear", null);
        setField(term84141, term84141.getClass(), "weekyearOfCentury", null);
        setField(term84141, term84141.getClass(), "millisOfSecond", null);
        setField(term84141, term84141.getClass(), "millisOfDay", null);
        setField(term84141, term84141.getClass(), "secondOfMinute", null);
        setField(term84141, term84141.getClass(), "secondOfDay", null);
        setField(term84141, term84141.getClass(), "minuteOfHour", null);
        setField(term84141, term84141.getClass(), "minuteOfDay", null);
        setField(term84141, term84141.getClass(), "hourOfDay", null);
        setField(term84141, term84141.getClass(), "hourOfHalfday", null);
        setField(term84141, term84141.getClass(), "clockhourOfDay", null);
        setField(term84141, term84141.getClass(), "clockhourOfHalfday", term84243);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term84141;
        try {
            callMethod(klass, "assemble", argTypes, term83963, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


