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

public class ReaderBasedJsonParser_init_1237508164125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term100476;

    public ReaderBasedJsonParser_init_1237508164125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term100334 = newInstance(Class.forName("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        Object term100392 = newInstance(Class.forName("java.io.Console$LineReader"));
        setIntField(term100334, term100334.getClass(), "_inputPtr", 0);
        setIntField(term100334, term100334.getClass(), "_inputEnd", 0);
        setLongField(term100334, term100334.getClass(), "_currInputProcessed", 0L);
        setIntField(term100334, term100334.getClass(), "_currInputRow", 0);
        setIntField(term100334, term100334.getClass(), "_currInputRowStart", 0);
        setLongField(term100334, term100334.getClass(), "_tokenInputTotal", 0L);
        setIntField(term100334, term100334.getClass(), "_tokenInputRow", 0);
        setIntField(term100334, term100334.getClass(), "_tokenInputCol", 0);
        setField(term100334, term100334.getClass(), "_nameCopyBuffer", null);
        setBooleanField(term100334, term100334.getClass(), "_nameCopied", false);
        setField(term100334, term100334.getClass(), "_byteArrayBuilder", null);
        setIntField(term100334, term100334.getClass(), "_numTypesValid", 0);
        setIntField(term100334, term100334.getClass(), "_features", 0);
        setField(term100334, term100334.getClass(), "_ioContext", null);
        setField(term100334, term100334.getClass(), "_textBuffer", null);
        setField(term100334, term100334.getClass(), "_parsingContext", null);
        setBooleanField(term100334, term100334.getClass(), "_tokenIncomplete", false);
        setField(term100334, term100334.getClass(), "_reader", term100392);
        term100476 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        Object term100574 = newInstance(Class.forName("com.fasterxml.jackson.core.util.BufferRecycler"));
        Object[] term100151 = (Object[]) newArray("[C", 1);
        char[] term100152 = (char[]) newCharArray(0);
        setElement(term100151, 0, term100152);
        setField(term100574, term100574.getClass(), "_charBuffers", term100151);
        setField(term100476, term100476.getClass(), "_bufferRecycler", term100574);
        setField(term100476, term100476.getClass(), "_tokenCBuffer", null);
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
        args[0] = term100476;
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


