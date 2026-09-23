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

public class ReaderBasedJsonParser_init_1237508164183 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47049;
     Object term47176;

    public ReaderBasedJsonParser_init_1237508164183() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term46717 = newInstance(Class.forName("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        Object term46807 = newInstance(Class.forName("com.fasterxml.jackson.core.util.TextBuffer"));
        Object term46907 = newInstance(Class.forName("com.fasterxml.jackson.core.json.JsonReadContext"));
        term47176 = newInstance(Class.forName("java.io.Console$LineReader"));
        setIntField(term46717, term46717.getClass(), "_features", 0);
        setIntField(term46717, term46717.getClass(), "_currInputRow", 0);
        setIntField(term46717, term46717.getClass(), "_tokenInputRow", 0);
        setIntField(term46717, term46717.getClass(), "_numTypesValid", 0);
        setField(term46717, term46717.getClass(), "_ioContext", null);
        setField(term46717, term46717.getClass(), "_textBuffer", term46807);
        setField(term46717, term46717.getClass(), "_parsingContext", term46907);
        setField(term46717, term46717.getClass(), "_reader", term47176);
        term47049 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        Object term47147 = newInstance(Class.forName("com.fasterxml.jackson.core.util.BufferRecycler"));
        setField(term47049, term47049.getClass(), "_bufferRecycler", term47147);
        setField(term47049, term47049.getClass(), "_tokenCBuffer", null);
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
        args[0] = term47049;
        args[1] = 0;
        args[2] = term47176;
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


