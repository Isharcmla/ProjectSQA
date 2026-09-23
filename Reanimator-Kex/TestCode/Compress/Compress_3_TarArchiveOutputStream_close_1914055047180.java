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

public class TarArchiveOutputStream_close_1914055047180 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term133116;

    public TarArchiveOutputStream_close_1914055047180() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term133116 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term132878 = (byte[]) newByteArray(3);
        Object term133224 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarBuffer"));
        byte[] term132910 = (byte[]) newByteArray(3);
        setBooleanField(term133116, term133116.getClass(), "closed", false);
        setField(term133116, term133116.getClass(), "recordBuf", term132878);
        setField(term133224, term133224.getClass(), "outStream", term133116);
        setIntField(term133224, term133224.getClass(), "recordSize", 3);
        setIntField(term133224, term133224.getClass(), "currRecIdx", -2147483648);
        setIntField(term133224, term133224.getClass(), "recsPerBlock", -2147483648);
        setField(term133224, term133224.getClass(), "blockBuffer", term132910);
        setIntField(term133224, term133224.getClass(), "blockSize", 1);
        setField(term133116, term133116.getClass(), "buffer", term133224);
        setLongField(term133116, term133116.getClass(), "currBytes", 326518485702L);
        setLongField(term133116, term133116.getClass(), "currSize", 36028327424249096L);
        setIntField(term133116, term133116.getClass(), "assemLen", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "close", argTypes, term133116, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


