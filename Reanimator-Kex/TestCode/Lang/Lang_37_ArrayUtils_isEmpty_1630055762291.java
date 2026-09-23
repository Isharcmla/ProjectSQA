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
import java.lang.Object;

public class ArrayUtils_isEmpty_1630055762291 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1313;
     Object term14742;

    public ArrayUtils_isEmpty_1630055762291() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1313 = (Object[]) newArray("java.lang.Object", 9);
        Object term1314 = newInstance(Class.forName("java.lang.Object"));
        Object term1315 = newInstance(Class.forName("java.lang.Object"));
        Object term1316 = newInstance(Class.forName("java.lang.Object"));
        Object term1317 = newInstance(Class.forName("java.lang.Object"));
        Object term1318 = newInstance(Class.forName("java.lang.Object"));
        Object term1319 = newInstance(Class.forName("java.lang.Object"));
        Object term1320 = newInstance(Class.forName("java.lang.Object"));
        Object term1321 = newInstance(Class.forName("java.lang.Object"));
        Object term1322 = newInstance(Class.forName("java.lang.Object"));
        setElement(term1313, 0, term1314);
        setElement(term1313, 1, term1315);
        setElement(term1313, 2, term1316);
        setElement(term1313, 3, term1317);
        setElement(term1313, 4, term1318);
        setElement(term1313, 5, term1319);
        setElement(term1313, 6, term1320);
        setElement(term1313, 7, term1321);
        setElement(term1313, 8, term1322);
        term14742 = (Object[]) newArray("java.lang.Object", 9);
        Object term14743 = newInstance(Class.forName("java.lang.Object"));
        Object term14744 = newInstance(Class.forName("java.lang.Object"));
        Object term14745 = newInstance(Class.forName("java.lang.Object"));
        Object term14746 = newInstance(Class.forName("java.lang.Object"));
        Object term14747 = newInstance(Class.forName("java.lang.Object"));
        Object term14748 = newInstance(Class.forName("java.lang.Object"));
        Object term14749 = newInstance(Class.forName("java.lang.Object"));
        Object term14750 = newInstance(Class.forName("java.lang.Object"));
        Object term14751 = newInstance(Class.forName("java.lang.Object"));
        setElement(term14742, 0, term14743);
        setElement(term14742, 1, term14744);
        setElement(term14742, 2, term14745);
        setElement(term14742, 3, term14746);
        setElement(term14742, 4, term14747);
        setElement(term14742, 5, term14748);
        setElement(term14742, 6, term14749);
        setElement(term14742, 7, term14750);
        setElement(term14742, 8, term14751);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term1313;
        Object retValue = callMethod(klass, "isEmpty", argTypes, null, args);
        assertTrue(recursiveEquals(term1313, term14742));
        assertTrue(recursiveEquals(retValue, false));
    }

};


