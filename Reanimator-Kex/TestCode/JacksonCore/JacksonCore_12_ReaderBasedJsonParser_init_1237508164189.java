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

public class ReaderBasedJsonParser_init_1237508164189 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term219339;
     Object term219481;

    public ReaderBasedJsonParser_init_1237508164189() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term219027 = newInstance(Class.forName("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        Object term219111 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        Object term219211 = newInstance(Class.forName("com.fasterxml.jackson.core.json.JsonReadContext"));
        Object term219255 = newInstance(Class.forName("java.io.PipedReader"));
        setIntField(term219027, term219027.getClass(), "_features", 0);
        setIntField(term219027, term219027.getClass(), "_inputPtr", 0);
        setIntField(term219027, term219027.getClass(), "_inputEnd", 0);
        setLongField(term219027, term219027.getClass(), "_currInputProcessed", 0L);
        setIntField(term219027, term219027.getClass(), "_currInputRow", 0);
        setIntField(term219027, term219027.getClass(), "_currInputRowStart", 0);
        setLongField(term219027, term219027.getClass(), "_tokenInputTotal", 0L);
        setIntField(term219027, term219027.getClass(), "_tokenInputRow", 0);
        setIntField(term219027, term219027.getClass(), "_tokenInputCol", 0);
        setField(term219027, term219027.getClass(), "_nameCopyBuffer", null);
        setBooleanField(term219027, term219027.getClass(), "_nameCopied", false);
        setField(term219027, term219027.getClass(), "_byteArrayBuilder", null);
        setIntField(term219027, term219027.getClass(), "_numTypesValid", 0);
        setField(term219027, term219027.getClass(), "_ioContext", term219111);
        setField(term219027, term219027.getClass(), "_textBuffer", null);
        setField(term219027, term219027.getClass(), "_parsingContext", term219211);
        setBooleanField(term219027, term219027.getClass(), "_tokenIncomplete", false);
        setField(term219027, term219027.getClass(), "_reader", term219255);
        term219339 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        Object term219437 = newInstance(Class.forName("com.fasterxml.jackson.core.util.BufferRecycler"));
        setField(term219339, term219339.getClass(), "_bufferRecycler", term219437);
        setField(term219339, term219339.getClass(), "_tokenCBuffer", null);
        term219481 = newInstance(Class.forName("java.io.PipedReader"));
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
        args[0] = term219339;
        args[1] = 0;
        args[2] = term219481;
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


