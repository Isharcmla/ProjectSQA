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

public class ReaderBasedJsonParser_init_1237508164219 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term392740;

    public ReaderBasedJsonParser_init_1237508164219() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term392382 = newInstance(Class.forName("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        Object term392466 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        Object term392556 = newInstance(Class.forName("com.fasterxml.jackson.core.util.TextBuffer"));
        Object term392656 = newInstance(Class.forName("com.fasterxml.jackson.core.json.JsonReadContext"));
        setIntField(term392382, term392382.getClass(), "_features", 0);
        setIntField(term392382, term392382.getClass(), "_currInputRow", 0);
        setIntField(term392382, term392382.getClass(), "_tokenInputRow", 0);
        setIntField(term392382, term392382.getClass(), "_numTypesValid", 0);
        setField(term392382, term392382.getClass(), "_ioContext", term392466);
        setField(term392382, term392382.getClass(), "_textBuffer", term392556);
        setField(term392382, term392382.getClass(), "_parsingContext", term392656);
        setField(term392382, term392382.getClass(), "_reader", null);
        term392740 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        Object term392838 = newInstance(Class.forName("com.fasterxml.jackson.core.util.BufferRecycler"));
        Object[] term392130 = (Object[]) newArray("[C", 1);
        char[] term392131 = (char[]) newCharArray(0);
        setElement(term392130, 0, term392131);
        setField(term392838, term392838.getClass(), "_charBuffers", term392130);
        setField(term392740, term392740.getClass(), "_bufferRecycler", term392838);
        setField(term392740, term392740.getClass(), "_tokenCBuffer", null);
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
        args[0] = term392740;
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


