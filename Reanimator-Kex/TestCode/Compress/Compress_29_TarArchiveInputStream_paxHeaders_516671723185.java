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

public class TarArchiveInputStream_paxHeaders_516671723185 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term84966;

    public TarArchiveInputStream_paxHeaders_516671723185() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term84966 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term84715 = (byte[]) newByteArray(0);
        Object term85098 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(term84966, term84966.getClass(), "SINGLE", term84715);
        setBooleanField(term84966, term84966.getClass(), "hasHitEOF", false);
        setLongField(term84966, term84966.getClass(), "entryOffset", 0L);
        setLongField(term84966, term84966.getClass(), "entrySize", -9223372036854775807L);
        setField(term84966, term84966.getClass(), "currEntry", null);
        setIntField(term84966, term84966.getClass(), "recordSize", 1);
        setBooleanField(term85098, term85098.getClass(), "hasHitEOF", true);
        setField(term84966, term84966.getClass(), "is", term85098);
        setLongField(term84966, term84966.getClass(), "bytesRead", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "paxHeaders", argTypes, term84966, args);
    }

};


