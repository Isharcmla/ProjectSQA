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

public class ArrayUtils_clone_335220671182 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53;
     Object term10684;
     Object term10674;

    public ArrayUtils_clone_335220671182() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53 = (short[]) newShortArray(4);
        setShortElement(term53, 0, (short) 9519);
        setShortElement(term53, 1, (short) -10960);
        setShortElement(term53, 2, (short) -1703);
        setShortElement(term53, 3, (short) 23627);
        term10684 = (short[]) newShortArray(4);
        setShortElement(term10684, 0, (short) 9519);
        setShortElement(term10684, 1, (short) -10960);
        setShortElement(term10684, 2, (short) -1703);
        setShortElement(term10684, 3, (short) 23627);
        term10674 = (short[]) newShortArray(4);
        setShortElement(term10674, 0, (short) 9519);
        setShortElement(term10674, 1, (short) -10960);
        setShortElement(term10674, 2, (short) -1703);
        setShortElement(term10674, 3, (short) 23627);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(short.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term53;
        Object retValue = callMethod(klass, "clone", argTypes, null, args);
        assertTrue(recursiveEquals(term53, term10684));
        assertTrue(recursiveEquals(retValue, term10674));
    }

};


