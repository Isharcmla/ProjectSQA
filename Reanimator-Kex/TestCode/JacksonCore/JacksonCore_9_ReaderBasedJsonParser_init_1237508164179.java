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

public class ReaderBasedJsonParser_init_1237508164179 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term356615;

    public ReaderBasedJsonParser_init_1237508164179() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term356447 = newInstance(Class.forName("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] term356210 = (char[]) newCharArray(0);
        Object term356531 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        setIntField(term356447, term356447.getClass(), "_features", 0);
        setIntField(term356447, term356447.getClass(), "_inputPtr", 0);
        setIntField(term356447, term356447.getClass(), "_inputEnd", 0);
        setLongField(term356447, term356447.getClass(), "_currInputProcessed", 0L);
        setIntField(term356447, term356447.getClass(), "_currInputRow", 0);
        setIntField(term356447, term356447.getClass(), "_currInputRowStart", 0);
        setLongField(term356447, term356447.getClass(), "_tokenInputTotal", 0L);
        setIntField(term356447, term356447.getClass(), "_tokenInputRow", 0);
        setIntField(term356447, term356447.getClass(), "_tokenInputCol", 0);
        setField(term356447, term356447.getClass(), "_nameCopyBuffer", term356210);
        setBooleanField(term356447, term356447.getClass(), "_nameCopied", false);
        setField(term356447, term356447.getClass(), "_byteArrayBuilder", null);
        setIntField(term356447, term356447.getClass(), "_numTypesValid", 0);
        setField(term356447, term356447.getClass(), "_ioContext", term356531);
        setField(term356447, term356447.getClass(), "_textBuffer", null);
        setField(term356447, term356447.getClass(), "_parsingContext", null);
        setBooleanField(term356447, term356447.getClass(), "_tokenIncomplete", false);
        setField(term356447, term356447.getClass(), "_reader", null);
        term356615 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        Object term356713 = newInstance(Class.forName("com.fasterxml.jackson.core.util.BufferRecycler"));
        setField(term356615, term356615.getClass(), "_bufferRecycler", term356713);
        setField(term356615, term356615.getClass(), "_tokenCBuffer", null);
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
        args[0] = term356615;
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


