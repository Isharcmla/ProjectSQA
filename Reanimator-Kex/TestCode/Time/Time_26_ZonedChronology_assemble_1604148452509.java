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

public class ZonedChronology_assemble_1604148452509 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term229739;
     Object term229953;

    public ZonedChronology_assemble_1604148452509() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term229739 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term229853 = newInstance(Class.forName("org.joda.time.tz.DateTimeZoneBuilder$PrecalculatedZone"));
        setField(term229739, term229739.getClass(), "iParam", term229853);
        term229953 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term230057 = newInstance(Class.forName("org.joda.time.chrono.BasicChronology$HalfdayField"));
        Object term230147 = newInstance(Class.forName("org.joda.time.field.DelegatedDurationField"));
        setField(term229953, term229953.getClass(), "eras", null);
        setField(term229953, term229953.getClass(), "centuries", null);
        setField(term229953, term229953.getClass(), "years", null);
        setField(term229953, term229953.getClass(), "months", null);
        setField(term229953, term229953.getClass(), "weekyears", null);
        setField(term229953, term229953.getClass(), "weeks", null);
        setField(term229953, term229953.getClass(), "days", null);
        setField(term229953, term229953.getClass(), "halfdays", null);
        setField(term229953, term229953.getClass(), "hours", null);
        setField(term229953, term229953.getClass(), "minutes", null);
        setField(term229953, term229953.getClass(), "seconds", null);
        setField(term229953, term229953.getClass(), "millis", null);
        setField(term229953, term229953.getClass(), "year", null);
        setField(term229953, term229953.getClass(), "yearOfEra", null);
        setField(term230057, term230057.getClass(), "iUnitField", term230147);
        setField(term229953, term229953.getClass(), "yearOfCentury", term230057);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term229953;
        try {
            callMethod(klass, "assemble", argTypes, term229739, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


