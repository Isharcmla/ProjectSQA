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
import java.lang.ClassCastException;
import static org.joda.time.chrono.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ZonedChronology_assemble_1604148452143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49241;
     Object term49341;

    public ZonedChronology_assemble_1604148452143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term49241 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        setField(term49241, term49241.getClass(), "iParam", term49241);
        term49341 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term49443 = newInstance(Class.forName("org.joda.time.chrono.BasicSingleEraDateTimeField"));
        setField(term49341, term49341.getClass(), "eras", null);
        setField(term49341, term49341.getClass(), "centuries", null);
        setField(term49341, term49341.getClass(), "years", null);
        setField(term49341, term49341.getClass(), "months", null);
        setField(term49341, term49341.getClass(), "weekyears", null);
        setField(term49341, term49341.getClass(), "weeks", null);
        setField(term49341, term49341.getClass(), "days", null);
        setField(term49341, term49341.getClass(), "halfdays", null);
        setField(term49341, term49341.getClass(), "hours", null);
        setField(term49341, term49341.getClass(), "minutes", null);
        setField(term49341, term49341.getClass(), "seconds", null);
        setField(term49341, term49341.getClass(), "millis", null);
        setField(term49341, term49341.getClass(), "year", null);
        setField(term49341, term49341.getClass(), "yearOfEra", null);
        setField(term49341, term49341.getClass(), "yearOfCentury", null);
        setField(term49341, term49341.getClass(), "centuryOfEra", null);
        setField(term49341, term49341.getClass(), "era", null);
        setField(term49341, term49341.getClass(), "dayOfWeek", null);
        setField(term49341, term49341.getClass(), "dayOfMonth", null);
        setField(term49341, term49341.getClass(), "dayOfYear", null);
        setField(term49341, term49341.getClass(), "monthOfYear", term49443);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term49341;
        try {
            callMethod(klass, "assemble", argTypes, term49241, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


