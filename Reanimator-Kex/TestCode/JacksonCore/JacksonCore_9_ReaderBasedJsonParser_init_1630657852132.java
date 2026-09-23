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

public class ReaderBasedJsonParser_init_1630657852132 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18466;

    public ReaderBasedJsonParser_init_1630657852132() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term18382 = newInstance(Class.forName("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setIntField(term18382, term18382.getClass(), "_features", 0);
        setIntField(term18382, term18382.getClass(), "_inputPtr", 0);
        setIntField(term18382, term18382.getClass(), "_inputEnd", 0);
        setLongField(term18382, term18382.getClass(), "_currInputProcessed", 0L);
        setIntField(term18382, term18382.getClass(), "_currInputRow", 0);
        setIntField(term18382, term18382.getClass(), "_currInputRowStart", 0);
        setLongField(term18382, term18382.getClass(), "_tokenInputTotal", 0L);
        setIntField(term18382, term18382.getClass(), "_tokenInputRow", 0);
        setIntField(term18382, term18382.getClass(), "_tokenInputCol", 0);
        setField(term18382, term18382.getClass(), "_nameCopyBuffer", null);
        setBooleanField(term18382, term18382.getClass(), "_nameCopied", false);
        setField(term18382, term18382.getClass(), "_byteArrayBuilder", null);
        setIntField(term18382, term18382.getClass(), "_numTypesValid", 0);
        setField(term18382, term18382.getClass(), "_ioContext", null);
        setField(term18382, term18382.getClass(), "_textBuffer", null);
        term18466 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        setField(term18466, term18466.getClass(), "_bufferRecycler", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.core.json.ReaderBasedJsonParser");
        Class<?>[] argTypes = new Class<?>[9];
        argTypes[0] = Class.forName("com.fasterxml.jackson.core.io.IOContext");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("java.io.Reader");
        argTypes[3] = Class.forName("com.fasterxml.jackson.core.ObjectCodec");
        argTypes[4] = Class.forName("com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer");
        argTypes[5] = Array.newInstance(char.class, 0).getClass();
        argTypes[6] = int.class;
        argTypes[7] = int.class;
        argTypes[8] = boolean.class;
        Object[] args = new Object[9];
        args[0] = term18466;
        args[1] = -1;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        args[5] = null;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


