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

public class TarArchiveOutputStream_write_1643250680171 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term318012;

    public TarArchiveOutputStream_write_1643250680171() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term318012 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term317843 = (byte[]) newByteArray(0);
        Object term318120 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarBuffer"));
        Object term318192 = newInstance(Class.forName("org.tukaani.xz.SimpleOutputStream"));
        setLongField(term318012, term318012.getClass(), "currBytes", -511158558241632699L);
        setLongField(term318012, term318012.getClass(), "currSize", 511158557706592700L);
        setIntField(term318012, term318012.getClass(), "assemLen", 0);
        setField(term318012, term318012.getClass(), "recordBuf", term317843);
        setField(term318120, term318120.getClass(), "outStream", term318192);
        setField(term318012, term318012.getClass(), "buffer", term318120);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = 0;
        args[2] = 1022;
        try {
            callMethod(klass, "write", argTypes, term318012, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


