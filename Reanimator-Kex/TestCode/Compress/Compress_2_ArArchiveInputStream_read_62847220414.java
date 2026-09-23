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
import java.lang.Integer;

public class ArArchiveInputStream_read_62847220414 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27;
     Object term30;
     Object term35;
     Object term37;

    public ArArchiveInputStream_read_62847220414() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27 = newInstance(Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream"));
        setField(term27, term27.getClass(), "input", null);
        setLongField(term27, term27.getClass(), "offset", 7411271909051562686L);
        setBooleanField(term27, term27.getClass(), "closed", true);
        term30 = (byte[]) newByteArray(4);
        setByteElement(term30, 0, (byte) -58);
        setByteElement(term30, 1, (byte) -29);
        setByteElement(term30, 2, (byte) -54);
        setByteElement(term30, 3, (byte) -10);
        term35 = new Integer(568599855);
        term37 = new Integer(1162663216);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.ar.ArArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term30;
        args[1] = term35;
        args[2] = term37;
        try {
            callMethod(klass, "read", argTypes, term27, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


