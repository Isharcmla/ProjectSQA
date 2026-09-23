package org.joda.time.format;

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
import static org.joda.time.format.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class DateTimeFormatter_selectChronology_914502882147 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33279;

    public DateTimeFormatter_selectChronology_914502882147() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33279 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        Object term33341 = newInstance(Class.forName("org.joda.time.tz.UTCProvider"));
        setField(null, Class.forName("org.joda.time.DateTimeZone"), "cDefault", null);
        setField(null, Class.forName("org.joda.time.DateTimeZone"), "cProvider", term33341);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.Chronology");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "selectChronology", argTypes, term33279, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


