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

public class ArrayUtils_clone_335220671184 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term67;
     Object term10738;
     Object term10728;

    public ArrayUtils_clone_335220671184() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term67 = (short[]) newShortArray(4);
        setShortElement(term67, 0, (short) 9519);
        setShortElement(term67, 1, (short) -10960);
        setShortElement(term67, 2, (short) -1703);
        setShortElement(term67, 3, (short) 23627);
        term10738 = (short[]) newShortArray(4);
        setShortElement(term10738, 0, (short) 9519);
        setShortElement(term10738, 1, (short) -10960);
        setShortElement(term10738, 2, (short) -1703);
        setShortElement(term10738, 3, (short) 23627);
        term10728 = (short[]) newShortArray(4);
        setShortElement(term10728, 0, (short) 9519);
        setShortElement(term10728, 1, (short) -10960);
        setShortElement(term10728, 2, (short) -1703);
        setShortElement(term10728, 3, (short) 23627);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(short.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term67;
        Object retValue = callMethod(klass, "clone", argTypes, null, args);
        assertTrue(recursiveEquals(term67, term10738));
        assertTrue(recursiveEquals(retValue, term10728));
    }

};


