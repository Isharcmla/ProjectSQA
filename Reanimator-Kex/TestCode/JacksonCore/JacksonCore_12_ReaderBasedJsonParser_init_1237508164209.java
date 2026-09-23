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

public class ReaderBasedJsonParser_init_1237508164209 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term444095;
     Object term444251;

    public ReaderBasedJsonParser_init_1237508164209() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term444011 = newInstance(Class.forName("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] term443747 = (char[]) newCharArray(0);
        setIntField(term444011, term444011.getClass(), "_features", 0);
        setIntField(term444011, term444011.getClass(), "_inputPtr", 0);
        setIntField(term444011, term444011.getClass(), "_inputEnd", 0);
        setLongField(term444011, term444011.getClass(), "_currInputProcessed", 0L);
        setIntField(term444011, term444011.getClass(), "_currInputRow", 0);
        setIntField(term444011, term444011.getClass(), "_currInputRowStart", 0);
        setLongField(term444011, term444011.getClass(), "_tokenInputTotal", 0L);
        setIntField(term444011, term444011.getClass(), "_tokenInputRow", 0);
        setIntField(term444011, term444011.getClass(), "_tokenInputCol", 0);
        setField(term444011, term444011.getClass(), "_nameCopyBuffer", term443747);
        setBooleanField(term444011, term444011.getClass(), "_nameCopied", false);
        setField(term444011, term444011.getClass(), "_byteArrayBuilder", null);
        setIntField(term444011, term444011.getClass(), "_numTypesValid", 0);
        setField(term444011, term444011.getClass(), "_ioContext", null);
        setField(term444011, term444011.getClass(), "_textBuffer", null);
        setField(term444011, term444011.getClass(), "_parsingContext", null);
        setBooleanField(term444011, term444011.getClass(), "_tokenIncomplete", false);
        setField(term444011, term444011.getClass(), "_reader", null);
        term444095 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        Object term444193 = newInstance(Class.forName("com.fasterxml.jackson.core.util.BufferRecycler"));
        Object[] term443772 = (Object[]) newArray("[C", 1);
        char[] term443773 = (char[]) newCharArray(0);
        setElement(term443772, 0, term443773);
        setField(term444193, term444193.getClass(), "_charBuffers", term443772);
        setField(term444095, term444095.getClass(), "_bufferRecycler", term444193);
        setField(term444095, term444095.getClass(), "_tokenCBuffer", null);
        term444251 = newInstance(Class.forName("java.io.Console$LineReader"));
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
        args[0] = term444095;
        args[1] = 0;
        args[2] = term444251;
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


