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

public class ReaderBasedJsonParser_init_1237508164209 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term441155;

    public ReaderBasedJsonParser_init_1237508164209() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term440987 = newInstance(Class.forName("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        Object term441071 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        setIntField(term440987, term440987.getClass(), "_features", 0);
        setIntField(term440987, term440987.getClass(), "_currInputRow", 0);
        setIntField(term440987, term440987.getClass(), "_tokenInputRow", 0);
        setIntField(term440987, term440987.getClass(), "_numTypesValid", 0);
        setField(term440987, term440987.getClass(), "_ioContext", term441071);
        setField(term440987, term440987.getClass(), "_textBuffer", null);
        setField(term440987, term440987.getClass(), "_parsingContext", null);
        setField(term440987, term440987.getClass(), "_reader", null);
        term441155 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        Object term441253 = newInstance(Class.forName("com.fasterxml.jackson.core.util.BufferRecycler"));
        Object[] term440751 = (Object[]) newArray("[C", 32);
        char[] term440752 = (char[]) newCharArray(0);
        setElement(term440751, 0, term440752);
        setField(term441253, term441253.getClass(), "_charBuffers", term440751);
        setField(term441155, term441155.getClass(), "_bufferRecycler", term441253);
        setField(term441155, term441155.getClass(), "_tokenCBuffer", null);
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
        args[0] = term441155;
        args[1] = 0;
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


