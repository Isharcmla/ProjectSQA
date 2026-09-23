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

public class BZip2CompressorInputStream_recvDecodingTables_137545303472 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26684;

    public BZip2CompressorInputStream_recvDecodingTables_137545303472() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26684 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        Object term26844 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data"));
        byte[] term25345 = (byte[]) newByteArray(992);
        setField(term26844, term26844.getClass(), "inUse", null);
        setField(term26844, term26844.getClass(), "recvDecodingTables_pos", term25345);
        setField(term26844, term26844.getClass(), "selector", null);
        setField(term26844, term26844.getClass(), "selectorMtf", null);
        setField(term26684, term26684.getClass(), "data", term26844);
        setIntField(term26684, term26684.getClass(), "bsLive", 12);
        setIntField(term26684, term26684.getClass(), "bsBuff", 1925);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "recvDecodingTables", argTypes, term26684, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


