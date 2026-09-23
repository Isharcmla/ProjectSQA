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

public class ReaderBasedJsonParser_init_1237508164203 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term355387;

    public ReaderBasedJsonParser_init_1237508164203() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term355245 = newInstance(Class.forName("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] term354986 = (char[]) newCharArray(0);
        Object term355303 = newInstance(Class.forName("java.io.Console$LineReader"));
        setIntField(term355245, term355245.getClass(), "_features", 0);
        setIntField(term355245, term355245.getClass(), "_inputPtr", 0);
        setIntField(term355245, term355245.getClass(), "_inputEnd", 0);
        setLongField(term355245, term355245.getClass(), "_currInputProcessed", 0L);
        setIntField(term355245, term355245.getClass(), "_currInputRow", 0);
        setIntField(term355245, term355245.getClass(), "_currInputRowStart", 0);
        setLongField(term355245, term355245.getClass(), "_tokenInputTotal", 0L);
        setIntField(term355245, term355245.getClass(), "_tokenInputRow", 0);
        setIntField(term355245, term355245.getClass(), "_tokenInputCol", 0);
        setField(term355245, term355245.getClass(), "_nameCopyBuffer", term354986);
        setBooleanField(term355245, term355245.getClass(), "_nameCopied", false);
        setField(term355245, term355245.getClass(), "_byteArrayBuilder", null);
        setIntField(term355245, term355245.getClass(), "_numTypesValid", 0);
        setField(term355245, term355245.getClass(), "_ioContext", null);
        setField(term355245, term355245.getClass(), "_textBuffer", null);
        setField(term355245, term355245.getClass(), "_parsingContext", null);
        setBooleanField(term355245, term355245.getClass(), "_tokenIncomplete", false);
        setField(term355245, term355245.getClass(), "_reader", term355303);
        term355387 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        Object term355485 = newInstance(Class.forName("com.fasterxml.jackson.core.util.BufferRecycler"));
        Object[] term355007 = (Object[]) newArray("[C", 1);
        char[] term355008 = (char[]) newCharArray(0);
        setElement(term355007, 0, term355008);
        setField(term355485, term355485.getClass(), "_charBuffers", term355007);
        setField(term355387, term355387.getClass(), "_bufferRecycler", term355485);
        setField(term355387, term355387.getClass(), "_tokenCBuffer", null);
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
        args[0] = term355387;
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


