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

public class ArrayUtils_isSameLength_310055670204 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term341;
     Object term348;
     Object term11797;
     Object term11798;

    public ArrayUtils_isSameLength_310055670204() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term341 = (float[]) newFloatArray(6);
        setFloatElement(term341, 0, 0.5254275F);
        setFloatElement(term341, 1, 0.2857073F);
        setFloatElement(term341, 2, 0.6880585F);
        setFloatElement(term341, 3, 0.40176582F);
        setFloatElement(term341, 4, 0.8783184F);
        setFloatElement(term341, 5, 0.26413453F);
        term348 = (float[]) newFloatArray(2);
        setFloatElement(term348, 0, 0.7944024F);
        setFloatElement(term348, 1, 0.3692338F);
        term11797 = (float[]) newFloatArray(6);
        setFloatElement(term11797, 0, 0.5254275F);
        setFloatElement(term11797, 1, 0.2857073F);
        setFloatElement(term11797, 2, 0.6880585F);
        setFloatElement(term11797, 3, 0.40176582F);
        setFloatElement(term11797, 4, 0.8783184F);
        setFloatElement(term11797, 5, 0.26413453F);
        term11798 = (float[]) newFloatArray(2);
        setFloatElement(term11798, 0, 0.7944024F);
        setFloatElement(term11798, 1, 0.3692338F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(float.class, 0).getClass();
        argTypes[1] = Array.newInstance(float.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term341;
        args[1] = term348;
        Object retValue = callMethod(klass, "isSameLength", argTypes, null, args);
        assertTrue(recursiveEquals(term341, term11797));
        assertTrue(recursiveEquals(term348, term11798));
        assertTrue(recursiveEquals(retValue, false));
    }

};


