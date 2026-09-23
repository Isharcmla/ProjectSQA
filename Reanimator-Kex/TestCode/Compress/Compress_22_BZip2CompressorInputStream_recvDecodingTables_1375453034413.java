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

public class BZip2CompressorInputStream_recvDecodingTables_1375453034413 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term521002;

    public BZip2CompressorInputStream_recvDecodingTables_1375453034413() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term521002 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        Object term521162 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data"));
        boolean[] term518124 = (boolean[]) newBooleanArray(639);
        byte[] term518764 = (byte[]) newByteArray(384);
        setField(term521162, term521162.getClass(), "inUse", term518124);
        setField(term521162, term521162.getClass(), "recvDecodingTables_pos", null);
        setField(term521162, term521162.getClass(), "selector", null);
        setField(term521162, term521162.getClass(), "selectorMtf", term518764);
        setField(term521002, term521002.getClass(), "data", term521162);
        setIntField(term521002, term521002.getClass(), "bsLive", 28);
        setIntField(term521002, term521002.getClass(), "bsBuff", -2021292030);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "recvDecodingTables", argTypes, term521002, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


