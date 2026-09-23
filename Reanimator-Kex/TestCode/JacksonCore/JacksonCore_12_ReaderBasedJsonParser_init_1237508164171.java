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
import static com.fasterxml.jackson.core.json.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ReaderBasedJsonParser_init_1237508164171 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42745;
     Object term42789;

    public ReaderBasedJsonParser_init_1237508164171() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term42327 = newInstance(Class.forName("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        Object term42429 = newInstance(Class.forName("com.fasterxml.jackson.core.util.ByteArrayBuilder"));
        Object term42519 = newInstance(Class.forName("com.fasterxml.jackson.core.util.TextBuffer"));
        Object term42619 = newInstance(Class.forName("com.fasterxml.jackson.core.json.JsonReadContext"));
        Object term42661 = newInstance(Class.forName("java.io.FileReader"));
        setIntField(term42327, term42327.getClass(), "_features", 0);
        setIntField(term42327, term42327.getClass(), "_inputPtr", 0);
        setIntField(term42327, term42327.getClass(), "_inputEnd", 0);
        setLongField(term42327, term42327.getClass(), "_currInputProcessed", 0L);
        setIntField(term42327, term42327.getClass(), "_currInputRow", 0);
        setIntField(term42327, term42327.getClass(), "_currInputRowStart", 0);
        setLongField(term42327, term42327.getClass(), "_tokenInputTotal", 0L);
        setIntField(term42327, term42327.getClass(), "_tokenInputRow", 0);
        setIntField(term42327, term42327.getClass(), "_tokenInputCol", 0);
        setField(term42327, term42327.getClass(), "_nameCopyBuffer", null);
        setBooleanField(term42327, term42327.getClass(), "_nameCopied", false);
        setField(term42327, term42327.getClass(), "_byteArrayBuilder", term42429);
        setIntField(term42327, term42327.getClass(), "_numTypesValid", 0);
        setField(term42327, term42327.getClass(), "_ioContext", null);
        setField(term42327, term42327.getClass(), "_textBuffer", term42519);
        setField(term42327, term42327.getClass(), "_parsingContext", term42619);
        setBooleanField(term42327, term42327.getClass(), "_tokenIncomplete", false);
        setField(term42327, term42327.getClass(), "_reader", term42661);
        term42745 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        char[] term41620 = (char[]) newCharArray(489);
        setField(term42745, term42745.getClass(), "_bufferRecycler", null);
        setCharElement(term41620, 0, 'I');
        setCharElement(term41620, 1, 'G');
        setCharElement(term41620, 2, 'N');
        setCharElement(term41620, 3, 'O');
        setCharElement(term41620, 4, 'R');
        setCharElement(term41620, 5, 'E');
        setCharElement(term41620, 6, (char) 95);
        setCharElement(term41620, 7, 'U');
        setCharElement(term41620, 8, 'N');
        setCharElement(term41620, 9, 'D');
        setCharElement(term41620, 10, 'E');
        setCharElement(term41620, 11, 'F');
        setCharElement(term41620, 12, 'I');
        setCharElement(term41620, 13, 'N');
        setCharElement(term41620, 14, 'E');
        setCharElement(term41620, 15, 'D');
        setField(term42745, term42745.getClass(), "_tokenCBuffer", term41620);
        term42789 = newInstance(Class.forName("java.io.PipedReader"));
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
        args[0] = term42745;
        args[1] = 0;
        args[2] = term42789;
        args[3] = null;
        args[4] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


