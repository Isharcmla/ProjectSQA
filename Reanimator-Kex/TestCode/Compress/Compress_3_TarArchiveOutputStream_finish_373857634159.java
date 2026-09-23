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

public class TarArchiveOutputStream_finish_373857634159 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term122859;

    public TarArchiveOutputStream_finish_373857634159() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term122859 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term122659 = (byte[]) newByteArray(1);
        Object term122967 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarBuffer"));
        Object term123105 = newInstance(Class.forName("org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream"));
        setField(term122859, term122859.getClass(), "recordBuf", term122659);
        setField(term122967, term122967.getClass(), "outStream", term123105);
        setIntField(term122967, term122967.getClass(), "recordSize", 1);
        setIntField(term122967, term122967.getClass(), "currRecIdx", -2147483648);
        setIntField(term122967, term122967.getClass(), "recsPerBlock", -2147483648);
        setField(term122967, term122967.getClass(), "blockBuffer", term122659);
        setIntField(term122967, term122967.getClass(), "blockSize", 1);
        setField(term122859, term122859.getClass(), "buffer", term122967);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "finish", argTypes, term122859, args);
            assertTrue(false);
        }
        catch (IOException e) {
        }

    }

};


