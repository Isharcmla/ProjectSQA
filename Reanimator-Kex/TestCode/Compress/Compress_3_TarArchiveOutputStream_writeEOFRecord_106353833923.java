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
     Object term516;

    public TarArchiveOutputStream_writeEOFRecord_106353833923() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term516 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term531 = (byte[]) newByteArray(2);
        byte[] term535 = (byte[]) newByteArray(6);
        Object term542 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarBuffer"));
        byte[] term543 = (byte[]) newByteArray(6);
        byte[] term557 = (byte[]) newByteArray(2);
        setLongField(term516, term516.getClass(), "currSize", -5476826692763582090L);
        setField(term516, term516.getClass(), "currName", "MjGYSRKTNF");
        setLongField(term516, term516.getClass(), "currBytes", -872011222785455006L);
        setByteElement(term531, 0, (byte) -28);
        setByteElement(term531, 1, (byte) 115);
        setField(term516, term516.getClass(), "recordBuf", term531);
        setIntField(term516, term516.getClass(), "assemLen", -2095575670);
        setByteElement(term535, 0, (byte) 96);
        setByteElement(term535, 1, (byte) 51);
        setByteElement(term535, 2, (byte) -53);
        setByteElement(term535, 3, (byte) -8);
        setByteElement(term535, 4, (byte) -9);
        setByteElement(term535, 5, (byte) 97);
        setField(term516, term516.getClass(), "assemBuf", term535);
        setField(term542, term542.getClass(), "inStream", null);
        setField(term542, term542.getClass(), "outStream", null);
        setByteElement(term543, 0, (byte) -46);
        setByteElement(term543, 1, (byte) 14);
        setByteElement(term543, 2, (byte) 34);
        setByteElement(term543, 3, (byte) 126);
        setByteElement(term543, 4, (byte) 7);
        setByteElement(term543, 5, (byte) -96);
        setField(term542, term542.getClass(), "blockBuffer", term543);
        setIntField(term542, term542.getClass(), "currBlkIdx", 1225272962);
        setIntField(term542, term542.getClass(), "currRecIdx", 1324040357);
        setIntField(term542, term542.getClass(), "blockSize", -1588772968);
        setIntField(term542, term542.getClass(), "recordSize", -93135961);
        setIntField(term542, term542.getClass(), "recsPerBlock", -112921587);
        setField(term516, term516.getClass(), "buffer", term542);
        setIntField(term516, term516.getClass(), "longFileMode", 933028652);
        setBooleanField(term516, term516.getClass(), "closed", true);
        setField(term516, term516.getClass(), "out", null);
        setByteElement(term557, 0, (byte) -22);
        setByteElement(term557, 1, (byte) -5);
        setField(term516, term516.getClass(), "oneByte", term557);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "writeEOFRecord", argTypes, term516, args);
            assertTrue(false);
        }
        catch (IOException e) {
        }

    }

};


