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

public class TarArchiveOutputStream_writeRecord_1598060345271 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term154889;
     Object term153680;

    public TarArchiveOutputStream_writeRecord_1598060345271() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term154889 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        Object term155023 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term154201 = (byte[]) newByteArray(513);
        setIntField(term154889, term154889.getClass(), "recordSize", 512);
        setBooleanField(term155023, term155023.getClass(), "haveUnclosedEntry", true);
        setLongField(term155023, term155023.getClass(), "currBytes", -4611693715008782863L);
        setLongField(term155023, term155023.getClass(), "currSize", 4611691515985526786L);
        setIntField(term155023, term155023.getClass(), "assemLen", 0);
        setField(term155023, term155023.getClass(), "recordBuf", term154201);
        setField(term154889, term154889.getClass(), "out", term155023);
        term153680 = (byte[]) newByteArray(513);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term153680;
        args[1] = 1;
        try {
            callMethod(klass, "writeRecord", argTypes, term154889, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


