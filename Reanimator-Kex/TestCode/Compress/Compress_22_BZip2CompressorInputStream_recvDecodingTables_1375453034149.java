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

public class BZip2CompressorInputStream_recvDecodingTables_1375453034149 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term73557;

    public BZip2CompressorInputStream_recvDecodingTables_1375453034149() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term73557 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        Object term73717 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data"));
        boolean[] term72111 = (boolean[]) newBooleanArray(512);
        byte[] term72624 = (byte[]) newByteArray(0);
        byte[] term72625 = (byte[]) newByteArray(512);
        setField(term73717, term73717.getClass(), "inUse", term72111);
        setField(term73717, term73717.getClass(), "recvDecodingTables_pos", term72624);
        setField(term73717, term73717.getClass(), "selector", null);
        setField(term73717, term73717.getClass(), "selectorMtf", term72625);
        setField(term73557, term73557.getClass(), "data", term73717);
        setIntField(term73557, term73557.getClass(), "bsLive", 19);
        setIntField(term73557, term73557.getClass(), "bsBuff", -1039940928);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "recvDecodingTables", argTypes, term73557, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


