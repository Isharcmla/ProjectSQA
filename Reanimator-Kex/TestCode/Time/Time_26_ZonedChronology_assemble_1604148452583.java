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

public class ZonedChronology_assemble_1604148452583 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term264693;
     Object term264793;

    public ZonedChronology_assemble_1604148452583() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term264693 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        setField(term264693, term264693.getClass(), "iParam", null);
        term264793 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term264887 = newInstance(Class.forName("org.joda.time.field.UnsupportedDateTimeField"));
        Object term265003 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology$ZonedDateTimeField"));
        Object term265093 = newInstance(Class.forName("org.joda.time.field.DelegatedDurationField"));
        setField(term264793, term264793.getClass(), "eras", null);
        setField(term264793, term264793.getClass(), "centuries", null);
        setField(term264793, term264793.getClass(), "years", null);
        setField(term264793, term264793.getClass(), "months", null);
        setField(term264793, term264793.getClass(), "weekyears", null);
        setField(term264793, term264793.getClass(), "weeks", null);
        setField(term264793, term264793.getClass(), "days", null);
        setField(term264793, term264793.getClass(), "halfdays", null);
        setField(term264793, term264793.getClass(), "hours", null);
        setField(term264793, term264793.getClass(), "minutes", null);
        setField(term264793, term264793.getClass(), "seconds", null);
        setField(term264793, term264793.getClass(), "millis", null);
        setField(term264793, term264793.getClass(), "year", null);
        setField(term264793, term264793.getClass(), "yearOfEra", null);
        setField(term264793, term264793.getClass(), "yearOfCentury", null);
        setField(term264793, term264793.getClass(), "centuryOfEra", null);
        setField(term264793, term264793.getClass(), "era", null);
        setField(term264793, term264793.getClass(), "dayOfWeek", null);
        setField(term264793, term264793.getClass(), "dayOfMonth", null);
        setField(term264793, term264793.getClass(), "dayOfYear", null);
        setField(term264793, term264793.getClass(), "monthOfYear", null);
        setField(term264793, term264793.getClass(), "weekOfWeekyear", null);
        setField(term264793, term264793.getClass(), "weekyear", null);
        setField(term264793, term264793.getClass(), "weekyearOfCentury", null);
        setField(term264793, term264793.getClass(), "millisOfSecond", null);
        setField(term264793, term264793.getClass(), "millisOfDay", term264887);
        setField(term264793, term264793.getClass(), "secondOfMinute", null);
        setField(term264793, term264793.getClass(), "secondOfDay", null);
        setField(term264793, term264793.getClass(), "minuteOfHour", null);
        setField(term264793, term264793.getClass(), "minuteOfDay", null);
        setField(term264793, term264793.getClass(), "hourOfDay", null);
        setField(term264793, term264793.getClass(), "hourOfHalfday", null);
        setField(term264793, term264793.getClass(), "clockhourOfDay", null);
        setField(term265003, term265003.getClass(), "iDurationField", term265093);
        setField(term264793, term264793.getClass(), "clockhourOfHalfday", term265003);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term264793;
        try {
            callMethod(klass, "assemble", argTypes, term264693, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


