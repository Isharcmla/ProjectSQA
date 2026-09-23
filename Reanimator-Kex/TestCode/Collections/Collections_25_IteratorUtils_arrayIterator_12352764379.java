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

public class IteratorUtils_arrayIterator_12352764379 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21;
     Object term27;
     Object term29;

    public IteratorUtils_arrayIterator_12352764379() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21 = (Object[]) newArray("java.lang.Object", 5);
        Object term22 = newInstance(Class.forName("java.lang.Object"));
        Object term23 = newInstance(Class.forName("java.lang.Object"));
        Object term24 = newInstance(Class.forName("java.lang.Object"));
        Object term25 = newInstance(Class.forName("java.lang.Object"));
        Object term26 = newInstance(Class.forName("java.lang.Object"));
        setElement(term21, 0, term22);
        setElement(term21, 1, term23);
        setElement(term21, 2, term24);
        setElement(term21, 3, term25);
        setElement(term21, 4, term26);
        term27 = new Integer(1484323161);
        term29 = new Integer(391863371);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections4.IteratorUtils");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term21;
        args[1] = term27;
        args[2] = term29;
        try {
            callMethod(klass, "arrayIterator", argTypes, null, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


