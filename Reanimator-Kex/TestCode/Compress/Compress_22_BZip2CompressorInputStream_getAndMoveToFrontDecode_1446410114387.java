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

public class BZip2CompressorInputStream_getAndMoveToFrontDecode_1446410114387 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term474858;

    public BZip2CompressorInputStream_getAndMoveToFrontDecode_1446410114387() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term474858 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        Object term475018 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data"));
        boolean[] term472583 = (boolean[]) newBooleanArray(511);
        setIntField(term474858, term474858.getClass(), "bsLive", 54);
        setIntField(term474858, term474858.getClass(), "bsBuff", 402718848);
        setIntField(term474858, term474858.getClass(), "origPtr", 0);
        setField(term475018, term475018.getClass(), "inUse", term472583);
        setField(term475018, term475018.getClass(), "recvDecodingTables_pos", null);
        setField(term475018, term475018.getClass(), "selector", null);
        setField(term475018, term475018.getClass(), "selectorMtf", null);
        setField(term474858, term474858.getClass(), "data", term475018);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getAndMoveToFrontDecode", argTypes, term474858, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


