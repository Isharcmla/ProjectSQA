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

public class ZonedChronology_assemble_1604148452111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38713;
     Object term38813;

    public ZonedChronology_assemble_1604148452111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38713 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        term38813 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term38917 = newInstance(Class.forName("org.joda.time.chrono.BasicChronology$HalfdayField"));
        setField(term38813, term38813.getClass(), "eras", null);
        setField(term38813, term38813.getClass(), "centuries", null);
        setField(term38813, term38813.getClass(), "years", null);
        setField(term38813, term38813.getClass(), "months", null);
        setField(term38813, term38813.getClass(), "weekyears", null);
        setField(term38813, term38813.getClass(), "weeks", null);
        setField(term38813, term38813.getClass(), "days", null);
        setField(term38813, term38813.getClass(), "halfdays", null);
        setField(term38813, term38813.getClass(), "hours", null);
        setField(term38813, term38813.getClass(), "minutes", null);
        setField(term38813, term38813.getClass(), "seconds", null);
        setField(term38813, term38813.getClass(), "millis", null);
        setField(term38813, term38813.getClass(), "year", null);
        setField(term38813, term38813.getClass(), "yearOfEra", null);
        setField(term38813, term38813.getClass(), "yearOfCentury", null);
        setField(term38813, term38813.getClass(), "centuryOfEra", null);
        setField(term38813, term38813.getClass(), "era", null);
        setField(term38813, term38813.getClass(), "dayOfWeek", null);
        setField(term38813, term38813.getClass(), "dayOfMonth", null);
        setField(term38813, term38813.getClass(), "dayOfYear", null);
        setField(term38813, term38813.getClass(), "monthOfYear", null);
        setField(term38813, term38813.getClass(), "weekOfWeekyear", term38917);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term38813;
        try {
            callMethod(klass, "assemble", argTypes, term38713, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


