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

public class ReaderBasedJsonParser_init_1237508164157 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term70695;
     Object term70835;

    public ReaderBasedJsonParser_init_1237508164157() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term70365 = newInstance(Class.forName("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] term70128 = (char[]) newCharArray(0);
        Object term70455 = newInstance(Class.forName("com.fasterxml.jackson.core.util.TextBuffer"));
        Object term70555 = newInstance(Class.forName("com.fasterxml.jackson.core.json.JsonReadContext"));
        Object term70611 = newInstance(Class.forName("java.io.InputStreamReader"));
        setIntField(term70365, term70365.getClass(), "_features", 0);
        setIntField(term70365, term70365.getClass(), "_inputPtr", 0);
        setIntField(term70365, term70365.getClass(), "_inputEnd", 0);
        setLongField(term70365, term70365.getClass(), "_currInputProcessed", 0L);
        setIntField(term70365, term70365.getClass(), "_currInputRow", 0);
        setIntField(term70365, term70365.getClass(), "_currInputRowStart", 0);
        setLongField(term70365, term70365.getClass(), "_tokenInputTotal", 0L);
        setIntField(term70365, term70365.getClass(), "_tokenInputRow", 0);
        setIntField(term70365, term70365.getClass(), "_tokenInputCol", 0);
        setField(term70365, term70365.getClass(), "_nameCopyBuffer", term70128);
        setBooleanField(term70365, term70365.getClass(), "_nameCopied", false);
        setField(term70365, term70365.getClass(), "_byteArrayBuilder", null);
        setIntField(term70365, term70365.getClass(), "_numTypesValid", 0);
        setField(term70365, term70365.getClass(), "_ioContext", null);
        setField(term70365, term70365.getClass(), "_textBuffer", term70455);
        setField(term70365, term70365.getClass(), "_parsingContext", term70555);
        setBooleanField(term70365, term70365.getClass(), "_tokenIncomplete", false);
        setField(term70365, term70365.getClass(), "_reader", term70611);
        term70695 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        Object term70793 = newInstance(Class.forName("com.fasterxml.jackson.core.util.BufferRecycler"));
        setField(term70695, term70695.getClass(), "_bufferRecycler", term70793);
        setField(term70695, term70695.getClass(), "_tokenCBuffer", null);
        term70835 = newInstance(Class.forName("java.io.FileReader"));
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
        args[0] = term70695;
        args[1] = 0;
        args[2] = term70835;
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


