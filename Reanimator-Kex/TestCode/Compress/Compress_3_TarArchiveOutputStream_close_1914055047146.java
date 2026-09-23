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

public class TarArchiveOutputStream_close_1914055047146 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term114973;

    public TarArchiveOutputStream_close_1914055047146() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term114973 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term114615 = (byte[]) newByteArray(7);
        Object term115081 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarBuffer"));
        Object term115177 = newInstance(Class.forName("java.lang.ProcessImpl$ProcessPipeOutputStream"));
        byte[] term114740 = (byte[]) newByteArray(7);
        setBooleanField(term114973, term114973.getClass(), "closed", false);
        setField(term114973, term114973.getClass(), "recordBuf", term114615);
        setField(term115081, term115081.getClass(), "outStream", term115177);
        setIntField(term115081, term115081.getClass(), "recordSize", 7);
        setIntField(term115081, term115081.getClass(), "currRecIdx", -2147483648);
        setIntField(term115081, term115081.getClass(), "recsPerBlock", -2147483648);
        setField(term115081, term115081.getClass(), "blockBuffer", term114740);
        setIntField(term115081, term115081.getClass(), "blockSize", 0);
        setField(term114973, term114973.getClass(), "buffer", term115081);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "close", argTypes, term114973, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


