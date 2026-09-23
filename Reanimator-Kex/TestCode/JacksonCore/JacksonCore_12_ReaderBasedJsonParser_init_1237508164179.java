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

public class ReaderBasedJsonParser_init_1237508164179 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term74855;

    public ReaderBasedJsonParser_init_1237508164179() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term74681 = newInstance(Class.forName("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        Object term74771 = newInstance(Class.forName("com.fasterxml.jackson.core.util.TextBuffer"));
        setIntField(term74681, term74681.getClass(), "_features", 0);
        setIntField(term74681, term74681.getClass(), "_inputPtr", 0);
        setIntField(term74681, term74681.getClass(), "_inputEnd", 0);
        setLongField(term74681, term74681.getClass(), "_currInputProcessed", 0L);
        setIntField(term74681, term74681.getClass(), "_currInputRow", 0);
        setIntField(term74681, term74681.getClass(), "_currInputRowStart", 0);
        setLongField(term74681, term74681.getClass(), "_tokenInputTotal", 0L);
        setIntField(term74681, term74681.getClass(), "_tokenInputRow", 0);
        setIntField(term74681, term74681.getClass(), "_tokenInputCol", 0);
        setField(term74681, term74681.getClass(), "_nameCopyBuffer", null);
        setBooleanField(term74681, term74681.getClass(), "_nameCopied", false);
        setField(term74681, term74681.getClass(), "_byteArrayBuilder", null);
        setIntField(term74681, term74681.getClass(), "_numTypesValid", 0);
        setField(term74681, term74681.getClass(), "_ioContext", null);
        setField(term74681, term74681.getClass(), "_textBuffer", term74771);
        setField(term74681, term74681.getClass(), "_parsingContext", null);
        setBooleanField(term74681, term74681.getClass(), "_tokenIncomplete", false);
        setField(term74681, term74681.getClass(), "_reader", null);
        term74855 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        Object term74953 = newInstance(Class.forName("com.fasterxml.jackson.core.util.BufferRecycler"));
        Object[] term74453 = (Object[]) newArray("[C", 1);
        char[] term74454 = (char[]) newCharArray(0);
        setElement(term74453, 0, term74454);
        setField(term74953, term74953.getClass(), "_charBuffers", term74453);
        setField(term74855, term74855.getClass(), "_bufferRecycler", term74953);
        setField(term74855, term74855.getClass(), "_tokenCBuffer", null);
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
        args[0] = term74855;
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


