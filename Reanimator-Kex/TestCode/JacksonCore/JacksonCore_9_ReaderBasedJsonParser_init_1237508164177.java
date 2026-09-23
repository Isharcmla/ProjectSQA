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

public class ReaderBasedJsonParser_init_1237508164177 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term355320;

    public ReaderBasedJsonParser_init_1237508164177() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term354962 = newInstance(Class.forName("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        Object term355046 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        Object term355136 = newInstance(Class.forName("com.fasterxml.jackson.core.util.TextBuffer"));
        Object term355236 = newInstance(Class.forName("com.fasterxml.jackson.core.json.JsonReadContext"));
        setIntField(term354962, term354962.getClass(), "_features", 0);
        setIntField(term354962, term354962.getClass(), "_inputPtr", 0);
        setIntField(term354962, term354962.getClass(), "_inputEnd", 0);
        setLongField(term354962, term354962.getClass(), "_currInputProcessed", 0L);
        setIntField(term354962, term354962.getClass(), "_currInputRow", 0);
        setIntField(term354962, term354962.getClass(), "_currInputRowStart", 0);
        setLongField(term354962, term354962.getClass(), "_tokenInputTotal", 0L);
        setIntField(term354962, term354962.getClass(), "_tokenInputRow", 0);
        setIntField(term354962, term354962.getClass(), "_tokenInputCol", 0);
        setField(term354962, term354962.getClass(), "_nameCopyBuffer", null);
        setBooleanField(term354962, term354962.getClass(), "_nameCopied", false);
        setField(term354962, term354962.getClass(), "_byteArrayBuilder", null);
        setIntField(term354962, term354962.getClass(), "_numTypesValid", 0);
        setField(term354962, term354962.getClass(), "_ioContext", term355046);
        setField(term354962, term354962.getClass(), "_textBuffer", term355136);
        setField(term354962, term354962.getClass(), "_parsingContext", term355236);
        setBooleanField(term354962, term354962.getClass(), "_tokenIncomplete", false);
        setField(term354962, term354962.getClass(), "_reader", null);
        term355320 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        Object term355418 = newInstance(Class.forName("com.fasterxml.jackson.core.util.BufferRecycler"));
        setField(term355320, term355320.getClass(), "_bufferRecycler", term355418);
        setField(term355320, term355320.getClass(), "_tokenCBuffer", null);
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
        args[0] = term355320;
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


