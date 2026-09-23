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

public class BZip2CompressorInputStream_getAndMoveToFrontDecode_1446410114496 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term661650;

    public BZip2CompressorInputStream_getAndMoveToFrontDecode_1446410114496() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term661650 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        Object term661810 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data"));
        boolean[] term661279 = (boolean[]) newBooleanArray(0);
        byte[] term661280 = (byte[]) newByteArray(0);
        Object term661892 = newInstance(Class.forName("org.tukaani.xz.SeekableFileInputStream"));
        setIntField(term661650, term661650.getClass(), "bsLive", 37);
        setIntField(term661650, term661650.getClass(), "bsBuff", 2100226);
        setIntField(term661650, term661650.getClass(), "origPtr", 0);
        setField(term661810, term661810.getClass(), "inUse", term661279);
        setField(term661810, term661810.getClass(), "recvDecodingTables_pos", null);
        setField(term661810, term661810.getClass(), "selector", term661280);
        setField(term661810, term661810.getClass(), "selectorMtf", null);
        setField(term661650, term661650.getClass(), "data", term661810);
        setField(term661650, term661650.getClass(), "in", term661892);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAndMoveToFrontDecode", argTypes, term661650, args);
    }

};


