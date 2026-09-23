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

public class ReaderBasedJsonParser_init_1630657852137 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23687;
     Object term22324;
     Object term23803;
     Object term22326;

    public ReaderBasedJsonParser_init_1630657852137() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term23369 = newInstance(Class.forName("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] term23127 = (char[]) newCharArray(0);
        Object term23459 = newInstance(Class.forName("com.fasterxml.jackson.core.util.TextBuffer"));
        Object term23559 = newInstance(Class.forName("com.fasterxml.jackson.core.json.JsonReadContext"));
        Object term23603 = newInstance(Class.forName("java.io.PipedReader"));
        char[] term23145 = (char[]) newCharArray(0);
        Object term23148 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.ObjectCodec"));
        setIntField(term23369, term23369.getClass(), "_features", 0);
        setIntField(term23369, term23369.getClass(), "_inputPtr", 0);
        setIntField(term23369, term23369.getClass(), "_inputEnd", 0);
        setLongField(term23369, term23369.getClass(), "_currInputProcessed", 0L);
        setIntField(term23369, term23369.getClass(), "_currInputRow", 0);
        setIntField(term23369, term23369.getClass(), "_currInputRowStart", 0);
        setLongField(term23369, term23369.getClass(), "_tokenInputTotal", 0L);
        setIntField(term23369, term23369.getClass(), "_tokenInputRow", 0);
        setIntField(term23369, term23369.getClass(), "_tokenInputCol", 0);
        setField(term23369, term23369.getClass(), "_nameCopyBuffer", term23127);
        setBooleanField(term23369, term23369.getClass(), "_nameCopied", false);
        setField(term23369, term23369.getClass(), "_byteArrayBuilder", null);
        setIntField(term23369, term23369.getClass(), "_numTypesValid", 0);
        setField(term23369, term23369.getClass(), "_ioContext", null);
        setField(term23369, term23369.getClass(), "_textBuffer", term23459);
        setField(term23369, term23369.getClass(), "_parsingContext", term23559);
        setBooleanField(term23369, term23369.getClass(), "_tokenIncomplete", false);
        setField(term23369, term23369.getClass(), "_reader", term23603);
        setField(term23369, term23369.getClass(), "_inputBuffer", term23145);
        setField(term23369, term23369.getClass(), "_objectCodec", term23148);
        setField(term23369, term23369.getClass(), "_symbols", null);
        term23687 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        setField(term23687, term23687.getClass(), "_bufferRecycler", null);
        term22324 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.ObjectCodec"));
        term23803 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer"));
        term22326 = (char[]) newCharArray(489);
        setCharElement(term22326, 0, 'A');
        setCharElement(term22326, 1, 'L');
        setCharElement(term22326, 2, 'L');
        setCharElement(term22326, 3, 'O');
        setCharElement(term22326, 4, 'W');
        setCharElement(term22326, 5, (char) 95);
        setCharElement(term22326, 6, 'N');
        setCharElement(term22326, 7, 'U');
        setCharElement(term22326, 8, 'M');
        setCharElement(term22326, 9, 'E');
        setCharElement(term22326, 10, 'R');
        setCharElement(term22326, 11, 'I');
        setCharElement(term22326, 12, 'C');
        setCharElement(term22326, 13, (char) 95);
        setCharElement(term22326, 14, 'L');
        setCharElement(term22326, 15, 'E');
        setCharElement(term22326, 16, 'A');
        setCharElement(term22326, 17, 'D');
        setCharElement(term22326, 18, 'I');
        setCharElement(term22326, 19, 'N');
        setCharElement(term22326, 20, 'G');
        setCharElement(term22326, 21, (char) 95);
        setCharElement(term22326, 22, 'Z');
        setCharElement(term22326, 23, 'E');
        setCharElement(term22326, 24, 'R');
        setCharElement(term22326, 25, 'O');
        setCharElement(term22326, 26, 'S');
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
        args[0] = term23687;
        args[1] = -1;
        args[2] = null;
        args[3] = term22324;
        args[4] = term23803;
        args[5] = term22326;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


