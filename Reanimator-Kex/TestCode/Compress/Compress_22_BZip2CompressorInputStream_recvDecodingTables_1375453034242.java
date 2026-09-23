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

public class BZip2CompressorInputStream_recvDecodingTables_1375453034242 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term183820;

    public BZip2CompressorInputStream_recvDecodingTables_1375453034242() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term183820 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        Object term183980 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data"));
        boolean[] term180369 = (boolean[]) newBooleanArray(448);
        byte[] term180818 = (byte[]) newByteArray(569);
        byte[] term181388 = (byte[]) newByteArray(569);
        setField(term183980, term183980.getClass(), "inUse", term180369);
        setField(term183980, term183980.getClass(), "recvDecodingTables_pos", term180818);
        setField(term183980, term183980.getClass(), "selector", term181388);
        setField(term183980, term183980.getClass(), "selectorMtf", null);
        setField(term183820, term183820.getClass(), "data", term183980);
        setIntField(term183820, term183820.getClass(), "bsLive", 32);
        setIntField(term183820, term183820.getClass(), "bsBuff", 2019065860);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "recvDecodingTables", argTypes, term183820, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


