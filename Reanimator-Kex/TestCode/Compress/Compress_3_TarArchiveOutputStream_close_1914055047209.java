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

public class TarArchiveOutputStream_close_1914055047209 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term174902;

    public TarArchiveOutputStream_close_1914055047209() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term174902 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term174661 = (byte[]) newByteArray(3);
        Object term175010 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarBuffer"));
        Object term175054 = newInstance(Class.forName("java.io.PrintStream"));
        setBooleanField(term174902, term174902.getClass(), "closed", false);
        setField(term174902, term174902.getClass(), "recordBuf", term174661);
        setField(term175010, term175010.getClass(), "outStream", term175054);
        setIntField(term175010, term175010.getClass(), "recordSize", 3);
        setIntField(term175010, term175010.getClass(), "currRecIdx", -2147483648);
        setIntField(term175010, term175010.getClass(), "recsPerBlock", -2147483648);
        setField(term175010, term175010.getClass(), "blockBuffer", null);
        setIntField(term175010, term175010.getClass(), "blockSize", 2);
        setField(term174902, term174902.getClass(), "buffer", term175010);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "close", argTypes, term174902, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


