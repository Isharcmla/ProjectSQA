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

public class ReaderBasedJsonParser_init_1237508164141 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26952;
     Object term27100;

    public ReaderBasedJsonParser_init_1237508164141() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term26626 = newInstance(Class.forName("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] term26403 = (char[]) newCharArray(0);
        Object term26716 = newInstance(Class.forName("com.fasterxml.jackson.core.util.TextBuffer"));
        Object term26816 = newInstance(Class.forName("com.fasterxml.jackson.core.json.JsonReadContext"));
        Object term26868 = newInstance(Class.forName("java.io.CharArrayReader"));
        setIntField(term26626, term26626.getClass(), "_features", 0);
        setIntField(term26626, term26626.getClass(), "_inputPtr", 0);
        setIntField(term26626, term26626.getClass(), "_inputEnd", 0);
        setLongField(term26626, term26626.getClass(), "_currInputProcessed", 0L);
        setIntField(term26626, term26626.getClass(), "_currInputRow", 0);
        setIntField(term26626, term26626.getClass(), "_currInputRowStart", 0);
        setLongField(term26626, term26626.getClass(), "_tokenInputTotal", 0L);
        setIntField(term26626, term26626.getClass(), "_tokenInputRow", 0);
        setIntField(term26626, term26626.getClass(), "_tokenInputCol", 0);
        setField(term26626, term26626.getClass(), "_nameCopyBuffer", term26403);
        setBooleanField(term26626, term26626.getClass(), "_nameCopied", false);
        setField(term26626, term26626.getClass(), "_byteArrayBuilder", null);
        setIntField(term26626, term26626.getClass(), "_numTypesValid", 0);
        setField(term26626, term26626.getClass(), "_ioContext", null);
        setField(term26626, term26626.getClass(), "_textBuffer", term26716);
        setField(term26626, term26626.getClass(), "_parsingContext", term26816);
        setBooleanField(term26626, term26626.getClass(), "_tokenIncomplete", false);
        setField(term26626, term26626.getClass(), "_reader", term26868);
        term26952 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        Object term27050 = newInstance(Class.forName("com.fasterxml.jackson.core.util.BufferRecycler"));
        setField(term26952, term26952.getClass(), "_bufferRecycler", term27050);
        setField(term26952, term26952.getClass(), "_tokenCBuffer", null);
        term27100 = newInstance(Class.forName("java.io.BufferedReader"));
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
        args[0] = term26952;
        args[1] = -1;
        args[2] = term27100;
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


