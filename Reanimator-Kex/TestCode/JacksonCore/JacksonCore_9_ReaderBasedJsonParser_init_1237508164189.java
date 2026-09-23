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
     Object term441321;

    public ReaderBasedJsonParser_init_1237508164189() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term441137 = newInstance(Class.forName("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] term440877 = (char[]) newCharArray(0);
        Object term441237 = newInstance(Class.forName("com.fasterxml.jackson.core.json.JsonReadContext"));
        setIntField(term441137, term441137.getClass(), "_features", 0);
        setIntField(term441137, term441137.getClass(), "_inputPtr", 0);
        setIntField(term441137, term441137.getClass(), "_inputEnd", 0);
        setLongField(term441137, term441137.getClass(), "_currInputProcessed", 0L);
        setIntField(term441137, term441137.getClass(), "_currInputRow", 0);
        setIntField(term441137, term441137.getClass(), "_currInputRowStart", 0);
        setLongField(term441137, term441137.getClass(), "_tokenInputTotal", 0L);
        setIntField(term441137, term441137.getClass(), "_tokenInputRow", 0);
        setIntField(term441137, term441137.getClass(), "_tokenInputCol", 0);
        setField(term441137, term441137.getClass(), "_nameCopyBuffer", term440877);
        setBooleanField(term441137, term441137.getClass(), "_nameCopied", false);
        setField(term441137, term441137.getClass(), "_byteArrayBuilder", null);
        setIntField(term441137, term441137.getClass(), "_numTypesValid", 0);
        setField(term441137, term441137.getClass(), "_ioContext", null);
        setField(term441137, term441137.getClass(), "_textBuffer", null);
        setField(term441137, term441137.getClass(), "_parsingContext", term441237);
        setBooleanField(term441137, term441137.getClass(), "_tokenIncomplete", false);
        setField(term441137, term441137.getClass(), "_reader", null);
        term441321 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        Object term441419 = newInstance(Class.forName("com.fasterxml.jackson.core.util.BufferRecycler"));
        Object[] term440904 = (Object[]) newArray("[C", 32);
        setField(term441419, term441419.getClass(), "_charBuffers", term440904);
        setField(term441321, term441321.getClass(), "_bufferRecycler", term441419);
        setField(term441321, term441321.getClass(), "_tokenCBuffer", null);
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
        args[0] = term441321;
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


