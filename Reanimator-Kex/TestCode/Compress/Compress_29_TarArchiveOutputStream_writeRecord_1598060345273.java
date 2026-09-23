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
import java.lang.NullPointerException;
import static org.apache.commons.compress.archivers.tar.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TarArchiveOutputStream_writeRecord_1598060345273 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term157519;
     Object term157336;

    public TarArchiveOutputStream_writeRecord_1598060345273() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term157519 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        Object term157653 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term157344 = (byte[]) newByteArray(0);
        setIntField(term157519, term157519.getClass(), "recordSize", -2);
        setBooleanField(term157653, term157653.getClass(), "haveUnclosedEntry", true);
        setLongField(term157653, term157653.getClass(), "currBytes", -9222531460215341057L);
        setLongField(term157653, term157653.getClass(), "currSize", 9222246136947933186L);
        setIntField(term157653, term157653.getClass(), "assemLen", 1);
        setField(term157653, term157653.getClass(), "recordBuf", term157344);
        setField(term157519, term157519.getClass(), "out", term157653);
        term157336 = (byte[]) newByteArray(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term157336;
        args[1] = 2;
        try {
            callMethod(klass, "writeRecord", argTypes, term157519, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


