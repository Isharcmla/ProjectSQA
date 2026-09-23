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

public class ZonedChronology_assemble_1604148452393 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term171529;
     Object term171629;

    public ZonedChronology_assemble_1604148452393() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term171529 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        setField(term171529, term171529.getClass(), "iParam", term171529);
        term171629 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term171727 = newInstance(Class.forName("org.joda.time.chrono.ISOYearOfEraDateTimeField"));
        setField(term171629, term171629.getClass(), "eras", null);
        setField(term171629, term171629.getClass(), "centuries", null);
        setField(term171629, term171629.getClass(), "years", null);
        setField(term171629, term171629.getClass(), "months", null);
        setField(term171629, term171629.getClass(), "weekyears", null);
        setField(term171629, term171629.getClass(), "weeks", null);
        setField(term171629, term171629.getClass(), "days", null);
        setField(term171629, term171629.getClass(), "halfdays", null);
        setField(term171629, term171629.getClass(), "hours", null);
        setField(term171629, term171629.getClass(), "minutes", null);
        setField(term171629, term171629.getClass(), "seconds", null);
        setField(term171629, term171629.getClass(), "millis", null);
        setField(term171629, term171629.getClass(), "year", null);
        setField(term171629, term171629.getClass(), "yearOfEra", null);
        setField(term171629, term171629.getClass(), "yearOfCentury", null);
        setField(term171629, term171629.getClass(), "centuryOfEra", null);
        setField(term171629, term171629.getClass(), "era", null);
        setField(term171629, term171629.getClass(), "dayOfWeek", null);
        setField(term171629, term171629.getClass(), "dayOfMonth", null);
        setField(term171629, term171629.getClass(), "dayOfYear", null);
        setField(term171629, term171629.getClass(), "monthOfYear", null);
        setField(term171629, term171629.getClass(), "weekOfWeekyear", null);
        setField(term171629, term171629.getClass(), "weekyear", null);
        setField(term171629, term171629.getClass(), "weekyearOfCentury", term171727);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term171629;
        try {
            callMethod(klass, "assemble", argTypes, term171529, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


