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

public class BZip2CompressorInputStream_getAndMoveToFrontDecode_1446410114311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term321280;

    public BZip2CompressorInputStream_getAndMoveToFrontDecode_1446410114311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term321280 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        Object term321440 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data"));
        boolean[] term318588 = (boolean[]) newBooleanArray(866);
        byte[] term319455 = (byte[]) newByteArray(0);
        byte[] term319456 = (byte[]) newByteArray(0);
        setIntField(term321280, term321280.getClass(), "bsLive", 51);
        setIntField(term321280, term321280.getClass(), "bsBuff", 50397184);
        setIntField(term321280, term321280.getClass(), "origPtr", 0);
        setField(term321440, term321440.getClass(), "inUse", term318588);
        setField(term321440, term321440.getClass(), "recvDecodingTables_pos", term319455);
        setField(term321440, term321440.getClass(), "selector", term319456);
        setField(term321440, term321440.getClass(), "selectorMtf", term319455);
        setField(term321280, term321280.getClass(), "data", term321440);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getAndMoveToFrontDecode", argTypes, term321280, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


