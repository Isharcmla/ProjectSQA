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

public class ReaderBasedJsonParser_init_1237508164199 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term168119;

    public ReaderBasedJsonParser_init_1237508164199() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term167951 = newInstance(Class.forName("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        Object term168035 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        setIntField(term167951, term167951.getClass(), "_features", 0);
        setIntField(term167951, term167951.getClass(), "_currInputRow", 0);
        setIntField(term167951, term167951.getClass(), "_tokenInputRow", 0);
        setIntField(term167951, term167951.getClass(), "_numTypesValid", 0);
        setField(term167951, term167951.getClass(), "_ioContext", term168035);
        setField(term167951, term167951.getClass(), "_textBuffer", null);
        setField(term167951, term167951.getClass(), "_parsingContext", null);
        setField(term167951, term167951.getClass(), "_reader", null);
        term168119 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        Object term168217 = newInstance(Class.forName("com.fasterxml.jackson.core.util.BufferRecycler"));
        Object[] term167702 = (Object[]) newArray("[C", 8);
        setField(term168217, term168217.getClass(), "_charBuffers", term167702);
        setField(term168119, term168119.getClass(), "_bufferRecycler", term168217);
        setField(term168119, term168119.getClass(), "_tokenCBuffer", null);
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
        args[0] = term168119;
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


