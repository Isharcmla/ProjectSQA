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
import java.lang.Object;

public class TarArchiveOutputStream_writeRecord_1598060345269 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term153131;
     Object term152939;

    public TarArchiveOutputStream_writeRecord_1598060345269() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term153131 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        Object term153265 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term152947 = (byte[]) newByteArray(0);
        Object term153399 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setIntField(term153131, term153131.getClass(), "recordSize", 1022);
        setBooleanField(term153265, term153265.getClass(), "haveUnclosedEntry", true);
        setLongField(term153265, term153265.getClass(), "currBytes", -9223038199801079552L);
        setLongField(term153265, term153265.getClass(), "currSize", 8065401574853206272L);
        setIntField(term153265, term153265.getClass(), "assemLen", 0);
        setField(term153265, term153265.getClass(), "recordBuf", term152947);
        setIntField(term153265, term153265.getClass(), "recordSize", 1022);
        setField(term153265, term153265.getClass(), "out", term153399);
        setField(term153131, term153131.getClass(), "out", term153265);
        term152939 = (byte[]) newByteArray(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term152939;
        args[1] = -1022;
        try {
            callMethod(klass, "writeRecord", argTypes, term153131, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


