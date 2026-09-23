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

public class ReaderBasedJsonParser_init_1237508164181 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43053;
     Object term43103;

    public ReaderBasedJsonParser_init_1237508164181() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term42695 = newInstance(Class.forName("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        term43053 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        char[] term41972 = (char[]) newCharArray(489);
        Object term42869 = newInstance(Class.forName("com.fasterxml.jackson.core.util.TextBuffer"));
        Object term42969 = newInstance(Class.forName("com.fasterxml.jackson.core.json.JsonReadContext"));
        Object term43011 = newInstance(Class.forName("java.io.FileReader"));
        setIntField(term42695, term42695.getClass(), "_features", 0);
        setIntField(term42695, term42695.getClass(), "_currInputRow", 0);
        setIntField(term42695, term42695.getClass(), "_tokenInputRow", 0);
        setIntField(term42695, term42695.getClass(), "_numTypesValid", 0);
        setField(term43053, term43053.getClass(), "_bufferRecycler", null);
        setCharElement(term41972, 0, 'A');
        setCharElement(term41972, 1, 'L');
        setCharElement(term41972, 2, 'L');
        setCharElement(term41972, 3, 'O');
        setCharElement(term41972, 4, 'W');
        setCharElement(term41972, 5, (char) 95);
        setCharElement(term41972, 6, 'S');
        setCharElement(term41972, 7, 'I');
        setCharElement(term41972, 8, 'N');
        setCharElement(term41972, 9, 'G');
        setCharElement(term41972, 10, 'L');
        setCharElement(term41972, 11, 'E');
        setCharElement(term41972, 12, (char) 95);
        setCharElement(term41972, 13, 'Q');
        setCharElement(term41972, 14, 'U');
        setCharElement(term41972, 15, 'O');
        setCharElement(term41972, 16, 'T');
        setCharElement(term41972, 17, 'E');
        setCharElement(term41972, 18, 'S');
        setField(term43053, term43053.getClass(), "_tokenCBuffer", term41972);
        setField(term42695, term42695.getClass(), "_ioContext", term43053);
        setField(term42695, term42695.getClass(), "_textBuffer", term42869);
        setField(term42969, term42969.getClass(), "_parent", null);
        setField(term42969, term42969.getClass(), "_dups", null);
        setIntField(term42969, term42969.getClass(), "_type", 0);
        setIntField(term42969, term42969.getClass(), "_lineNr", 0);
        setIntField(term42969, term42969.getClass(), "_columnNr", 0);
        setIntField(term42969, term42969.getClass(), "_index", 0);
        setField(term42695, term42695.getClass(), "_parsingContext", term42969);
        setField(term42695, term42695.getClass(), "_reader", term43011);
        term43103 = newInstance(Class.forName("java.io.PushbackReader"));
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
        args[0] = term43053;
        args[1] = 0;
        args[2] = term43103;
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


