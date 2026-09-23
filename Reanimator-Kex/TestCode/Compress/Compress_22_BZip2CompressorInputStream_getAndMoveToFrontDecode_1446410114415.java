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

public class BZip2CompressorInputStream_getAndMoveToFrontDecode_1446410114415 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term529843;

    public BZip2CompressorInputStream_getAndMoveToFrontDecode_1446410114415() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term529843 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        Object term530003 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data"));
        byte[] term528922 = (byte[]) newByteArray(328);
        byte[] term529251 = (byte[]) newByteArray(328);
        setIntField(term529843, term529843.getClass(), "bsLive", 40);
        setIntField(term529843, term529843.getClass(), "bsBuff", -2147466240);
        setIntField(term529843, term529843.getClass(), "origPtr", 0);
        setField(term530003, term530003.getClass(), "inUse", null);
        setField(term530003, term530003.getClass(), "recvDecodingTables_pos", null);
        setField(term530003, term530003.getClass(), "selector", term528922);
        setField(term530003, term530003.getClass(), "selectorMtf", term529251);
        setField(term529843, term529843.getClass(), "data", term530003);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getAndMoveToFrontDecode", argTypes, term529843, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


