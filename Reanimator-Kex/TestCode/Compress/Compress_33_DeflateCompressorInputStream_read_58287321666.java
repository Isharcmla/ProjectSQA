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
import java.lang.Object;

public class DeflateCompressorInputStream_read_58287321666 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17581;

    public DeflateCompressorInputStream_read_58287321666() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17581 = newInstance(Class.forName("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream"));
        Object term17739 = newInstance(Class.forName("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream"));
        Object term17821 = newInstance(Class.forName("org.tukaani.xz.SeekableFileInputStream"));
        setField(term17739, term17739.getClass(), "in", term17821);
        setField(term17581, term17581.getClass(), "in", term17739);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = 0;
        args[2] = 0;
        try {
            callMethod(klass, "read", argTypes, term17581, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


