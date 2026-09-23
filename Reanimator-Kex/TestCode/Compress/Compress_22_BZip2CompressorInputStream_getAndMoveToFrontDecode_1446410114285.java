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

public class BZip2CompressorInputStream_getAndMoveToFrontDecode_1446410114285 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term276552;

    public BZip2CompressorInputStream_getAndMoveToFrontDecode_1446410114285() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term276552 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        Object term276712 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data"));
        boolean[] term274164 = (boolean[]) newBooleanArray(512);
        setIntField(term276552, term276552.getClass(), "bsLive", 55);
        setIntField(term276552, term276552.getClass(), "bsBuff", -1341128703);
        setIntField(term276552, term276552.getClass(), "origPtr", 0);
        setField(term276712, term276712.getClass(), "inUse", term274164);
        setField(term276712, term276712.getClass(), "recvDecodingTables_pos", null);
        setField(term276712, term276712.getClass(), "selector", null);
        setField(term276712, term276712.getClass(), "selectorMtf", null);
        setField(term276552, term276552.getClass(), "data", term276712);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getAndMoveToFrontDecode", argTypes, term276552, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


