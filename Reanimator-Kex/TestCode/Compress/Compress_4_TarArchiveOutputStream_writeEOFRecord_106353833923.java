package org.apache.commons.compress.archivers.tar;

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
import java.io.IOException;
import static org.apache.commons.compress.archivers.tar.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TarArchiveOutputStream_writeEOFRecord_106353833923 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term523;

    public TarArchiveOutputStream_writeEOFRecord_106353833923() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term523 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term538 = (byte[]) newByteArray(2);
        byte[] term542 = (byte[]) newByteArray(6);
        Object term549 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarBuffer"));
        byte[] term550 = (byte[]) newByteArray(6);
        byte[] term565 = (byte[]) newByteArray(2);
        setLongField(term523, term523.getClass(), "currSize", -5476826692763582090L);
        setField(term523, term523.getClass(), "currName", "MjGYSRKTNF");
        setLongField(term523, term523.getClass(), "currBytes", -872011222785455006L);
        setByteElement(term538, 0, (byte) -28);
        setByteElement(term538, 1, (byte) 115);
        setField(term523, term523.getClass(), "recordBuf", term538);
        setIntField(term523, term523.getClass(), "assemLen", -2095575670);
        setByteElement(term542, 0, (byte) 96);
        setByteElement(term542, 1, (byte) 51);
        setByteElement(term542, 2, (byte) -53);
        setByteElement(term542, 3, (byte) -8);
        setByteElement(term542, 4, (byte) -9);
        setByteElement(term542, 5, (byte) 97);
        setField(term523, term523.getClass(), "assemBuf", term542);
        setField(term549, term549.getClass(), "inStream", null);
        setField(term549, term549.getClass(), "outStream", null);
        setByteElement(term550, 0, (byte) -46);
        setByteElement(term550, 1, (byte) 14);
        setByteElement(term550, 2, (byte) 34);
        setByteElement(term550, 3, (byte) 126);
        setByteElement(term550, 4, (byte) 7);
        setByteElement(term550, 5, (byte) -96);
        setField(term549, term549.getClass(), "blockBuffer", term550);
        setIntField(term549, term549.getClass(), "currBlkIdx", 1225272962);
        setIntField(term549, term549.getClass(), "currRecIdx", 1324040357);
        setIntField(term549, term549.getClass(), "blockSize", -1588772968);
        setIntField(term549, term549.getClass(), "recordSize", -93135961);
        setIntField(term549, term549.getClass(), "recsPerBlock", -112921587);
        setField(term523, term523.getClass(), "buffer", term549);
        setIntField(term523, term523.getClass(), "longFileMode", 933028652);
        setBooleanField(term523, term523.getClass(), "closed", false);
        setBooleanField(term523, term523.getClass(), "haveUnclosedEntry", false);
        setField(term523, term523.getClass(), "out", null);
        setByteElement(term565, 0, (byte) -22);
        setByteElement(term565, 1, (byte) -5);
        setField(term523, term523.getClass(), "oneByte", term565);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "writeEOFRecord", argTypes, term523, args);
            assertTrue(false);
        }
        catch (IOException e) {
        }

    }

};


