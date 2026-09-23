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

public class ReaderBasedJsonParser_init_1237508164185 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term189206;
     Object term189348;

    public ReaderBasedJsonParser_init_1237508164185() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term189022 = newInstance(Class.forName("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        Object term189122 = newInstance(Class.forName("com.fasterxml.jackson.core.json.JsonReadContext"));
        setIntField(term189022, term189022.getClass(), "_features", 0);
        setIntField(term189022, term189022.getClass(), "_currInputRow", 0);
        setIntField(term189022, term189022.getClass(), "_tokenInputRow", 0);
        setIntField(term189022, term189022.getClass(), "_numTypesValid", 0);
        setField(term189022, term189022.getClass(), "_ioContext", null);
        setField(term189022, term189022.getClass(), "_textBuffer", null);
        setField(term189022, term189022.getClass(), "_parsingContext", term189122);
        setField(term189022, term189022.getClass(), "_reader", null);
        term189206 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        Object term189304 = newInstance(Class.forName("com.fasterxml.jackson.core.util.BufferRecycler"));
        Object[] term188792 = (Object[]) newArray("[C", 128);
        char[] term188793 = (char[]) newCharArray(0);
        setElement(term188792, 0, term188793);
        setField(term189304, term189304.getClass(), "_charBuffers", term188792);
        setField(term189206, term189206.getClass(), "_bufferRecycler", term189304);
        setField(term189206, term189206.getClass(), "_tokenCBuffer", null);
        term189348 = newInstance(Class.forName("java.io.PipedReader"));
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
        args[0] = term189206;
        args[1] = -1;
        args[2] = term189348;
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


