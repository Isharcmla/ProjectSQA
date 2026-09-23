package org.joda.time.field;

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
import java.lang.UnsupportedOperationException;
import static org.joda.time.field.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class UnsupportedDurationField_getDifferenceAsLong_165894973442 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52;
     Object term53;
     Object term55;

    public UnsupportedDurationField_getDifferenceAsLong_165894973442() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52 = newInstance(Class.forName("org.joda.time.field.UnsupportedDurationField"));
        setField(term52, term52.getClass(), "iType", null);
        term53 = new Long(-872011222785455006L);
        term55 = new Long(-316468845751588286L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.field.UnsupportedDurationField");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = long.class;
        argTypes[1] = long.class;
        Object[] args = new Object[2];
        args[0] = term53;
        args[1] = term55;
        try {
            callMethod(klass, "getDifferenceAsLong", argTypes, term52, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


