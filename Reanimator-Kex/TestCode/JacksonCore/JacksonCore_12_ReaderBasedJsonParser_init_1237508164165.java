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

public class ReaderBasedJsonParser_init_1237508164165 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36005;
     Object term36153;

    public ReaderBasedJsonParser_init_1237508164165() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term35643 = newInstance(Class.forName("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        Object term35733 = newInstance(Class.forName("com.fasterxml.jackson.core.util.TextBuffer"));
        Object term35833 = newInstance(Class.forName("com.fasterxml.jackson.core.json.JsonReadContext"));
        Object term35921 = newInstance(Class.forName("com.fasterxml.jackson.core.io.UTF32Reader"));
        setIntField(term35643, term35643.getClass(), "_features", 0);
        setIntField(term35643, term35643.getClass(), "_inputPtr", 0);
        setIntField(term35643, term35643.getClass(), "_inputEnd", 0);
        setLongField(term35643, term35643.getClass(), "_currInputProcessed", 0L);
        setIntField(term35643, term35643.getClass(), "_currInputRow", 0);
        setIntField(term35643, term35643.getClass(), "_currInputRowStart", 0);
        setLongField(term35643, term35643.getClass(), "_tokenInputTotal", 0L);
        setIntField(term35643, term35643.getClass(), "_tokenInputRow", 0);
        setIntField(term35643, term35643.getClass(), "_tokenInputCol", 0);
        setField(term35643, term35643.getClass(), "_nameCopyBuffer", null);
        setBooleanField(term35643, term35643.getClass(), "_nameCopied", false);
        setField(term35643, term35643.getClass(), "_byteArrayBuilder", null);
        setIntField(term35643, term35643.getClass(), "_numTypesValid", 0);
        setField(term35643, term35643.getClass(), "_ioContext", null);
        setField(term35643, term35643.getClass(), "_textBuffer", term35733);
        setField(term35643, term35643.getClass(), "_parsingContext", term35833);
        setBooleanField(term35643, term35643.getClass(), "_tokenIncomplete", false);
        setField(term35643, term35643.getClass(), "_reader", term35921);
        term36005 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        Object term36103 = newInstance(Class.forName("com.fasterxml.jackson.core.util.BufferRecycler"));
        setField(term36005, term36005.getClass(), "_bufferRecycler", term36103);
        setField(term36005, term36005.getClass(), "_tokenCBuffer", null);
        term36153 = newInstance(Class.forName("java.io.BufferedReader"));
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
        args[0] = term36005;
        args[1] = 0;
        args[2] = term36153;
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


