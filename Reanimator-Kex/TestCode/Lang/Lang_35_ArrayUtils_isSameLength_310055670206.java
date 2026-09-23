package org.apache.commons.lang3;

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
import static org.apache.commons.lang3.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang3.EqualityUtils.*;

public class ArrayUtils_isSameLength_310055670206 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term352;
     Object term359;
     Object term11843;
     Object term11844;

    public ArrayUtils_isSameLength_310055670206() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term352 = (float[]) newFloatArray(6);
        setFloatElement(term352, 0, 0.5254275F);
        setFloatElement(term352, 1, 0.2857073F);
        setFloatElement(term352, 2, 0.6880585F);
        setFloatElement(term352, 3, 0.40176582F);
        setFloatElement(term352, 4, 0.8783184F);
        setFloatElement(term352, 5, 0.26413453F);
        term359 = (float[]) newFloatArray(2);
        setFloatElement(term359, 0, 0.7944024F);
        setFloatElement(term359, 1, 0.3692338F);
        term11843 = (float[]) newFloatArray(6);
        setFloatElement(term11843, 0, 0.5254275F);
        setFloatElement(term11843, 1, 0.2857073F);
        setFloatElement(term11843, 2, 0.6880585F);
        setFloatElement(term11843, 3, 0.40176582F);
        setFloatElement(term11843, 4, 0.8783184F);
        setFloatElement(term11843, 5, 0.26413453F);
        term11844 = (float[]) newFloatArray(2);
        setFloatElement(term11844, 0, 0.7944024F);
        setFloatElement(term11844, 1, 0.3692338F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(float.class, 0).getClass();
        argTypes[1] = Array.newInstance(float.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term352;
        args[1] = term359;
        Object retValue = callMethod(klass, "isSameLength", argTypes, null, args);
        assertTrue(recursiveEquals(term352, term11843));
        assertTrue(recursiveEquals(term359, term11844));
        assertTrue(recursiveEquals(retValue, false));
    }

};


