package org.apache.commons.compress.archivers.ar;

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
import static org.apache.commons.compress.archivers.ar.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ArArchiveInputStream_read_62966458813 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13;
     Object term16;

    public ArArchiveInputStream_read_62966458813() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        setField(term13, term13.getClass(), "input", null);
        setLongField(term13, term13.getClass(), "offset", 5270370404989704783L);
        setBooleanField(term13, term13.getClass(), "closed", true);
        term16 = (byte[]) newByteArray(5);
        setByteElement(term16, 0, (byte) 47);
        setByteElement(term16, 1, (byte) 48);
        setByteElement(term16, 2, (byte) 89);
        setByteElement(term16, 3, (byte) 75);
        setByteElement(term16, 4, (byte) 18);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term16;
        try {
            callMethod(klass, "read", argTypes, term13, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


