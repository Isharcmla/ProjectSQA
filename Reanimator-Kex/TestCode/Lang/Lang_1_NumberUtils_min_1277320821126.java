package org.apache.commons.lang3.math;

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
import static org.apache.commons.lang3.math.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang3.math.EqualityUtils.*;

public class NumberUtils_min_1277320821126 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10018;
     Object term14169;

    public NumberUtils_min_1277320821126() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10018 = (short[]) newShortArray(8);
        setShortElement(term10018, 0, (short) 1);
        setShortElement(term10018, 2, (short) 1);
        setShortElement(term10018, 3, (short) 1);
        setShortElement(term10018, 4, (short) 1);
        setShortElement(term10018, 5, (short) 1);
        setShortElement(term10018, 6, (short) 1);
        setShortElement(term10018, 7, (short) 1);
        term14169 = (short[]) newShortArray(8);
        setShortElement(term14169, 0, (short) 1);
        setShortElement(term14169, 2, (short) 1);
        setShortElement(term14169, 3, (short) 1);
        setShortElement(term14169, 4, (short) 1);
        setShortElement(term14169, 5, (short) 1);
        setShortElement(term14169, 6, (short) 1);
        setShortElement(term14169, 7, (short) 1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.NumberUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(short.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term10018;
        callMethod(klass, "min", argTypes, null, args);
        assertTrue(recursiveEquals(term10018, term14169));
    }

};


