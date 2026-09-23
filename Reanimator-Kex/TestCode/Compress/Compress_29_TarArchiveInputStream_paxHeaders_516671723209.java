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

public class TarArchiveInputStream_paxHeaders_516671723209 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term98608;

    public TarArchiveInputStream_paxHeaders_516671723209() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term98608 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term98158 = (byte[]) newByteArray(9);
        Object term98702 = newInstance(Class.forName("java.lang.ProcessImpl$ProcessPipeInputStream"));
        setByteElement(term98158, 0, (byte) 2);
        setByteElement(term98158, 1, (byte) 2);
        setByteElement(term98158, 2, (byte) 2);
        setByteElement(term98158, 3, (byte) 2);
        setByteElement(term98158, 4, (byte) 2);
        setByteElement(term98158, 5, (byte) 2);
        setByteElement(term98158, 6, (byte) 2);
        setByteElement(term98158, 7, (byte) 2);
        setByteElement(term98158, 8, (byte) 2);
        setField(term98608, term98608.getClass(), "SINGLE", term98158);
        setBooleanField(term98608, term98608.getClass(), "hasHitEOF", false);
        setLongField(term98608, term98608.getClass(), "entryOffset", 0L);
        setLongField(term98608, term98608.getClass(), "entrySize", -9223372036854775806L);
        setField(term98608, term98608.getClass(), "currEntry", null);
        setIntField(term98608, term98608.getClass(), "recordSize", 236);
        setField(term98608, term98608.getClass(), "is", term98702);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "paxHeaders", argTypes, term98608, args);
    }

};


