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

public class ZonedChronology_assemble_1604148452127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43443;
     Object term43543;

    public ZonedChronology_assemble_1604148452127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43443 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        setField(term43443, term43443.getClass(), "iParam", null);
        term43543 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term43629 = newInstance(Class.forName("org.joda.time.field.PreciseDateTimeField"));
        Object term43715 = newInstance(Class.forName("org.joda.time.field.PreciseDurationField"));
        setField(term43543, term43543.getClass(), "eras", null);
        setField(term43543, term43543.getClass(), "centuries", null);
        setField(term43543, term43543.getClass(), "years", null);
        setField(term43543, term43543.getClass(), "months", null);
        setField(term43543, term43543.getClass(), "weekyears", null);
        setField(term43543, term43543.getClass(), "weeks", null);
        setField(term43543, term43543.getClass(), "days", null);
        setField(term43543, term43543.getClass(), "halfdays", null);
        setField(term43543, term43543.getClass(), "hours", null);
        setField(term43543, term43543.getClass(), "minutes", null);
        setField(term43543, term43543.getClass(), "seconds", null);
        setField(term43543, term43543.getClass(), "millis", null);
        setField(term43543, term43543.getClass(), "year", null);
        setField(term43543, term43543.getClass(), "yearOfEra", null);
        setField(term43543, term43543.getClass(), "yearOfCentury", null);
        setField(term43543, term43543.getClass(), "centuryOfEra", null);
        setField(term43543, term43543.getClass(), "era", null);
        setField(term43543, term43543.getClass(), "dayOfWeek", null);
        setField(term43543, term43543.getClass(), "dayOfMonth", null);
        setField(term43543, term43543.getClass(), "dayOfYear", null);
        setField(term43543, term43543.getClass(), "monthOfYear", null);
        setField(term43543, term43543.getClass(), "weekOfWeekyear", null);
        setField(term43543, term43543.getClass(), "weekyear", null);
        setField(term43543, term43543.getClass(), "weekyearOfCentury", null);
        setField(term43543, term43543.getClass(), "millisOfSecond", null);
        setField(term43543, term43543.getClass(), "millisOfDay", null);
        setField(term43629, term43629.getClass(), "iUnitField", term43715);
        setField(term43543, term43543.getClass(), "secondOfMinute", term43629);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term43543;
        try {
            callMethod(klass, "assemble", argTypes, term43443, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


