package org.apache.commons.compress.compressors.bzip2;

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
import static org.apache.commons.compress.compressors.bzip2.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.compress.compressors.bzip2.EqualityUtils.*;
import java.lang.Integer;

public class BZip2CompressorInputStream_matches_145514828355 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8359;
     Object term8363;
     Object term21786;

    public BZip2CompressorInputStream_matches_145514828355() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8359 = (byte[]) newByteArray(3);
        setByteElement(term8359, 0, (byte) 90);
        setByteElement(term8359, 1, (byte) -40);
        setByteElement(term8359, 2, (byte) 79);
        term8363 = new Integer(-1435032444);
        term21786 = (byte[]) newByteArray(3);
        setByteElement(term21786, 0, (byte) 90);
        setByteElement(term21786, 1, (byte) -40);
        setByteElement(term21786, 2, (byte) 79);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term8359;
        args[1] = term8363;
        Object retValue = callMethod(klass, "matches", argTypes, null, args);
        assertTrue(recursiveEquals(term8359, term21786));
        assertTrue(recursiveEquals(term8363, -1435032444));
        assertTrue(recursiveEquals(retValue, false));
    }

};


