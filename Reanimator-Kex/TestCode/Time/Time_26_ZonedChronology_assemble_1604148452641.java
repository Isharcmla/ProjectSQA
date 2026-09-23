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

public class ZonedChronology_assemble_1604148452641 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term333124;
     Object term333300;

    public ZonedChronology_assemble_1604148452641() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term333124 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term333200 = newInstance(Class.forName("org.joda.time.tz.CachedDateTimeZone"));
        setField(term333124, term333124.getClass(), "iParam", term333200);
        term333300 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term333404 = newInstance(Class.forName("org.joda.time.chrono.BasicChronology$HalfdayField"));
        Object term333524 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term333628 = newInstance(Class.forName("org.joda.time.chrono.BasicChronology$HalfdayField"));
        setField(term333300, term333300.getClass(), "eras", null);
        setField(term333300, term333300.getClass(), "centuries", null);
        setField(term333300, term333300.getClass(), "years", null);
        setField(term333300, term333300.getClass(), "months", null);
        setField(term333300, term333300.getClass(), "weekyears", null);
        setField(term333300, term333300.getClass(), "weeks", null);
        setField(term333300, term333300.getClass(), "days", null);
        setField(term333300, term333300.getClass(), "halfdays", null);
        setField(term333300, term333300.getClass(), "hours", null);
        setField(term333300, term333300.getClass(), "minutes", null);
        setField(term333300, term333300.getClass(), "seconds", null);
        setField(term333300, term333300.getClass(), "millis", null);
        setField(term333300, term333300.getClass(), "year", null);
        setField(term333300, term333300.getClass(), "yearOfEra", null);
        setField(term333404, term333404.getClass(), "iUnitField", null);
        setField(term333404, term333404.getClass(), "iRangeField", null);
        setField(term333404, term333404.getClass(), "iType", term333524);
        setField(term333300, term333300.getClass(), "yearOfCentury", term333404);
        setField(term333300, term333300.getClass(), "centuryOfEra", null);
        setField(term333300, term333300.getClass(), "era", null);
        setField(term333300, term333300.getClass(), "dayOfWeek", null);
        setField(term333300, term333300.getClass(), "dayOfMonth", null);
        setField(term333300, term333300.getClass(), "dayOfYear", null);
        setField(term333300, term333300.getClass(), "monthOfYear", null);
        setField(term333300, term333300.getClass(), "weekOfWeekyear", null);
        setField(term333300, term333300.getClass(), "weekyear", null);
        setField(term333300, term333300.getClass(), "weekyearOfCentury", null);
        setField(term333300, term333300.getClass(), "millisOfSecond", null);
        setField(term333300, term333300.getClass(), "millisOfDay", null);
        setField(term333300, term333300.getClass(), "secondOfMinute", null);
        setField(term333300, term333300.getClass(), "secondOfDay", null);
        setField(term333300, term333300.getClass(), "minuteOfHour", null);
        setField(term333300, term333300.getClass(), "minuteOfDay", null);
        setField(term333300, term333300.getClass(), "hourOfDay", null);
        setField(term333300, term333300.getClass(), "hourOfHalfday", null);
        setField(term333300, term333300.getClass(), "clockhourOfDay", null);
        setField(term333300, term333300.getClass(), "clockhourOfHalfday", term333628);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term333300;
        try {
            callMethod(klass, "assemble", argTypes, term333124, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


