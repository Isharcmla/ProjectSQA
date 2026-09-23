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

public class TarArchiveOutputStream_close_1914055047116 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term97170;

    public TarArchiveOutputStream_close_1914055047116() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term97170 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        Object term97278 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarBuffer"));
        Object term97426 = newInstance(Class.forName("org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream"));
        setBooleanField(term97170, term97170.getClass(), "finished", true);
        setBooleanField(term97170, term97170.getClass(), "closed", false);
        setField(term97278, term97278.getClass(), "outStream", term97426);
        setIntField(term97278, term97278.getClass(), "currRecIdx", 0);
        setField(term97170, term97170.getClass(), "buffer", term97278);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "close", argTypes, term97170, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


