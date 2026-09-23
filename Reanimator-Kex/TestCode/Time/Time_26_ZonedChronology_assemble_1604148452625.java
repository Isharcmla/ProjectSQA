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

public class ZonedChronology_assemble_1604148452625 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term323256;
     Object term323430;

    public ZonedChronology_assemble_1604148452625() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term323256 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term323330 = newInstance(Class.forName("org.joda.time.tz.FixedDateTimeZone"));
        setField(term323256, term323256.getClass(), "iParam", term323330);
        term323430 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term323534 = newInstance(Class.forName("org.joda.time.chrono.BasicChronology$HalfdayField"));
        Object term323654 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term323758 = newInstance(Class.forName("org.joda.time.chrono.BasicChronology$HalfdayField"));
        setField(term323430, term323430.getClass(), "eras", null);
        setField(term323430, term323430.getClass(), "centuries", null);
        setField(term323430, term323430.getClass(), "years", null);
        setField(term323430, term323430.getClass(), "months", null);
        setField(term323430, term323430.getClass(), "weekyears", null);
        setField(term323430, term323430.getClass(), "weeks", null);
        setField(term323430, term323430.getClass(), "days", null);
        setField(term323430, term323430.getClass(), "halfdays", null);
        setField(term323430, term323430.getClass(), "hours", null);
        setField(term323430, term323430.getClass(), "minutes", null);
        setField(term323430, term323430.getClass(), "seconds", null);
        setField(term323430, term323430.getClass(), "millis", null);
        setField(term323430, term323430.getClass(), "year", null);
        setField(term323430, term323430.getClass(), "yearOfEra", null);
        setField(term323534, term323534.getClass(), "iUnitField", null);
        setField(term323534, term323534.getClass(), "iRangeField", null);
        setField(term323534, term323534.getClass(), "iType", term323654);
        setField(term323430, term323430.getClass(), "yearOfCentury", term323534);
        setField(term323430, term323430.getClass(), "centuryOfEra", null);
        setField(term323430, term323430.getClass(), "era", null);
        setField(term323430, term323430.getClass(), "dayOfWeek", null);
        setField(term323430, term323430.getClass(), "dayOfMonth", null);
        setField(term323430, term323430.getClass(), "dayOfYear", null);
        setField(term323430, term323430.getClass(), "monthOfYear", null);
        setField(term323430, term323430.getClass(), "weekOfWeekyear", null);
        setField(term323430, term323430.getClass(), "weekyear", null);
        setField(term323430, term323430.getClass(), "weekyearOfCentury", null);
        setField(term323430, term323430.getClass(), "millisOfSecond", null);
        setField(term323430, term323430.getClass(), "millisOfDay", term323758);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term323430;
        try {
            callMethod(klass, "assemble", argTypes, term323256, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


