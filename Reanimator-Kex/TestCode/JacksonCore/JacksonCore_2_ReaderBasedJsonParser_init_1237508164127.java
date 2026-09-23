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

public class ReaderBasedJsonParser_init_1237508164127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term113419;

    public ReaderBasedJsonParser_init_1237508164127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term113335 = newInstance(Class.forName("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setIntField(term113335, term113335.getClass(), "_inputPtr", 0);
        setIntField(term113335, term113335.getClass(), "_inputEnd", 0);
        setLongField(term113335, term113335.getClass(), "_currInputProcessed", 0L);
        setIntField(term113335, term113335.getClass(), "_currInputRow", 0);
        setIntField(term113335, term113335.getClass(), "_currInputRowStart", 0);
        setLongField(term113335, term113335.getClass(), "_tokenInputTotal", 0L);
        setIntField(term113335, term113335.getClass(), "_tokenInputRow", 0);
        setIntField(term113335, term113335.getClass(), "_tokenInputCol", 0);
        setField(term113335, term113335.getClass(), "_nameCopyBuffer", null);
        setBooleanField(term113335, term113335.getClass(), "_nameCopied", false);
        setField(term113335, term113335.getClass(), "_byteArrayBuilder", null);
        setIntField(term113335, term113335.getClass(), "_numTypesValid", 0);
        setIntField(term113335, term113335.getClass(), "_features", 0);
        setField(term113335, term113335.getClass(), "_ioContext", null);
        setField(term113335, term113335.getClass(), "_textBuffer", null);
        setField(term113335, term113335.getClass(), "_parsingContext", null);
        setBooleanField(term113335, term113335.getClass(), "_tokenIncomplete", false);
        setField(term113335, term113335.getClass(), "_reader", null);
        term113419 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        Object term113517 = newInstance(Class.forName("com.fasterxml.jackson.core.util.BufferRecycler"));
        Object[] term113155 = (Object[]) newArray("[C", 1);
        setField(term113517, term113517.getClass(), "_charBuffers", term113155);
        setField(term113419, term113419.getClass(), "_bufferRecycler", term113517);
        setField(term113419, term113419.getClass(), "_tokenCBuffer", null);
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
        args[0] = term113419;
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


