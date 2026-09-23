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

public class TarArchiveOutputStream_closeArchiveEntry_113192567179 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term189318;

    public TarArchiveOutputStream_closeArchiveEntry_113192567179() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term189318 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term189133 = (byte[]) newByteArray(0);
        Object term189426 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarBuffer"));
        setIntField(term189318, term189318.getClass(), "assemLen", 1);
        setField(term189318, term189318.getClass(), "assemBuf", term189133);
        setField(term189426, term189426.getClass(), "outStream", term189318);
        setIntField(term189426, term189426.getClass(), "recordSize", 0);
        setIntField(term189426, term189426.getClass(), "currRecIdx", -2147483648);
        setIntField(term189426, term189426.getClass(), "recsPerBlock", -2147483648);
        setField(term189426, term189426.getClass(), "blockBuffer", term189133);
        setIntField(term189426, term189426.getClass(), "blockSize", 0);
        setField(term189318, term189318.getClass(), "buffer", term189426);
        setLongField(term189318, term189318.getClass(), "currBytes", 0L);
        setLongField(term189318, term189318.getClass(), "currSize", 9223372036854775807L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "closeArchiveEntry", argTypes, term189318, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


