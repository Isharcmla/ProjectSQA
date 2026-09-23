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
     Object term287;

    public TarArchiveOutputStream_putArchiveEntry_53641996420() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term287 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term302 = (byte[]) newByteArray(0);
        byte[] term304 = (byte[]) newByteArray(2);
        Object term307 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarBuffer"));
        byte[] term308 = (byte[]) newByteArray(8);
        byte[] term325 = (byte[]) newByteArray(6);
        setLongField(term287, term287.getClass(), "currSize", -7237588299778557629L);
        setField(term287, term287.getClass(), "currName", "jJCZpVmanW");
        setLongField(term287, term287.getClass(), "currBytes", 6967924379644551255L);
        setField(term287, term287.getClass(), "recordBuf", term302);
        setIntField(term287, term287.getClass(), "assemLen", -469968304);
        setByteElement(term304, 0, (byte) -81);
        setByteElement(term304, 1, (byte) 102);
        setField(term287, term287.getClass(), "assemBuf", term304);
        setField(term307, term307.getClass(), "inStream", null);
        setField(term307, term307.getClass(), "outStream", null);
        setByteElement(term308, 0, (byte) -118);
        setByteElement(term308, 1, (byte) -126);
        setByteElement(term308, 2, (byte) -91);
        setByteElement(term308, 3, (byte) -104);
        setByteElement(term308, 4, (byte) -89);
        setByteElement(term308, 5, (byte) 13);
        setByteElement(term308, 6, (byte) 44);
        setByteElement(term308, 7, (byte) -63);
        setField(term307, term307.getClass(), "blockBuffer", term308);
        setIntField(term307, term307.getClass(), "currBlkIdx", -1145578966);
        setIntField(term307, term307.getClass(), "currRecIdx", 679763016);
        setIntField(term307, term307.getClass(), "blockSize", 1962444399);
        setIntField(term307, term307.getClass(), "recordSize", 767834723);
        setIntField(term307, term307.getClass(), "recsPerBlock", -602026508);
        setField(term287, term287.getClass(), "buffer", term307);
        setIntField(term287, term287.getClass(), "longFileMode", -157887805);
        setBooleanField(term287, term287.getClass(), "closed", false);
        setBooleanField(term287, term287.getClass(), "haveUnclosedEntry", true);
        setField(term287, term287.getClass(), "out", null);
        setByteElement(term325, 0, (byte) 15);
        setByteElement(term325, 1, (byte) 45);
        setByteElement(term325, 2, (byte) -39);
        setByteElement(term325, 3, (byte) -20);
        setByteElement(term325, 4, (byte) 10);
        setByteElement(term325, 5, (byte) 77);
        setField(term287, term287.getClass(), "oneByte", term325);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.compress.archivers.ArchiveEntry");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "putArchiveEntry", argTypes, term287, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


