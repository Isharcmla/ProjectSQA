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
import java.lang.ArrayIndexOutOfBoundsException;
import static org.apache.commons.compress.compressors.bzip2.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class BZip2CompressorInputStream_recvDecodingTables_1375453034475 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term631727;

    public BZip2CompressorInputStream_recvDecodingTables_1375453034475() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term631727 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        Object term631887 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data"));
        boolean[] term631304 = (boolean[]) newBooleanArray(0);
        byte[] term631305 = (byte[]) newByteArray(0);
        byte[] term631306 = (byte[]) newByteArray(0);
        setField(term631887, term631887.getClass(), "inUse", term631304);
        setField(term631887, term631887.getClass(), "recvDecodingTables_pos", term631305);
        setField(term631887, term631887.getClass(), "selector", term631306);
        setField(term631887, term631887.getClass(), "selectorMtf", null);
        setField(term631727, term631727.getClass(), "data", term631887);
        setIntField(term631727, term631727.getClass(), "bsLive", 32);
        setIntField(term631727, term631727.getClass(), "bsBuff", 2030127616);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "recvDecodingTables", argTypes, term631727, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


