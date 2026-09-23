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

public class ReaderBasedJsonParser_init_1237508164143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29019;
     Object term29175;

    public ReaderBasedJsonParser_init_1237508164143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term28695 = newInstance(Class.forName("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        Object term28785 = newInstance(Class.forName("com.fasterxml.jackson.core.util.TextBuffer"));
        Object term28885 = newInstance(Class.forName("com.fasterxml.jackson.core.json.JsonReadContext"));
        Object term28935 = newInstance(Class.forName("java.io.PushbackReader"));
        setIntField(term28695, term28695.getClass(), "_features", 0);
        setIntField(term28695, term28695.getClass(), "_inputPtr", 0);
        setIntField(term28695, term28695.getClass(), "_inputEnd", 0);
        setLongField(term28695, term28695.getClass(), "_currInputProcessed", 0L);
        setIntField(term28695, term28695.getClass(), "_currInputRow", 0);
        setIntField(term28695, term28695.getClass(), "_currInputRowStart", 0);
        setLongField(term28695, term28695.getClass(), "_tokenInputTotal", 0L);
        setIntField(term28695, term28695.getClass(), "_tokenInputRow", 0);
        setIntField(term28695, term28695.getClass(), "_tokenInputCol", 0);
        setField(term28695, term28695.getClass(), "_nameCopyBuffer", null);
        setBooleanField(term28695, term28695.getClass(), "_nameCopied", false);
        setField(term28695, term28695.getClass(), "_byteArrayBuilder", null);
        setIntField(term28695, term28695.getClass(), "_numTypesValid", 0);
        setField(term28695, term28695.getClass(), "_ioContext", null);
        setField(term28695, term28695.getClass(), "_textBuffer", term28785);
        setField(term28695, term28695.getClass(), "_parsingContext", term28885);
        setBooleanField(term28695, term28695.getClass(), "_tokenIncomplete", false);
        setField(term28695, term28695.getClass(), "_reader", term28935);
        term29019 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        Object term29117 = newInstance(Class.forName("com.fasterxml.jackson.core.util.BufferRecycler"));
        setField(term29019, term29019.getClass(), "_bufferRecycler", term29117);
        setField(term29019, term29019.getClass(), "_tokenCBuffer", null);
        term29175 = newInstance(Class.forName("java.io.Console$LineReader"));
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
        args[0] = term29019;
        args[1] = 0;
        args[2] = term29175;
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


