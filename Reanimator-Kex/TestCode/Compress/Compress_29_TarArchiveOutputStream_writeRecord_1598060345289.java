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
import java.io.IOException;
import static org.apache.commons.compress.archivers.tar.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class TarArchiveOutputStream_writeRecord_1598060345289 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term163816;
     Object term163648;

    public TarArchiveOutputStream_writeRecord_1598060345289() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term163816 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setIntField(term163816, term163816.getClass(), "recordSize", 0);
        setField(term163816, term163816.getClass(), "out", term163816);
        setBooleanField(term163816, term163816.getClass(), "haveUnclosedEntry", true);
        setLongField(term163816, term163816.getClass(), "currBytes", 9223372036854775776L);
        setLongField(term163816, term163816.getClass(), "currSize", 29L);
        term163648 = (byte[]) newByteArray(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term163648;
        args[1] = 0;
        try {
            callMethod(klass, "writeRecord", argTypes, term163816, args);
            assertTrue(false);
        }
        catch (IOException e) {
        }

    }

};


