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

public class BZip2CompressorInputStream_recvDecodingTables_1375453034337 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term383976;

    public BZip2CompressorInputStream_recvDecodingTables_1375453034337() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term383976 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        Object term384136 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data"));
        byte[] term383711 = (byte[]) newByteArray(8);
        byte[] term383720 = (byte[]) newByteArray(0);
        setField(term384136, term384136.getClass(), "inUse", null);
        setField(term384136, term384136.getClass(), "recvDecodingTables_pos", term383711);
        setField(term384136, term384136.getClass(), "selector", term383720);
        setField(term384136, term384136.getClass(), "selectorMtf", null);
        setField(term383976, term383976.getClass(), "data", term384136);
        setIntField(term383976, term383976.getClass(), "bsLive", 6);
        setIntField(term383976, term383976.getClass(), "bsBuff", -2146172910);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "recvDecodingTables", argTypes, term383976, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


