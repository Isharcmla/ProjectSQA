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

public class ZonedChronology_assemble_1604148452493 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term222309;
     Object term222409;

    public ZonedChronology_assemble_1604148452493() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term222309 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        setField(term222309, term222309.getClass(), "iParam", null);
        term222409 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term222513 = newInstance(Class.forName("org.joda.time.chrono.BasicChronology$HalfdayField"));
        Object term222625 = newInstance(Class.forName("org.joda.time.chrono.GJChronology$LinkedDurationField"));
        Object term222745 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        setField(term222409, term222409.getClass(), "eras", null);
        setField(term222409, term222409.getClass(), "centuries", null);
        setField(term222409, term222409.getClass(), "years", null);
        setField(term222409, term222409.getClass(), "months", null);
        setField(term222409, term222409.getClass(), "weekyears", null);
        setField(term222409, term222409.getClass(), "weeks", null);
        setField(term222409, term222409.getClass(), "days", null);
        setField(term222409, term222409.getClass(), "halfdays", null);
        setField(term222409, term222409.getClass(), "hours", null);
        setField(term222409, term222409.getClass(), "minutes", null);
        setField(term222409, term222409.getClass(), "seconds", null);
        setField(term222409, term222409.getClass(), "millis", null);
        setField(term222409, term222409.getClass(), "year", null);
        setField(term222409, term222409.getClass(), "yearOfEra", null);
        setField(term222409, term222409.getClass(), "yearOfCentury", null);
        setField(term222409, term222409.getClass(), "centuryOfEra", null);
        setField(term222409, term222409.getClass(), "era", null);
        setField(term222409, term222409.getClass(), "dayOfWeek", null);
        setField(term222409, term222409.getClass(), "dayOfMonth", null);
        setField(term222409, term222409.getClass(), "dayOfYear", null);
        setField(term222409, term222409.getClass(), "monthOfYear", null);
        setField(term222513, term222513.getClass(), "iUnitField", null);
        setField(term222625, term222625.getClass(), "iType", term222745);
        setField(term222513, term222513.getClass(), "iRangeField", term222625);
        setField(term222409, term222409.getClass(), "weekOfWeekyear", term222513);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term222409;
        try {
            callMethod(klass, "assemble", argTypes, term222309, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


