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
import org.mockito.Mockito;

public class ReaderBasedJsonParser_init_1630657852188 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term252296;
     Object term252348;
     Object term250953;
     Object term252464;
     Object term250955;

    public ReaderBasedJsonParser_init_1630657852188() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term251984 = newInstance(Class.forName("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        Object term252068 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        Object term252168 = newInstance(Class.forName("com.fasterxml.jackson.core.json.JsonReadContext"));
        Object term252212 = newInstance(Class.forName("java.io.PipedReader"));
        Object term251766 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.ObjectCodec"));
        setIntField(term251984, term251984.getClass(), "_features", 0);
        setIntField(term251984, term251984.getClass(), "_currInputRow", 0);
        setIntField(term251984, term251984.getClass(), "_tokenInputRow", 0);
        setIntField(term251984, term251984.getClass(), "_numTypesValid", 0);
        setField(term251984, term251984.getClass(), "_ioContext", term252068);
        setField(term251984, term251984.getClass(), "_textBuffer", null);
        setField(term251984, term251984.getClass(), "_parsingContext", term252168);
        setField(term251984, term251984.getClass(), "_reader", term252212);
        setField(term251984, term251984.getClass(), "_inputBuffer", null);
        setIntField(term251984, term251984.getClass(), "_inputPtr", 0);
        setIntField(term251984, term251984.getClass(), "_inputEnd", 0);
        setField(term251984, term251984.getClass(), "_objectCodec", term251766);
        setField(term251984, term251984.getClass(), "_symbols", null);
        term252296 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        setField(term252296, term252296.getClass(), "_bufferRecycler", null);
        term252348 = newInstance(Class.forName("java.io.CharArrayReader"));
        term250953 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.ObjectCodec"));
        term252464 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer"));
        term250955 = (char[]) newCharArray(489);
        setCharElement(term250955, 0, 'A');
        setCharElement(term250955, 1, 'L');
        setCharElement(term250955, 2, 'L');
        setCharElement(term250955, 3, 'O');
        setCharElement(term250955, 4, 'W');
        setCharElement(term250955, 5, (char) 95);
        setCharElement(term250955, 6, 'S');
        setCharElement(term250955, 7, 'I');
        setCharElement(term250955, 8, 'N');
        setCharElement(term250955, 9, 'G');
        setCharElement(term250955, 10, 'L');
        setCharElement(term250955, 11, 'E');
        setCharElement(term250955, 12, (char) 95);
        setCharElement(term250955, 13, 'Q');
        setCharElement(term250955, 14, 'U');
        setCharElement(term250955, 15, 'O');
        setCharElement(term250955, 16, 'T');
        setCharElement(term250955, 17, 'E');
        setCharElement(term250955, 18, 'S');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.core.json.ReaderBasedJsonParser");
        Class<?>[] argTypes = new Class<?>[9];
        argTypes[0] = Class.forName("com.fasterxml.jackson.core.io.IOContext");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("java.io.Reader");
        argTypes[3] = Class.forName("com.fasterxml.jackson.core.ObjectCodec");
        argTypes[4] = Class.forName("com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer");
        argTypes[5] = Array.newInstance(char.class, 0).getClass();
        argTypes[6] = int.class;
        argTypes[7] = int.class;
        argTypes[8] = boolean.class;
        Object[] args = new Object[9];
        args[0] = term252296;
        args[1] = -1;
        args[2] = term252348;
        args[3] = term250953;
        args[4] = term252464;
        args[5] = term250955;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


