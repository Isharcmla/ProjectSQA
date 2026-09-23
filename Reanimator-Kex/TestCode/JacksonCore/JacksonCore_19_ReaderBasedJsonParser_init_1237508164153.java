package com.fasterxml.jackson.core.json;

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
import static com.fasterxml.jackson.core.json.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ReaderBasedJsonParser_init_1237508164153 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25280;

    public ReaderBasedJsonParser_init_1237508164153() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term25112 = newInstance(Class.forName("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        Object term25196 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        setIntField(term25112, term25112.getClass(), "_features", 0);
        setIntField(term25112, term25112.getClass(), "_currInputRow", 0);
        setIntField(term25112, term25112.getClass(), "_tokenInputRow", 0);
        setIntField(term25112, term25112.getClass(), "_numTypesValid", 0);
        setField(term25112, term25112.getClass(), "_ioContext", term25196);
        setField(term25112, term25112.getClass(), "_textBuffer", null);
        setField(term25112, term25112.getClass(), "_parsingContext", null);
        setField(term25112, term25112.getClass(), "_reader", null);
        term25280 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        Object term25378 = newInstance(Class.forName("com.fasterxml.jackson.core.util.BufferRecycler"));
        setField(term25280, term25280.getClass(), "_bufferRecycler", term25378);
        setField(term25280, term25280.getClass(), "_tokenCBuffer", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.core.json.ReaderBasedJsonParser");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("com.fasterxml.jackson.core.io.IOContext");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("java.io.Reader");
        argTypes[3] = Class.forName("com.fasterxml.jackson.core.ObjectCodec");
        argTypes[4] = Class.forName("com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer");
        Object[] args = new Object[5];
        args[0] = term25280;
        args[1] = 0;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


