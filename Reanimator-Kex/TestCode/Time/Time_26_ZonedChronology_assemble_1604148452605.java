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

public class ZonedChronology_assemble_1604148452605 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term274398;
     Object term274498;

    public ZonedChronology_assemble_1604148452605() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term274398 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        setField(term274398, term274398.getClass(), "iParam", null);
        term274498 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term274592 = newInstance(Class.forName("org.joda.time.field.UnsupportedDateTimeField"));
        Object term274708 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField"));
        Object term274798 = newInstance(Class.forName("org.joda.time.field.DelegatedDurationField"));
        setField(term274498, term274498.getClass(), "eras", null);
        setField(term274498, term274498.getClass(), "centuries", null);
        setField(term274498, term274498.getClass(), "years", null);
        setField(term274498, term274498.getClass(), "months", null);
        setField(term274498, term274498.getClass(), "weekyears", null);
        setField(term274498, term274498.getClass(), "weeks", null);
        setField(term274498, term274498.getClass(), "days", null);
        setField(term274498, term274498.getClass(), "halfdays", null);
        setField(term274498, term274498.getClass(), "hours", null);
        setField(term274498, term274498.getClass(), "minutes", null);
        setField(term274498, term274498.getClass(), "seconds", null);
        setField(term274498, term274498.getClass(), "millis", null);
        setField(term274498, term274498.getClass(), "year", null);
        setField(term274498, term274498.getClass(), "yearOfEra", null);
        setField(term274498, term274498.getClass(), "yearOfCentury", null);
        setField(term274498, term274498.getClass(), "centuryOfEra", null);
        setField(term274498, term274498.getClass(), "era", null);
        setField(term274498, term274498.getClass(), "dayOfWeek", null);
        setField(term274498, term274498.getClass(), "dayOfMonth", null);
        setField(term274498, term274498.getClass(), "dayOfYear", null);
        setField(term274498, term274498.getClass(), "monthOfYear", null);
        setField(term274498, term274498.getClass(), "weekOfWeekyear", null);
        setField(term274498, term274498.getClass(), "weekyear", null);
        setField(term274498, term274498.getClass(), "weekyearOfCentury", null);
        setField(term274498, term274498.getClass(), "millisOfSecond", null);
        setField(term274498, term274498.getClass(), "millisOfDay", term274592);
        setField(term274498, term274498.getClass(), "secondOfMinute", null);
        setField(term274498, term274498.getClass(), "secondOfDay", null);
        setField(term274498, term274498.getClass(), "minuteOfHour", null);
        setField(term274708, term274708.getClass(), "iDurationField", term274798);
        setField(term274498, term274498.getClass(), "minuteOfDay", term274708);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term274498;
        try {
            callMethod(klass, "assemble", argTypes, term274398, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


