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

public class TarArchiveOutputStream_close_1914055047116 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term103012;

    public TarArchiveOutputStream_close_1914055047116() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term103012 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term102809 = (byte[]) newByteArray(3);
        Object term103120 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarBuffer"));
        Object term103188 = newInstance(Class.forName("java.io.StringBufferInputStream"));
        setBooleanField(term103012, term103012.getClass(), "closed", false);
        setField(term103012, term103012.getClass(), "recordBuf", term102809);
        setField(term103120, term103120.getClass(), "outStream", null);
        setField(term103120, term103120.getClass(), "inStream", term103188);
        setField(term103012, term103012.getClass(), "buffer", term103120);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "close", argTypes, term103012, args);
            assertTrue(false);
        }
        catch (IOException e) {
        }

    }

};


