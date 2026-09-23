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

public class ReaderBasedJsonParser_init_1630657852166 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38009;
     Object term36640;
     Object term38125;
     Object term36642;

    public ReaderBasedJsonParser_init_1630657852166() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term37685 = newInstance(Class.forName("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] term37443 = (char[]) newCharArray(0);
        Object term37775 = newInstance(Class.forName("com.fasterxml.jackson.core.util.TextBuffer"));
        Object term37875 = newInstance(Class.forName("com.fasterxml.jackson.core.json.JsonReadContext"));
        Object term37925 = newInstance(Class.forName("java.io.BufferedReader"));
        char[] term37461 = (char[]) newCharArray(0);
        Object term37464 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.ObjectCodec"));
        setIntField(term37685, term37685.getClass(), "_features", 0);
        setIntField(term37685, term37685.getClass(), "_inputPtr", 0);
        setIntField(term37685, term37685.getClass(), "_inputEnd", 0);
        setLongField(term37685, term37685.getClass(), "_currInputProcessed", 0L);
        setIntField(term37685, term37685.getClass(), "_currInputRow", 0);
        setIntField(term37685, term37685.getClass(), "_currInputRowStart", 0);
        setLongField(term37685, term37685.getClass(), "_tokenInputTotal", 0L);
        setIntField(term37685, term37685.getClass(), "_tokenInputRow", 0);
        setIntField(term37685, term37685.getClass(), "_tokenInputCol", 0);
        setField(term37685, term37685.getClass(), "_nameCopyBuffer", term37443);
        setBooleanField(term37685, term37685.getClass(), "_nameCopied", false);
        setField(term37685, term37685.getClass(), "_byteArrayBuilder", null);
        setIntField(term37685, term37685.getClass(), "_numTypesValid", 0);
        setField(term37685, term37685.getClass(), "_ioContext", null);
        setField(term37685, term37685.getClass(), "_textBuffer", term37775);
        setField(term37685, term37685.getClass(), "_parsingContext", term37875);
        setBooleanField(term37685, term37685.getClass(), "_tokenIncomplete", false);
        setField(term37685, term37685.getClass(), "_reader", term37925);
        setField(term37685, term37685.getClass(), "_inputBuffer", term37461);
        setField(term37685, term37685.getClass(), "_objectCodec", term37464);
        setField(term37685, term37685.getClass(), "_symbols", null);
        term38009 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        setField(term38009, term38009.getClass(), "_bufferRecycler", null);
        term36640 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.ObjectCodec"));
        term38125 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer"));
        term36642 = (char[]) newCharArray(489);
        setCharElement(term36642, 0, 'A');
        setCharElement(term36642, 1, 'L');
        setCharElement(term36642, 2, 'L');
        setCharElement(term36642, 3, 'O');
        setCharElement(term36642, 4, 'W');
        setCharElement(term36642, 5, (char) 95);
        setCharElement(term36642, 6, 'N');
        setCharElement(term36642, 7, 'U');
        setCharElement(term36642, 8, 'M');
        setCharElement(term36642, 9, 'E');
        setCharElement(term36642, 10, 'R');
        setCharElement(term36642, 11, 'I');
        setCharElement(term36642, 12, 'C');
        setCharElement(term36642, 13, (char) 95);
        setCharElement(term36642, 14, 'L');
        setCharElement(term36642, 15, 'E');
        setCharElement(term36642, 16, 'A');
        setCharElement(term36642, 17, 'D');
        setCharElement(term36642, 18, 'I');
        setCharElement(term36642, 19, 'N');
        setCharElement(term36642, 20, 'G');
        setCharElement(term36642, 21, (char) 95);
        setCharElement(term36642, 22, 'Z');
        setCharElement(term36642, 23, 'E');
        setCharElement(term36642, 24, 'R');
        setCharElement(term36642, 25, 'O');
        setCharElement(term36642, 26, 'S');
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
        args[0] = term38009;
        args[1] = -1;
        args[2] = null;
        args[3] = term36640;
        args[4] = term38125;
        args[5] = term36642;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


