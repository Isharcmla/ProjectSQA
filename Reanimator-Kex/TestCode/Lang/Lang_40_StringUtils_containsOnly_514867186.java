package org.apache.commons.lang;

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
import static org.apache.commons.lang.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang.EqualityUtils.*;

public class StringUtils_containsOnly_514867186 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1242;
     Object term9628;

    public StringUtils_containsOnly_514867186() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1242 = (char[]) newCharArray(6);
        setCharElement(term1242, 0, 'J');
        setCharElement(term1242, 1, 'A');
        setCharElement(term1242, 2, 'E');
        setCharElement(term1242, 3, 't');
        setCharElement(term1242, 4, 'R');
        setCharElement(term1242, 5, 'r');
        term9628 = (char[]) newCharArray(6);
        setCharElement(term9628, 0, 'J');
        setCharElement(term9628, 1, 'A');
        setCharElement(term9628, 2, 'E');
        setCharElement(term9628, 3, 't');
        setCharElement(term9628, 4, 'R');
        setCharElement(term9628, 5, 'r');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.StringUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Array.newInstance(char.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = "onpbIeEKoi";
        args[1] = term1242;
        Object retValue = callMethod(klass, "containsOnly", argTypes, null, args);
        assertTrue(recursiveEquals(term1242, term9628));
        assertTrue(recursiveEquals(retValue, false));
    }

};


