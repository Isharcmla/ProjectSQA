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

public class ReaderBasedJsonParser_init_1237508164149 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19872;

    public ReaderBasedJsonParser_init_1237508164149() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term19602 = newInstance(Class.forName("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        Object term19704 = newInstance(Class.forName("com.fasterxml.jackson.core.util.ByteArrayBuilder"));
        Object term19788 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        setIntField(term19602, term19602.getClass(), "_features", 0);
        setIntField(term19602, term19602.getClass(), "_inputPtr", 0);
        setIntField(term19602, term19602.getClass(), "_inputEnd", 0);
        setLongField(term19602, term19602.getClass(), "_currInputProcessed", 0L);
        setIntField(term19602, term19602.getClass(), "_currInputRow", 0);
        setIntField(term19602, term19602.getClass(), "_currInputRowStart", 0);
        setLongField(term19602, term19602.getClass(), "_tokenInputTotal", 0L);
        setIntField(term19602, term19602.getClass(), "_tokenInputRow", 0);
        setIntField(term19602, term19602.getClass(), "_tokenInputCol", 0);
        setField(term19602, term19602.getClass(), "_nameCopyBuffer", null);
        setBooleanField(term19602, term19602.getClass(), "_nameCopied", false);
        setField(term19602, term19602.getClass(), "_byteArrayBuilder", term19704);
        setIntField(term19602, term19602.getClass(), "_numTypesValid", 0);
        setField(term19602, term19602.getClass(), "_ioContext", term19788);
        term19872 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
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
        args[0] = term19872;
        args[1] = 0;
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


