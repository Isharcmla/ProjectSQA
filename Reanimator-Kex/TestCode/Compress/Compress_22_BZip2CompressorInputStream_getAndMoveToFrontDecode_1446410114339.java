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

public class BZip2CompressorInputStream_getAndMoveToFrontDecode_1446410114339 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term390728;

    public BZip2CompressorInputStream_getAndMoveToFrontDecode_1446410114339() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term390728 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        Object term390888 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data"));
        setIntField(term390728, term390728.getClass(), "bsLive", 34);
        setIntField(term390728, term390728.getClass(), "bsBuff", -2147483192);
        setIntField(term390728, term390728.getClass(), "origPtr", 0);
        setField(term390888, term390888.getClass(), "inUse", null);
        setField(term390888, term390888.getClass(), "recvDecodingTables_pos", null);
        setField(term390888, term390888.getClass(), "selector", null);
        setField(term390888, term390888.getClass(), "selectorMtf", null);
        setField(term390728, term390728.getClass(), "data", term390888);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getAndMoveToFrontDecode", argTypes, term390728, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


