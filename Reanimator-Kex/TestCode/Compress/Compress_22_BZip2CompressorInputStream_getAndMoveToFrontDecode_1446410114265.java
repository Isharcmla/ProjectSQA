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

public class BZip2CompressorInputStream_getAndMoveToFrontDecode_1446410114265 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term238023;

    public BZip2CompressorInputStream_getAndMoveToFrontDecode_1446410114265() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term238023 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        Object term238183 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data"));
        byte[] term237640 = (byte[]) newByteArray(0);
        byte[] term237641 = (byte[]) newByteArray(0);
        setIntField(term238023, term238023.getClass(), "bsLive", 45);
        setIntField(term238023, term238023.getClass(), "bsBuff", 524412);
        setIntField(term238023, term238023.getClass(), "origPtr", 0);
        setField(term238183, term238183.getClass(), "inUse", null);
        setField(term238183, term238183.getClass(), "recvDecodingTables_pos", term237640);
        setField(term238183, term238183.getClass(), "selector", term237641);
        setField(term238183, term238183.getClass(), "selectorMtf", term237640);
        setField(term238023, term238023.getClass(), "data", term238183);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getAndMoveToFrontDecode", argTypes, term238023, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


