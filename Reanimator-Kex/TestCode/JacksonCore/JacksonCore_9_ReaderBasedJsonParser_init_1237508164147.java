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
import java.lang.ArrayIndexOutOfBoundsException;
import static com.fasterxml.jackson.core.json.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ReaderBasedJsonParser_init_1237508164147 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32351;

    public ReaderBasedJsonParser_init_1237508164147() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term32267 = newInstance(Class.forName("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setIntField(term32267, term32267.getClass(), "_features", 0);
        setIntField(term32267, term32267.getClass(), "_inputPtr", 0);
        setIntField(term32267, term32267.getClass(), "_inputEnd", 0);
        setLongField(term32267, term32267.getClass(), "_currInputProcessed", 0L);
        setIntField(term32267, term32267.getClass(), "_currInputRow", 0);
        setIntField(term32267, term32267.getClass(), "_currInputRowStart", 0);
        setLongField(term32267, term32267.getClass(), "_tokenInputTotal", 0L);
        setIntField(term32267, term32267.getClass(), "_tokenInputRow", 0);
        setIntField(term32267, term32267.getClass(), "_tokenInputCol", 0);
        setField(term32267, term32267.getClass(), "_nameCopyBuffer", null);
        setBooleanField(term32267, term32267.getClass(), "_nameCopied", false);
        setField(term32267, term32267.getClass(), "_byteArrayBuilder", null);
        setIntField(term32267, term32267.getClass(), "_numTypesValid", 0);
        setField(term32267, term32267.getClass(), "_ioContext", null);
        setField(term32267, term32267.getClass(), "_textBuffer", null);
        setField(term32267, term32267.getClass(), "_parsingContext", null);
        setBooleanField(term32267, term32267.getClass(), "_tokenIncomplete", false);
        setField(term32267, term32267.getClass(), "_reader", null);
        term32351 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        Object term32449 = newInstance(Class.forName("com.fasterxml.jackson.core.util.BufferRecycler"));
        Object[] term32039 = (Object[]) newArray("[C", 0);
        setField(term32449, term32449.getClass(), "_charBuffers", term32039);
        setField(term32351, term32351.getClass(), "_bufferRecycler", term32449);
        setField(term32351, term32351.getClass(), "_tokenCBuffer", null);
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
        args[0] = term32351;
        args[1] = 0;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


