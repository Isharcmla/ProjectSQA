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

public class TarArchiveOutputStream_writeEOFRecord_106353833957 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term87551;

    public TarArchiveOutputStream_writeEOFRecord_106353833957() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term87551 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term87369 = (byte[]) newByteArray(2);
        Object term87659 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarBuffer"));
        Object term87731 = newInstance(Class.forName("java.lang.Process$PipeInputStream"));
        setField(term87551, term87551.getClass(), "recordBuf", term87369);
        setField(term87659, term87659.getClass(), "outStream", null);
        setField(term87659, term87659.getClass(), "inStream", term87731);
        setField(term87551, term87551.getClass(), "buffer", term87659);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "writeEOFRecord", argTypes, term87551, args);
            assertTrue(false);
        }
        catch (IOException e) {
        }

    }

};


