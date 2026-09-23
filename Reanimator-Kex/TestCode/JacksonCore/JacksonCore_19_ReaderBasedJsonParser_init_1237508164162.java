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

public class ReaderBasedJsonParser_init_1237508164162 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34108;

    public ReaderBasedJsonParser_init_1237508164162() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term33934 = newInstance(Class.forName("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        Object term34024 = newInstance(Class.forName("com.fasterxml.jackson.core.util.TextBuffer"));
        setIntField(term33934, term33934.getClass(), "_features", 0);
        setIntField(term33934, term33934.getClass(), "_currInputRow", 0);
        setIntField(term33934, term33934.getClass(), "_tokenInputRow", 0);
        setIntField(term33934, term33934.getClass(), "_numTypesValid", 0);
        setField(term33934, term33934.getClass(), "_ioContext", null);
        setField(term33934, term33934.getClass(), "_textBuffer", term34024);
        setField(term33934, term33934.getClass(), "_parsingContext", null);
        setField(term33934, term33934.getClass(), "_reader", null);
        term34108 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        char[] term33390 = (char[]) newCharArray(329);
        setField(term34108, term34108.getClass(), "_bufferRecycler", null);
        setCharElement(term33390, 0, 'A');
        setCharElement(term33390, 1, 'L');
        setCharElement(term33390, 2, 'L');
        setCharElement(term33390, 3, 'O');
        setCharElement(term33390, 4, 'W');
        setCharElement(term33390, 5, (char) 95);
        setCharElement(term33390, 6, 'C');
        setCharElement(term33390, 7, 'O');
        setCharElement(term33390, 8, 'M');
        setCharElement(term33390, 9, 'M');
        setCharElement(term33390, 10, 'E');
        setCharElement(term33390, 11, 'N');
        setCharElement(term33390, 12, 'T');
        setCharElement(term33390, 13, 'S');
        setField(term34108, term34108.getClass(), "_tokenCBuffer", term33390);
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
        args[0] = term34108;
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


