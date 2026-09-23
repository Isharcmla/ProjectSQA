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

public class BZip2CompressorInputStream_recvDecodingTables_1375453034467 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term611672;

    public BZip2CompressorInputStream_recvDecodingTables_1375453034467() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term611672 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        Object term611832 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data"));
        boolean[] term611360 = (boolean[]) newBooleanArray(8);
        byte[] term611369 = (byte[]) newByteArray(8);
        Object term611894 = newInstance(Class.forName("java.nio.channels.Channels$2"));
        setField(term611832, term611832.getClass(), "inUse", term611360);
        setField(term611832, term611832.getClass(), "recvDecodingTables_pos", null);
        setField(term611832, term611832.getClass(), "selector", term611369);
        setField(term611832, term611832.getClass(), "selectorMtf", null);
        setField(term611672, term611672.getClass(), "data", term611832);
        setIntField(term611672, term611672.getClass(), "bsLive", 9);
        setIntField(term611672, term611672.getClass(), "bsBuff", 192);
        setField(term611672, term611672.getClass(), "in", term611894);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "recvDecodingTables", argTypes, term611672, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


