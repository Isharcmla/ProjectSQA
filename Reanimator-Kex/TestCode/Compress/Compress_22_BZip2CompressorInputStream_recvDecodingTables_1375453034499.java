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

public class BZip2CompressorInputStream_recvDecodingTables_1375453034499 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term670849;

    public BZip2CompressorInputStream_recvDecodingTables_1375453034499() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term670849 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        Object term671009 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data"));
        boolean[] term667496 = (boolean[]) newBooleanArray(371);
        byte[] term667868 = (byte[]) newByteArray(371);
        byte[] term668240 = (byte[]) newByteArray(371);
        byte[] term668612 = (byte[]) newByteArray(371);
        setField(term671009, term671009.getClass(), "inUse", term667496);
        setField(term671009, term671009.getClass(), "recvDecodingTables_pos", term667868);
        setField(term671009, term671009.getClass(), "selector", term668240);
        setField(term671009, term671009.getClass(), "selectorMtf", term668612);
        setField(term670849, term670849.getClass(), "data", term671009);
        setIntField(term670849, term670849.getClass(), "bsLive", 29);
        setIntField(term670849, term670849.getClass(), "bsBuff", 252384520);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "recvDecodingTables", argTypes, term670849, args);
    }

};


