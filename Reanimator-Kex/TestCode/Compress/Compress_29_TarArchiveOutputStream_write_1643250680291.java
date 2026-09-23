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

public class TarArchiveOutputStream_write_1643250680291 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term164270;
     Object term164092;

    public TarArchiveOutputStream_write_1643250680291() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term164270 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term164099 = (byte[]) newByteArray(0);
        setBooleanField(term164270, term164270.getClass(), "haveUnclosedEntry", true);
        setLongField(term164270, term164270.getClass(), "currBytes", -8658679235583L);
        setLongField(term164270, term164270.getClass(), "currSize", 8658679234560L);
        setIntField(term164270, term164270.getClass(), "assemLen", 0);
        setField(term164270, term164270.getClass(), "recordBuf", term164099);
        setIntField(term164270, term164270.getClass(), "recordSize", 0);
        term164092 = (byte[]) newByteArray(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term164092;
        args[1] = 1;
        args[2] = 1022;
        try {
            callMethod(klass, "write", argTypes, term164270, args);
            assertTrue(false);
        }
        catch (IOException e) {
        }

    }

};


