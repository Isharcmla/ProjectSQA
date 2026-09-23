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

public class ZonedChronology_assemble_1604148452233 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term85872;
     Object term85972;

    public ZonedChronology_assemble_1604148452233() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term85872 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        setField(term85872, term85872.getClass(), "iParam", null);
        term85972 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term86088 = newInstance(Class.forName("org.joda.time.chrono.LimitChronology$LimitDateTimeField"));
        Object term86178 = newInstance(Class.forName("org.joda.time.field.DelegatedDurationField"));
        setField(term85972, term85972.getClass(), "eras", null);
        setField(term85972, term85972.getClass(), "centuries", null);
        setField(term85972, term85972.getClass(), "years", null);
        setField(term85972, term85972.getClass(), "months", null);
        setField(term85972, term85972.getClass(), "weekyears", null);
        setField(term85972, term85972.getClass(), "weeks", null);
        setField(term85972, term85972.getClass(), "days", null);
        setField(term85972, term85972.getClass(), "halfdays", null);
        setField(term85972, term85972.getClass(), "hours", null);
        setField(term85972, term85972.getClass(), "minutes", null);
        setField(term85972, term85972.getClass(), "seconds", null);
        setField(term85972, term85972.getClass(), "millis", null);
        setField(term85972, term85972.getClass(), "year", null);
        setField(term85972, term85972.getClass(), "yearOfEra", null);
        setField(term85972, term85972.getClass(), "yearOfCentury", null);
        setField(term85972, term85972.getClass(), "centuryOfEra", null);
        setField(term85972, term85972.getClass(), "era", null);
        setField(term85972, term85972.getClass(), "dayOfWeek", null);
        setField(term85972, term85972.getClass(), "dayOfMonth", null);
        setField(term85972, term85972.getClass(), "dayOfYear", null);
        setField(term85972, term85972.getClass(), "monthOfYear", null);
        setField(term85972, term85972.getClass(), "weekOfWeekyear", null);
        setField(term85972, term85972.getClass(), "weekyear", null);
        setField(term85972, term85972.getClass(), "weekyearOfCentury", null);
        setField(term86088, term86088.getClass(), "iDurationField", null);
        setField(term86088, term86088.getClass(), "iRangeDurationField", term86178);
        setField(term85972, term85972.getClass(), "millisOfSecond", term86088);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term85972;
        try {
            callMethod(klass, "assemble", argTypes, term85872, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


