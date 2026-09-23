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

public class ReaderBasedJsonParser_init_1237508164189 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term76078;

    public ReaderBasedJsonParser_init_1237508164189() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term75820 = newInstance(Class.forName("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        Object term75904 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        Object term75994 = newInstance(Class.forName("com.fasterxml.jackson.core.util.TextBuffer"));
        setIntField(term75820, term75820.getClass(), "_features", 0);
        setIntField(term75820, term75820.getClass(), "_currInputRow", 0);
        setIntField(term75820, term75820.getClass(), "_tokenInputRow", 0);
        setIntField(term75820, term75820.getClass(), "_numTypesValid", 0);
        setField(term75820, term75820.getClass(), "_ioContext", term75904);
        setField(term75820, term75820.getClass(), "_textBuffer", term75994);
        setField(term75820, term75820.getClass(), "_parsingContext", null);
        setField(term75820, term75820.getClass(), "_reader", null);
        term76078 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        Object term76176 = newInstance(Class.forName("com.fasterxml.jackson.core.util.BufferRecycler"));
        Object[] term75578 = (Object[]) newArray("[C", 0);
        setField(term76176, term76176.getClass(), "_charBuffers", term75578);
        setField(term76078, term76078.getClass(), "_bufferRecycler", term76176);
        setField(term76078, term76078.getClass(), "_tokenCBuffer", null);
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
        args[0] = term76078;
        args[1] = 0;
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


