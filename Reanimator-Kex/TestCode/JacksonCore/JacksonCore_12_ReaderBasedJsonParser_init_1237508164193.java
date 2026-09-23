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

public class ReaderBasedJsonParser_init_1237508164193 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term259097;

    public ReaderBasedJsonParser_init_1237508164193() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term258911 = newInstance(Class.forName("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        Object term259013 = newInstance(Class.forName("com.fasterxml.jackson.core.util.ByteArrayBuilder"));
        setIntField(term258911, term258911.getClass(), "_features", 0);
        setIntField(term258911, term258911.getClass(), "_inputPtr", 0);
        setIntField(term258911, term258911.getClass(), "_inputEnd", 0);
        setLongField(term258911, term258911.getClass(), "_currInputProcessed", 0L);
        setIntField(term258911, term258911.getClass(), "_currInputRow", 0);
        setIntField(term258911, term258911.getClass(), "_currInputRowStart", 0);
        setLongField(term258911, term258911.getClass(), "_tokenInputTotal", 0L);
        setIntField(term258911, term258911.getClass(), "_tokenInputRow", 0);
        setIntField(term258911, term258911.getClass(), "_tokenInputCol", 0);
        setField(term258911, term258911.getClass(), "_nameCopyBuffer", null);
        setBooleanField(term258911, term258911.getClass(), "_nameCopied", false);
        setField(term258911, term258911.getClass(), "_byteArrayBuilder", term259013);
        setIntField(term258911, term258911.getClass(), "_numTypesValid", 0);
        setField(term258911, term258911.getClass(), "_ioContext", null);
        setField(term258911, term258911.getClass(), "_textBuffer", null);
        setField(term258911, term258911.getClass(), "_parsingContext", null);
        setBooleanField(term258911, term258911.getClass(), "_tokenIncomplete", false);
        setField(term258911, term258911.getClass(), "_reader", null);
        term259097 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        Object term259195 = newInstance(Class.forName("com.fasterxml.jackson.core.util.BufferRecycler"));
        Object[] term257646 = (Object[]) newArray("[C", 1);
        char[] term257647 = (char[]) newCharArray(514);
        setElement(term257646, 0, term257647);
        setField(term259195, term259195.getClass(), "_charBuffers", term257646);
        setField(term259097, term259097.getClass(), "_bufferRecycler", term259195);
        setField(term259097, term259097.getClass(), "_tokenCBuffer", null);
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
        args[0] = term259097;
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


