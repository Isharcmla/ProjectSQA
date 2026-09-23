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

public class ReaderBasedJsonParser_init_1237508164175 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term329764;
     Object term329906;

    public ReaderBasedJsonParser_init_1237508164175() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term329680 = newInstance(Class.forName("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] term329416 = (char[]) newCharArray(0);
        setIntField(term329680, term329680.getClass(), "_features", 0);
        setIntField(term329680, term329680.getClass(), "_inputPtr", 0);
        setIntField(term329680, term329680.getClass(), "_inputEnd", 0);
        setLongField(term329680, term329680.getClass(), "_currInputProcessed", 0L);
        setIntField(term329680, term329680.getClass(), "_currInputRow", 0);
        setIntField(term329680, term329680.getClass(), "_currInputRowStart", 0);
        setLongField(term329680, term329680.getClass(), "_tokenInputTotal", 0L);
        setIntField(term329680, term329680.getClass(), "_tokenInputRow", 0);
        setIntField(term329680, term329680.getClass(), "_tokenInputCol", 0);
        setField(term329680, term329680.getClass(), "_nameCopyBuffer", term329416);
        setBooleanField(term329680, term329680.getClass(), "_nameCopied", false);
        setField(term329680, term329680.getClass(), "_byteArrayBuilder", null);
        setIntField(term329680, term329680.getClass(), "_numTypesValid", 0);
        setField(term329680, term329680.getClass(), "_ioContext", null);
        setField(term329680, term329680.getClass(), "_textBuffer", null);
        setField(term329680, term329680.getClass(), "_parsingContext", null);
        setBooleanField(term329680, term329680.getClass(), "_tokenIncomplete", false);
        setField(term329680, term329680.getClass(), "_reader", null);
        term329764 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        Object term329862 = newInstance(Class.forName("com.fasterxml.jackson.core.util.BufferRecycler"));
        Object[] term329441 = (Object[]) newArray("[C", 1);
        char[] term329442 = (char[]) newCharArray(0);
        setElement(term329441, 0, term329442);
        setField(term329862, term329862.getClass(), "_charBuffers", term329441);
        setField(term329764, term329764.getClass(), "_bufferRecycler", term329862);
        setField(term329764, term329764.getClass(), "_tokenCBuffer", null);
        term329906 = newInstance(Class.forName("java.io.PipedReader"));
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
        args[0] = term329764;
        args[1] = 0;
        args[2] = term329906;
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


