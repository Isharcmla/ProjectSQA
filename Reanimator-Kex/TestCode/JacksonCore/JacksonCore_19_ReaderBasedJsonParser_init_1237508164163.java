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
import java.lang.ArrayIndexOutOfBoundsException;
import static com.fasterxml.jackson.core.json.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ReaderBasedJsonParser_init_1237508164163 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35368;

    public ReaderBasedJsonParser_init_1237508164163() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term35110 = newInstance(Class.forName("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        Object term35194 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        Object term35284 = newInstance(Class.forName("com.fasterxml.jackson.core.util.TextBuffer"));
        setIntField(term35110, term35110.getClass(), "_features", 0);
        setIntField(term35110, term35110.getClass(), "_currInputRow", 0);
        setIntField(term35110, term35110.getClass(), "_tokenInputRow", 0);
        setIntField(term35110, term35110.getClass(), "_numTypesValid", 0);
        setField(term35110, term35110.getClass(), "_ioContext", term35194);
        setField(term35110, term35110.getClass(), "_textBuffer", term35284);
        setField(term35110, term35110.getClass(), "_parsingContext", null);
        setField(term35110, term35110.getClass(), "_reader", null);
        term35368 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        Object term35466 = newInstance(Class.forName("com.fasterxml.jackson.core.util.BufferRecycler"));
        Object[] term34886 = (Object[]) newArray("[C", 0);
        setField(term35466, term35466.getClass(), "_charBuffers", term34886);
        setField(term35368, term35368.getClass(), "_bufferRecycler", term35466);
        setField(term35368, term35368.getClass(), "_tokenCBuffer", null);
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
        args[0] = term35368;
        args[1] = 0;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


