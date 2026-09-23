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

public class ReaderBasedJsonParser_init_1237508164161 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28324;
     Object term28480;

    public ReaderBasedJsonParser_init_1237508164161() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term28000 = newInstance(Class.forName("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] term27287 = (char[]) newCharArray(0);
        Object term28090 = newInstance(Class.forName("com.fasterxml.jackson.core.util.TextBuffer"));
        Object term28190 = newInstance(Class.forName("com.fasterxml.jackson.core.json.JsonReadContext"));
        Object term28240 = newInstance(Class.forName("java.io.BufferedReader"));
        setIntField(term28000, term28000.getClass(), "_features", 0);
        setIntField(term28000, term28000.getClass(), "_inputPtr", 0);
        setIntField(term28000, term28000.getClass(), "_inputEnd", 0);
        setLongField(term28000, term28000.getClass(), "_currInputProcessed", 0L);
        setIntField(term28000, term28000.getClass(), "_currInputRow", 0);
        setIntField(term28000, term28000.getClass(), "_currInputRowStart", 0);
        setLongField(term28000, term28000.getClass(), "_tokenInputTotal", 0L);
        setIntField(term28000, term28000.getClass(), "_tokenInputRow", 0);
        setIntField(term28000, term28000.getClass(), "_tokenInputCol", 0);
        setField(term28000, term28000.getClass(), "_nameCopyBuffer", term27287);
        setBooleanField(term28000, term28000.getClass(), "_nameCopied", false);
        setField(term28000, term28000.getClass(), "_byteArrayBuilder", null);
        setIntField(term28000, term28000.getClass(), "_numTypesValid", 0);
        setField(term28000, term28000.getClass(), "_ioContext", null);
        setField(term28000, term28000.getClass(), "_textBuffer", term28090);
        setField(term28000, term28000.getClass(), "_parsingContext", term28190);
        setBooleanField(term28000, term28000.getClass(), "_tokenIncomplete", false);
        setField(term28000, term28000.getClass(), "_reader", term28240);
        term28324 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        Object term28422 = newInstance(Class.forName("com.fasterxml.jackson.core.util.BufferRecycler"));
        char[] term27306 = (char[]) newCharArray(489);
        setField(term28324, term28324.getClass(), "_bufferRecycler", term28422);
        setCharElement(term27306, 0, 'I');
        setCharElement(term27306, 1, 'G');
        setCharElement(term27306, 2, 'N');
        setCharElement(term27306, 3, 'O');
        setCharElement(term27306, 4, 'R');
        setCharElement(term27306, 5, 'E');
        setCharElement(term27306, 6, (char) 95);
        setCharElement(term27306, 7, 'U');
        setCharElement(term27306, 8, 'N');
        setCharElement(term27306, 9, 'D');
        setCharElement(term27306, 10, 'E');
        setCharElement(term27306, 11, 'F');
        setCharElement(term27306, 12, 'I');
        setCharElement(term27306, 13, 'N');
        setCharElement(term27306, 14, 'E');
        setCharElement(term27306, 15, 'D');
        setField(term28324, term28324.getClass(), "_tokenCBuffer", term27306);
        term28480 = newInstance(Class.forName("java.io.Console$LineReader"));
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
        args[0] = term28324;
        args[1] = -1;
        args[2] = term28480;
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


