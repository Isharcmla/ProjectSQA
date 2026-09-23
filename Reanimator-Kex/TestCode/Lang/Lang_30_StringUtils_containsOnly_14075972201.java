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

public class StringUtils_containsOnly_14075972201 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1372;
     Object term9545;

    public StringUtils_containsOnly_14075972201() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1372 = (char[]) newCharArray(6);
        setCharElement(term1372, 0, 'J');
        setCharElement(term1372, 1, 'A');
        setCharElement(term1372, 2, 'E');
        setCharElement(term1372, 3, 't');
        setCharElement(term1372, 4, 'R');
        setCharElement(term1372, 5, 'r');
        term9545 = (char[]) newCharArray(6);
        setCharElement(term9545, 0, 'J');
        setCharElement(term9545, 1, 'A');
        setCharElement(term9545, 2, 'E');
        setCharElement(term9545, 3, 't');
        setCharElement(term9545, 4, 'R');
        setCharElement(term9545, 5, 'r');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.StringUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.CharSequence");
        argTypes[1] = Array.newInstance(char.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term1372;
        Object retValue = callMethod(klass, "containsOnly", argTypes, null, args);
        assertTrue(recursiveEquals(term1372, term9545));
        assertTrue(recursiveEquals(retValue, false));
    }

};


