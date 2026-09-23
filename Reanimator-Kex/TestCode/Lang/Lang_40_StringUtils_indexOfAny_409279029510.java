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

public class StringUtils_indexOfAny_409279029510 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term168896;
     Object term250159;

    public StringUtils_indexOfAny_409279029510() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term168896 = (char[]) newCharArray(3);
        setCharElement(term168896, 0, (char) 1);
        setCharElement(term168896, 1, (char) 1);
        setCharElement(term168896, 2, (char) 1);
        term250159 = (char[]) newCharArray(3);
        setCharElement(term250159, 0, (char) 1);
        setCharElement(term250159, 1, (char) 1);
        setCharElement(term250159, 2, (char) 1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.StringUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Array.newInstance(char.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = "   ";
        args[1] = term168896;
        Object retValue = callMethod(klass, "indexOfAny", argTypes, null, args);
        assertTrue(recursiveEquals(term168896, term250159));
        assertTrue(recursiveEquals(retValue, -1));
    }

};


