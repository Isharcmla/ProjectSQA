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

public class ReaderBasedJsonParser_init_1237508164155 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27116;

    public ReaderBasedJsonParser_init_1237508164155() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term26942 = newInstance(Class.forName("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        Object term27032 = newInstance(Class.forName("com.fasterxml.jackson.core.util.TextBuffer"));
        setIntField(term26942, term26942.getClass(), "_features", 0);
        setIntField(term26942, term26942.getClass(), "_currInputRow", 0);
        setIntField(term26942, term26942.getClass(), "_tokenInputRow", 0);
        setIntField(term26942, term26942.getClass(), "_numTypesValid", 0);
        setField(term26942, term26942.getClass(), "_ioContext", null);
        setField(term26942, term26942.getClass(), "_textBuffer", term27032);
        setField(term26942, term26942.getClass(), "_parsingContext", null);
        setField(term26942, term26942.getClass(), "_reader", null);
        term27116 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        char[] term26238 = (char[]) newCharArray(489);
        setField(term27116, term27116.getClass(), "_bufferRecycler", null);
        setCharElement(term26238, 0, 'A');
        setCharElement(term26238, 1, 'U');
        setCharElement(term26238, 2, 'T');
        setCharElement(term26238, 3, 'O');
        setCharElement(term26238, 4, (char) 95);
        setCharElement(term26238, 5, 'C');
        setCharElement(term26238, 6, 'L');
        setCharElement(term26238, 7, 'O');
        setCharElement(term26238, 8, 'S');
        setCharElement(term26238, 9, 'E');
        setCharElement(term26238, 10, (char) 95);
        setCharElement(term26238, 11, 'S');
        setCharElement(term26238, 12, 'O');
        setCharElement(term26238, 13, 'U');
        setCharElement(term26238, 14, 'R');
        setCharElement(term26238, 15, 'C');
        setCharElement(term26238, 16, 'E');
        setField(term27116, term27116.getClass(), "_tokenCBuffer", term26238);
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
        args[0] = term27116;
        args[1] = 0;
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


