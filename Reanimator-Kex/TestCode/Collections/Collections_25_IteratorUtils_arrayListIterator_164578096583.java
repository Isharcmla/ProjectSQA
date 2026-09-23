package org.apache.commons.collections4;

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
import java.lang.ArrayIndexOutOfBoundsException;
import static org.apache.commons.collections4.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;

public class IteratorUtils_arrayListIterator_164578096583 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45;
     Object term52;

    public IteratorUtils_arrayListIterator_164578096583() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45 = (Object[]) newArray("java.lang.Object", 6);
        Object term46 = newInstance(Class.forName("java.lang.Object"));
        Object term47 = newInstance(Class.forName("java.lang.Object"));
        Object term48 = newInstance(Class.forName("java.lang.Object"));
        Object term49 = newInstance(Class.forName("java.lang.Object"));
        Object term50 = newInstance(Class.forName("java.lang.Object"));
        Object term51 = newInstance(Class.forName("java.lang.Object"));
        setElement(term45, 0, term46);
        setElement(term45, 1, term47);
        setElement(term45, 2, term48);
        setElement(term45, 3, term49);
        setElement(term45, 4, term50);
        setElement(term45, 5, term51);
        term52 = new Integer(-1955890973);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.IteratorUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term45;
        args[1] = term52;
        try {
            callMethod(klass, "arrayListIterator", argTypes, null, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


