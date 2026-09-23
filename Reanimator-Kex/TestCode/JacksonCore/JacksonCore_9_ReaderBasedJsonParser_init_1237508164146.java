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

public class ReaderBasedJsonParser_init_1237508164146 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31126;
     Object term31214;

    public ReaderBasedJsonParser_init_1237508164146() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term30692 = newInstance(Class.forName("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        Object term30794 = newInstance(Class.forName("com.fasterxml.jackson.core.util.ByteArrayBuilder"));
        Object term30884 = newInstance(Class.forName("com.fasterxml.jackson.core.util.TextBuffer"));
        Object term30984 = newInstance(Class.forName("com.fasterxml.jackson.core.json.JsonReadContext"));
        Object term31042 = newInstance(Class.forName("java.io.Console$LineReader"));
        setIntField(term30692, term30692.getClass(), "_features", 0);
        setIntField(term30692, term30692.getClass(), "_inputPtr", 0);
        setIntField(term30692, term30692.getClass(), "_inputEnd", 0);
        setLongField(term30692, term30692.getClass(), "_currInputProcessed", 0L);
        setIntField(term30692, term30692.getClass(), "_currInputRow", 0);
        setIntField(term30692, term30692.getClass(), "_currInputRowStart", 0);
        setLongField(term30692, term30692.getClass(), "_tokenInputTotal", 0L);
        setIntField(term30692, term30692.getClass(), "_tokenInputRow", 0);
        setIntField(term30692, term30692.getClass(), "_tokenInputCol", 0);
        setField(term30692, term30692.getClass(), "_nameCopyBuffer", null);
        setBooleanField(term30692, term30692.getClass(), "_nameCopied", false);
        setField(term30692, term30692.getClass(), "_byteArrayBuilder", term30794);
        setIntField(term30692, term30692.getClass(), "_numTypesValid", 0);
        setField(term30692, term30692.getClass(), "_ioContext", null);
        setField(term30692, term30692.getClass(), "_textBuffer", term30884);
        setField(term30692, term30692.getClass(), "_parsingContext", term30984);
        setBooleanField(term30692, term30692.getClass(), "_tokenIncomplete", false);
        setField(term30692, term30692.getClass(), "_reader", term31042);
        term31126 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        char[] term29985 = (char[]) newCharArray(489);
        setField(term31126, term31126.getClass(), "_bufferRecycler", null);
        setCharElement(term29985, 0, 'I');
        setCharElement(term29985, 1, 'G');
        setCharElement(term29985, 2, 'N');
        setCharElement(term29985, 3, 'O');
        setCharElement(term29985, 4, 'R');
        setCharElement(term29985, 5, 'E');
        setCharElement(term29985, 6, (char) 95);
        setCharElement(term29985, 7, 'U');
        setCharElement(term29985, 8, 'N');
        setCharElement(term29985, 9, 'D');
        setCharElement(term29985, 10, 'E');
        setCharElement(term29985, 11, 'F');
        setCharElement(term29985, 12, 'I');
        setCharElement(term29985, 13, 'N');
        setCharElement(term29985, 14, 'E');
        setCharElement(term29985, 15, 'D');
        setField(term31126, term31126.getClass(), "_tokenCBuffer", term29985);
        term31214 = newInstance(Class.forName("com.fasterxml.jackson.core.io.UTF32Reader"));
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
        args[0] = term31126;
        args[1] = 0;
        args[2] = term31214;
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


