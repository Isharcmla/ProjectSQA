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

public class ReaderBasedJsonParser_init_1237508164149 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36801;
     Object term36943;

    public ReaderBasedJsonParser_init_1237508164149() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term36477 = newInstance(Class.forName("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] term35764 = (char[]) newCharArray(0);
        Object term36567 = newInstance(Class.forName("com.fasterxml.jackson.core.util.TextBuffer"));
        Object term36667 = newInstance(Class.forName("com.fasterxml.jackson.core.json.JsonReadContext"));
        Object term36717 = newInstance(Class.forName("java.io.PushbackReader"));
        setIntField(term36477, term36477.getClass(), "_features", 0);
        setIntField(term36477, term36477.getClass(), "_inputPtr", 0);
        setIntField(term36477, term36477.getClass(), "_inputEnd", 0);
        setLongField(term36477, term36477.getClass(), "_currInputProcessed", 0L);
        setIntField(term36477, term36477.getClass(), "_currInputRow", 0);
        setIntField(term36477, term36477.getClass(), "_currInputRowStart", 0);
        setLongField(term36477, term36477.getClass(), "_tokenInputTotal", 0L);
        setIntField(term36477, term36477.getClass(), "_tokenInputRow", 0);
        setIntField(term36477, term36477.getClass(), "_tokenInputCol", 0);
        setField(term36477, term36477.getClass(), "_nameCopyBuffer", term35764);
        setBooleanField(term36477, term36477.getClass(), "_nameCopied", false);
        setField(term36477, term36477.getClass(), "_byteArrayBuilder", null);
        setIntField(term36477, term36477.getClass(), "_numTypesValid", 0);
        setField(term36477, term36477.getClass(), "_ioContext", null);
        setField(term36477, term36477.getClass(), "_textBuffer", term36567);
        setField(term36477, term36477.getClass(), "_parsingContext", term36667);
        setBooleanField(term36477, term36477.getClass(), "_tokenIncomplete", false);
        setField(term36477, term36477.getClass(), "_reader", term36717);
        term36801 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        Object term36899 = newInstance(Class.forName("com.fasterxml.jackson.core.util.BufferRecycler"));
        char[] term35783 = (char[]) newCharArray(489);
        setField(term36801, term36801.getClass(), "_bufferRecycler", term36899);
        setCharElement(term35783, 0, 'I');
        setCharElement(term35783, 1, 'G');
        setCharElement(term35783, 2, 'N');
        setCharElement(term35783, 3, 'O');
        setCharElement(term35783, 4, 'R');
        setCharElement(term35783, 5, 'E');
        setCharElement(term35783, 6, (char) 95);
        setCharElement(term35783, 7, 'U');
        setCharElement(term35783, 8, 'N');
        setCharElement(term35783, 9, 'D');
        setCharElement(term35783, 10, 'E');
        setCharElement(term35783, 11, 'F');
        setCharElement(term35783, 12, 'I');
        setCharElement(term35783, 13, 'N');
        setCharElement(term35783, 14, 'E');
        setCharElement(term35783, 15, 'D');
        setField(term36801, term36801.getClass(), "_tokenCBuffer", term35783);
        term36943 = newInstance(Class.forName("java.io.PipedReader"));
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
        args[0] = term36801;
        args[1] = -1;
        args[2] = term36943;
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


