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

public class ReaderBasedJsonParser_init_1237508164175 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47908;
     Object term48060;

    public ReaderBasedJsonParser_init_1237508164175() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term47582 = newInstance(Class.forName("com.fasterxml.jackson.core.json.ReaderBasedJsonParser"));
        char[] term47345 = (char[]) newCharArray(0);
        Object term47672 = newInstance(Class.forName("com.fasterxml.jackson.core.util.TextBuffer"));
        Object term47772 = newInstance(Class.forName("com.fasterxml.jackson.core.json.JsonReadContext"));
        Object term47824 = newInstance(Class.forName("java.io.CharArrayReader"));
        setIntField(term47582, term47582.getClass(), "_features", 0);
        setIntField(term47582, term47582.getClass(), "_inputPtr", 0);
        setIntField(term47582, term47582.getClass(), "_inputEnd", 0);
        setLongField(term47582, term47582.getClass(), "_currInputProcessed", 0L);
        setIntField(term47582, term47582.getClass(), "_currInputRow", 0);
        setIntField(term47582, term47582.getClass(), "_currInputRowStart", 0);
        setLongField(term47582, term47582.getClass(), "_tokenInputTotal", 0L);
        setIntField(term47582, term47582.getClass(), "_tokenInputRow", 0);
        setIntField(term47582, term47582.getClass(), "_tokenInputCol", 0);
        setField(term47582, term47582.getClass(), "_nameCopyBuffer", term47345);
        setBooleanField(term47582, term47582.getClass(), "_nameCopied", false);
        setField(term47582, term47582.getClass(), "_byteArrayBuilder", null);
        setIntField(term47582, term47582.getClass(), "_numTypesValid", 0);
        setField(term47582, term47582.getClass(), "_ioContext", null);
        setField(term47582, term47582.getClass(), "_textBuffer", term47672);
        setField(term47582, term47582.getClass(), "_parsingContext", term47772);
        setBooleanField(term47582, term47582.getClass(), "_tokenIncomplete", false);
        setField(term47582, term47582.getClass(), "_reader", term47824);
        term47908 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        Object term48006 = newInstance(Class.forName("com.fasterxml.jackson.core.util.BufferRecycler"));
        setField(term47908, term47908.getClass(), "_bufferRecycler", term48006);
        setField(term47908, term47908.getClass(), "_tokenCBuffer", null);
        term48060 = newInstance(Class.forName("java.io.LineNumberReader"));
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
        args[0] = term47908;
        args[1] = 0;
        args[2] = term48060;
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


