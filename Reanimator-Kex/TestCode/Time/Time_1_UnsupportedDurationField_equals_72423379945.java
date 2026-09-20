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

public class UnsupportedDurationField_equals_72423379945 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term59;
     Object term60;
     Object term6402;
     Object term6403;

    public UnsupportedDurationField_equals_72423379945() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term59 = newInstance(Class.forName("org.joda.time.field.UnsupportedDurationField"));
        setField(term59, term59.getClass(), "iType", null);
        term60 = newInstance(Class.forName("java.lang.Object"));
        term6402 = newInstance(Class.forName("org.joda.time.field.UnsupportedDurationField"));
        setField(term6402, term6402.getClass(), "iType", null);
        term6403 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.field.UnsupportedDurationField");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term60;
        Object retValue = callMethod(klass, "equals", argTypes, term59, args);
        assertTrue(recursiveEquals(term59, term6402));
        assertTrue(recursiveEquals(term60, term6403));
        assertTrue(recursiveEquals(retValue, false));
    }

};
