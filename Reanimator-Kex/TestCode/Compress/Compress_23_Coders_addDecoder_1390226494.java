package org.apache.commons.compress.archivers.sevenz;

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
import java.io.IOException;
import static org.apache.commons.compress.archivers.sevenz.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Coders_addDecoder_1390226494 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term15;

    public Coders_addDecoder_1390226494() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.Coder"));
        byte[] term2 = (byte[]) newByteArray(5);
        byte[] term10 = (byte[]) newByteArray(4);
        setByteElement(term2, 0, (byte) 47);
        setByteElement(term2, 1, (byte) 48);
        setByteElement(term2, 2, (byte) 89);
        setByteElement(term2, 3, (byte) 75);
        setByteElement(term2, 4, (byte) 18);
        setField(term1, term1.getClass(), "decompressionMethodId", term2);
        setLongField(term1, term1.getClass(), "numInStreams", 2442117782898005296L);
        setLongField(term1, term1.getClass(), "numOutStreams", 6375119433582206027L);
        setByteElement(term10, 0, (byte) -58);
        setByteElement(term10, 1, (byte) -29);
        setByteElement(term10, 2, (byte) -54);
        setByteElement(term10, 3, (byte) -10);
        setField(term1, term1.getClass(), "properties", term10);
        term15 = (byte[]) newByteArray(3);
        setByteElement(term15, 0, (byte) 79);
        setByteElement(term15, 1, (byte) -119);
        setByteElement(term15, 2, (byte) -66);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.sevenz.Coders");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.io.InputStream");
        argTypes[1] = Class.forName("org.apache.commons.compress.archivers.sevenz.Coder");
        argTypes[2] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term1;
        args[2] = term15;
        try {
            callMethod(klass, "addDecoder", argTypes, null, args);
            assertTrue(false);
        }
        catch (IOException e) {
        }

    }

};


