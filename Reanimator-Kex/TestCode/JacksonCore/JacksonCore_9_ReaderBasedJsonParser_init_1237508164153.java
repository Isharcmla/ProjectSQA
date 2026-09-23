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

public class ReaderBasedJsonParser_init_1237508164153 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43753;
     Object term43903;

    public ReaderBasedJsonParser_init_1237508164153() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term43435 = newInstance(Class.forName("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        Object term43525 = newInstance(Class.forName("com.fasterxml.jackson.core.util.TextBuffer"));
        Object term43625 = newInstance(Class.forName("com.fasterxml.jackson.core.json.JsonReadContext"));
        Object term43669 = newInstance(Class.forName("java.io.PipedReader"));
        setIntField(term43435, term43435.getClass(), "_features", 0);
        setIntField(term43435, term43435.getClass(), "_inputPtr", 0);
        setIntField(term43435, term43435.getClass(), "_inputEnd", 0);
        setLongField(term43435, term43435.getClass(), "_currInputProcessed", 0L);
        setIntField(term43435, term43435.getClass(), "_currInputRow", 0);
        setIntField(term43435, term43435.getClass(), "_currInputRowStart", 0);
        setLongField(term43435, term43435.getClass(), "_tokenInputTotal", 0L);
        setIntField(term43435, term43435.getClass(), "_tokenInputRow", 0);
        setIntField(term43435, term43435.getClass(), "_tokenInputCol", 0);
        setField(term43435, term43435.getClass(), "_nameCopyBuffer", null);
        setBooleanField(term43435, term43435.getClass(), "_nameCopied", false);
        setField(term43435, term43435.getClass(), "_byteArrayBuilder", null);
        setIntField(term43435, term43435.getClass(), "_numTypesValid", 0);
        setField(term43435, term43435.getClass(), "_ioContext", null);
        setField(term43435, term43435.getClass(), "_textBuffer", term43525);
        setField(term43435, term43435.getClass(), "_parsingContext", term43625);
        setBooleanField(term43435, term43435.getClass(), "_tokenIncomplete", false);
        setField(term43435, term43435.getClass(), "_reader", term43669);
        term43753 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        Object term43851 = newInstance(Class.forName("com.fasterxml.jackson.core.util.BufferRecycler"));
        setField(term43753, term43753.getClass(), "_bufferRecycler", term43851);
        setField(term43753, term43753.getClass(), "_tokenCBuffer", null);
        term43903 = newInstance(Class.forName("java.io.CharArrayReader"));
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
        args[0] = term43753;
        args[1] = -1;
        args[2] = term43903;
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


