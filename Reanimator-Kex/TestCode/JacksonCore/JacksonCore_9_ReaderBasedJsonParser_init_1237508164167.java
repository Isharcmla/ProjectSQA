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

public class ReaderBasedJsonParser_init_1237508164167 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term199543;
     Object term199685;

    public ReaderBasedJsonParser_init_1237508164167() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term199183 = newInstance(Class.forName("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] term197899 = (char[]) newCharArray(0);
        Object term199285 = newInstance(Class.forName("com.fasterxml.jackson.core.util.ByteArrayBuilder"));
        Object term199369 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        Object term199459 = newInstance(Class.forName("com.fasterxml.jackson.core.util.TextBuffer"));
        setIntField(term199183, term199183.getClass(), "_features", 0);
        setIntField(term199183, term199183.getClass(), "_inputPtr", 0);
        setIntField(term199183, term199183.getClass(), "_inputEnd", 0);
        setLongField(term199183, term199183.getClass(), "_currInputProcessed", 0L);
        setIntField(term199183, term199183.getClass(), "_currInputRow", 0);
        setIntField(term199183, term199183.getClass(), "_currInputRowStart", 0);
        setLongField(term199183, term199183.getClass(), "_tokenInputTotal", 0L);
        setIntField(term199183, term199183.getClass(), "_tokenInputRow", 0);
        setIntField(term199183, term199183.getClass(), "_tokenInputCol", 0);
        setField(term199183, term199183.getClass(), "_nameCopyBuffer", term197899);
        setBooleanField(term199183, term199183.getClass(), "_nameCopied", false);
        setField(term199183, term199183.getClass(), "_byteArrayBuilder", term199285);
        setIntField(term199183, term199183.getClass(), "_numTypesValid", 0);
        setField(term199183, term199183.getClass(), "_ioContext", term199369);
        setField(term199183, term199183.getClass(), "_textBuffer", term199459);
        setField(term199183, term199183.getClass(), "_parsingContext", null);
        setBooleanField(term199183, term199183.getClass(), "_tokenIncomplete", false);
        setField(term199183, term199183.getClass(), "_reader", null);
        term199543 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        Object term199641 = newInstance(Class.forName("com.fasterxml.jackson.core.util.BufferRecycler"));
        Object[] term197923 = (Object[]) newArray("[C", 1);
        char[] term197924 = (char[]) newCharArray(512);
        setElement(term197923, 0, term197924);
        setField(term199641, term199641.getClass(), "_charBuffers", term197923);
        setField(term199543, term199543.getClass(), "_bufferRecycler", term199641);
        setField(term199543, term199543.getClass(), "_tokenCBuffer", null);
        term199685 = newInstance(Class.forName("java.io.PipedReader"));
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
        args[0] = term199543;
        args[1] = 0;
        args[2] = term199685;
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


