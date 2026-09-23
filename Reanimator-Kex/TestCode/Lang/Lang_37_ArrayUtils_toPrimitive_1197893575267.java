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
import java.lang.Character;

public class ArrayUtils_toPrimitive_1197893575267 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1093;
     Object term14014;
     Object term14003;

    public ArrayUtils_toPrimitive_1197893575267() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term1094 = new Character('I');
        Character term1096 = new Character('R');
        Character term1098 = new Character('b');
        term1093 = (Object[]) newArray("java.lang.Character", 3);
        setElement(term1093, 0, term1094);
        setElement(term1093, 1, term1096);
        setElement(term1093, 2, term1098);
        Character term14015 = new Character('I');
        Character term14016 = new Character('R');
        Character term14017 = new Character('b');
        term14014 = (Object[]) newArray("java.lang.Character", 3);
        setElement(term14014, 0, term14015);
        setElement(term14014, 1, term14016);
        setElement(term14014, 2, term14017);
        term14003 = (char[]) newCharArray(3);
        setCharElement(term14003, 0, 'I');
        setCharElement(term14003, 1, 'R');
        setCharElement(term14003, 2, 'b');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Character"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term1093;
        Object retValue = callMethod(klass, "toPrimitive", argTypes, null, args);
        assertTrue(recursiveEquals(term1093, term14014));
        assertTrue(recursiveEquals(retValue, term14003));
    }

};


