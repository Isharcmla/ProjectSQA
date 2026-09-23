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

public class TarArchiveOutputStream_finish_373857634147 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term115822;

    public TarArchiveOutputStream_finish_373857634147() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term115822 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term115618 = (byte[]) newByteArray(1);
        Object term115930 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarBuffer"));
        Object term116026 = newInstance(Class.forName("java.lang.ProcessImpl$ProcessPipeOutputStream"));
        byte[] term115629 = (byte[]) newByteArray(1);
        setBooleanField(term115822, term115822.getClass(), "haveUnclosedEntry", false);
        setField(term115822, term115822.getClass(), "recordBuf", term115618);
        setField(term115930, term115930.getClass(), "outStream", term116026);
        setIntField(term115930, term115930.getClass(), "recordSize", 1);
        setIntField(term115930, term115930.getClass(), "currRecIdx", -2147483648);
        setIntField(term115930, term115930.getClass(), "recsPerBlock", -2147483648);
        setField(term115930, term115930.getClass(), "blockBuffer", term115629);
        setIntField(term115930, term115930.getClass(), "blockSize", 1);
        setField(term115822, term115822.getClass(), "buffer", term115930);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "finish", argTypes, term115822, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


