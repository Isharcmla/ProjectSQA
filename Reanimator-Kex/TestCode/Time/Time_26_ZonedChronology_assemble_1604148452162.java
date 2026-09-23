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

public class ZonedChronology_assemble_1604148452162 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term59881;
     Object term59981;

    public ZonedChronology_assemble_1604148452162() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term59881 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        setField(term59881, term59881.getClass(), "iParam", null);
        term59981 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term60085 = newInstance(Class.forName("org.joda.time.chrono.BasicChronology$HalfdayField"));
        Object term60197 = newInstance(Class.forName("org.joda.time.chrono.GJChronology$LinkedDurationField"));
        setField(term59981, term59981.getClass(), "eras", null);
        setField(term59981, term59981.getClass(), "centuries", null);
        setField(term59981, term59981.getClass(), "years", null);
        setField(term59981, term59981.getClass(), "months", null);
        setField(term59981, term59981.getClass(), "weekyears", null);
        setField(term59981, term59981.getClass(), "weeks", null);
        setField(term59981, term59981.getClass(), "days", null);
        setField(term59981, term59981.getClass(), "halfdays", null);
        setField(term59981, term59981.getClass(), "hours", null);
        setField(term59981, term59981.getClass(), "minutes", null);
        setField(term59981, term59981.getClass(), "seconds", null);
        setField(term59981, term59981.getClass(), "millis", null);
        setField(term59981, term59981.getClass(), "year", null);
        setField(term59981, term59981.getClass(), "yearOfEra", null);
        setField(term59981, term59981.getClass(), "yearOfCentury", null);
        setField(term59981, term59981.getClass(), "centuryOfEra", null);
        setField(term59981, term59981.getClass(), "era", null);
        setField(term59981, term59981.getClass(), "dayOfWeek", null);
        setField(term59981, term59981.getClass(), "dayOfMonth", null);
        setField(term59981, term59981.getClass(), "dayOfYear", null);
        setField(term59981, term59981.getClass(), "monthOfYear", null);
        setField(term60085, term60085.getClass(), "iUnitField", null);
        setField(term60085, term60085.getClass(), "iRangeField", term60197);
        setField(term59981, term59981.getClass(), "weekOfWeekyear", term60085);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term59981;
        try {
            callMethod(klass, "assemble", argTypes, term59881, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


