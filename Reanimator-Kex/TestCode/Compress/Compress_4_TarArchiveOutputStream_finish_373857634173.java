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

public class TarArchiveOutputStream_finish_373857634173 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term145949;

    public TarArchiveOutputStream_finish_373857634173() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term145949 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term145745 = (byte[]) newByteArray(1);
        Object term146057 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarBuffer"));
        setBooleanField(term145949, term145949.getClass(), "haveUnclosedEntry", false);
        setField(term145949, term145949.getClass(), "recordBuf", term145745);
        setField(term146057, term146057.getClass(), "outStream", term145949);
        setIntField(term146057, term146057.getClass(), "recordSize", 1);
        setIntField(term146057, term146057.getClass(), "currRecIdx", -2147483648);
        setIntField(term146057, term146057.getClass(), "recsPerBlock", -2147483648);
        setField(term146057, term146057.getClass(), "blockBuffer", term145745);
        setIntField(term146057, term146057.getClass(), "blockSize", -1);
        setField(term145949, term145949.getClass(), "buffer", term146057);
        setLongField(term145949, term145949.getClass(), "currBytes", -9223367638808281088L);
        setLongField(term145949, term145949.getClass(), "currSize", 9223367638808264704L);
        setIntField(term145949, term145949.getClass(), "assemLen", 1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "finish", argTypes, term145949, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


