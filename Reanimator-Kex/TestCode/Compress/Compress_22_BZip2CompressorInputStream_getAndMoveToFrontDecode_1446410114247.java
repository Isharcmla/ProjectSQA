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

public class BZip2CompressorInputStream_getAndMoveToFrontDecode_1446410114247 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term193772;

    public BZip2CompressorInputStream_getAndMoveToFrontDecode_1446410114247() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term193772 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        Object term193932 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data"));
        boolean[] term192157 = (boolean[]) newBooleanArray(640);
        byte[] term192798 = (byte[]) newByteArray(640);
        setIntField(term193772, term193772.getClass(), "bsLive", 56);
        setIntField(term193772, term193772.getClass(), "bsBuff", 1612709888);
        setIntField(term193772, term193772.getClass(), "origPtr", 0);
        setField(term193932, term193932.getClass(), "inUse", term192157);
        setField(term193932, term193932.getClass(), "recvDecodingTables_pos", null);
        setField(term193932, term193932.getClass(), "selector", null);
        setField(term193932, term193932.getClass(), "selectorMtf", term192798);
        setField(term193772, term193772.getClass(), "data", term193932);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getAndMoveToFrontDecode", argTypes, term193772, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


