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

public class TarArchiveOutputStream_close_1914055047178 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term132695;

    public TarArchiveOutputStream_close_1914055047178() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term132695 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term132508 = (byte[]) newByteArray(0);
        Object term132803 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarBuffer"));
        Object term132875 = newInstance(Class.forName("java.util.zip.CheckedOutputStream"));
        setBooleanField(term132695, term132695.getClass(), "closed", false);
        setField(term132695, term132695.getClass(), "recordBuf", term132508);
        setField(term132803, term132803.getClass(), "outStream", term132875);
        setIntField(term132803, term132803.getClass(), "recordSize", 0);
        setIntField(term132803, term132803.getClass(), "currRecIdx", -2147483648);
        setIntField(term132803, term132803.getClass(), "recsPerBlock", -2147483648);
        setField(term132803, term132803.getClass(), "blockBuffer", null);
        setIntField(term132803, term132803.getClass(), "blockSize", 0);
        setField(term132695, term132695.getClass(), "buffer", term132803);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "close", argTypes, term132695, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


