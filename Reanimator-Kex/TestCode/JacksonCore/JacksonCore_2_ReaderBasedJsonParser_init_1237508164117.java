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

public class ReaderBasedJsonParser_init_1237508164117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49287;

    public ReaderBasedJsonParser_init_1237508164117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term49011 = newInstance(Class.forName("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        Object term49113 = newInstance(Class.forName("com.fasterxml.jackson.core.util.ByteArrayBuilder"));
        Object term49203 = newInstance(Class.forName("com.fasterxml.jackson.core.util.TextBuffer"));
        setIntField(term49011, term49011.getClass(), "_inputPtr", 0);
        setIntField(term49011, term49011.getClass(), "_inputEnd", 0);
        setLongField(term49011, term49011.getClass(), "_currInputProcessed", 0L);
        setIntField(term49011, term49011.getClass(), "_currInputRow", 0);
        setIntField(term49011, term49011.getClass(), "_currInputRowStart", 0);
        setLongField(term49011, term49011.getClass(), "_tokenInputTotal", 0L);
        setIntField(term49011, term49011.getClass(), "_tokenInputRow", 0);
        setIntField(term49011, term49011.getClass(), "_tokenInputCol", 0);
        setField(term49011, term49011.getClass(), "_nameCopyBuffer", null);
        setBooleanField(term49011, term49011.getClass(), "_nameCopied", false);
        setField(term49011, term49011.getClass(), "_byteArrayBuilder", term49113);
        setIntField(term49011, term49011.getClass(), "_numTypesValid", 0);
        setIntField(term49011, term49011.getClass(), "_features", 0);
        setField(term49011, term49011.getClass(), "_ioContext", null);
        setField(term49011, term49011.getClass(), "_textBuffer", term49203);
        setField(term49011, term49011.getClass(), "_parsingContext", null);
        setBooleanField(term49011, term49011.getClass(), "_tokenIncomplete", false);
        setField(term49011, term49011.getClass(), "_reader", null);
        term49287 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        Object term49385 = newInstance(Class.forName("com.fasterxml.jackson.core.util.BufferRecycler"));
        Object[] term48832 = (Object[]) newArray("[C", 1);
        char[] term48833 = (char[]) newCharArray(0);
        setElement(term48832, 0, term48833);
        setField(term49385, term49385.getClass(), "_charBuffers", term48832);
        setField(term49287, term49287.getClass(), "_bufferRecycler", term49385);
        setField(term49287, term49287.getClass(), "_tokenCBuffer", null);
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
        args[0] = term49287;
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


