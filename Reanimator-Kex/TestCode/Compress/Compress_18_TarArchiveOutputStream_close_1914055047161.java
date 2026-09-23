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

public class TarArchiveOutputStream_close_1914055047161 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term281545;

    public TarArchiveOutputStream_close_1914055047161() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term281545 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term281284 = (byte[]) newByteArray(5);
        Object term281653 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarBuffer"));
        Object term281787 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        setBooleanField(term281545, term281545.getClass(), "finished", false);
        setBooleanField(term281545, term281545.getClass(), "haveUnclosedEntry", false);
        setField(term281545, term281545.getClass(), "recordBuf", term281284);
        setField(term281653, term281653.getClass(), "outStream", term281787);
        setIntField(term281653, term281653.getClass(), "recordSize", 5);
        setField(term281545, term281545.getClass(), "buffer", term281653);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "close", argTypes, term281545, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


