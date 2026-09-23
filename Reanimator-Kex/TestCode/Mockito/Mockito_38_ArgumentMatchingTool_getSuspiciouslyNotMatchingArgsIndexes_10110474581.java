package org.mockito.internal.verification.argumentmatching;

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
import static org.mockito.internal.verification.argumentmatching.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.LinkedList;
import java.lang.Object;

public class ArgumentMatchingTool_getSuspiciouslyNotMatchingArgsIndexes_10110474581 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term2;
     Object term10;

    public ArgumentMatchingTool_getSuspiciouslyNotMatchingArgsIndexes_10110474581() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("org.mockito.internal.verification.argumentmatching.ArgumentMatchingTool"));
        term2 = new LinkedList();
        ((LinkedList) term2).add((Object)null);
        ((LinkedList) term2).add((Object)null);
        ((LinkedList) term2).add((Object)null);
        ((LinkedList) term2).add((Object)null);
        ((LinkedList) term2).add((Object)null);
        term10 = (Object[]) newArray("java.lang.Object", 9);
        Object term11 = newInstance(Class.forName("java.lang.Object"));
        Object term12 = newInstance(Class.forName("java.lang.Object"));
        Object term13 = newInstance(Class.forName("java.lang.Object"));
        Object term14 = newInstance(Class.forName("java.lang.Object"));
        Object term15 = newInstance(Class.forName("java.lang.Object"));
        Object term16 = newInstance(Class.forName("java.lang.Object"));
        Object term17 = newInstance(Class.forName("java.lang.Object"));
        Object term18 = newInstance(Class.forName("java.lang.Object"));
        Object term19 = newInstance(Class.forName("java.lang.Object"));
        setElement(term10, 0, term11);
        setElement(term10, 1, term12);
        setElement(term10, 2, term13);
        setElement(term10, 3, term14);
        setElement(term10, 4, term15);
        setElement(term10, 5, term16);
        setElement(term10, 6, term17);
        setElement(term10, 7, term18);
        setElement(term10, 8, term19);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.internal.verification.argumentmatching.ArgumentMatchingTool");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.List");
        argTypes[1] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[2];
        args[0] = term2;
        args[1] = term10;
        callMethod(klass, "getSuspiciouslyNotMatchingArgsIndexes", argTypes, term1, args);
    }

};


