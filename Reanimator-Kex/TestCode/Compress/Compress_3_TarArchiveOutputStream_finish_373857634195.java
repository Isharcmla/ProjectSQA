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

public class TarArchiveOutputStream_finish_373857634195 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term134752;

    public TarArchiveOutputStream_finish_373857634195() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term134752 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term134546 = (byte[]) newByteArray(1);
        Object term134860 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarBuffer"));
        Object term134994 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream"));
        setField(term134752, term134752.getClass(), "recordBuf", term134546);
        setField(term134860, term134860.getClass(), "outStream", term134994);
        setIntField(term134860, term134860.getClass(), "recordSize", 1);
        setIntField(term134860, term134860.getClass(), "currRecIdx", -2147483648);
        setIntField(term134860, term134860.getClass(), "recsPerBlock", -2147483648);
        setField(term134860, term134860.getClass(), "blockBuffer", term134546);
        setIntField(term134860, term134860.getClass(), "blockSize", -1);
        setField(term134752, term134752.getClass(), "buffer", term134860);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "finish", argTypes, term134752, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


