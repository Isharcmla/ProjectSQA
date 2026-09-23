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
import java.lang.NullPointerException;
import static org.joda.time.field.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class LenientDateTimeField_getInstance_170798709173 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13757;

    public LenientDateTimeField_getInstance_170798709173() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13757 = newInstance(Class.forName("org.joda.time.field.OffsetDateTimeField"));
        Object term13841 = newInstance(Class.forName("org.joda.time.field.OffsetDateTimeField"));
        setField(term13757, term13757.getClass(), "iField", term13841);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.field.LenientDateTimeField");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.joda.time.DateTimeField");
        argTypes[1] = Class.forName("org.joda.time.Chronology");
        Object[] args = new Object[2];
        args[0] = term13757;
        args[1] = null;
        try {
            callMethod(klass, "getInstance", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


