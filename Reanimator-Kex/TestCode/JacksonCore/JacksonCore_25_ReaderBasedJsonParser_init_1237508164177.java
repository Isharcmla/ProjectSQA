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
import java.lang.ArrayIndexOutOfBoundsException;
import static com.fasterxml.jackson.core.json.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ReaderBasedJsonParser_init_1237508164177 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39435;
     Object term39585;

    public ReaderBasedJsonParser_init_1237508164177() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term39177 = newInstance(Class.forName("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        Object term39261 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        Object term39351 = newInstance(Class.forName("com.fasterxml.jackson.core.util.TextBuffer"));
        setIntField(term39177, term39177.getClass(), "_features", 0);
        setIntField(term39177, term39177.getClass(), "_currInputRow", 0);
        setIntField(term39177, term39177.getClass(), "_tokenInputRow", 0);
        setIntField(term39177, term39177.getClass(), "_numTypesValid", 0);
        setField(term39177, term39177.getClass(), "_ioContext", term39261);
        setField(term39177, term39177.getClass(), "_textBuffer", term39351);
        setField(term39177, term39177.getClass(), "_parsingContext", null);
        setField(term39177, term39177.getClass(), "_reader", null);
        term39435 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        Object term39533 = newInstance(Class.forName("com.fasterxml.jackson.core.util.BufferRecycler"));
        Object[] term38931 = (Object[]) newArray("[C", 0);
        setField(term39533, term39533.getClass(), "_charBuffers", term38931);
        setField(term39435, term39435.getClass(), "_bufferRecycler", term39533);
        setField(term39435, term39435.getClass(), "_tokenCBuffer", null);
        term39585 = newInstance(Class.forName("java.io.CharArrayReader"));
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
        args[0] = term39435;
        args[1] = -1;
        args[2] = term39585;
        args[3] = null;
        args[4] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


