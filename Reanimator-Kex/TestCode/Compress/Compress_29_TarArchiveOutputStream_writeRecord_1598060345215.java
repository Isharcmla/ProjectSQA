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

public class TarArchiveOutputStream_writeRecord_1598060345215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term121481;
     Object term121302;

    public TarArchiveOutputStream_writeRecord_1598060345215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term121481 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        Object term121615 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term121310 = (byte[]) newByteArray(0);
        setIntField(term121481, term121481.getClass(), "recordSize", 1);
        setBooleanField(term121615, term121615.getClass(), "haveUnclosedEntry", true);
        setLongField(term121615, term121615.getClass(), "currBytes", 1125487589953502L);
        setLongField(term121615, term121615.getClass(), "currSize", 8916001362286768160L);
        setIntField(term121615, term121615.getClass(), "assemLen", 0);
        setField(term121615, term121615.getClass(), "recordBuf", term121310);
        setField(term121481, term121481.getClass(), "out", term121615);
        term121302 = (byte[]) newByteArray(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term121302;
        args[1] = -1;
        try {
            callMethod(klass, "writeRecord", argTypes, term121481, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


