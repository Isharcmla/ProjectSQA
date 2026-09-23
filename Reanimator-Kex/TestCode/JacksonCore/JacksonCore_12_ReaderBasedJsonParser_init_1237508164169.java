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

public class ReaderBasedJsonParser_init_1237508164169 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40591;

    public ReaderBasedJsonParser_init_1237508164169() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term40417 = newInstance(Class.forName("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        Object term40507 = newInstance(Class.forName("com.fasterxml.jackson.core.util.TextBuffer"));
        setIntField(term40417, term40417.getClass(), "_features", 0);
        setIntField(term40417, term40417.getClass(), "_inputPtr", 0);
        setIntField(term40417, term40417.getClass(), "_inputEnd", 0);
        setLongField(term40417, term40417.getClass(), "_currInputProcessed", 0L);
        setIntField(term40417, term40417.getClass(), "_currInputRow", 0);
        setIntField(term40417, term40417.getClass(), "_currInputRowStart", 0);
        setLongField(term40417, term40417.getClass(), "_tokenInputTotal", 0L);
        setIntField(term40417, term40417.getClass(), "_tokenInputRow", 0);
        setIntField(term40417, term40417.getClass(), "_tokenInputCol", 0);
        setField(term40417, term40417.getClass(), "_nameCopyBuffer", null);
        setBooleanField(term40417, term40417.getClass(), "_nameCopied", false);
        setField(term40417, term40417.getClass(), "_byteArrayBuilder", null);
        setIntField(term40417, term40417.getClass(), "_numTypesValid", 0);
        setField(term40417, term40417.getClass(), "_ioContext", null);
        setField(term40417, term40417.getClass(), "_textBuffer", term40507);
        setField(term40417, term40417.getClass(), "_parsingContext", null);
        setBooleanField(term40417, term40417.getClass(), "_tokenIncomplete", false);
        setField(term40417, term40417.getClass(), "_reader", null);
        term40591 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        Object term40689 = newInstance(Class.forName("com.fasterxml.jackson.core.util.BufferRecycler"));
        Object[] term40191 = (Object[]) newArray("[C", 0);
        setField(term40689, term40689.getClass(), "_charBuffers", term40191);
        setField(term40591, term40591.getClass(), "_bufferRecycler", term40689);
        setField(term40591, term40591.getClass(), "_tokenCBuffer", null);
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
        args[0] = term40591;
        args[1] = -1;
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


