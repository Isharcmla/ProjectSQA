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
import java.lang.Object;

public class TarArchiveOutputStream_write_1643250680122 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term100021;

    public TarArchiveOutputStream_write_1643250680122() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term100021 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term99855 = (byte[]) newByteArray(0);
        Object term100129 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarBuffer"));
        setLongField(term100021, term100021.getClass(), "currBytes", -4611686059464459319L);
        setLongField(term100021, term100021.getClass(), "currSize", 4611686059464458296L);
        setIntField(term100021, term100021.getClass(), "assemLen", 0);
        setField(term100021, term100021.getClass(), "recordBuf", term99855);
        setField(term100021, term100021.getClass(), "buffer", term100129);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = 0;
        args[2] = 1022;
        try {
            callMethod(klass, "write", argTypes, term100021, args);
            assertTrue(false);
        }
        catch (IOException e) {
        }

    }

};


