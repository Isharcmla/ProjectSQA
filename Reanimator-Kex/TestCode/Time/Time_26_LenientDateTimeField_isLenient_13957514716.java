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

public class LenientDateTimeField_isLenient_13957514716 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term397;

    public LenientDateTimeField_isLenient_13957514716() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("org.joda.time.field.LenientDateTimeField"));
        setField(term1, term1.getClass(), "iBase", null);
        setField(term1, term1.getClass(), "iField", null);
        setField(term1, term1.getClass(), "iType", null);
        term397 = newInstance(Class.forName("org.joda.time.field.LenientDateTimeField"));
        setField(term397, term397.getClass(), "iBase", null);
        setField(term397, term397.getClass(), "iField", null);
        setField(term397, term397.getClass(), "iType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.field.LenientDateTimeField");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isLenient", argTypes, term1, args);
        assertTrue(recursiveEquals(term1, term397));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


