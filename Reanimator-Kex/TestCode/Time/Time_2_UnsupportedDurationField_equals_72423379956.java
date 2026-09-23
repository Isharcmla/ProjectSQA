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
import static org.joda.time.field.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.joda.time.field.EqualityUtils.*;

public class UnsupportedDurationField_equals_72423379956 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9766;
     Object term10777;
     Object term10778;

    public UnsupportedDurationField_equals_72423379956() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9766 = newInstance(Class.forName("org.joda.time.field.UnsupportedDurationField"));
        term10777 = newInstance(Class.forName("org.joda.time.field.UnsupportedDurationField"));
        setField(term10777, term10777.getClass(), "iType", null);
        term10778 = newInstance(Class.forName("org.joda.time.field.UnsupportedDurationField"));
        setField(term10778, term10778.getClass(), "iType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.field.UnsupportedDurationField");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term9766;
        Object retValue = callMethod(klass, "equals", argTypes, term9766, args);
        assertTrue(recursiveEquals(term9766, term10777));
        assertTrue(recursiveEquals(term9766, term10778));
        assertTrue(recursiveEquals(retValue, true));
    }

};


