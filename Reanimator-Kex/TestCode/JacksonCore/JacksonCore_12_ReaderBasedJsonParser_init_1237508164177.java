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

public class ReaderBasedJsonParser_init_1237508164177 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49363;
     Object term49519;

    public ReaderBasedJsonParser_init_1237508164177() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term49189 = newInstance(Class.forName("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] term48878 = (char[]) newCharArray(0);
        Object term49279 = newInstance(Class.forName("com.fasterxml.jackson.core.util.TextBuffer"));
        setIntField(term49189, term49189.getClass(), "_features", 0);
        setIntField(term49189, term49189.getClass(), "_inputPtr", 0);
        setIntField(term49189, term49189.getClass(), "_inputEnd", 0);
        setLongField(term49189, term49189.getClass(), "_currInputProcessed", 0L);
        setIntField(term49189, term49189.getClass(), "_currInputRow", 0);
        setIntField(term49189, term49189.getClass(), "_currInputRowStart", 0);
        setLongField(term49189, term49189.getClass(), "_tokenInputTotal", 0L);
        setIntField(term49189, term49189.getClass(), "_tokenInputRow", 0);
        setIntField(term49189, term49189.getClass(), "_tokenInputCol", 0);
        setField(term49189, term49189.getClass(), "_nameCopyBuffer", term48878);
        setBooleanField(term49189, term49189.getClass(), "_nameCopied", false);
        setField(term49189, term49189.getClass(), "_byteArrayBuilder", null);
        setIntField(term49189, term49189.getClass(), "_numTypesValid", 0);
        setField(term49189, term49189.getClass(), "_ioContext", null);
        setField(term49189, term49189.getClass(), "_textBuffer", term49279);
        setField(term49189, term49189.getClass(), "_parsingContext", null);
        setBooleanField(term49189, term49189.getClass(), "_tokenIncomplete", false);
        setField(term49189, term49189.getClass(), "_reader", null);
        term49363 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        Object term49461 = newInstance(Class.forName("com.fasterxml.jackson.core.util.BufferRecycler"));
        Object[] term48961 = (Object[]) newArray("[C", 2);
        setField(term49461, term49461.getClass(), "_charBuffers", term48961);
        setField(term49363, term49363.getClass(), "_bufferRecycler", term49461);
        setField(term49363, term49363.getClass(), "_tokenCBuffer", null);
        term49519 = newInstance(Class.forName("java.io.Console$LineReader"));
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
        args[0] = term49363;
        args[1] = -1;
        args[2] = term49519;
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


