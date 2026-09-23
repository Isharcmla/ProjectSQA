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

public class IOContext_releaseNameCopyBuffer_207318869547 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51;

    public IOContext_releaseNameCopyBuffer_207318869547() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term51 = (char[]) newCharArray(6);
        setCharElement(term51, 0, 'n');
        setCharElement(term51, 1, 'Z');
        setCharElement(term51, 2, 't');
        setCharElement(term51, 3, 'T');
        setCharElement(term51, 4, 'D');
        setCharElement(term51, 5, 's');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.core.io.IOContext");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(char.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term51;
        try {
            callMethod(klass, "releaseNameCopyBuffer", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


