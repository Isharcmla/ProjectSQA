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

public class ZonedChronology_assemble_1604148452551 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term251185;
     Object term251285;

    public ZonedChronology_assemble_1604148452551() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term251185 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        setField(term251185, term251185.getClass(), "iParam", null);
        term251285 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term251401 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology$ZonedDurationField"));
        Object term251521 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        setField(term251285, term251285.getClass(), "eras", null);
        setField(term251285, term251285.getClass(), "centuries", null);
        setField(term251285, term251285.getClass(), "years", null);
        setField(term251285, term251285.getClass(), "months", null);
        setField(term251285, term251285.getClass(), "weekyears", null);
        setField(term251285, term251285.getClass(), "weeks", null);
        setField(term251401, term251401.getClass(), "iType", term251521);
        setField(term251285, term251285.getClass(), "days", term251401);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term251285;
        try {
            callMethod(klass, "assemble", argTypes, term251185, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


