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

public class TarArchiveOutputStream_finish_373857634161 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term122976;

    public TarArchiveOutputStream_finish_373857634161() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term122976 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term122789 = (byte[]) newByteArray(0);
        Object term123084 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarBuffer"));
        Object term123146 = newInstance(Class.forName("java.nio.channels.Channels$1"));
        setBooleanField(term122976, term122976.getClass(), "haveUnclosedEntry", false);
        setField(term122976, term122976.getClass(), "recordBuf", term122789);
        setField(term123084, term123084.getClass(), "outStream", term123146);
        setIntField(term123084, term123084.getClass(), "recordSize", 0);
        setIntField(term123084, term123084.getClass(), "currRecIdx", -2147483648);
        setIntField(term123084, term123084.getClass(), "recsPerBlock", -2147483648);
        setField(term123084, term123084.getClass(), "blockBuffer", null);
        setIntField(term123084, term123084.getClass(), "blockSize", 0);
        setField(term122976, term122976.getClass(), "buffer", term123084);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "finish", argTypes, term122976, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


