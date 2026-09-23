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

public class ZonedChronology_assemble_1604148452464 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term207132;
     Object term207308;

    public ZonedChronology_assemble_1604148452464() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term207132 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term207208 = newInstance(Class.forName("org.joda.time.tz.CachedDateTimeZone"));
        setField(term207132, term207132.getClass(), "iParam", term207208);
        term207308 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term207412 = newInstance(Class.forName("org.joda.time.chrono.BasicChronology$HalfdayField"));
        Object term207524 = newInstance(Class.forName("org.joda.time.chrono.GJChronology$LinkedDurationField"));
        setField(term207308, term207308.getClass(), "eras", null);
        setField(term207308, term207308.getClass(), "centuries", null);
        setField(term207308, term207308.getClass(), "years", null);
        setField(term207308, term207308.getClass(), "months", null);
        setField(term207308, term207308.getClass(), "weekyears", null);
        setField(term207308, term207308.getClass(), "weeks", null);
        setField(term207308, term207308.getClass(), "days", null);
        setField(term207308, term207308.getClass(), "halfdays", null);
        setField(term207308, term207308.getClass(), "hours", null);
        setField(term207308, term207308.getClass(), "minutes", null);
        setField(term207308, term207308.getClass(), "seconds", null);
        setField(term207308, term207308.getClass(), "millis", null);
        setField(term207308, term207308.getClass(), "year", null);
        setField(term207308, term207308.getClass(), "yearOfEra", null);
        setField(term207412, term207412.getClass(), "iUnitField", term207524);
        setField(term207308, term207308.getClass(), "yearOfCentury", term207412);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term207308;
        try {
            callMethod(klass, "assemble", argTypes, term207132, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


