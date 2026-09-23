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

public class UTF8JsonGenerator_init_25805811197 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term69695;
     Object term67813;
     Object term69797;
     Object term67815;

    public UTF8JsonGenerator_init_25805811197() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term69417 = newInstance(Class.forName("com.fasterxml.jackson.core.json.UTF8JsonGenerator"));
        Object term69515 = newInstance(Class.forName("com.fasterxml.jackson.core.io.SerializedString"));
        term69695 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        char[] term69070 = (char[]) newCharArray(105);
        Object term69653 = newInstance(Class.forName("java.io.FileOutputStream"));
        byte[] term68578 = (byte[]) newByteArray(0);
        setIntField(term69417, term69417.getClass(), "_features", 0);
        setField(term69417, term69417.getClass(), "_objectCodec", null);
        setField(term69417, term69417.getClass(), "_writeContext", null);
        setBooleanField(term69417, term69417.getClass(), "_cfgNumbersAsStrings", false);
        setField(term69417, term69417.getClass(), "_outputEscapes", null);
        setField(term69417, term69417.getClass(), "_rootValueSeparator", term69515);
        setCharElement(term69070, 0, 'E');
        setCharElement(term69070, 1, 'S');
        setCharElement(term69070, 2, 'C');
        setCharElement(term69070, 3, 'A');
        setCharElement(term69070, 4, 'P');
        setCharElement(term69070, 5, 'E');
        setCharElement(term69070, 6, (char) 95);
        setCharElement(term69070, 7, 'N');
        setCharElement(term69070, 8, 'O');
        setCharElement(term69070, 9, 'N');
        setCharElement(term69070, 10, (char) 95);
        setCharElement(term69070, 11, 'A');
        setCharElement(term69070, 12, 'S');
        setCharElement(term69070, 13, 'C');
        setCharElement(term69070, 14, 'I');
        setCharElement(term69070, 15, 'I');
        setField(term69695, term69695.getClass(), "_concatCBuffer", term69070);
        setField(term69417, term69417.getClass(), "_ioContext", term69695);
        setIntField(term69417, term69417.getClass(), "_maximumNonEscapedChar", 0);
        setBooleanField(term69417, term69417.getClass(), "_cfgUnqNames", false);
        setField(term69417, term69417.getClass(), "_outputStream", term69653);
        setBooleanField(term69417, term69417.getClass(), "_bufferRecyclable", false);
        setIntField(term69417, term69417.getClass(), "_outputTail", 0);
        setField(term69417, term69417.getClass(), "_outputBuffer", term68578);
        setIntField(term69417, term69417.getClass(), "_outputEnd", 0);
        setIntField(term69417, term69417.getClass(), "_outputMaxContiguous", 0);
        term67813 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.ObjectCodec"));
        term69797 = newInstance(Class.forName("java.io.ObjectOutputStream$BlockDataOutputStream"));
        term67815 = (byte[]) newByteArray(489);
        setByteElement(term67815, 0, (byte) 69);
        setByteElement(term67815, 1, (byte) 83);
        setByteElement(term67815, 2, (byte) 67);
        setByteElement(term67815, 3, (byte) 65);
        setByteElement(term67815, 4, (byte) 80);
        setByteElement(term67815, 5, (byte) 69);
        setByteElement(term67815, 6, (byte) 95);
        setByteElement(term67815, 7, (byte) 78);
        setByteElement(term67815, 8, (byte) 79);
        setByteElement(term67815, 9, (byte) 78);
        setByteElement(term67815, 10, (byte) 95);
        setByteElement(term67815, 11, (byte) 65);
        setByteElement(term67815, 12, (byte) 83);
        setByteElement(term67815, 13, (byte) 67);
        setByteElement(term67815, 14, (byte) 73);
        setByteElement(term67815, 15, (byte) 73);
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
        args[0] = term69695;
        args[1] = -1;
        args[2] = term67813;
        args[3] = term69797;
        args[4] = term67815;
        args[5] = 0;
        args[6] = true;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


