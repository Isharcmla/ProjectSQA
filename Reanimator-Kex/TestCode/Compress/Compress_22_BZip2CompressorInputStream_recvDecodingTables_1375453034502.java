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
import static org.apache.commons.compress.compressors.bzip2.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class BZip2CompressorInputStream_recvDecodingTables_1375453034502 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term674338;

    public BZip2CompressorInputStream_recvDecodingTables_1375453034502() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term674338 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        Object term674498 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data"));
        byte[] term673672 = (byte[]) newByteArray(381);
        byte[] term674054 = (byte[]) newByteArray(1);
        setField(term674498, term674498.getClass(), "inUse", null);
        setField(term674498, term674498.getClass(), "recvDecodingTables_pos", term673672);
        setField(term674498, term674498.getClass(), "selector", term674054);
        setField(term674498, term674498.getClass(), "selectorMtf", null);
        setField(term674338, term674338.getClass(), "data", term674498);
        setIntField(term674338, term674338.getClass(), "bsLive", 8);
        setIntField(term674338, term674338.getClass(), "bsBuff", -2147483568);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "recvDecodingTables", argTypes, term674338, args);
    }

};


