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

public class ReaderBasedJsonParser_init_1237508164163 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33891;
     Object term34039;

    public ReaderBasedJsonParser_init_1237508164163() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term33559 = newInstance(Class.forName("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        Object term33649 = newInstance(Class.forName("com.fasterxml.jackson.core.util.TextBuffer"));
        Object term33749 = newInstance(Class.forName("com.fasterxml.jackson.core.json.JsonReadContext"));
        Object term33807 = newInstance(Class.forName("java.io.Console$LineReader"));
        setIntField(term33559, term33559.getClass(), "_features", 0);
        setIntField(term33559, term33559.getClass(), "_inputPtr", 0);
        setIntField(term33559, term33559.getClass(), "_inputEnd", 0);
        setLongField(term33559, term33559.getClass(), "_currInputProcessed", 0L);
        setIntField(term33559, term33559.getClass(), "_currInputRow", 0);
        setIntField(term33559, term33559.getClass(), "_currInputRowStart", 0);
        setLongField(term33559, term33559.getClass(), "_tokenInputTotal", 0L);
        setIntField(term33559, term33559.getClass(), "_tokenInputRow", 0);
        setIntField(term33559, term33559.getClass(), "_tokenInputCol", 0);
        setField(term33559, term33559.getClass(), "_nameCopyBuffer", null);
        setBooleanField(term33559, term33559.getClass(), "_nameCopied", false);
        setField(term33559, term33559.getClass(), "_byteArrayBuilder", null);
        setIntField(term33559, term33559.getClass(), "_numTypesValid", 0);
        setField(term33559, term33559.getClass(), "_ioContext", null);
        setField(term33559, term33559.getClass(), "_textBuffer", term33649);
        setField(term33559, term33559.getClass(), "_parsingContext", term33749);
        setBooleanField(term33559, term33559.getClass(), "_tokenIncomplete", false);
        setField(term33559, term33559.getClass(), "_reader", term33807);
        term33891 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        Object term33989 = newInstance(Class.forName("com.fasterxml.jackson.core.util.BufferRecycler"));
        setField(term33891, term33891.getClass(), "_bufferRecycler", term33989);
        setField(term33891, term33891.getClass(), "_tokenCBuffer", null);
        term34039 = newInstance(Class.forName("java.io.PushbackReader"));
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
        args[0] = term33891;
        args[1] = -1;
        args[2] = term34039;
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


