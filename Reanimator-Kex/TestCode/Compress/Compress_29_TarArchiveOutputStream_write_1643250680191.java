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

public class TarArchiveOutputStream_write_1643250680191 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term103963;
     Object term103787;

    public TarArchiveOutputStream_write_1643250680191() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term103963 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term103794 = (byte[]) newByteArray(0);
        setBooleanField(term103963, term103963.getClass(), "haveUnclosedEntry", true);
        setLongField(term103963, term103963.getClass(), "currBytes", -2061785629695L);
        setLongField(term103963, term103963.getClass(), "currSize", 137640280064L);
        setIntField(term103963, term103963.getClass(), "assemLen", 0);
        setField(term103963, term103963.getClass(), "recordBuf", term103794);
        setIntField(term103963, term103963.getClass(), "recordSize", 0);
        term103787 = (byte[]) newByteArray(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term103787;
        args[1] = 0;
        args[2] = 1022;
        try {
            callMethod(klass, "write", argTypes, term103963, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


