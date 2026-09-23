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

public class ReaderBasedJsonParser_init_1237508164223 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term444340;

    public ReaderBasedJsonParser_init_1237508164223() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term444172 = newInstance(Class.forName("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        Object term444256 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        setIntField(term444172, term444172.getClass(), "_features", 0);
        setIntField(term444172, term444172.getClass(), "_currInputRow", 0);
        setIntField(term444172, term444172.getClass(), "_tokenInputRow", 0);
        setIntField(term444172, term444172.getClass(), "_numTypesValid", 0);
        setField(term444172, term444172.getClass(), "_ioContext", term444256);
        setField(term444172, term444172.getClass(), "_textBuffer", null);
        setField(term444172, term444172.getClass(), "_parsingContext", null);
        setField(term444172, term444172.getClass(), "_reader", null);
        term444340 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        Object term444438 = newInstance(Class.forName("com.fasterxml.jackson.core.util.BufferRecycler"));
        Object[] term443420 = (Object[]) newArray("[C", 1);
        char[] term443421 = (char[]) newCharArray(257);
        setElement(term443420, 0, term443421);
        setField(term444438, term444438.getClass(), "_charBuffers", term443420);
        setField(term444340, term444340.getClass(), "_bufferRecycler", term444438);
        setField(term444340, term444340.getClass(), "_tokenCBuffer", null);
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
        args[0] = term444340;
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


