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

public class BZip2CompressorInputStream_getAndMoveToFrontDecode_1446410114492 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term652954;

    public BZip2CompressorInputStream_getAndMoveToFrontDecode_1446410114492() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term652954 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        Object term653114 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data"));
        byte[] term651673 = (byte[]) newByteArray(995);
        setIntField(term652954, term652954.getClass(), "bsLive", 32);
        setIntField(term652954, term652954.getClass(), "bsBuff", 68);
        setIntField(term652954, term652954.getClass(), "origPtr", 0);
        setField(term653114, term653114.getClass(), "inUse", null);
        setField(term653114, term653114.getClass(), "recvDecodingTables_pos", null);
        setField(term653114, term653114.getClass(), "selector", term651673);
        setField(term653114, term653114.getClass(), "selectorMtf", null);
        setField(term652954, term652954.getClass(), "data", term653114);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAndMoveToFrontDecode", argTypes, term652954, args);
    }

};


