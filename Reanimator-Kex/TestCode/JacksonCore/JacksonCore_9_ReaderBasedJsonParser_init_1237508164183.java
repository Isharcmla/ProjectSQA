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

public class ReaderBasedJsonParser_init_1237508164183 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term359488;

    public ReaderBasedJsonParser_init_1237508164183() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term359404 = newInstance(Class.forName("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setIntField(term359404, term359404.getClass(), "_features", 0);
        setIntField(term359404, term359404.getClass(), "_inputPtr", 0);
        setIntField(term359404, term359404.getClass(), "_inputEnd", 0);
        setLongField(term359404, term359404.getClass(), "_currInputProcessed", 0L);
        setIntField(term359404, term359404.getClass(), "_currInputRow", 0);
        setIntField(term359404, term359404.getClass(), "_currInputRowStart", 0);
        setLongField(term359404, term359404.getClass(), "_tokenInputTotal", 0L);
        setIntField(term359404, term359404.getClass(), "_tokenInputRow", 0);
        setIntField(term359404, term359404.getClass(), "_tokenInputCol", 0);
        setField(term359404, term359404.getClass(), "_nameCopyBuffer", null);
        setBooleanField(term359404, term359404.getClass(), "_nameCopied", false);
        setField(term359404, term359404.getClass(), "_byteArrayBuilder", null);
        setIntField(term359404, term359404.getClass(), "_numTypesValid", 0);
        setField(term359404, term359404.getClass(), "_ioContext", null);
        setField(term359404, term359404.getClass(), "_textBuffer", null);
        setField(term359404, term359404.getClass(), "_parsingContext", null);
        setBooleanField(term359404, term359404.getClass(), "_tokenIncomplete", false);
        setField(term359404, term359404.getClass(), "_reader", null);
        term359488 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        Object term359586 = newInstance(Class.forName("com.fasterxml.jackson.core.util.BufferRecycler"));
        Object[] term359173 = (Object[]) newArray("[C", 52);
        setField(term359586, term359586.getClass(), "_charBuffers", term359173);
        setField(term359488, term359488.getClass(), "_bufferRecycler", term359586);
        setField(term359488, term359488.getClass(), "_tokenCBuffer", null);
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
        args[0] = term359488;
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


