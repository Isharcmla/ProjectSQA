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

public class TarArchiveOutputStream_flush_28714280324 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term594;

    public TarArchiveOutputStream_flush_28714280324() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term594 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term609 = (byte[]) newByteArray(5);
        byte[] term616 = (byte[]) newByteArray(3);
        Object term620 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarBuffer"));
        byte[] term621 = (byte[]) newByteArray(5);
        byte[] term635 = (byte[]) newByteArray(5);
        setLongField(term594, term594.getClass(), "currSize", -316468845751588286L);
        setField(term594, term594.getClass(), "currName", "hRNSzYYIrc");
        setLongField(term594, term594.getClass(), "currBytes", 5127676408959197577L);
        setByteElement(term609, 0, (byte) -124);
        setByteElement(term609, 1, (byte) -105);
        setByteElement(term609, 2, (byte) 25);
        setByteElement(term609, 3, (byte) 16);
        setByteElement(term609, 4, (byte) 39);
        setField(term594, term594.getClass(), "recordBuf", term609);
        setIntField(term594, term594.getClass(), "assemLen", 962840079);
        setByteElement(term616, 0, (byte) 123);
        setByteElement(term616, 1, (byte) 16);
        setByteElement(term616, 2, (byte) 2);
        setField(term594, term594.getClass(), "assemBuf", term616);
        setField(term620, term620.getClass(), "inStream", null);
        setField(term620, term620.getClass(), "outStream", null);
        setByteElement(term621, 0, (byte) -120);
        setByteElement(term621, 1, (byte) 96);
        setByteElement(term621, 2, (byte) -41);
        setByteElement(term621, 3, (byte) -88);
        setByteElement(term621, 4, (byte) 39);
        setField(term620, term620.getClass(), "blockBuffer", term621);
        setIntField(term620, term620.getClass(), "currBlkIdx", 1540719661);
        setIntField(term620, term620.getClass(), "currRecIdx", 1265463001);
        setIntField(term620, term620.getClass(), "blockSize", 335112684);
        setIntField(term620, term620.getClass(), "recordSize", 1551099402);
        setIntField(term620, term620.getClass(), "recsPerBlock", -2027534003);
        setField(term594, term594.getClass(), "buffer", term620);
        setIntField(term594, term594.getClass(), "longFileMode", 1063420942);
        setBooleanField(term594, term594.getClass(), "closed", true);
        setBooleanField(term594, term594.getClass(), "haveUnclosedEntry", true);
        setField(term594, term594.getClass(), "out", null);
        setByteElement(term635, 0, (byte) -1);
        setByteElement(term635, 1, (byte) 117);
        setByteElement(term635, 2, (byte) 43);
        setByteElement(term635, 3, (byte) -27);
        setByteElement(term635, 4, (byte) 34);
        setField(term594, term594.getClass(), "oneByte", term635);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "flush", argTypes, term594, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


