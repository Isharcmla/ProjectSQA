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

public class TarArchiveOutputStream_close_1914055047186 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term323428;

    public TarArchiveOutputStream_close_1914055047186() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term323428 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term323138 = (byte[]) newByteArray(5);
        Object term323536 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarBuffer"));
        Object term323598 = newInstance(Class.forName("java.io.BufferedOutputStream"));
        setBooleanField(term323428, term323428.getClass(), "finished", false);
        setBooleanField(term323428, term323428.getClass(), "haveUnclosedEntry", false);
        setField(term323428, term323428.getClass(), "recordBuf", term323138);
        setField(term323536, term323536.getClass(), "outStream", term323428);
        setIntField(term323536, term323536.getClass(), "recordSize", 5);
        setIntField(term323536, term323536.getClass(), "currRecIdx", -2147483648);
        setIntField(term323536, term323536.getClass(), "recsPerBlock", -2147483648);
        setField(term323536, term323536.getClass(), "blockBuffer", null);
        setIntField(term323536, term323536.getClass(), "blockSize", 0);
        setField(term323428, term323428.getClass(), "buffer", term323536);
        setLongField(term323428, term323428.getClass(), "currBytes", -9223372036854644737L);
        setLongField(term323428, term323428.getClass(), "currSize", 9106278446543011840L);
        setIntField(term323428, term323428.getClass(), "assemLen", 0);
        setField(term323428, term323428.getClass(), "out", term323598);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "close", argTypes, term323428, args);
    }

};


