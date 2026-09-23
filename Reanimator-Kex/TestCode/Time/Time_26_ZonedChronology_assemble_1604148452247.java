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

public class ZonedChronology_assemble_1604148452247 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term91887;
     Object term91987;

    public ZonedChronology_assemble_1604148452247() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term91887 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        setField(term91887, term91887.getClass(), "iParam", null);
        term91987 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term92091 = newInstance(Class.forName("org.joda.time.chrono.BasicChronology$HalfdayField"));
        Object term92175 = newInstance(Class.forName("org.joda.time.field.MillisDurationField"));
        setField(term91987, term91987.getClass(), "eras", null);
        setField(term91987, term91987.getClass(), "centuries", null);
        setField(term91987, term91987.getClass(), "years", null);
        setField(term91987, term91987.getClass(), "months", null);
        setField(term91987, term91987.getClass(), "weekyears", null);
        setField(term91987, term91987.getClass(), "weeks", null);
        setField(term91987, term91987.getClass(), "days", null);
        setField(term91987, term91987.getClass(), "halfdays", null);
        setField(term91987, term91987.getClass(), "hours", null);
        setField(term91987, term91987.getClass(), "minutes", null);
        setField(term91987, term91987.getClass(), "seconds", null);
        setField(term91987, term91987.getClass(), "millis", null);
        setField(term91987, term91987.getClass(), "year", null);
        setField(term91987, term91987.getClass(), "yearOfEra", null);
        setField(term92091, term92091.getClass(), "iUnitField", null);
        setField(term92091, term92091.getClass(), "iRangeField", term92175);
        setField(term91987, term91987.getClass(), "yearOfCentury", term92091);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term91987;
        try {
            callMethod(klass, "assemble", argTypes, term91887, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


