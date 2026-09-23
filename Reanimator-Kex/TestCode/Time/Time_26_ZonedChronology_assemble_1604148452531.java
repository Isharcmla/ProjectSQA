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

public class ZonedChronology_assemble_1604148452531 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term242833;
     Object term242933;

    public ZonedChronology_assemble_1604148452531() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term242833 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        setField(term242833, term242833.getClass(), "iParam", null);
        term242933 = newInstance(Class.forName("org.joda.time.chrono.AssembledChronology$Fields"));
        Object term243045 = newInstance(Class.forName("org.joda.time.chrono.GJChronology$LinkedDurationField"));
        Object term243165 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        setField(term242933, term242933.getClass(), "eras", null);
        setField(term242933, term242933.getClass(), "centuries", null);
        setField(term242933, term242933.getClass(), "years", null);
        setField(term242933, term242933.getClass(), "months", null);
        setField(term242933, term242933.getClass(), "weekyears", null);
        setField(term242933, term242933.getClass(), "weeks", null);
        setField(term242933, term242933.getClass(), "days", null);
        setField(term243045, term243045.getClass(), "iType", term243165);
        setField(term242933, term242933.getClass(), "halfdays", term243045);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.chrono.AssembledChronology$Fields");
        Object[] args = new Object[1];
        args[0] = term242933;
        try {
            callMethod(klass, "assemble", argTypes, term242833, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


