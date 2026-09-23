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

public class TarArchiveOutputStream_close_1914055047117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term103772;

    public TarArchiveOutputStream_close_1914055047117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term103772 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term103448 = (byte[]) newByteArray(7);
        Object term103880 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarBuffer"));
        Object term104014 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setBooleanField(term103772, term103772.getClass(), "closed", false);
        setField(term103772, term103772.getClass(), "recordBuf", term103448);
        setField(term103880, term103880.getClass(), "outStream", term104014);
        setIntField(term103880, term103880.getClass(), "recordSize", 7);
        setField(term103772, term103772.getClass(), "buffer", term103880);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "close", argTypes, term103772, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


