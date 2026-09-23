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

public class BZip2CompressorInputStream_getAndMoveToFrontDecode_1446410114449 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term579822;

    public BZip2CompressorInputStream_getAndMoveToFrontDecode_1446410114449() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term579822 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        Object term579982 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data"));
        byte[] term578522 = (byte[]) newByteArray(950);
        setIntField(term579822, term579822.getClass(), "bsLive", 40);
        setIntField(term579822, term579822.getClass(), "bsBuff", 1073766544);
        setIntField(term579822, term579822.getClass(), "origPtr", 0);
        setField(term579982, term579982.getClass(), "inUse", null);
        setField(term579982, term579982.getClass(), "recvDecodingTables_pos", null);
        setField(term579982, term579982.getClass(), "selector", term578522);
        setField(term579982, term579982.getClass(), "selectorMtf", null);
        setField(term579822, term579822.getClass(), "data", term579982);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getAndMoveToFrontDecode", argTypes, term579822, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


