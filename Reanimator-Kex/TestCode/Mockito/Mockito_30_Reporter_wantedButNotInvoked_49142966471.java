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
import java.lang.Object;

public class Reporter_wantedButNotInvoked_49142966471 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10167;
     Object term10168;

    public Reporter_wantedButNotInvoked_49142966471() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10167 = newInstance(Class.forName("org.mockito.exceptions.Reporter"));
        term10168 = new LinkedList();
        ((LinkedList) term10168).add((Object)null);
        ((LinkedList) term10168).add((Object)null);
        ((LinkedList) term10168).add((Object)null);
        ((LinkedList) term10168).add((Object)null);
        ((LinkedList) term10168).add((Object)null);
        ((LinkedList) term10168).add((Object)null);
        ((LinkedList) term10168).add((Object)null);
        ((LinkedList) term10168).add((Object)null);
        ((LinkedList) term10168).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.exceptions.Reporter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.mockito.exceptions.PrintableInvocation");
        argTypes[1] = Class.forName("java.util.List");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term10168;
        try {
            callMethod(klass, "wantedButNotInvoked", argTypes, term10167, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


