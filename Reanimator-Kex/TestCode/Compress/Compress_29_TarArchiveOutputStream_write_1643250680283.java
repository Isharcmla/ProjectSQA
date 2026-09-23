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

public class TarArchiveOutputStream_write_1643250680283 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term165326;
     Object term165140;

    public TarArchiveOutputStream_write_1643250680283() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term165326 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term165147 = (byte[]) newByteArray(0);
        Object term165460 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setBooleanField(term165326, term165326.getClass(), "haveUnclosedEntry", true);
        setLongField(term165326, term165326.getClass(), "currBytes", -4751403160525161436L);
        setLongField(term165326, term165326.getClass(), "currSize", 4751403160265111133L);
        setIntField(term165326, term165326.getClass(), "assemLen", 0);
        setField(term165326, term165326.getClass(), "recordBuf", term165147);
        setIntField(term165326, term165326.getClass(), "recordSize", 0);
        setBooleanField(term165460, term165460.getClass(), "haveUnclosedEntry", true);
        setField(term165326, term165326.getClass(), "out", term165460);
        term165140 = (byte[]) newByteArray(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term165140;
        args[1] = 0;
        args[2] = 1022;
        callMethod(klass, "write", argTypes, term165326, args);
    }

};


