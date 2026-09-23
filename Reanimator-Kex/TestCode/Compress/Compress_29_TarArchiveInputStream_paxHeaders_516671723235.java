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

public class TarArchiveInputStream_paxHeaders_516671723235 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term107481;

    public TarArchiveInputStream_paxHeaders_516671723235() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term107481 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term107242 = (byte[]) newByteArray(16);
        Object term107623 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipFile$BoundedInputStream"));
        setField(term107481, term107481.getClass(), "SINGLE", term107242);
        setBooleanField(term107481, term107481.getClass(), "hasHitEOF", false);
        setLongField(term107481, term107481.getClass(), "entryOffset", 412316860416L);
        setLongField(term107481, term107481.getClass(), "entrySize", 274877906945L);
        setField(term107481, term107481.getClass(), "currEntry", null);
        setIntField(term107481, term107481.getClass(), "recordSize", 0);
        setField(term107481, term107481.getClass(), "is", term107623);
        setLongField(term107481, term107481.getClass(), "bytesRead", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "paxHeaders", argTypes, term107481, args);
    }

};


