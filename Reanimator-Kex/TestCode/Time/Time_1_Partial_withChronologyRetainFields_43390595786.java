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
import java.lang.NullPointerException;
import static org.joda.time.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Partial_withChronologyRetainFields_43390595786 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39596;

    public Partial_withChronologyRetainFields_43390595786() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term39596 = newInstance(Class.forName("org.joda.time.Partial"));
        setField(term39596, term39596.getClass(), "iChronology", null);
        Object term39670 = newInstance(Class.forName("org.joda.time.tz.FixedDateTimeZone"));
        setField(term39670, term39670.getClass(), "iNameKey", "UTC");
        setIntField(term39670, term39670.getClass(), "iWallOffset", 0);
        setIntField(term39670, term39670.getClass(), "iStandardOffset", 0);
        setField(term39670, term39670.getClass(), "iID", "UTC");
        setField(null, Class.forName("org.joda.time.DateTimeZone"), "cDefault", term39670);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Partial");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.Chronology");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "withChronologyRetainFields", argTypes, term39596, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};
