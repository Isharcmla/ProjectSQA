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

public class BZip2CompressorInputStream_recvDecodingTables_1375453034211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term132994;

    public BZip2CompressorInputStream_recvDecodingTables_1375453034211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term132994 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        Object term133154 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data"));
        boolean[] term130760 = (boolean[]) newBooleanArray(512);
        setField(term133154, term133154.getClass(), "inUse", term130760);
        setField(term133154, term133154.getClass(), "recvDecodingTables_pos", null);
        setField(term133154, term133154.getClass(), "selector", null);
        setField(term133154, term133154.getClass(), "selectorMtf", null);
        setField(term132994, term132994.getClass(), "data", term133154);
        setIntField(term132994, term132994.getClass(), "bsLive", 32);
        setIntField(term132994, term132994.getClass(), "bsBuff", 2019033088);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "recvDecodingTables", argTypes, term132994, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


