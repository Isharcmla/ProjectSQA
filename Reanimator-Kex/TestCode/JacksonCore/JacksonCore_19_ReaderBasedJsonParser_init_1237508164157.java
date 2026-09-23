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

public class ReaderBasedJsonParser_init_1237508164157 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31249;
     Object term31405;

    public ReaderBasedJsonParser_init_1237508164157() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term31121 = newInstance(Class.forName("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        Object term31165 = newInstance(Class.forName("java.io.PipedReader"));
        setIntField(term31121, term31121.getClass(), "_features", 0);
        setIntField(term31121, term31121.getClass(), "_currInputRow", 0);
        setIntField(term31121, term31121.getClass(), "_tokenInputRow", 0);
        setIntField(term31121, term31121.getClass(), "_numTypesValid", 0);
        setField(term31121, term31121.getClass(), "_ioContext", null);
        setField(term31121, term31121.getClass(), "_textBuffer", null);
        setField(term31121, term31121.getClass(), "_parsingContext", null);
        setField(term31121, term31121.getClass(), "_reader", term31165);
        term31249 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        Object term31347 = newInstance(Class.forName("com.fasterxml.jackson.core.util.BufferRecycler"));
        setField(term31249, term31249.getClass(), "_bufferRecycler", term31347);
        setField(term31249, term31249.getClass(), "_tokenCBuffer", null);
        term31405 = newInstance(Class.forName("java.io.Console$LineReader"));
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
        args[0] = term31249;
        args[1] = 0;
        args[2] = term31405;
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


