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

public class TarArchiveOutputStream_writeRecord_1598060345217 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term122090;
     Object term121911;

    public TarArchiveOutputStream_writeRecord_1598060345217() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term122090 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        Object term122224 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term121919 = (byte[]) newByteArray(0);
        setIntField(term122090, term122090.getClass(), "recordSize", 0);
        setBooleanField(term122224, term122224.getClass(), "haveUnclosedEntry", true);
        setLongField(term122224, term122224.getClass(), "currBytes", -9222269226692141073L);
        setLongField(term122224, term122224.getClass(), "currSize", 9222246136947957760L);
        setIntField(term122224, term122224.getClass(), "assemLen", 1);
        setField(term122224, term122224.getClass(), "recordBuf", term121919);
        setField(term122090, term122090.getClass(), "out", term122224);
        term121911 = (byte[]) newByteArray(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term121911;
        args[1] = 0;
        try {
            callMethod(klass, "writeRecord", argTypes, term122090, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


