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

public class TarArchiveOutputStream_closeArchiveEntry_113192567205 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term138903;

    public TarArchiveOutputStream_closeArchiveEntry_113192567205() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term138903 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term138713 = (byte[]) newByteArray(0);
        Object term139011 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarBuffer"));
        Object term139061 = newInstance(Class.forName("java.io.OutputStream$1"));
        setIntField(term138903, term138903.getClass(), "assemLen", 1022);
        setField(term138903, term138903.getClass(), "assemBuf", term138713);
        setField(term139011, term139011.getClass(), "outStream", term139061);
        setIntField(term139011, term139011.getClass(), "recordSize", 0);
        setIntField(term139011, term139011.getClass(), "currRecIdx", -2147483648);
        setIntField(term139011, term139011.getClass(), "recsPerBlock", -2147483648);
        setField(term139011, term139011.getClass(), "blockBuffer", null);
        setIntField(term139011, term139011.getClass(), "blockSize", 1);
        setField(term138903, term138903.getClass(), "buffer", term139011);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "closeArchiveEntry", argTypes, term138903, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


