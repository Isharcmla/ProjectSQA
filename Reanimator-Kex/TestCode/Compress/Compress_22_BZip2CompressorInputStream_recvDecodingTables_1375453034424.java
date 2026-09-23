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

public class BZip2CompressorInputStream_recvDecodingTables_1375453034424 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term541360;

    public BZip2CompressorInputStream_recvDecodingTables_1375453034424() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term541360 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        Object term541520 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream$Data"));
        boolean[] term538900 = (boolean[]) newBooleanArray(639);
        setField(term541520, term541520.getClass(), "inUse", term538900);
        setField(term541520, term541520.getClass(), "recvDecodingTables_pos", null);
        setField(term541520, term541520.getClass(), "selector", null);
        setField(term541520, term541520.getClass(), "selectorMtf", null);
        setField(term541360, term541360.getClass(), "data", term541520);
        setIntField(term541360, term541360.getClass(), "bsLive", 26);
        setIntField(term541360, term541360.getClass(), "bsBuff", -2115936256);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "recvDecodingTables", argTypes, term541360, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


