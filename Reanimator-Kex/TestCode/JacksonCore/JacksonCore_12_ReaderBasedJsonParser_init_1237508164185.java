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
     Object term163845;
     Object term164031;

    public ReaderBasedJsonParser_init_1237508164185() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term163485 = newInstance(Class.forName("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] term162201 = (char[]) newCharArray(0);
        Object term163587 = newInstance(Class.forName("com.fasterxml.jackson.core.util.ByteArrayBuilder"));
        Object term163671 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        Object term163761 = newInstance(Class.forName("com.fasterxml.jackson.core.util.TextBuffer"));
        setIntField(term163485, term163485.getClass(), "_features", 0);
        setIntField(term163485, term163485.getClass(), "_inputPtr", 0);
        setIntField(term163485, term163485.getClass(), "_inputEnd", 0);
        setLongField(term163485, term163485.getClass(), "_currInputProcessed", 0L);
        setIntField(term163485, term163485.getClass(), "_currInputRow", 0);
        setIntField(term163485, term163485.getClass(), "_currInputRowStart", 0);
        setLongField(term163485, term163485.getClass(), "_tokenInputTotal", 0L);
        setIntField(term163485, term163485.getClass(), "_tokenInputRow", 0);
        setIntField(term163485, term163485.getClass(), "_tokenInputCol", 0);
        setField(term163485, term163485.getClass(), "_nameCopyBuffer", term162201);
        setBooleanField(term163485, term163485.getClass(), "_nameCopied", false);
        setField(term163485, term163485.getClass(), "_byteArrayBuilder", term163587);
        setIntField(term163485, term163485.getClass(), "_numTypesValid", 0);
        setField(term163485, term163485.getClass(), "_ioContext", term163671);
        setField(term163485, term163485.getClass(), "_textBuffer", term163761);
        setField(term163485, term163485.getClass(), "_parsingContext", null);
        setBooleanField(term163485, term163485.getClass(), "_tokenIncomplete", false);
        setField(term163485, term163485.getClass(), "_reader", null);
        term163845 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        Object term163943 = newInstance(Class.forName("com.fasterxml.jackson.core.util.BufferRecycler"));
        Object[] term162225 = (Object[]) newArray("[C", 1);
        char[] term162226 = (char[]) newCharArray(512);
        setElement(term162225, 0, term162226);
        setField(term163943, term163943.getClass(), "_charBuffers", term162225);
        setField(term163845, term163845.getClass(), "_bufferRecycler", term163943);
        setField(term163845, term163845.getClass(), "_tokenCBuffer", null);
        term164031 = newInstance(Class.forName("com.fasterxml.jackson.core.io.UTF32Reader"));
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
        args[0] = term163845;
        args[1] = 0;
        args[2] = term164031;
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


