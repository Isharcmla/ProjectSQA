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

public class ReaderBasedJsonParser_init_1237508164138 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22164;
     Object term22320;

    public ReaderBasedJsonParser_init_1237508164138() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term21846 = newInstance(Class.forName("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] term21624 = (char[]) newCharArray(0);
        Object term21936 = newInstance(Class.forName("com.fasterxml.jackson.core.util.TextBuffer"));
        Object term22036 = newInstance(Class.forName("com.fasterxml.jackson.core.json.JsonReadContext"));
        Object term22080 = newInstance(Class.forName("java.io.PipedReader"));
        setIntField(term21846, term21846.getClass(), "_features", 0);
        setIntField(term21846, term21846.getClass(), "_inputPtr", 0);
        setIntField(term21846, term21846.getClass(), "_inputEnd", 0);
        setLongField(term21846, term21846.getClass(), "_currInputProcessed", 0L);
        setIntField(term21846, term21846.getClass(), "_currInputRow", 0);
        setIntField(term21846, term21846.getClass(), "_currInputRowStart", 0);
        setLongField(term21846, term21846.getClass(), "_tokenInputTotal", 0L);
        setIntField(term21846, term21846.getClass(), "_tokenInputRow", 0);
        setIntField(term21846, term21846.getClass(), "_tokenInputCol", 0);
        setField(term21846, term21846.getClass(), "_nameCopyBuffer", term21624);
        setBooleanField(term21846, term21846.getClass(), "_nameCopied", false);
        setField(term21846, term21846.getClass(), "_byteArrayBuilder", null);
        setIntField(term21846, term21846.getClass(), "_numTypesValid", 0);
        setField(term21846, term21846.getClass(), "_ioContext", null);
        setField(term21846, term21846.getClass(), "_textBuffer", term21936);
        setField(term21846, term21846.getClass(), "_parsingContext", term22036);
        setBooleanField(term21846, term21846.getClass(), "_tokenIncomplete", false);
        setField(term21846, term21846.getClass(), "_reader", term22080);
        term22164 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        Object term22262 = newInstance(Class.forName("com.fasterxml.jackson.core.util.BufferRecycler"));
        setField(term22164, term22164.getClass(), "_bufferRecycler", term22262);
        setField(term22164, term22164.getClass(), "_tokenCBuffer", null);
        term22320 = newInstance(Class.forName("java.io.Console$LineReader"));
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
        args[0] = term22164;
        args[1] = 0;
        args[2] = term22320;
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


