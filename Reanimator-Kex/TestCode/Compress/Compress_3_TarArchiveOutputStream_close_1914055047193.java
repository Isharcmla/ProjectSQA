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
import java.lang.StackOverflowError;
import static org.apache.commons.compress.archivers.tar.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TarArchiveOutputStream_close_1914055047193 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term133681;

    public TarArchiveOutputStream_close_1914055047193() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term133681 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term133493 = (byte[]) newByteArray(0);
        Object term133789 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarBuffer"));
        setBooleanField(term133681, term133681.getClass(), "closed", false);
        setField(term133681, term133681.getClass(), "recordBuf", term133493);
        setField(term133789, term133789.getClass(), "outStream", term133681);
        setIntField(term133789, term133789.getClass(), "recordSize", 0);
        setIntField(term133789, term133789.getClass(), "currRecIdx", -2147483648);
        setIntField(term133789, term133789.getClass(), "recsPerBlock", -2147483648);
        setField(term133789, term133789.getClass(), "blockBuffer", term133493);
        setIntField(term133789, term133789.getClass(), "blockSize", 1);
        setField(term133681, term133681.getClass(), "buffer", term133789);
        setLongField(term133681, term133681.getClass(), "currBytes", 576495936675512319L);
        setLongField(term133681, term133681.getClass(), "currSize", 3863176435388645375L);
        setIntField(term133681, term133681.getClass(), "assemLen", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "close", argTypes, term133681, args);
            assertTrue(false);
        }
        catch (StackOverflowError e) {
        }

    }

};


