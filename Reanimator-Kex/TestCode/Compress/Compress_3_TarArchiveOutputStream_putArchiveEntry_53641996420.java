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
import java.lang.NullPointerException;
import static org.apache.commons.compress.archivers.tar.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TarArchiveOutputStream_putArchiveEntry_53641996420 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term283;

    public TarArchiveOutputStream_putArchiveEntry_53641996420() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term283 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term298 = (byte[]) newByteArray(0);
        byte[] term300 = (byte[]) newByteArray(2);
        Object term303 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarBuffer"));
        byte[] term304 = (byte[]) newByteArray(8);
        byte[] term320 = (byte[]) newByteArray(6);
        setLongField(term283, term283.getClass(), "currSize", -7237588299778557629L);
        setField(term283, term283.getClass(), "currName", "jJCZpVmanW");
        setLongField(term283, term283.getClass(), "currBytes", 6967924379644551255L);
        setField(term283, term283.getClass(), "recordBuf", term298);
        setIntField(term283, term283.getClass(), "assemLen", -469968304);
        setByteElement(term300, 0, (byte) -81);
        setByteElement(term300, 1, (byte) 102);
        setField(term283, term283.getClass(), "assemBuf", term300);
        setField(term303, term303.getClass(), "inStream", null);
        setField(term303, term303.getClass(), "outStream", null);
        setByteElement(term304, 0, (byte) -118);
        setByteElement(term304, 1, (byte) -126);
        setByteElement(term304, 2, (byte) -91);
        setByteElement(term304, 3, (byte) -104);
        setByteElement(term304, 4, (byte) -89);
        setByteElement(term304, 5, (byte) 13);
        setByteElement(term304, 6, (byte) 44);
        setByteElement(term304, 7, (byte) -63);
        setField(term303, term303.getClass(), "blockBuffer", term304);
        setIntField(term303, term303.getClass(), "currBlkIdx", -1145578966);
        setIntField(term303, term303.getClass(), "currRecIdx", 679763016);
        setIntField(term303, term303.getClass(), "blockSize", 1962444399);
        setIntField(term303, term303.getClass(), "recordSize", 767834723);
        setIntField(term303, term303.getClass(), "recsPerBlock", -602026508);
        setField(term283, term283.getClass(), "buffer", term303);
        setIntField(term283, term283.getClass(), "longFileMode", -157887805);
        setBooleanField(term283, term283.getClass(), "closed", true);
        setField(term283, term283.getClass(), "out", null);
        setByteElement(term320, 0, (byte) 15);
        setByteElement(term320, 1, (byte) 45);
        setByteElement(term320, 2, (byte) -39);
        setByteElement(term320, 3, (byte) -20);
        setByteElement(term320, 4, (byte) 10);
        setByteElement(term320, 5, (byte) 77);
        setField(term283, term283.getClass(), "oneByte", term320);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.compress.archivers.ArchiveEntry");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "putArchiveEntry", argTypes, term283, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


