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

public class ReaderBasedJsonParser_init_1237508164123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term82845;

    public ReaderBasedJsonParser_init_1237508164123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term82677 = newInstance(Class.forName("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] term81447 = (char[]) newCharArray(0);
        Object term82761 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        setIntField(term82677, term82677.getClass(), "_inputPtr", 0);
        setIntField(term82677, term82677.getClass(), "_inputEnd", 0);
        setLongField(term82677, term82677.getClass(), "_currInputProcessed", 0L);
        setIntField(term82677, term82677.getClass(), "_currInputRow", 0);
        setIntField(term82677, term82677.getClass(), "_currInputRowStart", 0);
        setLongField(term82677, term82677.getClass(), "_tokenInputTotal", 0L);
        setIntField(term82677, term82677.getClass(), "_tokenInputRow", 0);
        setIntField(term82677, term82677.getClass(), "_tokenInputCol", 0);
        setField(term82677, term82677.getClass(), "_nameCopyBuffer", term81447);
        setBooleanField(term82677, term82677.getClass(), "_nameCopied", false);
        setField(term82677, term82677.getClass(), "_byteArrayBuilder", null);
        setIntField(term82677, term82677.getClass(), "_numTypesValid", 0);
        setIntField(term82677, term82677.getClass(), "_features", 0);
        setField(term82677, term82677.getClass(), "_ioContext", term82761);
        setField(term82677, term82677.getClass(), "_textBuffer", null);
        setField(term82677, term82677.getClass(), "_parsingContext", null);
        setBooleanField(term82677, term82677.getClass(), "_tokenIncomplete", false);
        setField(term82677, term82677.getClass(), "_reader", null);
        term82845 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        Object term82943 = newInstance(Class.forName("com.fasterxml.jackson.core.util.BufferRecycler"));
        Object[] term81465 = (Object[]) newArray("[C", 1);
        char[] term81466 = (char[]) newCharArray(514);
        setElement(term81465, 0, term81466);
        setField(term82943, term82943.getClass(), "_charBuffers", term81465);
        setField(term82845, term82845.getClass(), "_bufferRecycler", term82943);
        setField(term82845, term82845.getClass(), "_tokenCBuffer", null);
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
        args[0] = term82845;
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


