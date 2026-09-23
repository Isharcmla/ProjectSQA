package org.mockito.exceptions;

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
import org.mockito.exceptions.misusing.InvalidUseOfMatchersException;
import static org.mockito.exceptions.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.util.LinkedList;

public class Reporter_invalidUseOfMatchers_79189035393 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3271;
     Object term3272;
     Object term3274;

    public Reporter_invalidUseOfMatchers_79189035393() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3271 = newInstance(Class.forName("org.mockito.exceptions.Reporter"));
        term3272 = new Integer(568599855);
        term3274 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.exceptions.Reporter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("java.util.List");
        Object[] args = new Object[2];
        args[0] = term3272;
        args[1] = term3274;
        try {
            callMethod(klass, "invalidUseOfMatchers", argTypes, term3271, args);
            assertTrue(false);
        }
        catch (InvalidUseOfMatchersException e) {
        }

    }

};


