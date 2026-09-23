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

public class ReaderBasedJsonParser_init_1237508164197 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term290596;

    public ReaderBasedJsonParser_init_1237508164197() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term290412 = newInstance(Class.forName("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] term290152 = (char[]) newCharArray(0);
        Object term290512 = newInstance(Class.forName("com.fasterxml.jackson.core.json.JsonReadContext"));
        setIntField(term290412, term290412.getClass(), "_features", 0);
        setIntField(term290412, term290412.getClass(), "_inputPtr", 0);
        setIntField(term290412, term290412.getClass(), "_inputEnd", 0);
        setLongField(term290412, term290412.getClass(), "_currInputProcessed", 0L);
        setIntField(term290412, term290412.getClass(), "_currInputRow", 0);
        setIntField(term290412, term290412.getClass(), "_currInputRowStart", 0);
        setLongField(term290412, term290412.getClass(), "_tokenInputTotal", 0L);
        setIntField(term290412, term290412.getClass(), "_tokenInputRow", 0);
        setIntField(term290412, term290412.getClass(), "_tokenInputCol", 0);
        setField(term290412, term290412.getClass(), "_nameCopyBuffer", term290152);
        setBooleanField(term290412, term290412.getClass(), "_nameCopied", false);
        setField(term290412, term290412.getClass(), "_byteArrayBuilder", null);
        setIntField(term290412, term290412.getClass(), "_numTypesValid", 0);
        setField(term290412, term290412.getClass(), "_ioContext", null);
        setField(term290412, term290412.getClass(), "_textBuffer", null);
        setField(term290412, term290412.getClass(), "_parsingContext", term290512);
        setBooleanField(term290412, term290412.getClass(), "_tokenIncomplete", false);
        setField(term290412, term290412.getClass(), "_reader", null);
        term290596 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        Object term290694 = newInstance(Class.forName("com.fasterxml.jackson.core.util.BufferRecycler"));
        Object[] term290179 = (Object[]) newArray("[C", 32);
        setField(term290694, term290694.getClass(), "_charBuffers", term290179);
        setField(term290596, term290596.getClass(), "_bufferRecycler", term290694);
        setField(term290596, term290596.getClass(), "_tokenCBuffer", null);
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
        args[0] = term290596;
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


