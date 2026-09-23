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

public class ReaderBasedJsonParser_init_1237508164195 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term293827;

    public ReaderBasedJsonParser_init_1237508164195() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term293643 = newInstance(Class.forName("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        Object term293743 = newInstance(Class.forName("com.fasterxml.jackson.core.json.JsonReadContext"));
        setIntField(term293643, term293643.getClass(), "_features", 0);
        setIntField(term293643, term293643.getClass(), "_currInputRow", 0);
        setIntField(term293643, term293643.getClass(), "_tokenInputRow", 0);
        setIntField(term293643, term293643.getClass(), "_numTypesValid", 0);
        setField(term293643, term293643.getClass(), "_ioContext", null);
        setField(term293643, term293643.getClass(), "_textBuffer", null);
        setField(term293743, term293743.getClass(), "_parent", null);
        setField(term293743, term293743.getClass(), "_dups", null);
        setIntField(term293743, term293743.getClass(), "_type", 0);
        setIntField(term293743, term293743.getClass(), "_lineNr", 0);
        setIntField(term293743, term293743.getClass(), "_columnNr", 0);
        setIntField(term293743, term293743.getClass(), "_index", 0);
        setField(term293643, term293643.getClass(), "_parsingContext", term293743);
        setField(term293643, term293643.getClass(), "_reader", null);
        term293827 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        Object term293925 = newInstance(Class.forName("com.fasterxml.jackson.core.util.BufferRecycler"));
        setField(term293827, term293827.getClass(), "_bufferRecycler", term293925);
        setField(term293827, term293827.getClass(), "_tokenCBuffer", null);
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
        args[0] = term293827;
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


