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

public class TarArchiveOutputStream_finish_373857634175 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term158995;

    public TarArchiveOutputStream_finish_373857634175() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term158995 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term146327 = (byte[]) newByteArray(0);
        Object term159103 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarBuffer"));
        Object term159157 = newInstance(Class.forName("java.io.FileOutputStream"));
        byte[] term146333 = (byte[]) newByteArray(490);
        setBooleanField(term158995, term158995.getClass(), "haveUnclosedEntry", false);
        setField(term158995, term158995.getClass(), "recordBuf", term146327);
        setField(term159103, term159103.getClass(), "outStream", term159157);
        setIntField(term159103, term159103.getClass(), "recordSize", 0);
        setIntField(term159103, term159103.getClass(), "currRecIdx", 0);
        setIntField(term159103, term159103.getClass(), "recsPerBlock", -2147483647);
        setField(term159103, term159103.getClass(), "blockBuffer", term146333);
        setIntField(term159103, term159103.getClass(), "blockSize", 1610612746);
        setField(term158995, term158995.getClass(), "buffer", term159103);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "finish", argTypes, term158995, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


