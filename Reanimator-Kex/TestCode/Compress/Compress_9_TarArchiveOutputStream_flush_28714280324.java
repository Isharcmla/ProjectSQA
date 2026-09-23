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
     Object term610;

    public TarArchiveOutputStream_flush_28714280324() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term610 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term625 = (byte[]) newByteArray(5);
        byte[] term632 = (byte[]) newByteArray(3);
        Object term636 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarBuffer"));
        byte[] term637 = (byte[]) newByteArray(5);
        byte[] term652 = (byte[]) newByteArray(5);
        setLongField(term610, term610.getClass(), "currSize", 2486810210675247493L);
        setField(term610, term610.getClass(), "currName", "hRNSzYYIrc");
        setLongField(term610, term610.getClass(), "currBytes", 7009926388951271268L);
        setByteElement(term625, 0, (byte) -124);
        setByteElement(term625, 1, (byte) -105);
        setByteElement(term625, 2, (byte) 25);
        setByteElement(term625, 3, (byte) 16);
        setByteElement(term625, 4, (byte) 39);
        setField(term610, term610.getClass(), "recordBuf", term625);
        setIntField(term610, term610.getClass(), "assemLen", 962840079);
        setByteElement(term632, 0, (byte) 123);
        setByteElement(term632, 1, (byte) 16);
        setByteElement(term632, 2, (byte) 2);
        setField(term610, term610.getClass(), "assemBuf", term632);
        setField(term636, term636.getClass(), "inStream", null);
        setField(term636, term636.getClass(), "outStream", null);
        setByteElement(term637, 0, (byte) -120);
        setByteElement(term637, 1, (byte) 96);
        setByteElement(term637, 2, (byte) -41);
        setByteElement(term637, 3, (byte) -88);
        setByteElement(term637, 4, (byte) 39);
        setField(term636, term636.getClass(), "blockBuffer", term637);
        setIntField(term636, term636.getClass(), "currBlkIdx", 1540719661);
        setIntField(term636, term636.getClass(), "currRecIdx", 1265463001);
        setIntField(term636, term636.getClass(), "blockSize", 335112684);
        setIntField(term636, term636.getClass(), "recordSize", 1551099402);
        setIntField(term636, term636.getClass(), "recsPerBlock", -2027534003);
        setField(term610, term610.getClass(), "buffer", term636);
        setIntField(term610, term610.getClass(), "longFileMode", 1063420942);
        setBooleanField(term610, term610.getClass(), "closed", true);
        setBooleanField(term610, term610.getClass(), "haveUnclosedEntry", false);
        setBooleanField(term610, term610.getClass(), "finished", false);
        setField(term610, term610.getClass(), "out", null);
        setByteElement(term652, 0, (byte) -1);
        setByteElement(term652, 1, (byte) 117);
        setByteElement(term652, 2, (byte) 43);
        setByteElement(term652, 3, (byte) -27);
        setByteElement(term652, 4, (byte) 34);
        setField(term610, term610.getClass(), "oneByte", term652);
        setLongField(term610, term610.getClass(), "bytesWritten", -7672528020740371001L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "flush", argTypes, term610, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


