package org.apache.commons.codec.binary;

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
import java.lang.IndexOutOfBoundsException;
import static org.apache.commons.codec.binary.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class BaseNCodecInputStream_read_11795911586 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16;
     Object term23;
     Object term27;
     Object term29;

    public BaseNCodecInputStream_read_11795911586() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16 = newInstance(Class.forName("org.apache.commons.codec.binary.BaseNCodecInputStream"));
        byte[] term18 = (byte[]) newByteArray(4);
        setBooleanField(term16, term16.getClass(), "doEncode", false);
        setField(term16, term16.getClass(), "baseNCodec", null);
        setByteElement(term18, 0, (byte) -58);
        setByteElement(term18, 1, (byte) -29);
        setByteElement(term18, 2, (byte) -54);
        setByteElement(term18, 3, (byte) -10);
        setField(term16, term16.getClass(), "singleByte", term18);
        setField(term16, term16.getClass(), "in", null);
        term23 = (byte[]) newByteArray(3);
        setByteElement(term23, 0, (byte) 79);
        setByteElement(term23, 1, (byte) -119);
        setByteElement(term23, 2, (byte) -66);
        term27 = new Integer(568599855);
        term29 = new Integer(1162663216);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.binary.BaseNCodecInputStream");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term23;
        args[1] = term27;
        args[2] = term29;
        try {
            callMethod(klass, "read", argTypes, term16, args);
            assertTrue(false);
        }
        catch (IndexOutOfBoundsException e) {
        }

    }

};


