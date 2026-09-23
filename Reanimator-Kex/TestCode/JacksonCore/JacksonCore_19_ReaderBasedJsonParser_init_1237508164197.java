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

public class ReaderBasedJsonParser_init_1237508164197 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term295132;

    public ReaderBasedJsonParser_init_1237508164197() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term294964 = newInstance(Class.forName("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        Object term295048 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        setIntField(term294964, term294964.getClass(), "_features", 0);
        setIntField(term294964, term294964.getClass(), "_currInputRow", 0);
        setIntField(term294964, term294964.getClass(), "_tokenInputRow", 0);
        setIntField(term294964, term294964.getClass(), "_numTypesValid", 0);
        setField(term294964, term294964.getClass(), "_ioContext", term295048);
        setField(term294964, term294964.getClass(), "_textBuffer", null);
        setField(term294964, term294964.getClass(), "_parsingContext", null);
        setField(term294964, term294964.getClass(), "_reader", null);
        term295132 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        Object term295230 = newInstance(Class.forName("com.fasterxml.jackson.core.util.BufferRecycler"));
        Object[] term294733 = (Object[]) newArray("[C", 32);
        setField(term295230, term295230.getClass(), "_charBuffers", term294733);
        setField(term295132, term295132.getClass(), "_bufferRecycler", term295230);
        setField(term295132, term295132.getClass(), "_tokenCBuffer", null);
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
        args[0] = term295132;
        args[1] = -1;
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


