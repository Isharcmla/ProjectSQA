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

public class ZonedChronology_assemble_160414845246 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11896;
     Object term11996;

    public ZonedChronology_assemble_160414845246() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11896 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        term11996 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term12108 = newInstance(Class.forName("org.joda.time.chrono.BasicWeekOfWeekyearDateTimeField"));
        setField(term11996, term11996.getClass(), "eras", null);
        setField(term11996, term11996.getClass(), "centuries", null);
        setField(term11996, term11996.getClass(), "years", null);
        setField(term11996, term11996.getClass(), "months", null);
        setField(term11996, term11996.getClass(), "weekyears", null);
        setField(term11996, term11996.getClass(), "weeks", null);
        setField(term11996, term11996.getClass(), "days", null);
        setField(term11996, term11996.getClass(), "halfdays", null);
        setField(term11996, term11996.getClass(), "hours", null);
        setField(term11996, term11996.getClass(), "minutes", null);
        setField(term11996, term11996.getClass(), "seconds", null);
        setField(term11996, term11996.getClass(), "millis", null);
        setField(term11996, term11996.getClass(), "year", null);
        setField(term11996, term11996.getClass(), "yearOfEra", null);
        setField(term11996, term11996.getClass(), "yearOfCentury", null);
        setField(term11996, term11996.getClass(), "centuryOfEra", null);
        setField(term11996, term11996.getClass(), "era", null);
        setField(term11996, term11996.getClass(), "dayOfWeek", null);
        setField(term11996, term11996.getClass(), "dayOfMonth", null);
        setField(term11996, term11996.getClass(), "dayOfYear", null);
        setField(term11996, term11996.getClass(), "monthOfYear", null);
        setField(term11996, term11996.getClass(), "weekOfWeekyear", null);
        setField(term11996, term11996.getClass(), "weekyear", term12108);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term11996;
        try {
            callMethod(klass, "assemble", argTypes, term11896, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


