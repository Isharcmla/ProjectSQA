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

public class TarArchiveOutputStream_getCount_125638318037 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term314;

    public TarArchiveOutputStream_getCount_125638318037() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term314 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term329 = (byte[]) newByteArray(5);
        byte[] term336 = (byte[]) newByteArray(2);
        Object term339 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarBuffer"));
        byte[] term343 = (byte[]) newByteArray(3);
        byte[] term355 = (byte[]) newByteArray(1);
        setLongField(term314, term314.getClass(), "currSize", 6967924379644551255L);
        setField(term314, term314.getClass(), "currName", "SzjVpOQTyS");
        setLongField(term314, term314.getClass(), "currBytes", -2813493605142626659L);
        setByteElement(term329, 0, (byte) -23);
        setByteElement(term329, 1, (byte) 100);
        setByteElement(term329, 2, (byte) 106);
        setByteElement(term329, 3, (byte) -57);
        setByteElement(term329, 4, (byte) -103);
        setField(term314, term314.getClass(), "recordBuf", term329);
        setIntField(term314, term314.getClass(), "assemLen", 1962444399);
        setByteElement(term336, 0, (byte) 98);
        setByteElement(term336, 1, (byte) 79);
        setField(term314, term314.getClass(), "assemBuf", term336);
        setField(term339, term339.getClass(), "inStream", null);
        setField(term339, term339.getClass(), "outStream", null);
        setIntField(term339, term339.getClass(), "blockSize", 767834723);
        setIntField(term339, term339.getClass(), "recordSize", -602026508);
        setIntField(term339, term339.getClass(), "recsPerBlock", -157887805);
        setByteElement(term343, 0, (byte) 61);
        setByteElement(term343, 1, (byte) -92);
        setByteElement(term343, 2, (byte) -42);
        setField(term339, term339.getClass(), "blockBuffer", term343);
        setIntField(term339, term339.getClass(), "currBlkIdx", 1876565163);
        setIntField(term339, term339.getClass(), "currRecIdx", -817164822);
        setField(term314, term314.getClass(), "buffer", term339);
        setIntField(term314, term314.getClass(), "longFileMode", -1016503459);
        setIntField(term314, term314.getClass(), "bigNumberMode", -1968847291);
        setBooleanField(term314, term314.getClass(), "closed", true);
        setBooleanField(term314, term314.getClass(), "haveUnclosedEntry", false);
        setBooleanField(term314, term314.getClass(), "finished", false);
        setField(term314, term314.getClass(), "out", null);
        setField(term314, term314.getClass(), "encoding", null);
        setBooleanField(term314, term314.getClass(), "addPaxHeadersForNonAsciiNames", true);
        setByteElement(term355, 0, (byte) 116);
        setField(term314, term314.getClass(), "oneByte", term355);
        setLongField(term314, term314.getClass(), "bytesWritten", -8885298608300233488L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getCount", argTypes, term314, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


