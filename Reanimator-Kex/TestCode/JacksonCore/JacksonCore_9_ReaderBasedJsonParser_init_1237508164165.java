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

public class ReaderBasedJsonParser_init_1237508164165 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term172864;
     Object term173000;

    public ReaderBasedJsonParser_init_1237508164165() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term172690 = newInstance(Class.forName("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] term172379 = (char[]) newCharArray(0);
        Object term172780 = newInstance(Class.forName("com.fasterxml.jackson.core.util.TextBuffer"));
        setIntField(term172690, term172690.getClass(), "_features", 0);
        setIntField(term172690, term172690.getClass(), "_inputPtr", 0);
        setIntField(term172690, term172690.getClass(), "_inputEnd", 0);
        setLongField(term172690, term172690.getClass(), "_currInputProcessed", 0L);
        setIntField(term172690, term172690.getClass(), "_currInputRow", 0);
        setIntField(term172690, term172690.getClass(), "_currInputRowStart", 0);
        setLongField(term172690, term172690.getClass(), "_tokenInputTotal", 0L);
        setIntField(term172690, term172690.getClass(), "_tokenInputRow", 0);
        setIntField(term172690, term172690.getClass(), "_tokenInputCol", 0);
        setField(term172690, term172690.getClass(), "_nameCopyBuffer", term172379);
        setBooleanField(term172690, term172690.getClass(), "_nameCopied", false);
        setField(term172690, term172690.getClass(), "_byteArrayBuilder", null);
        setIntField(term172690, term172690.getClass(), "_numTypesValid", 0);
        setField(term172690, term172690.getClass(), "_ioContext", null);
        setField(term172690, term172690.getClass(), "_textBuffer", term172780);
        setField(term172690, term172690.getClass(), "_parsingContext", null);
        setBooleanField(term172690, term172690.getClass(), "_tokenIncomplete", false);
        setField(term172690, term172690.getClass(), "_reader", null);
        term172864 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        Object term172962 = newInstance(Class.forName("com.fasterxml.jackson.core.util.BufferRecycler"));
        Object[] term172462 = (Object[]) newArray("[C", 2);
        setField(term172962, term172962.getClass(), "_charBuffers", term172462);
        setField(term172864, term172864.getClass(), "_bufferRecycler", term172962);
        setField(term172864, term172864.getClass(), "_tokenCBuffer", null);
        term173000 = newInstance(Class.forName("java.io.Reader$1"));
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
        args[0] = term172864;
        args[1] = -1;
        args[2] = term173000;
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


