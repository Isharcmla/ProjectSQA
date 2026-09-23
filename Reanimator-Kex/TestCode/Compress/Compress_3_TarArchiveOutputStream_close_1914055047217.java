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

public class TarArchiveOutputStream_close_1914055047217 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term233292;

    public TarArchiveOutputStream_close_1914055047217() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term233292 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term219925 = (byte[]) newByteArray(0);
        Object term233400 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarBuffer"));
        Object term233444 = newInstance(Class.forName("java.io.PrintStream"));
        byte[] term219931 = (byte[]) newByteArray(489);
        setBooleanField(term233292, term233292.getClass(), "closed", false);
        setField(term233292, term233292.getClass(), "recordBuf", term219925);
        setField(term233400, term233400.getClass(), "outStream", term233444);
        setIntField(term233400, term233400.getClass(), "recordSize", 0);
        setIntField(term233400, term233400.getClass(), "currRecIdx", 536870912);
        setIntField(term233400, term233400.getClass(), "recsPerBlock", 1);
        setField(term233400, term233400.getClass(), "blockBuffer", term219931);
        setIntField(term233400, term233400.getClass(), "blockSize", 67109124);
        setField(term233292, term233292.getClass(), "buffer", term233400);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "close", argTypes, term233292, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


