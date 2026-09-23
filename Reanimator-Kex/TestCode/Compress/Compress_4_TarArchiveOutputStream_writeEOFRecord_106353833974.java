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

public class TarArchiveOutputStream_writeEOFRecord_106353833974 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term91868;

    public TarArchiveOutputStream_writeEOFRecord_106353833974() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term91868 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term91686 = (byte[]) newByteArray(2);
        Object term91976 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarBuffer"));
        Object term92046 = newInstance(Class.forName("java.util.zip.CheckedInputStream"));
        setField(term91868, term91868.getClass(), "recordBuf", term91686);
        setField(term91976, term91976.getClass(), "outStream", null);
        setField(term91976, term91976.getClass(), "inStream", term92046);
        setField(term91868, term91868.getClass(), "buffer", term91976);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "writeEOFRecord", argTypes, term91868, args);
            assertTrue(false);
        }
        catch (IOException e) {
        }

    }

};


