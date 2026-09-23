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
import java.lang.ArrayIndexOutOfBoundsException;
import static com.fasterxml.jackson.core.json.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ReaderBasedJsonParser_init_1237508164173 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46408;

    public ReaderBasedJsonParser_init_1237508164173() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term46324 = newInstance(Class.forName("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        setIntField(term46324, term46324.getClass(), "_features", 0);
        setIntField(term46324, term46324.getClass(), "_inputPtr", 0);
        setIntField(term46324, term46324.getClass(), "_inputEnd", 0);
        setLongField(term46324, term46324.getClass(), "_currInputProcessed", 0L);
        setIntField(term46324, term46324.getClass(), "_currInputRow", 0);
        setIntField(term46324, term46324.getClass(), "_currInputRowStart", 0);
        setLongField(term46324, term46324.getClass(), "_tokenInputTotal", 0L);
        setIntField(term46324, term46324.getClass(), "_tokenInputRow", 0);
        setIntField(term46324, term46324.getClass(), "_tokenInputCol", 0);
        setField(term46324, term46324.getClass(), "_nameCopyBuffer", null);
        setBooleanField(term46324, term46324.getClass(), "_nameCopied", false);
        setField(term46324, term46324.getClass(), "_byteArrayBuilder", null);
        setIntField(term46324, term46324.getClass(), "_numTypesValid", 0);
        setField(term46324, term46324.getClass(), "_ioContext", null);
        setField(term46324, term46324.getClass(), "_textBuffer", null);
        setField(term46324, term46324.getClass(), "_parsingContext", null);
        setBooleanField(term46324, term46324.getClass(), "_tokenIncomplete", false);
        setField(term46324, term46324.getClass(), "_reader", null);
        term46408 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        Object term46506 = newInstance(Class.forName("com.fasterxml.jackson.core.util.BufferRecycler"));
        Object[] term46096 = (Object[]) newArray("[C", 0);
        setField(term46506, term46506.getClass(), "_charBuffers", term46096);
        setField(term46408, term46408.getClass(), "_bufferRecycler", term46506);
        setField(term46408, term46408.getClass(), "_tokenCBuffer", null);
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
        args[0] = term46408;
        args[1] = 0;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


