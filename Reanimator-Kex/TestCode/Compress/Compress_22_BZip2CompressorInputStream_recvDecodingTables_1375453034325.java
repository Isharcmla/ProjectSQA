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

public class BZip2CompressorInputStream_recvDecodingTables_1375453034325 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term370109;

    public BZip2CompressorInputStream_recvDecodingTables_1375453034325() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term370109 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        Object term370269 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data"));
        boolean[] term368950 = (boolean[]) newBooleanArray(136);
        byte[] term369087 = (byte[]) newByteArray(256);
        byte[] term369344 = (byte[]) newByteArray(512);
        setField(term370269, term370269.getClass(), "inUse", term368950);
        setField(term370269, term370269.getClass(), "recvDecodingTables_pos", term369087);
        setField(term370269, term370269.getClass(), "selector", term369344);
        setField(term370269, term370269.getClass(), "selectorMtf", null);
        setField(term370109, term370109.getClass(), "data", term370269);
        setIntField(term370109, term370109.getClass(), "bsLive", 6);
        setIntField(term370109, term370109.getClass(), "bsBuff", -1877999600);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "recvDecodingTables", argTypes, term370109, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


