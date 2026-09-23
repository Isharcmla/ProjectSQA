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

public class ReaderBasedJsonParser_init_1237508164207 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term288087;

    public ReaderBasedJsonParser_init_1237508164207() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term287919 = newInstance(Class.forName("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        Object term288003 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        setIntField(term287919, term287919.getClass(), "_features", 0);
        setIntField(term287919, term287919.getClass(), "_currInputRow", 0);
        setIntField(term287919, term287919.getClass(), "_tokenInputRow", 0);
        setIntField(term287919, term287919.getClass(), "_numTypesValid", 0);
        setField(term287919, term287919.getClass(), "_ioContext", term288003);
        setField(term287919, term287919.getClass(), "_textBuffer", null);
        setField(term287919, term287919.getClass(), "_parsingContext", null);
        setField(term287919, term287919.getClass(), "_reader", null);
        term288087 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        Object term288185 = newInstance(Class.forName("com.fasterxml.jackson.core.util.BufferRecycler"));
        Object[] term287670 = (Object[]) newArray("[C", 4);
        setField(term288185, term288185.getClass(), "_charBuffers", term287670);
        setField(term288087, term288087.getClass(), "_bufferRecycler", term288185);
        setField(term288087, term288087.getClass(), "_tokenCBuffer", null);
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
        args[0] = term288087;
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


