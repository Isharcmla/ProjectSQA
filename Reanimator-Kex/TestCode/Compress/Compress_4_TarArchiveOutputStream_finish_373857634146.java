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

public class TarArchiveOutputStream_finish_373857634146 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term115365;

    public TarArchiveOutputStream_finish_373857634146() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term115365 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term115001 = (byte[]) newByteArray(8);
        Object term115473 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarBuffer"));
        Object term115607 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setBooleanField(term115365, term115365.getClass(), "haveUnclosedEntry", false);
        setField(term115365, term115365.getClass(), "recordBuf", term115001);
        setField(term115473, term115473.getClass(), "outStream", term115607);
        setIntField(term115473, term115473.getClass(), "recordSize", 8);
        setField(term115365, term115365.getClass(), "buffer", term115473);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "finish", argTypes, term115365, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


