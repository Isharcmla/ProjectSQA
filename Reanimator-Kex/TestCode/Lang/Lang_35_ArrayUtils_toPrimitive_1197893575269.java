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

public class ArrayUtils_toPrimitive_1197893575269 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1104;
     Object term14060;
     Object term14049;

    public ArrayUtils_toPrimitive_1197893575269() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Character term1105 = new Character('I');
        Character term1107 = new Character('R');
        Character term1109 = new Character('b');
        term1104 = (Object[]) newArray("java.lang.Character", 3);
        setElement(term1104, 0, term1105);
        setElement(term1104, 1, term1107);
        setElement(term1104, 2, term1109);
        Character term14061 = new Character('I');
        Character term14062 = new Character('R');
        Character term14063 = new Character('b');
        term14060 = (Object[]) newArray("java.lang.Character", 3);
        setElement(term14060, 0, term14061);
        setElement(term14060, 1, term14062);
        setElement(term14060, 2, term14063);
        term14049 = (char[]) newCharArray(3);
        setCharElement(term14049, 0, 'I');
        setCharElement(term14049, 1, 'R');
        setCharElement(term14049, 2, 'b');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Character"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term1104;
        Object retValue = callMethod(klass, "toPrimitive", argTypes, null, args);
        assertTrue(recursiveEquals(term1104, term14060));
        assertTrue(recursiveEquals(retValue, term14049));
    }

};


