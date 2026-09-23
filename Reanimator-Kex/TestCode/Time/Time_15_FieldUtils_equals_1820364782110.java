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

public class FieldUtils_equals_1820364782110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8544;
     Object term8582;
     Object term9105;
     Object term9106;

    public FieldUtils_equals_1820364782110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8544 = newInstance(Class.forName("java.util.ResourceBundle$NoFallbackControl"));
        term8582 = newInstance(Class.forName("java.lang.Object"));
        term9105 = newInstance(Class.forName("java.util.ResourceBundle$NoFallbackControl"));
        setField(term9105, term9105.getClass(), "formats", null);
        term9106 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.field.FieldUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term8544;
        args[1] = term8582;
        Object retValue = callMethod(klass, "equals", argTypes, null, args);
        assertTrue(recursiveEquals(term8544, term9105));
        assertTrue(recursiveEquals(term8582, term9106));
        assertTrue(recursiveEquals(retValue, false));
    }

};


