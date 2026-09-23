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
import java.io.IOException;
import static org.apache.commons.compress.archivers.tar.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TarArchiveOutputStream_finish_37385763431 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term81552;

    public TarArchiveOutputStream_finish_37385763431() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term81552 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term81385 = (byte[]) newByteArray(1);
        Object term81660 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarBuffer"));
        Object term81714 = newInstance(Class.forName("java.io.PipedInputStream"));
        setField(term81552, term81552.getClass(), "recordBuf", term81385);
        setField(term81660, term81660.getClass(), "outStream", null);
        setField(term81660, term81660.getClass(), "inStream", term81714);
        setField(term81552, term81552.getClass(), "buffer", term81660);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "finish", argTypes, term81552, args);
            assertTrue(false);
        }
        catch (IOException e) {
        }

    }

};


