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

public class BZip2CompressorInputStream_recvDecodingTables_137545303487 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35481;

    public BZip2CompressorInputStream_recvDecodingTables_137545303487() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term35481 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        Object term35641 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data"));
        setField(term35641, term35641.getClass(), "inUse", null);
        setField(term35641, term35641.getClass(), "recvDecodingTables_pos", null);
        setField(term35641, term35641.getClass(), "selector", null);
        setField(term35641, term35641.getClass(), "selectorMtf", null);
        setField(term35481, term35481.getClass(), "data", term35641);
        setIntField(term35481, term35481.getClass(), "bsLive", 13);
        setIntField(term35481, term35481.getClass(), "bsBuff", -2147414261);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "recvDecodingTables", argTypes, term35481, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


