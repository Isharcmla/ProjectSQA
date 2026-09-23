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

public class ReaderBasedJsonParser_init_1237508164187 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term411291;

    public ReaderBasedJsonParser_init_1237508164187() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term411105 = newInstance(Class.forName("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        Object term411207 = newInstance(Class.forName("com.fasterxml.jackson.core.util.ByteArrayBuilder"));
        setIntField(term411105, term411105.getClass(), "_features", 0);
        setIntField(term411105, term411105.getClass(), "_inputPtr", 0);
        setIntField(term411105, term411105.getClass(), "_inputEnd", 0);
        setLongField(term411105, term411105.getClass(), "_currInputProcessed", 0L);
        setIntField(term411105, term411105.getClass(), "_currInputRow", 0);
        setIntField(term411105, term411105.getClass(), "_currInputRowStart", 0);
        setLongField(term411105, term411105.getClass(), "_tokenInputTotal", 0L);
        setIntField(term411105, term411105.getClass(), "_tokenInputRow", 0);
        setIntField(term411105, term411105.getClass(), "_tokenInputCol", 0);
        setField(term411105, term411105.getClass(), "_nameCopyBuffer", null);
        setBooleanField(term411105, term411105.getClass(), "_nameCopied", false);
        setField(term411105, term411105.getClass(), "_byteArrayBuilder", term411207);
        setIntField(term411105, term411105.getClass(), "_numTypesValid", 0);
        setField(term411105, term411105.getClass(), "_ioContext", null);
        setField(term411105, term411105.getClass(), "_textBuffer", null);
        setField(term411105, term411105.getClass(), "_parsingContext", null);
        setBooleanField(term411105, term411105.getClass(), "_tokenIncomplete", false);
        setField(term411105, term411105.getClass(), "_reader", null);
        term411291 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        Object term411389 = newInstance(Class.forName("com.fasterxml.jackson.core.util.BufferRecycler"));
        Object[] term409840 = (Object[]) newArray("[C", 1);
        char[] term409841 = (char[]) newCharArray(514);
        setElement(term409840, 0, term409841);
        setField(term411389, term411389.getClass(), "_charBuffers", term409840);
        setField(term411291, term411291.getClass(), "_bufferRecycler", term411389);
        setField(term411291, term411291.getClass(), "_tokenCBuffer", null);
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
        args[0] = term411291;
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


