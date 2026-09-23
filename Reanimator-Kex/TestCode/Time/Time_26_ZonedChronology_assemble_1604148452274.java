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

public class ZonedChronology_assemble_1604148452274 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term101535;
     Object term101635;

    public ZonedChronology_assemble_1604148452274() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term101535 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        setField(term101535, term101535.getClass(), "iParam", null);
        term101635 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term101731 = newInstance(Class.forName("org.joda.time.chrono.GJDayOfWeekDateTimeField"));
        Object term101821 = newInstance(Class.forName("org.joda.time.field.DelegatedDurationField"));
        setField(term101635, term101635.getClass(), "eras", null);
        setField(term101635, term101635.getClass(), "centuries", null);
        setField(term101635, term101635.getClass(), "years", null);
        setField(term101635, term101635.getClass(), "months", null);
        setField(term101635, term101635.getClass(), "weekyears", null);
        setField(term101635, term101635.getClass(), "weeks", null);
        setField(term101635, term101635.getClass(), "days", null);
        setField(term101635, term101635.getClass(), "halfdays", null);
        setField(term101635, term101635.getClass(), "hours", null);
        setField(term101635, term101635.getClass(), "minutes", null);
        setField(term101635, term101635.getClass(), "seconds", null);
        setField(term101635, term101635.getClass(), "millis", null);
        setField(term101635, term101635.getClass(), "year", null);
        setField(term101635, term101635.getClass(), "yearOfEra", null);
        setField(term101635, term101635.getClass(), "yearOfCentury", null);
        setField(term101731, term101731.getClass(), "iUnitField", term101821);
        setField(term101635, term101635.getClass(), "centuryOfEra", term101731);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term101635;
        try {
            callMethod(klass, "assemble", argTypes, term101535, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


