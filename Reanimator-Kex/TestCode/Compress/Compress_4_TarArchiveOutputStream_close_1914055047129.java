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

public class TarArchiveOutputStream_close_1914055047129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term108320;

    public TarArchiveOutputStream_close_1914055047129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term108320 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term108160 = (byte[]) newByteArray(0);
        Object term108428 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarBuffer"));
        Object term108578 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        setBooleanField(term108320, term108320.getClass(), "closed", false);
        setBooleanField(term108320, term108320.getClass(), "haveUnclosedEntry", false);
        setField(term108320, term108320.getClass(), "recordBuf", term108160);
        setField(term108428, term108428.getClass(), "outStream", null);
        setField(term108428, term108428.getClass(), "inStream", term108578);
        setField(term108320, term108320.getClass(), "buffer", term108428);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "close", argTypes, term108320, args);
            assertTrue(false);
        }
        catch (IOException e) {
        }

    }

};


