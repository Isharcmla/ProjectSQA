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

public class ReaderBasedJsonParser_init_1237508164183 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term160960;

    public ReaderBasedJsonParser_init_1237508164183() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term160792 = newInstance(Class.forName("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        Object term160876 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        setIntField(term160792, term160792.getClass(), "_features", 0);
        setIntField(term160792, term160792.getClass(), "_currInputRow", 0);
        setIntField(term160792, term160792.getClass(), "_tokenInputRow", 0);
        setIntField(term160792, term160792.getClass(), "_numTypesValid", 0);
        setField(term160792, term160792.getClass(), "_ioContext", term160876);
        setField(term160792, term160792.getClass(), "_textBuffer", null);
        setField(term160792, term160792.getClass(), "_parsingContext", null);
        setField(term160792, term160792.getClass(), "_reader", null);
        term160960 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        Object term161058 = newInstance(Class.forName("com.fasterxml.jackson.core.util.BufferRecycler"));
        Object[] term160026 = (Object[]) newArray("[C", 2);
        char[] term160027 = (char[]) newCharArray(266);
        setElement(term160026, 0, term160027);
        setField(term161058, term161058.getClass(), "_charBuffers", term160026);
        setField(term160960, term160960.getClass(), "_bufferRecycler", term161058);
        setField(term160960, term160960.getClass(), "_tokenCBuffer", null);
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
        args[0] = term160960;
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


