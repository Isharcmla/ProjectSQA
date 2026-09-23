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

public class TarArchiveOutputStream_close_1914055047187 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term323900;

    public TarArchiveOutputStream_close_1914055047187() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term323900 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term323607 = (byte[]) newByteArray(5);
        Object term324008 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarBuffer"));
        Object term324058 = newInstance(Class.forName("java.io.OutputStream$1"));
        byte[] term323678 = (byte[]) newByteArray(5);
        setBooleanField(term323900, term323900.getClass(), "finished", false);
        setBooleanField(term323900, term323900.getClass(), "haveUnclosedEntry", false);
        setField(term323900, term323900.getClass(), "recordBuf", term323607);
        setField(term324008, term324008.getClass(), "outStream", term324058);
        setIntField(term324008, term324008.getClass(), "recordSize", 5);
        setIntField(term324008, term324008.getClass(), "currRecIdx", -2147483648);
        setIntField(term324008, term324008.getClass(), "recsPerBlock", -2147483648);
        setField(term324008, term324008.getClass(), "blockBuffer", term323678);
        setIntField(term324008, term324008.getClass(), "blockSize", 0);
        setField(term323900, term323900.getClass(), "buffer", term324008);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "close", argTypes, term323900, args);
    }

};


