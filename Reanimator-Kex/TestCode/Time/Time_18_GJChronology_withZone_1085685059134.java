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

public class GJChronology_withZone_1085685059134 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42429;
     Object term42591;

    public GJChronology_withZone_1085685059134() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42429 = newInstance(Class.forName("org.joda.time.chrono.GJChronology"));
        Object term42515 = newInstance(Class.forName("org.joda.time.chrono.GregorianChronology"));
        setField(term42429, term42429.getClass(), "iBase", null);
        setField(term42429, term42429.getClass(), "iCutoverInstant", null);
        setField(term42429, term42429.getClass(), "iGregorianChronology", term42515);
        term42591 = newInstance(Class.forName("org.joda.time.tz.CachedDateTimeZone"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.chrono.GJChronology");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.DateTimeZone");
        Object[] args = new Object[1];
        args[0] = term42591;
        try {
            callMethod(klass, "withZone", argTypes, term42429, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


