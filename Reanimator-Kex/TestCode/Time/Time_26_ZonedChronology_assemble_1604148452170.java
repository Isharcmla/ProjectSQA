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

public class ZonedChronology_assemble_1604148452170 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term62524;
     Object term62624;

    public ZonedChronology_assemble_1604148452170() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term62524 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        term62624 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term62714 = newInstance(Class.forName("org.joda.time.field.ZeroIsMaxDateTimeField"));
        setField(term62624, term62624.getClass(), "eras", null);
        setField(term62624, term62624.getClass(), "centuries", null);
        setField(term62624, term62624.getClass(), "years", null);
        setField(term62624, term62624.getClass(), "months", null);
        setField(term62624, term62624.getClass(), "weekyears", null);
        setField(term62624, term62624.getClass(), "weeks", null);
        setField(term62624, term62624.getClass(), "days", null);
        setField(term62624, term62624.getClass(), "halfdays", null);
        setField(term62624, term62624.getClass(), "hours", null);
        setField(term62624, term62624.getClass(), "minutes", null);
        setField(term62624, term62624.getClass(), "seconds", null);
        setField(term62624, term62624.getClass(), "millis", null);
        setField(term62624, term62624.getClass(), "year", null);
        setField(term62624, term62624.getClass(), "yearOfEra", null);
        setField(term62624, term62624.getClass(), "yearOfCentury", null);
        setField(term62624, term62624.getClass(), "centuryOfEra", null);
        setField(term62624, term62624.getClass(), "era", null);
        setField(term62624, term62624.getClass(), "dayOfWeek", null);
        setField(term62624, term62624.getClass(), "dayOfMonth", null);
        setField(term62624, term62624.getClass(), "dayOfYear", null);
        setField(term62624, term62624.getClass(), "monthOfYear", null);
        setField(term62624, term62624.getClass(), "weekOfWeekyear", null);
        setField(term62624, term62624.getClass(), "weekyear", null);
        setField(term62624, term62624.getClass(), "weekyearOfCentury", null);
        setField(term62624, term62624.getClass(), "millisOfSecond", null);
        setField(term62624, term62624.getClass(), "millisOfDay", null);
        setField(term62624, term62624.getClass(), "secondOfMinute", null);
        setField(term62624, term62624.getClass(), "secondOfDay", null);
        setField(term62624, term62624.getClass(), "minuteOfHour", null);
        setField(term62624, term62624.getClass(), "minuteOfDay", null);
        setField(term62624, term62624.getClass(), "hourOfDay", null);
        setField(term62624, term62624.getClass(), "hourOfHalfday", term62714);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term62624;
        try {
            callMethod(klass, "assemble", argTypes, term62524, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


