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
import static org.apache.commons.compress.archivers.tar.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TarArchiveOutputStream_close_1914055047195 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term326540;

    public TarArchiveOutputStream_close_1914055047195() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term326540 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        Object term326648 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarBuffer"));
        Object term326718 = newInstance(Class.forName("org.tukaani.xz.LZMA2OutputStream"));
        setBooleanField(term326540, term326540.getClass(), "finished", true);
        setBooleanField(term326540, term326540.getClass(), "closed", false);
        setField(term326648, term326648.getClass(), "outStream", null);
        setField(term326648, term326648.getClass(), "inStream", null);
        setField(term326540, term326540.getClass(), "buffer", term326648);
        setBooleanField(term326718, term326718.getClass(), "finished", false);
        setField(term326540, term326540.getClass(), "out", term326718);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "close", argTypes, term326540, args);
    }

};


