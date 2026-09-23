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

public class BZip2CompressorInputStream_recvDecodingTables_1375453034379 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term461482;

    public BZip2CompressorInputStream_recvDecodingTables_1375453034379() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term461482 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        Object term461642 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data"));
        boolean[] term458620 = (boolean[]) newBooleanArray(1000);
        byte[] term459621 = (byte[]) newByteArray(0);
        setField(term461642, term461642.getClass(), "inUse", term458620);
        setField(term461642, term461642.getClass(), "recvDecodingTables_pos", term459621);
        setField(term461642, term461642.getClass(), "selector", null);
        setField(term461642, term461642.getClass(), "selectorMtf", null);
        setField(term461482, term461482.getClass(), "data", term461642);
        setIntField(term461482, term461482.getClass(), "bsLive", 31);
        setIntField(term461482, term461482.getClass(), "bsBuff", -1137950697);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "recvDecodingTables", argTypes, term461482, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


