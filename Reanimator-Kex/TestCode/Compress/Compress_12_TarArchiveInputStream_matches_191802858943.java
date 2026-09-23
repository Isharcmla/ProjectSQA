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

public class TarArchiveInputStream_matches_191802858943 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4936;
     Object term4946;
     Object term153151;

    public TarArchiveInputStream_matches_191802858943() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4936 = (byte[]) newByteArray(9);
        setByteElement(term4936, 0, (byte) 44);
        setByteElement(term4936, 1, (byte) 49);
        setByteElement(term4936, 2, (byte) 114);
        setByteElement(term4936, 3, (byte) -81);
        setByteElement(term4936, 4, (byte) 127);
        setByteElement(term4936, 5, (byte) -24);
        setByteElement(term4936, 6, (byte) -89);
        setByteElement(term4936, 7, (byte) -35);
        setByteElement(term4936, 8, (byte) -59);
        term4946 = new Integer(-165587447);
        term153151 = (byte[]) newByteArray(9);
        setByteElement(term153151, 0, (byte) 44);
        setByteElement(term153151, 1, (byte) 49);
        setByteElement(term153151, 2, (byte) 114);
        setByteElement(term153151, 3, (byte) -81);
        setByteElement(term153151, 4, (byte) 127);
        setByteElement(term153151, 5, (byte) -24);
        setByteElement(term153151, 6, (byte) -89);
        setByteElement(term153151, 7, (byte) -35);
        setByteElement(term153151, 8, (byte) -59);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term4936;
        args[1] = term4946;
        Object retValue = callMethod(klass, "matches", argTypes, null, args);
        assertTrue(recursiveEquals(term4936, term153151));
        assertTrue(recursiveEquals(term4946, -165587447));
        assertTrue(recursiveEquals(retValue, false));
    }

};


