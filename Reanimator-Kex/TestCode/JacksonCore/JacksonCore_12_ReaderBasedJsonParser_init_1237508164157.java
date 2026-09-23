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

public class ReaderBasedJsonParser_init_1237508164157 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24756;
     Object term24898;

    public ReaderBasedJsonParser_init_1237508164157() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term24424 = newInstance(Class.forName("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] term24201 = (char[]) newCharArray(0);
        Object term24514 = newInstance(Class.forName("com.fasterxml.jackson.core.util.TextBuffer"));
        Object term24614 = newInstance(Class.forName("com.fasterxml.jackson.core.json.JsonReadContext"));
        Object term24672 = newInstance(Class.forName("java.io.Console$LineReader"));
        setIntField(term24424, term24424.getClass(), "_features", 0);
        setIntField(term24424, term24424.getClass(), "_inputPtr", 0);
        setIntField(term24424, term24424.getClass(), "_inputEnd", 0);
        setLongField(term24424, term24424.getClass(), "_currInputProcessed", 0L);
        setIntField(term24424, term24424.getClass(), "_currInputRow", 0);
        setIntField(term24424, term24424.getClass(), "_currInputRowStart", 0);
        setLongField(term24424, term24424.getClass(), "_tokenInputTotal", 0L);
        setIntField(term24424, term24424.getClass(), "_tokenInputRow", 0);
        setIntField(term24424, term24424.getClass(), "_tokenInputCol", 0);
        setField(term24424, term24424.getClass(), "_nameCopyBuffer", term24201);
        setBooleanField(term24424, term24424.getClass(), "_nameCopied", false);
        setField(term24424, term24424.getClass(), "_byteArrayBuilder", null);
        setIntField(term24424, term24424.getClass(), "_numTypesValid", 0);
        setField(term24424, term24424.getClass(), "_ioContext", null);
        setField(term24424, term24424.getClass(), "_textBuffer", term24514);
        setField(term24424, term24424.getClass(), "_parsingContext", term24614);
        setBooleanField(term24424, term24424.getClass(), "_tokenIncomplete", false);
        setField(term24424, term24424.getClass(), "_reader", term24672);
        term24756 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        Object term24854 = newInstance(Class.forName("com.fasterxml.jackson.core.util.BufferRecycler"));
        setField(term24756, term24756.getClass(), "_bufferRecycler", term24854);
        setField(term24756, term24756.getClass(), "_tokenCBuffer", null);
        term24898 = newInstance(Class.forName("java.io.PipedReader"));
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
        args[0] = term24756;
        args[1] = -1;
        args[2] = term24898;
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


