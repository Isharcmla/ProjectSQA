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
     Object term295;

    public TarArchiveOutputStream_putArchiveEntry_53641996420() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term295 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term310 = (byte[]) newByteArray(0);
        byte[] term312 = (byte[]) newByteArray(2);
        Object term315 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarBuffer"));
        byte[] term316 = (byte[]) newByteArray(8);
        byte[] term334 = (byte[]) newByteArray(6);
        setLongField(term295, term295.getClass(), "currSize", -4325723315152823407L);
        setField(term295, term295.getClass(), "currName", "jJCZpVmanW");
        setLongField(term295, term295.getClass(), "currBytes", 2535595959091595249L);
        setField(term295, term295.getClass(), "recordBuf", term310);
        setIntField(term295, term295.getClass(), "assemLen", -469968304);
        setByteElement(term312, 0, (byte) -81);
        setByteElement(term312, 1, (byte) 102);
        setField(term295, term295.getClass(), "assemBuf", term312);
        setField(term315, term315.getClass(), "inStream", null);
        setField(term315, term315.getClass(), "outStream", null);
        setByteElement(term316, 0, (byte) -118);
        setByteElement(term316, 1, (byte) -126);
        setByteElement(term316, 2, (byte) -91);
        setByteElement(term316, 3, (byte) -104);
        setByteElement(term316, 4, (byte) -89);
        setByteElement(term316, 5, (byte) 13);
        setByteElement(term316, 6, (byte) 44);
        setByteElement(term316, 7, (byte) -63);
        setField(term315, term315.getClass(), "blockBuffer", term316);
        setIntField(term315, term315.getClass(), "currBlkIdx", -1145578966);
        setIntField(term315, term315.getClass(), "currRecIdx", 679763016);
        setIntField(term315, term315.getClass(), "blockSize", 1962444399);
        setIntField(term315, term315.getClass(), "recordSize", 767834723);
        setIntField(term315, term315.getClass(), "recsPerBlock", -602026508);
        setField(term295, term295.getClass(), "buffer", term315);
        setIntField(term295, term295.getClass(), "longFileMode", -157887805);
        setBooleanField(term295, term295.getClass(), "closed", false);
        setBooleanField(term295, term295.getClass(), "haveUnclosedEntry", true);
        setBooleanField(term295, term295.getClass(), "finished", false);
        setField(term295, term295.getClass(), "out", null);
        setByteElement(term334, 0, (byte) 15);
        setByteElement(term334, 1, (byte) 45);
        setByteElement(term334, 2, (byte) -39);
        setByteElement(term334, 3, (byte) -20);
        setByteElement(term334, 4, (byte) 10);
        setByteElement(term334, 5, (byte) 77);
        setField(term295, term295.getClass(), "oneByte", term334);
        setLongField(term295, term295.getClass(), "bytesWritten", -5476826692763582090L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.compress.archivers.ArchiveEntry");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "putArchiveEntry", argTypes, term295, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


