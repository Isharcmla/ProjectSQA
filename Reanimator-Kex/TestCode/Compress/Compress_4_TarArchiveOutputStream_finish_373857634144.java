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

public class TarArchiveOutputStream_finish_373857634144 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term112229;

    public TarArchiveOutputStream_finish_373857634144() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term112229 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term112030 = (byte[]) newByteArray(1);
        Object term112337 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarBuffer"));
        byte[] term112040 = (byte[]) newByteArray(1);
        setBooleanField(term112229, term112229.getClass(), "haveUnclosedEntry", false);
        setField(term112229, term112229.getClass(), "recordBuf", term112030);
        setField(term112337, term112337.getClass(), "outStream", term112229);
        setIntField(term112337, term112337.getClass(), "recordSize", 1);
        setIntField(term112337, term112337.getClass(), "currRecIdx", -2147483648);
        setIntField(term112337, term112337.getClass(), "recsPerBlock", -2147483648);
        setField(term112337, term112337.getClass(), "blockBuffer", term112040);
        setIntField(term112337, term112337.getClass(), "blockSize", 0);
        setField(term112229, term112229.getClass(), "buffer", term112337);
        setLongField(term112229, term112229.getClass(), "currBytes", -9223367492779342672L);
        setLongField(term112229, term112229.getClass(), "currSize", 357467576082069763L);
        setIntField(term112229, term112229.getClass(), "assemLen", 1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "finish", argTypes, term112229, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


