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

public class ReaderBasedJsonParser_init_1237508164201 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term353977;
     Object term354117;

    public ReaderBasedJsonParser_init_1237508164201() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term353651 = newInstance(Class.forName("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] term353420 = (char[]) newCharArray(0);
        Object term353741 = newInstance(Class.forName("com.fasterxml.jackson.core.util.TextBuffer"));
        Object term353841 = newInstance(Class.forName("com.fasterxml.jackson.core.json.JsonReadContext"));
        Object term353893 = newInstance(Class.forName("java.io.CharArrayReader"));
        setIntField(term353651, term353651.getClass(), "_features", 0);
        setIntField(term353651, term353651.getClass(), "_inputPtr", 0);
        setIntField(term353651, term353651.getClass(), "_inputEnd", 0);
        setLongField(term353651, term353651.getClass(), "_currInputProcessed", 0L);
        setIntField(term353651, term353651.getClass(), "_currInputRow", 0);
        setIntField(term353651, term353651.getClass(), "_currInputRowStart", 0);
        setLongField(term353651, term353651.getClass(), "_tokenInputTotal", 0L);
        setIntField(term353651, term353651.getClass(), "_tokenInputRow", 0);
        setIntField(term353651, term353651.getClass(), "_tokenInputCol", 0);
        setField(term353651, term353651.getClass(), "_nameCopyBuffer", term353420);
        setBooleanField(term353651, term353651.getClass(), "_nameCopied", false);
        setField(term353651, term353651.getClass(), "_byteArrayBuilder", null);
        setIntField(term353651, term353651.getClass(), "_numTypesValid", 0);
        setField(term353651, term353651.getClass(), "_ioContext", null);
        setField(term353651, term353651.getClass(), "_textBuffer", term353741);
        setField(term353651, term353651.getClass(), "_parsingContext", term353841);
        setBooleanField(term353651, term353651.getClass(), "_tokenIncomplete", false);
        setField(term353651, term353651.getClass(), "_reader", term353893);
        term353977 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        Object term354075 = newInstance(Class.forName("com.fasterxml.jackson.core.util.BufferRecycler"));
        setField(term353977, term353977.getClass(), "_bufferRecycler", term354075);
        setField(term353977, term353977.getClass(), "_tokenCBuffer", null);
        term354117 = newInstance(Class.forName("java.io.FileReader"));
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
        args[0] = term353977;
        args[1] = -1;
        args[2] = term354117;
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


