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

public class UTF8JsonGenerator_init_25805811196 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term62878;
     Object term60962;
     Object term62940;
     Object term60964;

    public UTF8JsonGenerator_init_25805811196() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term62566 = newInstance(Class.forName("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        Object term62664 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        term62878 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        char[] term62219 = (char[]) newCharArray(105);
        Object term62836 = newInstance(Class.forName("java.lang.ProcessBuilder$NullOutputStream"));
        byte[] term61727 = (byte[]) newByteArray(0);
        setIntField(term62566, term62566.getClass(), "_features", 0);
        setField(term62566, term62566.getClass(), "_objectCodec", null);
        setField(term62566, term62566.getClass(), "_writeContext", null);
        setBooleanField(term62566, term62566.getClass(), "_cfgNumbersAsStrings", false);
        setField(term62566, term62566.getClass(), "_outputEscapes", null);
        setField(term62566, term62566.getClass(), "_rootValueSeparator", term62664);
        setCharElement(term62219, 0, 'E');
        setCharElement(term62219, 1, 'S');
        setCharElement(term62219, 2, 'C');
        setCharElement(term62219, 3, 'A');
        setCharElement(term62219, 4, 'P');
        setCharElement(term62219, 5, 'E');
        setCharElement(term62219, 6, (char) 95);
        setCharElement(term62219, 7, 'N');
        setCharElement(term62219, 8, 'O');
        setCharElement(term62219, 9, 'N');
        setCharElement(term62219, 10, (char) 95);
        setCharElement(term62219, 11, 'A');
        setCharElement(term62219, 12, 'S');
        setCharElement(term62219, 13, 'C');
        setCharElement(term62219, 14, 'I');
        setCharElement(term62219, 15, 'I');
        setField(term62878, term62878.getClass(), "_concatCBuffer", term62219);
        setField(term62566, term62566.getClass(), "_ioContext", term62878);
        setIntField(term62566, term62566.getClass(), "_maximumNonEscapedChar", 0);
        setBooleanField(term62566, term62566.getClass(), "_cfgUnqNames", false);
        setField(term62566, term62566.getClass(), "_outputStream", term62836);
        setBooleanField(term62566, term62566.getClass(), "_bufferRecyclable", false);
        setIntField(term62566, term62566.getClass(), "_outputTail", 0);
        setField(term62566, term62566.getClass(), "_outputBuffer", term61727);
        setIntField(term62566, term62566.getClass(), "_outputEnd", 0);
        setIntField(term62566, term62566.getClass(), "_outputMaxContiguous", 0);
        term60962 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.ObjectCodec"));
        term62940 = newInstance(Class.forName("java.nio.channels.Channels$1"));
        term60964 = (byte[]) newByteArray(489);
        setByteElement(term60964, 0, (byte) 69);
        setByteElement(term60964, 1, (byte) 83);
        setByteElement(term60964, 2, (byte) 67);
        setByteElement(term60964, 3, (byte) 65);
        setByteElement(term60964, 4, (byte) 80);
        setByteElement(term60964, 5, (byte) 69);
        setByteElement(term60964, 6, (byte) 95);
        setByteElement(term60964, 7, (byte) 78);
        setByteElement(term60964, 8, (byte) 79);
        setByteElement(term60964, 9, (byte) 78);
        setByteElement(term60964, 10, (byte) 95);
        setByteElement(term60964, 11, (byte) 65);
        setByteElement(term60964, 12, (byte) 83);
        setByteElement(term60964, 13, (byte) 67);
        setByteElement(term60964, 14, (byte) 73);
        setByteElement(term60964, 15, (byte) 73);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.core.json.UTF8JsonGenerator");
        Class<?>[] argTypes = new Class<?>[7];
        argTypes[0] = Class.forName("com.fasterxml.jackson.core.io.IOContext");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("com.fasterxml.jackson.core.ObjectCodec");
        argTypes[3] = Class.forName("java.io.OutputStream");
        argTypes[4] = Array.newInstance(byte.class, 0).getClass();
        argTypes[5] = int.class;
        argTypes[6] = boolean.class;
        Object[] args = new Object[7];
        args[0] = term62878;
        args[1] = -1;
        args[2] = term60962;
        args[3] = term62940;
        args[4] = term60964;
        args[5] = 0;
        args[6] = true;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


