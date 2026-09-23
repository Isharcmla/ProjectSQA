package org.apache.commons.compress.archivers.tar;

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
import static org.apache.commons.compress.archivers.tar.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.compress.archivers.tar.EqualityUtils.*;
import java.lang.Integer;

public class TarArchiveInputStream_matches_191802858961 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6174;
     Object term6183;
     Object term21881;

    public TarArchiveInputStream_matches_191802858961() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6174 = (byte[]) newByteArray(8);
        setByteElement(term6174, 0, (byte) 112);
        setByteElement(term6174, 1, (byte) 77);
        setByteElement(term6174, 2, (byte) -1);
        setByteElement(term6174, 3, (byte) -83);
        setByteElement(term6174, 4, (byte) -63);
        setByteElement(term6174, 5, (byte) 108);
        setByteElement(term6174, 6, (byte) -105);
        setByteElement(term6174, 7, (byte) 33);
        term6183 = new Integer(-2104981311);
        term21881 = (byte[]) newByteArray(8);
        setByteElement(term21881, 0, (byte) 112);
        setByteElement(term21881, 1, (byte) 77);
        setByteElement(term21881, 2, (byte) -1);
        setByteElement(term21881, 3, (byte) -83);
        setByteElement(term21881, 4, (byte) -63);
        setByteElement(term21881, 5, (byte) 108);
        setByteElement(term21881, 6, (byte) -105);
        setByteElement(term21881, 7, (byte) 33);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term6174;
        args[1] = term6183;
        Object retValue = callMethod(klass, "matches", argTypes, null, args);
        assertTrue(recursiveEquals(term6174, term21881));
        assertTrue(recursiveEquals(term6183, -2104981311));
        assertTrue(recursiveEquals(retValue, false));
    }

};


