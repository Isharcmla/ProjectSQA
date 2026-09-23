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

public class ZonedChronology_equals_141452681397 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term173252;
     Object term173714;

    public ZonedChronology_equals_141452681397() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term173252 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term173330 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term173408 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term173753 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term173792 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        Object term173636 = newInstance(Class.forName("org.joda.time.chrono.GJChronology"));
        setField(term173792, term173792.getClass(), "iBase", term173753);
        setField(term173753, term173753.getClass(), "iBase", term173792);
        setField(term173408, term173408.getClass(), "iBase", term173753);
        setField(term173408, term173408.getClass(), "iParam", term173636);
        setField(term173330, term173330.getClass(), "iBase", term173408);
        setField(term173252, term173252.getClass(), "iBase", term173330);
        term173714 = newInstance(Class.forName("org.joda.time.chrono.ZonedChronology"));
        setField(term173714, term173714.getClass(), "iBase", term173753);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.ZonedChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term173714;
        try {
            callMethod(klass, "equals", argTypes, term173252, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


