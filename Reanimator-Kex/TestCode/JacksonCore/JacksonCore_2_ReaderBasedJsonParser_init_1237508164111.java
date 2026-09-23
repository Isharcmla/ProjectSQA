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

public class ReaderBasedJsonParser_init_1237508164111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16432;

    public ReaderBasedJsonParser_init_1237508164111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term16220 = newInstance(Class.forName("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] term16024 = (char[]) newCharArray(0);
        Object term16304 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        Object term16348 = newInstance(Class.forName("java.io.PipedReader"));
        setIntField(term16220, term16220.getClass(), "_inputPtr", 0);
        setIntField(term16220, term16220.getClass(), "_inputEnd", 0);
        setLongField(term16220, term16220.getClass(), "_currInputProcessed", 0L);
        setIntField(term16220, term16220.getClass(), "_currInputRow", 0);
        setIntField(term16220, term16220.getClass(), "_currInputRowStart", 0);
        setLongField(term16220, term16220.getClass(), "_tokenInputTotal", 0L);
        setIntField(term16220, term16220.getClass(), "_tokenInputRow", 0);
        setIntField(term16220, term16220.getClass(), "_tokenInputCol", 0);
        setField(term16220, term16220.getClass(), "_nameCopyBuffer", term16024);
        setBooleanField(term16220, term16220.getClass(), "_nameCopied", false);
        setField(term16220, term16220.getClass(), "_byteArrayBuilder", null);
        setIntField(term16220, term16220.getClass(), "_numTypesValid", 0);
        setIntField(term16220, term16220.getClass(), "_features", 0);
        setField(term16220, term16220.getClass(), "_ioContext", term16304);
        setField(term16220, term16220.getClass(), "_textBuffer", null);
        setField(term16220, term16220.getClass(), "_parsingContext", null);
        setBooleanField(term16220, term16220.getClass(), "_tokenIncomplete", false);
        setField(term16220, term16220.getClass(), "_reader", term16348);
        term16432 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        Object term16530 = newInstance(Class.forName("com.fasterxml.jackson.core.util.BufferRecycler"));
        Object[] term16043 = (Object[]) newArray("[C", 1);
        setField(term16530, term16530.getClass(), "_charBuffers", term16043);
        setField(term16432, term16432.getClass(), "_bufferRecycler", term16530);
        setField(term16432, term16432.getClass(), "_tokenCBuffer", null);
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
        args[0] = term16432;
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


