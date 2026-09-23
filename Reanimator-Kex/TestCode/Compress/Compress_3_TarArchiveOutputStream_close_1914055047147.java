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

public class TarArchiveOutputStream_close_1914055047147 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term115823;

    public TarArchiveOutputStream_close_1914055047147() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term115823 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term115464 = (byte[]) newByteArray(7);
        Object term115931 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarBuffer"));
        byte[] term115588 = (byte[]) newByteArray(7);
        setBooleanField(term115823, term115823.getClass(), "closed", false);
        setField(term115823, term115823.getClass(), "recordBuf", term115464);
        setField(term115931, term115931.getClass(), "outStream", term115823);
        setIntField(term115931, term115931.getClass(), "recordSize", 7);
        setIntField(term115931, term115931.getClass(), "currRecIdx", -2147483648);
        setIntField(term115931, term115931.getClass(), "recsPerBlock", -2147483648);
        setField(term115931, term115931.getClass(), "blockBuffer", term115588);
        setIntField(term115931, term115931.getClass(), "blockSize", 1);
        setField(term115823, term115823.getClass(), "buffer", term115931);
        setLongField(term115823, term115823.getClass(), "currBytes", -9222809091196321797L);
        setLongField(term115823, term115823.getClass(), "currSize", 5872130964137705473L);
        setIntField(term115823, term115823.getClass(), "assemLen", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "close", argTypes, term115823, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


