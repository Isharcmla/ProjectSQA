package org.joda.time;

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
import static org.joda.time.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Partial_init_35371778976 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31259;

    public Partial_init_35371778976() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term31393 = newInstance(Class.forName("org.joda.time.Partial"));
        Object term31455 = newInstance(Class.forName("org.joda.time.DateTimeZone$1"));
        setField(term31393, term31393.getClass(), "iChronology", term31455);
        term31259 = (Object[]) newArray("org.joda.time.DateTimeFieldType", 0);
        Object term31529 = newInstance(Class.forName("org.joda.time.tz.FixedDateTimeZone"));
        setField(term31529, term31529.getClass(), "iNameKey", "UTC");
        setIntField(term31529, term31529.getClass(), "iWallOffset", 0);
        setIntField(term31529, term31529.getClass(), "iStandardOffset", 0);
        setField(term31529, term31529.getClass(), "iID", "UTC");
        setField(null, Class.forName("org.joda.time.DateTimeZone"), "cDefault", term31529);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Partial");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(Class.forName("org.joda.time.DateTimeFieldType"), 0).getClass();
        argTypes[1] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term31259;
        args[1] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};
