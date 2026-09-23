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

public class UnsupportedDurationField_equals_72423379961 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11468;
     Object term11562;

    public UnsupportedDurationField_equals_72423379961() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11468 = newInstance(Class.forName("org.joda.time.field.UnsupportedDurationField"));
        term11562 = newInstance(Class.forName("org.joda.time.field.UnsupportedDurationField"));
        Object term11682 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        setField(term11562, term11562.getClass(), "iType", term11682);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.field.UnsupportedDurationField");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term11562;
        try {
            callMethod(klass, "equals", argTypes, term11468, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


