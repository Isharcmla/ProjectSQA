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

public class ArrayUtils_clone_335220159187 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term96;
     Object term10813;
     Object term10797;

    public ArrayUtils_clone_335220159187() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term96 = (boolean[]) newBooleanArray(7);
        setBooleanElement(term96, 4, true);
        setBooleanElement(term96, 5, true);
        setBooleanElement(term96, 6, true);
        term10813 = (boolean[]) newBooleanArray(7);
        setBooleanElement(term10813, 4, true);
        setBooleanElement(term10813, 5, true);
        setBooleanElement(term10813, 6, true);
        term10797 = (boolean[]) newBooleanArray(7);
        setBooleanElement(term10797, 4, true);
        setBooleanElement(term10797, 5, true);
        setBooleanElement(term10797, 6, true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(boolean.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term96;
        Object retValue = callMethod(klass, "clone", argTypes, null, args);
        assertTrue(recursiveEquals(term96, term10813));
        assertTrue(recursiveEquals(retValue, term10797));
    }

};


