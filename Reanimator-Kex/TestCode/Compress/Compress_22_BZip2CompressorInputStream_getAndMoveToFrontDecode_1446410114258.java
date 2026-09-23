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

public class BZip2CompressorInputStream_getAndMoveToFrontDecode_1446410114258 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term222204;

    public BZip2CompressorInputStream_getAndMoveToFrontDecode_1446410114258() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term222204 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        Object term222364 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data"));
        boolean[] term219947 = (boolean[]) newBooleanArray(383);
        byte[] term220331 = (byte[]) newByteArray(28);
        byte[] term220360 = (byte[]) newByteArray(0);
        setIntField(term222204, term222204.getClass(), "bsLive", 52);
        setIntField(term222204, term222204.getClass(), "bsBuff", -1803550720);
        setIntField(term222204, term222204.getClass(), "origPtr", 0);
        setField(term222364, term222364.getClass(), "inUse", term219947);
        setField(term222364, term222364.getClass(), "recvDecodingTables_pos", term220331);
        setField(term222364, term222364.getClass(), "selector", term220360);
        setField(term222364, term222364.getClass(), "selectorMtf", term220360);
        setField(term222204, term222204.getClass(), "data", term222364);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getAndMoveToFrontDecode", argTypes, term222204, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


