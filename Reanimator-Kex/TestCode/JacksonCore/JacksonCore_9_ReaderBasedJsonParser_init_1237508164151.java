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

public class ReaderBasedJsonParser_init_1237508164151 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41696;

    public ReaderBasedJsonParser_init_1237508164151() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term41522 = newInstance(Class.forName("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        Object term41612 = newInstance(Class.forName("com.fasterxml.jackson.core.util.TextBuffer"));
        setIntField(term41522, term41522.getClass(), "_features", 0);
        setIntField(term41522, term41522.getClass(), "_inputPtr", 0);
        setIntField(term41522, term41522.getClass(), "_inputEnd", 0);
        setLongField(term41522, term41522.getClass(), "_currInputProcessed", 0L);
        setIntField(term41522, term41522.getClass(), "_currInputRow", 0);
        setIntField(term41522, term41522.getClass(), "_currInputRowStart", 0);
        setLongField(term41522, term41522.getClass(), "_tokenInputTotal", 0L);
        setIntField(term41522, term41522.getClass(), "_tokenInputRow", 0);
        setIntField(term41522, term41522.getClass(), "_tokenInputCol", 0);
        setField(term41522, term41522.getClass(), "_nameCopyBuffer", null);
        setBooleanField(term41522, term41522.getClass(), "_nameCopied", false);
        setField(term41522, term41522.getClass(), "_byteArrayBuilder", null);
        setIntField(term41522, term41522.getClass(), "_numTypesValid", 0);
        setField(term41522, term41522.getClass(), "_ioContext", null);
        setField(term41522, term41522.getClass(), "_textBuffer", term41612);
        setField(term41522, term41522.getClass(), "_parsingContext", null);
        setBooleanField(term41522, term41522.getClass(), "_tokenIncomplete", false);
        setField(term41522, term41522.getClass(), "_reader", null);
        term41696 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        Object term41794 = newInstance(Class.forName("com.fasterxml.jackson.core.util.BufferRecycler"));
        Object[] term41296 = (Object[]) newArray("[C", 0);
        setField(term41794, term41794.getClass(), "_charBuffers", term41296);
        setField(term41696, term41696.getClass(), "_bufferRecycler", term41794);
        setField(term41696, term41696.getClass(), "_tokenCBuffer", null);
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
        args[0] = term41696;
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


