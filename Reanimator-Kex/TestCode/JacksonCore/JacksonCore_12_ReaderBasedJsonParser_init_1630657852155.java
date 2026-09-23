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

public class ReaderBasedJsonParser_init_1630657852155 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23345;

    public ReaderBasedJsonParser_init_1630657852155() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term23261 = newInstance(Class.forName("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setIntField(term23261, term23261.getClass(), "_features", 0);
        setIntField(term23261, term23261.getClass(), "_inputPtr", 0);
        setIntField(term23261, term23261.getClass(), "_inputEnd", 0);
        setLongField(term23261, term23261.getClass(), "_currInputProcessed", 0L);
        setIntField(term23261, term23261.getClass(), "_currInputRow", 0);
        setIntField(term23261, term23261.getClass(), "_currInputRowStart", 0);
        setLongField(term23261, term23261.getClass(), "_tokenInputTotal", 0L);
        setIntField(term23261, term23261.getClass(), "_tokenInputRow", 0);
        setIntField(term23261, term23261.getClass(), "_tokenInputCol", 0);
        setField(term23261, term23261.getClass(), "_nameCopyBuffer", null);
        setBooleanField(term23261, term23261.getClass(), "_nameCopied", false);
        setField(term23261, term23261.getClass(), "_byteArrayBuilder", null);
        setIntField(term23261, term23261.getClass(), "_numTypesValid", 0);
        setField(term23261, term23261.getClass(), "_ioContext", null);
        setField(term23261, term23261.getClass(), "_textBuffer", null);
        term23345 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        setField(term23345, term23345.getClass(), "_bufferRecycler", null);
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
        args[0] = term23345;
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


