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
import java.lang.NullPointerException;
import static com.fasterxml.jackson.core.json.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ReaderBasedJsonParser_init_1237508164169 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42049;

    public ReaderBasedJsonParser_init_1237508164169() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term41717 = newInstance(Class.forName("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        Object term41807 = newInstance(Class.forName("com.fasterxml.jackson.core.util.TextBuffer"));
        Object term41907 = newInstance(Class.forName("com.fasterxml.jackson.core.json.JsonReadContext"));
        Object term41965 = newInstance(Class.forName("java.io.Console$LineReader"));
        setIntField(term41717, term41717.getClass(), "_features", 0);
        setIntField(term41717, term41717.getClass(), "_currInputRow", 0);
        setIntField(term41717, term41717.getClass(), "_tokenInputRow", 0);
        setIntField(term41717, term41717.getClass(), "_numTypesValid", 0);
        setField(term41717, term41717.getClass(), "_ioContext", null);
        setField(term41717, term41717.getClass(), "_textBuffer", term41807);
        setField(term41717, term41717.getClass(), "_parsingContext", term41907);
        setField(term41717, term41717.getClass(), "_reader", term41965);
        term42049 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        Object term42147 = newInstance(Class.forName("com.fasterxml.jackson.core.util.BufferRecycler"));
        setField(term42049, term42049.getClass(), "_bufferRecycler", term42147);
        setField(term42049, term42049.getClass(), "_tokenCBuffer", null);
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
        args[0] = term42049;
        args[1] = -1;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


