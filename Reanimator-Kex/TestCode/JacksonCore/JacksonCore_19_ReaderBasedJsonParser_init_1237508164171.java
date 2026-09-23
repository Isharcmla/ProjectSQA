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

public class ReaderBasedJsonParser_init_1237508164171 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43546;

    public ReaderBasedJsonParser_init_1237508164171() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term43378 = newInstance(Class.forName("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        Object term43462 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        setIntField(term43378, term43378.getClass(), "_features", 0);
        setIntField(term43378, term43378.getClass(), "_currInputRow", 0);
        setIntField(term43378, term43378.getClass(), "_tokenInputRow", 0);
        setIntField(term43378, term43378.getClass(), "_numTypesValid", 0);
        setField(term43378, term43378.getClass(), "_ioContext", term43462);
        setField(term43378, term43378.getClass(), "_textBuffer", null);
        setField(term43378, term43378.getClass(), "_parsingContext", null);
        setField(term43378, term43378.getClass(), "_reader", null);
        term43546 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        Object term43644 = newInstance(Class.forName("com.fasterxml.jackson.core.util.BufferRecycler"));
        Object[] term43153 = (Object[]) newArray("[C", 0);
        setField(term43644, term43644.getClass(), "_charBuffers", term43153);
        setField(term43546, term43546.getClass(), "_bufferRecycler", term43644);
        setField(term43546, term43546.getClass(), "_tokenCBuffer", null);
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
        args[0] = term43546;
        args[1] = -1;
        args[2] = null;
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


