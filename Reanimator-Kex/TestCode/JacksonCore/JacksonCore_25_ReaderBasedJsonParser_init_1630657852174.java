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

public class ReaderBasedJsonParser_init_1630657852174 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38071;
     Object term38109;
     Object term36958;
     Object term38225;

    public ReaderBasedJsonParser_init_1630657852174() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term37597 = newInstance(Class.forName("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        Object term37681 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        Object term37771 = newInstance(Class.forName("com.fasterxml.jackson.core.util.TextBuffer"));
        Object term37871 = newInstance(Class.forName("com.fasterxml.jackson.core.json.JsonReadContext"));
        Object term37359 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.ObjectCodec"));
        Object term37987 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer"));
        setIntField(term37597, term37597.getClass(), "_features", 0);
        setIntField(term37597, term37597.getClass(), "_currInputRow", 0);
        setIntField(term37597, term37597.getClass(), "_tokenInputRow", 0);
        setIntField(term37597, term37597.getClass(), "_numTypesValid", 0);
        setField(term37597, term37597.getClass(), "_ioContext", term37681);
        setField(term37597, term37597.getClass(), "_textBuffer", term37771);
        setField(term37597, term37597.getClass(), "_parsingContext", term37871);
        setField(term37597, term37597.getClass(), "_reader", null);
        setField(term37597, term37597.getClass(), "_inputBuffer", null);
        setIntField(term37597, term37597.getClass(), "_inputPtr", 0);
        setIntField(term37597, term37597.getClass(), "_inputEnd", 0);
        setField(term37597, term37597.getClass(), "_objectCodec", term37359);
        setField(term37597, term37597.getClass(), "_symbols", term37987);
        term38071 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        setField(term38071, term38071.getClass(), "_bufferRecycler", null);
        term38109 = newInstance(Class.forName("java.io.Reader$1"));
        term36958 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.ObjectCodec"));
        term38225 = newInstance(Class.forName("com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer"));
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
        args[0] = term38071;
        args[1] = -1;
        args[2] = term38109;
        args[3] = term36958;
        args[4] = term38225;
        args[5] = null;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


