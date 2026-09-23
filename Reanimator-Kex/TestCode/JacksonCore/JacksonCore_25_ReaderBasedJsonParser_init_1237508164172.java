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

public class ReaderBasedJsonParser_init_1237508164172 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31021;

    public ReaderBasedJsonParser_init_1237508164172() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term30895 = newInstance(Class.forName("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        term31021 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        char[] term30173 = (char[]) newCharArray(489);
        setIntField(term30895, term30895.getClass(), "_features", 0);
        setIntField(term30895, term30895.getClass(), "_currInputRow", 0);
        setIntField(term30895, term30895.getClass(), "_tokenInputRow", 0);
        setIntField(term30895, term30895.getClass(), "_numTypesValid", 0);
        setField(term31021, term31021.getClass(), "_bufferRecycler", null);
        setCharElement(term30173, 0, 'A');
        setCharElement(term30173, 1, 'L');
        setCharElement(term30173, 2, 'L');
        setCharElement(term30173, 3, 'O');
        setCharElement(term30173, 4, 'W');
        setCharElement(term30173, 5, (char) 95);
        setCharElement(term30173, 6, 'Y');
        setCharElement(term30173, 7, 'A');
        setCharElement(term30173, 8, 'M');
        setCharElement(term30173, 9, 'L');
        setCharElement(term30173, 10, (char) 95);
        setCharElement(term30173, 11, 'C');
        setCharElement(term30173, 12, 'O');
        setCharElement(term30173, 13, 'M');
        setCharElement(term30173, 14, 'M');
        setCharElement(term30173, 15, 'E');
        setCharElement(term30173, 16, 'N');
        setCharElement(term30173, 17, 'T');
        setCharElement(term30173, 18, 'S');
        setField(term31021, term31021.getClass(), "_tokenCBuffer", term30173);
        setField(term30895, term30895.getClass(), "_ioContext", term31021);
        setField(term30895, term30895.getClass(), "_textBuffer", null);
        setField(term30895, term30895.getClass(), "_parsingContext", null);
        setField(term30895, term30895.getClass(), "_reader", null);
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
        args[0] = term31021;
        args[1] = -1;
        args[2] = null;
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


