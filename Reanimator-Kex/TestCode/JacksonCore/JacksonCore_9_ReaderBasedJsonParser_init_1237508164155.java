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

public class ReaderBasedJsonParser_init_1237508164155 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45214;

    public ReaderBasedJsonParser_init_1237508164155() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term45040 = newInstance(Class.forName("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        Object term45130 = newInstance(Class.forName("com.fasterxml.jackson.core.util.TextBuffer"));
        setIntField(term45040, term45040.getClass(), "_features", 0);
        setIntField(term45040, term45040.getClass(), "_inputPtr", 0);
        setIntField(term45040, term45040.getClass(), "_inputEnd", 0);
        setLongField(term45040, term45040.getClass(), "_currInputProcessed", 0L);
        setIntField(term45040, term45040.getClass(), "_currInputRow", 0);
        setIntField(term45040, term45040.getClass(), "_currInputRowStart", 0);
        setLongField(term45040, term45040.getClass(), "_tokenInputTotal", 0L);
        setIntField(term45040, term45040.getClass(), "_tokenInputRow", 0);
        setIntField(term45040, term45040.getClass(), "_tokenInputCol", 0);
        setField(term45040, term45040.getClass(), "_nameCopyBuffer", null);
        setBooleanField(term45040, term45040.getClass(), "_nameCopied", false);
        setField(term45040, term45040.getClass(), "_byteArrayBuilder", null);
        setIntField(term45040, term45040.getClass(), "_numTypesValid", 0);
        setField(term45040, term45040.getClass(), "_ioContext", null);
        setField(term45040, term45040.getClass(), "_textBuffer", term45130);
        setField(term45040, term45040.getClass(), "_parsingContext", null);
        setBooleanField(term45040, term45040.getClass(), "_tokenIncomplete", false);
        setField(term45040, term45040.getClass(), "_reader", null);
        term45214 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        Object term45312 = newInstance(Class.forName("com.fasterxml.jackson.core.util.BufferRecycler"));
        Object[] term44812 = (Object[]) newArray("[C", 1);
        char[] term44813 = (char[]) newCharArray(0);
        setElement(term44812, 0, term44813);
        setField(term45312, term45312.getClass(), "_charBuffers", term44812);
        setField(term45214, term45214.getClass(), "_bufferRecycler", term45312);
        setField(term45214, term45214.getClass(), "_tokenCBuffer", null);
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
        args[0] = term45214;
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


