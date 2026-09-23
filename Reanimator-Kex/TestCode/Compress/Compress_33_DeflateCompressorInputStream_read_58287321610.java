package org.apache.commons.compress.compressors.deflate;

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
import static org.apache.commons.compress.compressors.deflate.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class DeflateCompressorInputStream_read_58287321610 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6;
     Object term8;
     Object term14;
     Object term16;

    public DeflateCompressorInputStream_read_58287321610() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6 = newInstance(Class.forName("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream"));
        setField(term6, term6.getClass(), "in", null);
        setLongField(term6, term6.getClass(), "bytesRead", 6375119433582206027L);
        term8 = (byte[]) newByteArray(5);
        setByteElement(term8, 0, (byte) 47);
        setByteElement(term8, 1, (byte) 48);
        setByteElement(term8, 2, (byte) 89);
        setByteElement(term8, 3, (byte) 75);
        setByteElement(term8, 4, (byte) 18);
        term14 = new Integer(568599855);
        term16 = new Integer(1162663216);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term8;
        args[1] = term14;
        args[2] = term16;
        try {
            callMethod(klass, "read", argTypes, term6, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


