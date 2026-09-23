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

public class TarArchiveOutputStream_write_1643250680296 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term170559;
     Object term170376;

    public TarArchiveOutputStream_write_1643250680296() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term170559 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term170383 = (byte[]) newByteArray(0);
        Object term170613 = newInstance(Class.forName("java.io.DataOutputStream"));
        setBooleanField(term170559, term170559.getClass(), "haveUnclosedEntry", true);
        setLongField(term170559, term170559.getClass(), "currBytes", -504403186447703365L);
        setLongField(term170559, term170559.getClass(), "currSize", 504403167120326918L);
        setIntField(term170559, term170559.getClass(), "assemLen", 0);
        setField(term170559, term170559.getClass(), "recordBuf", term170383);
        setIntField(term170559, term170559.getClass(), "recordSize", 0);
        setField(term170559, term170559.getClass(), "out", term170613);
        term170376 = (byte[]) newByteArray(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term170376;
        args[1] = 0;
        args[2] = 1022;
        callMethod(klass, "write", argTypes, term170559, args);
    }

};


