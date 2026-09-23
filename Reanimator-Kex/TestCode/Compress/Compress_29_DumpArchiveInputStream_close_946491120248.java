package org.apache.commons.compress.archivers.dump;

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
import static org.apache.commons.compress.archivers.dump.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.compress.archivers.dump.EqualityUtils.*;
import java.lang.Object;

public class DumpArchiveInputStream_close_946491120248 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term275060;
     Object term276501;

    public DumpArchiveInputStream_close_946491120248() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term275060 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        Object term275182 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.TapeInputStream"));
        Object term275268 = newInstance(Class.forName("java.util.jar.JarVerifier$VerifierStream"));
        setBooleanField(term275060, term275060.getClass(), "isClosed", false);
        setField(term275182, term275182.getClass(), "in", term275268);
        setField(term275060, term275060.getClass(), "raw", term275182);
        term276501 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream"));
        Object term276502 = newInstance(Class.forName("org.apache.commons.compress.archivers.dump.TapeInputStream"));
        Object term276503 = newInstance(Class.forName("java.util.jar.JarVerifier$VerifierStream"));
        setField(term276501, term276501.getClass(), "summary", null);
        setField(term276501, term276501.getClass(), "active", null);
        setBooleanField(term276501, term276501.getClass(), "isClosed", true);
        setBooleanField(term276501, term276501.getClass(), "hasHitEOF", false);
        setLongField(term276501, term276501.getClass(), "entrySize", 0L);
        setLongField(term276501, term276501.getClass(), "entryOffset", 0L);
        setIntField(term276501, term276501.getClass(), "readIdx", 0);
        setField(term276501, term276501.getClass(), "readBuf", null);
        setField(term276501, term276501.getClass(), "blockBuffer", null);
        setIntField(term276501, term276501.getClass(), "recordOffset", 0);
        setLongField(term276501, term276501.getClass(), "filepos", 0L);
        setField(term276502, term276502.getClass(), "blockBuffer", null);
        setIntField(term276502, term276502.getClass(), "currBlkIdx", 0);
        setIntField(term276502, term276502.getClass(), "blockSize", 0);
        setIntField(term276502, term276502.getClass(), "readOffset", 0);
        setBooleanField(term276502, term276502.getClass(), "isCompressed", false);
        setLongField(term276502, term276502.getClass(), "bytesRead", 0L);
        setField(term276503, term276503.getClass(), "is", null);
        setField(term276503, term276503.getClass(), "jv", null);
        setField(term276503, term276503.getClass(), "mev", null);
        setLongField(term276503, term276503.getClass(), "numLeft", 0L);
        setField(term276502, term276502.getClass(), "in", term276503);
        setField(term276501, term276501.getClass(), "raw", term276502);
        setField(term276501, term276501.getClass(), "names", null);
        setField(term276501, term276501.getClass(), "pending", null);
        setField(term276501, term276501.getClass(), "queue", null);
        setField(term276501, term276501.getClass(), "zipEncoding", null);
        setField(term276501, term276501.getClass(), "SINGLE", null);
        setLongField(term276501, term276501.getClass(), "bytesRead", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.dump.DumpArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "close", argTypes, term275060, args);
        assertTrue(recursiveEquals(term275060, term276501));
    }

};


