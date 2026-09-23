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

public class TarArchiveOutputStream_writeEOFRecord_1063538339199 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term136408;

    public TarArchiveOutputStream_writeEOFRecord_1063538339199() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term136408 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term136192 = (byte[]) newByteArray(2);
        Object term136516 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarBuffer"));
        Object term136586 = newInstance(Class.forName("java.util.Base64$EncOutputStream"));
        setField(term136408, term136408.getClass(), "recordBuf", term136192);
        setField(term136516, term136516.getClass(), "outStream", term136586);
        setIntField(term136516, term136516.getClass(), "recordSize", 2);
        setIntField(term136516, term136516.getClass(), "currRecIdx", -2147483648);
        setIntField(term136516, term136516.getClass(), "recsPerBlock", -2147483648);
        setField(term136516, term136516.getClass(), "blockBuffer", term136192);
        setIntField(term136516, term136516.getClass(), "blockSize", 1);
        setField(term136408, term136408.getClass(), "buffer", term136516);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "writeEOFRecord", argTypes, term136408, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


