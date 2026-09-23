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

public class BZip2CompressorInputStream_getAndMoveToFrontDecode_1446410114497 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term664209;

    public BZip2CompressorInputStream_getAndMoveToFrontDecode_1446410114497() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term664209 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        Object term664369 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data"));
        boolean[] term661898 = (boolean[]) newBooleanArray(392);
        byte[] term662291 = (byte[]) newByteArray(100);
        setIntField(term664209, term664209.getClass(), "bsLive", 53);
        setIntField(term664209, term664209.getClass(), "bsBuff", -872382392);
        setIntField(term664209, term664209.getClass(), "origPtr", 0);
        setField(term664369, term664369.getClass(), "inUse", term661898);
        setField(term664369, term664369.getClass(), "recvDecodingTables_pos", null);
        setField(term664369, term664369.getClass(), "selector", null);
        setField(term664369, term664369.getClass(), "selectorMtf", term662291);
        setField(term664209, term664209.getClass(), "data", term664369);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAndMoveToFrontDecode", argTypes, term664209, args);
    }

};


