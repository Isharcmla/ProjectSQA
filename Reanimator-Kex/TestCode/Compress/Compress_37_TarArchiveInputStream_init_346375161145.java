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
import static org.apache.commons.compress.archivers.tar.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;

public class TarArchiveInputStream_init_346375161145 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term62318;

    public TarArchiveInputStream_init_346375161145() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term62048 = new HashMap();
        Object term62000 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term61567 = (byte[]) newByteArray(0);
        byte[] term61826 = (byte[]) newByteArray(0);
        Object term62186 = newInstance(Class.forName("org.apache.commons.compress.archivers.sevenz.AES256SHA256Decoder$1"));
        setField(term62000, term62000.getClass(), "SINGLE", term61567);
        setLongField(term62000, term62000.getClass(), "bytesRead", 0L);
        setField(term62000, term62000.getClass(), "SMALL_BUF", term61826);
        setField(term62000, term62000.getClass(), "globalPaxHeaders", term62048);
        setField(term62000, term62000.getClass(), "is", term62186);
        setBooleanField(term62000, term62000.getClass(), "hasHitEOF", false);
        setField(term62000, term62000.getClass(), "encoding", null);
        term62318 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.io.InputStream");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term62318;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


