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
import static com.fasterxml.jackson.core.json.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ReaderBasedJsonParser_init_1237508164119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term62181;

    public ReaderBasedJsonParser_init_1237508164119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term62007 = newInstance(Class.forName("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        Object term62097 = newInstance(Class.forName("com.fasterxml.jackson.core.util.TextBuffer"));
        setIntField(term62007, term62007.getClass(), "_inputPtr", 0);
        setIntField(term62007, term62007.getClass(), "_inputEnd", 0);
        setLongField(term62007, term62007.getClass(), "_currInputProcessed", 0L);
        setIntField(term62007, term62007.getClass(), "_currInputRow", 0);
        setIntField(term62007, term62007.getClass(), "_currInputRowStart", 0);
        setLongField(term62007, term62007.getClass(), "_tokenInputTotal", 0L);
        setIntField(term62007, term62007.getClass(), "_tokenInputRow", 0);
        setIntField(term62007, term62007.getClass(), "_tokenInputCol", 0);
        setField(term62007, term62007.getClass(), "_nameCopyBuffer", null);
        setBooleanField(term62007, term62007.getClass(), "_nameCopied", false);
        setField(term62007, term62007.getClass(), "_byteArrayBuilder", null);
        setIntField(term62007, term62007.getClass(), "_numTypesValid", 0);
        setIntField(term62007, term62007.getClass(), "_features", 0);
        setField(term62007, term62007.getClass(), "_ioContext", null);
        setField(term62007, term62007.getClass(), "_textBuffer", term62097);
        setField(term62007, term62007.getClass(), "_parsingContext", null);
        setBooleanField(term62007, term62007.getClass(), "_tokenIncomplete", false);
        setField(term62007, term62007.getClass(), "_reader", null);
        term62181 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        char[] term61872 = (char[]) newCharArray(0);
        setField(term62181, term62181.getClass(), "_bufferRecycler", null);
        setField(term62181, term62181.getClass(), "_tokenCBuffer", term61872);
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
        args[0] = term62181;
        args[1] = 0;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


