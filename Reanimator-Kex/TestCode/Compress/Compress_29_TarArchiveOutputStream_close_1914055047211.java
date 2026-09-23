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

public class TarArchiveOutputStream_close_1914055047211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term119407;

    public TarArchiveOutputStream_close_1914055047211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term119407 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term118265 = (byte[]) newByteArray(489);
        Object term119473 = newInstance(Class.forName("java.util.zip.GZIPOutputStream"));
        setBooleanField(term119407, term119407.getClass(), "finished", false);
        setBooleanField(term119407, term119407.getClass(), "haveUnclosedEntry", false);
        setField(term119407, term119407.getClass(), "recordBuf", term118265);
        setIntField(term119407, term119407.getClass(), "recordSize", 489);
        setField(term119407, term119407.getClass(), "out", term119473);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "close", argTypes, term119407, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


