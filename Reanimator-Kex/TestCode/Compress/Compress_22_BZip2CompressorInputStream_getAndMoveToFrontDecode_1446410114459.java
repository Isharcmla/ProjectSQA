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

public class BZip2CompressorInputStream_getAndMoveToFrontDecode_1446410114459 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term598117;

    public BZip2CompressorInputStream_getAndMoveToFrontDecode_1446410114459() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term598117 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        Object term598277 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data"));
        setIntField(term598117, term598117.getClass(), "bsLive", 56);
        setIntField(term598117, term598117.getClass(), "bsBuff", 1920991232);
        setIntField(term598117, term598117.getClass(), "origPtr", 0);
        setField(term598277, term598277.getClass(), "inUse", null);
        setField(term598277, term598277.getClass(), "recvDecodingTables_pos", null);
        setField(term598277, term598277.getClass(), "selector", null);
        setField(term598277, term598277.getClass(), "selectorMtf", null);
        setField(term598117, term598117.getClass(), "data", term598277);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getAndMoveToFrontDecode", argTypes, term598117, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


