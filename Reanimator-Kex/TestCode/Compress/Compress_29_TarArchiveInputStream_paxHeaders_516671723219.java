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

public class TarArchiveInputStream_paxHeaders_516671723219 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term101577;

    public TarArchiveInputStream_paxHeaders_516671723219() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term101577 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term101127 = (byte[]) newByteArray(9);
        Object term101645 = newInstance(Class.forName("org.tukaani.xz.BlockInputStream"));
        setByteElement(term101127, 0, (byte) 2);
        setByteElement(term101127, 1, (byte) 2);
        setByteElement(term101127, 2, (byte) 2);
        setByteElement(term101127, 3, (byte) 2);
        setByteElement(term101127, 4, (byte) 2);
        setByteElement(term101127, 5, (byte) 2);
        setByteElement(term101127, 6, (byte) 2);
        setByteElement(term101127, 7, (byte) 2);
        setByteElement(term101127, 8, (byte) 2);
        setField(term101577, term101577.getClass(), "SINGLE", term101127);
        setBooleanField(term101577, term101577.getClass(), "hasHitEOF", false);
        setLongField(term101577, term101577.getClass(), "entryOffset", 0L);
        setLongField(term101577, term101577.getClass(), "entrySize", -9223372036854775806L);
        setField(term101577, term101577.getClass(), "currEntry", null);
        setIntField(term101577, term101577.getClass(), "recordSize", 236);
        setField(term101577, term101577.getClass(), "is", term101645);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "paxHeaders", argTypes, term101577, args);
    }

};


