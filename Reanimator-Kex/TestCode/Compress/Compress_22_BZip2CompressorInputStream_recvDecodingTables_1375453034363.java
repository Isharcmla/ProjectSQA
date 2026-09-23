package org.apache.commons.compress.compressors.bzip2;

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
import static org.apache.commons.compress.compressors.bzip2.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class BZip2CompressorInputStream_recvDecodingTables_1375453034363 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term427697;

    public BZip2CompressorInputStream_recvDecodingTables_1375453034363() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term427697 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        Object term427857 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data"));
        boolean[] term424784 = (boolean[]) newBooleanArray(256);
        byte[] term425041 = (byte[]) newByteArray(256);
        byte[] term425298 = (byte[]) newByteArray(256);
        byte[] term425555 = (byte[]) newByteArray(256);
        setField(term427857, term427857.getClass(), "inUse", term424784);
        setField(term427857, term427857.getClass(), "recvDecodingTables_pos", term425041);
        setField(term427857, term427857.getClass(), "selector", term425298);
        setField(term427857, term427857.getClass(), "selectorMtf", term425555);
        setField(term427697, term427697.getClass(), "data", term427857);
        setIntField(term427697, term427697.getClass(), "bsLive", 32);
        setIntField(term427697, term427697.getClass(), "bsBuff", 2019033089);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "recvDecodingTables", argTypes, term427697, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


