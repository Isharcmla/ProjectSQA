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
import java.io.IOException;
import static org.apache.commons.compress.archivers.tar.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TarArchiveOutputStream_finish_373857634181 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term212877;

    public TarArchiveOutputStream_finish_373857634181() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term212877 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term198495 = (byte[]) newByteArray(490);
        Object term212985 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarBuffer"));
        Object term213049 = newInstance(Class.forName("java.io.ByteArrayOutputStream"));
        byte[] term198991 = (byte[]) newByteArray(490);
        setBooleanField(term212877, term212877.getClass(), "haveUnclosedEntry", false);
        setField(term212877, term212877.getClass(), "recordBuf", term198495);
        setField(term212985, term212985.getClass(), "outStream", term213049);
        setIntField(term212985, term212985.getClass(), "recordSize", -2147482656);
        setIntField(term212985, term212985.getClass(), "currRecIdx", 0);
        setIntField(term212985, term212985.getClass(), "recsPerBlock", -2147483647);
        setField(term212985, term212985.getClass(), "blockBuffer", term198991);
        setIntField(term212985, term212985.getClass(), "blockSize", 1077936128);
        setField(term212877, term212877.getClass(), "buffer", term212985);
        setLongField(term212877, term212877.getClass(), "currBytes", 866522365642211328L);
        setLongField(term212877, term212877.getClass(), "currSize", 866522366715953155L);
        setIntField(term212877, term212877.getClass(), "assemLen", -2147481600);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "finish", argTypes, term212877, args);
            assertTrue(false);
        }
        catch (IOException e) {
        }

    }

};


