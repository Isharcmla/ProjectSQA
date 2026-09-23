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

public class TarArchiveOutputStream_finish_373857634157 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term118661;

    public TarArchiveOutputStream_finish_373857634157() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term118661 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term118464 = (byte[]) newByteArray(1);
        Object term118769 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarBuffer"));
        byte[] term118474 = (byte[]) newByteArray(1);
        setField(term118661, term118661.getClass(), "recordBuf", term118464);
        setField(term118769, term118769.getClass(), "outStream", term118661);
        setIntField(term118769, term118769.getClass(), "recordSize", 1);
        setIntField(term118769, term118769.getClass(), "currRecIdx", -2147483648);
        setIntField(term118769, term118769.getClass(), "recsPerBlock", -2147483648);
        setField(term118769, term118769.getClass(), "blockBuffer", term118474);
        setIntField(term118769, term118769.getClass(), "blockSize", 0);
        setField(term118661, term118661.getClass(), "buffer", term118769);
        setLongField(term118661, term118661.getClass(), "currBytes", -9214364837600034817L);
        setLongField(term118661, term118661.getClass(), "currSize", 9214364837600034816L);
        setIntField(term118661, term118661.getClass(), "assemLen", 1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "finish", argTypes, term118661, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


