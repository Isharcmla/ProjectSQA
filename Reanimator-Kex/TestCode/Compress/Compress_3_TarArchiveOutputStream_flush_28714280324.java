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
     Object term586;

    public TarArchiveOutputStream_flush_28714280324() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term586 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term601 = (byte[]) newByteArray(5);
        byte[] term608 = (byte[]) newByteArray(3);
        Object term612 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarBuffer"));
        byte[] term613 = (byte[]) newByteArray(5);
        byte[] term626 = (byte[]) newByteArray(5);
        setLongField(term586, term586.getClass(), "currSize", -316468845751588286L);
        setField(term586, term586.getClass(), "currName", "hRNSzYYIrc");
        setLongField(term586, term586.getClass(), "currBytes", 5127676408959197577L);
        setByteElement(term601, 0, (byte) -124);
        setByteElement(term601, 1, (byte) -105);
        setByteElement(term601, 2, (byte) 25);
        setByteElement(term601, 3, (byte) 16);
        setByteElement(term601, 4, (byte) 39);
        setField(term586, term586.getClass(), "recordBuf", term601);
        setIntField(term586, term586.getClass(), "assemLen", 962840079);
        setByteElement(term608, 0, (byte) 123);
        setByteElement(term608, 1, (byte) 16);
        setByteElement(term608, 2, (byte) 2);
        setField(term586, term586.getClass(), "assemBuf", term608);
        setField(term612, term612.getClass(), "inStream", null);
        setField(term612, term612.getClass(), "outStream", null);
        setByteElement(term613, 0, (byte) -120);
        setByteElement(term613, 1, (byte) 96);
        setByteElement(term613, 2, (byte) -41);
        setByteElement(term613, 3, (byte) -88);
        setByteElement(term613, 4, (byte) 39);
        setField(term612, term612.getClass(), "blockBuffer", term613);
        setIntField(term612, term612.getClass(), "currBlkIdx", 1540719661);
        setIntField(term612, term612.getClass(), "currRecIdx", 1265463001);
        setIntField(term612, term612.getClass(), "blockSize", 335112684);
        setIntField(term612, term612.getClass(), "recordSize", 1551099402);
        setIntField(term612, term612.getClass(), "recsPerBlock", -2027534003);
        setField(term586, term586.getClass(), "buffer", term612);
        setIntField(term586, term586.getClass(), "longFileMode", 1063420942);
        setBooleanField(term586, term586.getClass(), "closed", false);
        setField(term586, term586.getClass(), "out", null);
        setByteElement(term626, 0, (byte) -1);
        setByteElement(term626, 1, (byte) 117);
        setByteElement(term626, 2, (byte) 43);
        setByteElement(term626, 3, (byte) -27);
        setByteElement(term626, 4, (byte) 34);
        setField(term586, term586.getClass(), "oneByte", term626);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "flush", argTypes, term586, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


