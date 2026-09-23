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

public class ReaderBasedJsonParser_init_1237508164185 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term384794;

    public ReaderBasedJsonParser_init_1237508164185() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term384652 = newInstance(Class.forName("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] term384393 = (char[]) newCharArray(0);
        Object term384710 = newInstance(Class.forName("java.io.Console$LineReader"));
        setIntField(term384652, term384652.getClass(), "_features", 0);
        setIntField(term384652, term384652.getClass(), "_inputPtr", 0);
        setIntField(term384652, term384652.getClass(), "_inputEnd", 0);
        setLongField(term384652, term384652.getClass(), "_currInputProcessed", 0L);
        setIntField(term384652, term384652.getClass(), "_currInputRow", 0);
        setIntField(term384652, term384652.getClass(), "_currInputRowStart", 0);
        setLongField(term384652, term384652.getClass(), "_tokenInputTotal", 0L);
        setIntField(term384652, term384652.getClass(), "_tokenInputRow", 0);
        setIntField(term384652, term384652.getClass(), "_tokenInputCol", 0);
        setField(term384652, term384652.getClass(), "_nameCopyBuffer", term384393);
        setBooleanField(term384652, term384652.getClass(), "_nameCopied", false);
        setField(term384652, term384652.getClass(), "_byteArrayBuilder", null);
        setIntField(term384652, term384652.getClass(), "_numTypesValid", 0);
        setField(term384652, term384652.getClass(), "_ioContext", null);
        setField(term384652, term384652.getClass(), "_textBuffer", null);
        setField(term384652, term384652.getClass(), "_parsingContext", null);
        setBooleanField(term384652, term384652.getClass(), "_tokenIncomplete", false);
        setField(term384652, term384652.getClass(), "_reader", term384710);
        term384794 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        Object term384892 = newInstance(Class.forName("com.fasterxml.jackson.core.util.BufferRecycler"));
        Object[] term384414 = (Object[]) newArray("[C", 1);
        char[] term384415 = (char[]) newCharArray(0);
        setElement(term384414, 0, term384415);
        setField(term384892, term384892.getClass(), "_charBuffers", term384414);
        setField(term384794, term384794.getClass(), "_bufferRecycler", term384892);
        setField(term384794, term384794.getClass(), "_tokenCBuffer", null);
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
        args[0] = term384794;
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


