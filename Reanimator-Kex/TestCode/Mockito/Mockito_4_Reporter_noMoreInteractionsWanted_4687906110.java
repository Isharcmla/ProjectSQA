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
import java.lang.NullPointerException;
import static org.mockito.exceptions.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.LinkedList;

public class Reporter_noMoreInteractionsWanted_4687906110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3385;
     Object term3386;

    public Reporter_noMoreInteractionsWanted_4687906110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3385 = newInstance(Class.forName("org.mockito.exceptions.Reporter"));
        term3386 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.exceptions.Reporter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.mockito.invocation.Invocation");
        argTypes[1] = Class.forName("java.util.List");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term3386;
        try {
            callMethod(klass, "noMoreInteractionsWanted", argTypes, term3385, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


