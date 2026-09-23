package com.fasterxml.jackson.core.io;

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
import static com.fasterxml.jackson.core.io.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class IOContext_verifyRelease_112179874950 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term83;
     Object term91;

    public IOContext_verifyRelease_112179874950() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term83 = (char[]) newCharArray(7);
        setCharElement(term83, 0, 'j');
        setCharElement(term83, 1, 'l');
        setCharElement(term83, 2, 'J');
        setCharElement(term83, 3, 'A');
        setCharElement(term83, 4, 'E');
        setCharElement(term83, 5, 't');
        setCharElement(term83, 6, 'R');
        term91 = (char[]) newCharArray(1);
        setCharElement(term91, 0, 'r');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.core.io.IOContext");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(char.class, 0).getClass();
        argTypes[1] = Array.newInstance(char.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term83;
        args[1] = term91;
        try {
            callMethod(klass, "_verifyRelease", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


