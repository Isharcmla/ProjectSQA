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
import java.lang.IllegalArgumentException;
import static org.apache.commons.compress.archivers.tar.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Integer;

public class TarUtils_formatOctalBytes_94475273232 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term198;
     Object term200;
     Object term206;
     Object term208;

    public TarUtils_formatOctalBytes_94475273232() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term198 = new Long(6375119433582206027L);
        term200 = (byte[]) newByteArray(5);
        setByteElement(term200, 0, (byte) 93);
        setByteElement(term200, 1, (byte) 69);
        setByteElement(term200, 2, (byte) -74);
        setByteElement(term200, 3, (byte) -123);
        setByteElement(term200, 4, (byte) -23);
        term206 = new Integer(-2068769794);
        term208 = new Integer(-117576464);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarUtils");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = long.class;
        argTypes[1] = Array.newInstance(byte.class, 0).getClass();
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        Object[] args = new Object[4];
        args[0] = term198;
        args[1] = term200;
        args[2] = term206;
        args[3] = term208;
        try {
            callMethod(klass, "formatOctalBytes", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


