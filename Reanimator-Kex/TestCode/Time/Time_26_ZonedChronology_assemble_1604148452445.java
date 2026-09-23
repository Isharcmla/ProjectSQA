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

public class ZonedChronology_assemble_1604148452445 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term194055;
     Object term194155;

    public ZonedChronology_assemble_1604148452445() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term194055 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        setField(term194055, term194055.getClass(), "iParam", null);
        term194155 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term194249 = newInstance(Class.forName("org.joda.time.field.UnsupportedDateTimeField"));
        Object term194361 = newInstance(Class.forName("org.joda.time.chrono.BasicWeekOfWeekyearDateTimeField"));
        Object term194451 = newInstance(Class.forName("org.joda.time.field.DelegatedDurationField"));
        setField(term194155, term194155.getClass(), "eras", null);
        setField(term194155, term194155.getClass(), "centuries", null);
        setField(term194155, term194155.getClass(), "years", null);
        setField(term194155, term194155.getClass(), "months", null);
        setField(term194155, term194155.getClass(), "weekyears", null);
        setField(term194155, term194155.getClass(), "weeks", null);
        setField(term194155, term194155.getClass(), "days", null);
        setField(term194155, term194155.getClass(), "halfdays", null);
        setField(term194155, term194155.getClass(), "hours", null);
        setField(term194155, term194155.getClass(), "minutes", null);
        setField(term194155, term194155.getClass(), "seconds", null);
        setField(term194155, term194155.getClass(), "millis", null);
        setField(term194155, term194155.getClass(), "year", null);
        setField(term194155, term194155.getClass(), "yearOfEra", null);
        setField(term194155, term194155.getClass(), "yearOfCentury", null);
        setField(term194155, term194155.getClass(), "centuryOfEra", null);
        setField(term194155, term194155.getClass(), "era", null);
        setField(term194155, term194155.getClass(), "dayOfWeek", null);
        setField(term194155, term194155.getClass(), "dayOfMonth", null);
        setField(term194155, term194155.getClass(), "dayOfYear", null);
        setField(term194155, term194155.getClass(), "monthOfYear", null);
        setField(term194155, term194155.getClass(), "weekOfWeekyear", null);
        setField(term194155, term194155.getClass(), "weekyear", null);
        setField(term194155, term194155.getClass(), "weekyearOfCentury", null);
        setField(term194155, term194155.getClass(), "millisOfSecond", null);
        setField(term194155, term194155.getClass(), "millisOfDay", term194249);
        setField(term194155, term194155.getClass(), "secondOfMinute", null);
        setField(term194155, term194155.getClass(), "secondOfDay", null);
        setField(term194155, term194155.getClass(), "minuteOfHour", null);
        setField(term194155, term194155.getClass(), "minuteOfDay", null);
        setField(term194155, term194155.getClass(), "hourOfDay", null);
        setField(term194155, term194155.getClass(), "hourOfHalfday", null);
        setField(term194361, term194361.getClass(), "iUnitField", term194451);
        setField(term194155, term194155.getClass(), "clockhourOfDay", term194361);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term194155;
        try {
            callMethod(klass, "assemble", argTypes, term194055, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


