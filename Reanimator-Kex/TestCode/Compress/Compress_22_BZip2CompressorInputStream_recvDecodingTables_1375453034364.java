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

public class BZip2CompressorInputStream_recvDecodingTables_1375453034364 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term429620;

    public BZip2CompressorInputStream_recvDecodingTables_1375453034364() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term429620 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        Object term429780 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data"));
        setField(term429780, term429780.getClass(), "inUse", null);
        setField(term429780, term429780.getClass(), "recvDecodingTables_pos", null);
        setField(term429780, term429780.getClass(), "selector", null);
        setField(term429780, term429780.getClass(), "selectorMtf", null);
        setField(term429620, term429620.getClass(), "data", term429780);
        setIntField(term429620, term429620.getClass(), "bsLive", 12);
        setIntField(term429620, term429620.getClass(), "bsBuff", 1090586117);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "recvDecodingTables", argTypes, term429620, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


