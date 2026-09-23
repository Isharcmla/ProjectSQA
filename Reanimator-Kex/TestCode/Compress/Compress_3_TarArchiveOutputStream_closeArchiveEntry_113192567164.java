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

public class TarArchiveOutputStream_closeArchiveEntry_113192567164 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term127176;

    public TarArchiveOutputStream_closeArchiveEntry_113192567164() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term127176 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term124898 = (byte[]) newByteArray(528);
        Object term127284 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarBuffer"));
        Object term127346 = newInstance(Class.forName("java.io.BufferedOutputStream"));
        setIntField(term127176, term127176.getClass(), "assemLen", 527);
        setField(term127176, term127176.getClass(), "assemBuf", term124898);
        setField(term127284, term127284.getClass(), "outStream", term127346);
        setField(term127176, term127176.getClass(), "buffer", term127284);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "closeArchiveEntry", argTypes, term127176, args);
            assertTrue(false);
        }
        catch (IOException e) {
        }

    }

};


