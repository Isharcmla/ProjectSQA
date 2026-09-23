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

public class TarArchiveOutputStream_close_1914055047196 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term135233;

    public TarArchiveOutputStream_close_1914055047196() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term135233 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term134998 = (byte[]) newByteArray(3);
        Object term135341 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarBuffer"));
        byte[] term135030 = (byte[]) newByteArray(3);
        setBooleanField(term135233, term135233.getClass(), "closed", false);
        setField(term135233, term135233.getClass(), "recordBuf", term134998);
        setField(term135341, term135341.getClass(), "outStream", term135233);
        setIntField(term135341, term135341.getClass(), "recordSize", 3);
        setIntField(term135341, term135341.getClass(), "currRecIdx", -2147483648);
        setIntField(term135341, term135341.getClass(), "recsPerBlock", -2147483648);
        setField(term135341, term135341.getClass(), "blockBuffer", term135030);
        setIntField(term135341, term135341.getClass(), "blockSize", 0);
        setField(term135233, term135233.getClass(), "buffer", term135341);
        setLongField(term135233, term135233.getClass(), "currBytes", 2093383L);
        setLongField(term135233, term135233.getClass(), "currSize", 5512405943899393208L);
        setIntField(term135233, term135233.getClass(), "assemLen", 1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "close", argTypes, term135233, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


