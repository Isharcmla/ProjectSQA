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
     Object term289141;

    public ReaderBasedJsonParser_init_1237508164195() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term288973 = newInstance(Class.forName("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] term288736 = (char[]) newCharArray(0);
        Object term289057 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        setIntField(term288973, term288973.getClass(), "_features", 0);
        setIntField(term288973, term288973.getClass(), "_inputPtr", 0);
        setIntField(term288973, term288973.getClass(), "_inputEnd", 0);
        setLongField(term288973, term288973.getClass(), "_currInputProcessed", 0L);
        setIntField(term288973, term288973.getClass(), "_currInputRow", 0);
        setIntField(term288973, term288973.getClass(), "_currInputRowStart", 0);
        setLongField(term288973, term288973.getClass(), "_tokenInputTotal", 0L);
        setIntField(term288973, term288973.getClass(), "_tokenInputRow", 0);
        setIntField(term288973, term288973.getClass(), "_tokenInputCol", 0);
        setField(term288973, term288973.getClass(), "_nameCopyBuffer", term288736);
        setBooleanField(term288973, term288973.getClass(), "_nameCopied", false);
        setField(term288973, term288973.getClass(), "_byteArrayBuilder", null);
        setIntField(term288973, term288973.getClass(), "_numTypesValid", 0);
        setField(term288973, term288973.getClass(), "_ioContext", term289057);
        setField(term288973, term288973.getClass(), "_textBuffer", null);
        setField(term288973, term288973.getClass(), "_parsingContext", null);
        setBooleanField(term288973, term288973.getClass(), "_tokenIncomplete", false);
        setField(term288973, term288973.getClass(), "_reader", null);
        term289141 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        Object term289239 = newInstance(Class.forName("com.fasterxml.jackson.core.util.BufferRecycler"));
        setField(term289141, term289141.getClass(), "_bufferRecycler", term289239);
        setField(term289141, term289141.getClass(), "_tokenCBuffer", null);
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
        args[0] = term289141;
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


