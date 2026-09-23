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

public class BZip2CompressorInputStream_recvDecodingTables_1375453034445 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term571916;

    public BZip2CompressorInputStream_recvDecodingTables_1375453034445() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term571916 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        Object term572076 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data"));
        boolean[] term568710 = (boolean[]) newBooleanArray(640);
        byte[] term569351 = (byte[]) newByteArray(352);
        byte[] term569704 = (byte[]) newByteArray(352);
        setField(term572076, term572076.getClass(), "inUse", term568710);
        setField(term572076, term572076.getClass(), "recvDecodingTables_pos", term569351);
        setField(term572076, term572076.getClass(), "selector", term569704);
        setField(term572076, term572076.getClass(), "selectorMtf", null);
        setField(term571916, term571916.getClass(), "data", term572076);
        setIntField(term571916, term571916.getClass(), "bsLive", 32);
        setIntField(term571916, term571916.getClass(), "bsBuff", 2019033092);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "recvDecodingTables", argTypes, term571916, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


