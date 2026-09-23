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

public class TarUtils_verifyCheckSum_13554032319 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term281;

    public TarUtils_verifyCheckSum_13554032319() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term281 = (byte[]) newByteArray(8);
        setByteElement(term281, 0, (byte) -126);
        setByteElement(term281, 1, (byte) -91);
        setByteElement(term281, 2, (byte) -104);
        setByteElement(term281, 3, (byte) -89);
        setByteElement(term281, 4, (byte) 13);
        setByteElement(term281, 5, (byte) 44);
        setByteElement(term281, 6, (byte) -63);
        setByteElement(term281, 7, (byte) 15);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term281;
        callMethod(klass, "verifyCheckSum", argTypes, null, args);
    }

};


