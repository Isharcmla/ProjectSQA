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

public class ReaderBasedJsonParser_init_1237508164159 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26309;
     Object term26453;

    public ReaderBasedJsonParser_init_1237508164159() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term25989 = newInstance(Class.forName("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] term25768 = (char[]) newCharArray(0);
        Object term26079 = newInstance(Class.forName("com.fasterxml.jackson.core.util.TextBuffer"));
        Object term26179 = newInstance(Class.forName("com.fasterxml.jackson.core.json.JsonReadContext"));
        Object term26225 = newInstance(Class.forName("java.io.StringReader"));
        setIntField(term25989, term25989.getClass(), "_features", 0);
        setIntField(term25989, term25989.getClass(), "_inputPtr", 0);
        setIntField(term25989, term25989.getClass(), "_inputEnd", 0);
        setLongField(term25989, term25989.getClass(), "_currInputProcessed", 0L);
        setIntField(term25989, term25989.getClass(), "_currInputRow", 0);
        setIntField(term25989, term25989.getClass(), "_currInputRowStart", 0);
        setLongField(term25989, term25989.getClass(), "_tokenInputTotal", 0L);
        setIntField(term25989, term25989.getClass(), "_tokenInputRow", 0);
        setIntField(term25989, term25989.getClass(), "_tokenInputCol", 0);
        setField(term25989, term25989.getClass(), "_nameCopyBuffer", term25768);
        setBooleanField(term25989, term25989.getClass(), "_nameCopied", false);
        setField(term25989, term25989.getClass(), "_byteArrayBuilder", null);
        setIntField(term25989, term25989.getClass(), "_numTypesValid", 0);
        setField(term25989, term25989.getClass(), "_ioContext", null);
        setField(term25989, term25989.getClass(), "_textBuffer", term26079);
        setField(term25989, term25989.getClass(), "_parsingContext", term26179);
        setBooleanField(term25989, term25989.getClass(), "_tokenIncomplete", false);
        setField(term25989, term25989.getClass(), "_reader", term26225);
        term26309 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        Object term26407 = newInstance(Class.forName("com.fasterxml.jackson.core.util.BufferRecycler"));
        setField(term26309, term26309.getClass(), "_bufferRecycler", term26407);
        setField(term26309, term26309.getClass(), "_tokenCBuffer", null);
        term26453 = newInstance(Class.forName("java.io.StringReader"));
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
        args[0] = term26309;
        args[1] = 0;
        args[2] = term26453;
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


