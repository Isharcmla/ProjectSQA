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

public class TarUtils_formatCheckSumOctalBytes_94203830324 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term161;
     Object term163;
     Object term170;
     Object term172;

    public TarUtils_formatCheckSumOctalBytes_94203830324() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term161 = new Long(5270370404989704783L);
        term163 = (byte[]) newByteArray(6);
        setByteElement(term163, 0, (byte) 111);
        setByteElement(term163, 1, (byte) 99);
        setByteElement(term163, 2, (byte) -12);
        setByteElement(term163, 3, (byte) -61);
        setByteElement(term163, 4, (byte) -85);
        setByteElement(term163, 5, (byte) -22);
        term170 = new Integer(-655067527);
        term172 = new Integer(-6029667);
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
        args[0] = term161;
        args[1] = term163;
        args[2] = term170;
        args[3] = term172;
        try {
            callMethod(klass, "formatCheckSumOctalBytes", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


