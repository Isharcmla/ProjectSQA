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

public class TarArchiveOutputStream_writeRecord_1598060345179 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term98790;
     Object term98616;

    public TarArchiveOutputStream_writeRecord_1598060345179() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term98790 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setIntField(term98790, term98790.getClass(), "recordSize", 1);
        setField(term98790, term98790.getClass(), "out", term98790);
        setBooleanField(term98790, term98790.getClass(), "haveUnclosedEntry", true);
        setLongField(term98790, term98790.getClass(), "currBytes", -9223372035781033986L);
        setLongField(term98790, term98790.getClass(), "currSize", 9223372035781033984L);
        setIntField(term98790, term98790.getClass(), "assemLen", 0);
        term98616 = (byte[]) newByteArray(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term98616;
        args[1] = -1;
        try {
            callMethod(klass, "writeRecord", argTypes, term98790, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


