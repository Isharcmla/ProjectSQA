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

public class ReaderBasedJsonParser_init_1237508164181 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term358153;
     Object term358293;

    public ReaderBasedJsonParser_init_1237508164181() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term357827 = newInstance(Class.forName("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] term357596 = (char[]) newCharArray(0);
        Object term357917 = newInstance(Class.forName("com.fasterxml.jackson.core.util.TextBuffer"));
        Object term358017 = newInstance(Class.forName("com.fasterxml.jackson.core.json.JsonReadContext"));
        Object term358069 = newInstance(Class.forName("java.io.CharArrayReader"));
        setIntField(term357827, term357827.getClass(), "_features", 0);
        setIntField(term357827, term357827.getClass(), "_inputPtr", 0);
        setIntField(term357827, term357827.getClass(), "_inputEnd", 0);
        setLongField(term357827, term357827.getClass(), "_currInputProcessed", 0L);
        setIntField(term357827, term357827.getClass(), "_currInputRow", 0);
        setIntField(term357827, term357827.getClass(), "_currInputRowStart", 0);
        setLongField(term357827, term357827.getClass(), "_tokenInputTotal", 0L);
        setIntField(term357827, term357827.getClass(), "_tokenInputRow", 0);
        setIntField(term357827, term357827.getClass(), "_tokenInputCol", 0);
        setField(term357827, term357827.getClass(), "_nameCopyBuffer", term357596);
        setBooleanField(term357827, term357827.getClass(), "_nameCopied", false);
        setField(term357827, term357827.getClass(), "_byteArrayBuilder", null);
        setIntField(term357827, term357827.getClass(), "_numTypesValid", 0);
        setField(term357827, term357827.getClass(), "_ioContext", null);
        setField(term357827, term357827.getClass(), "_textBuffer", term357917);
        setField(term357827, term357827.getClass(), "_parsingContext", term358017);
        setBooleanField(term357827, term357827.getClass(), "_tokenIncomplete", false);
        setField(term357827, term357827.getClass(), "_reader", term358069);
        term358153 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        Object term358251 = newInstance(Class.forName("com.fasterxml.jackson.core.util.BufferRecycler"));
        setField(term358153, term358153.getClass(), "_bufferRecycler", term358251);
        setField(term358153, term358153.getClass(), "_tokenCBuffer", null);
        term358293 = newInstance(Class.forName("java.io.FileReader"));
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
        args[0] = term358153;
        args[1] = -1;
        args[2] = term358293;
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


