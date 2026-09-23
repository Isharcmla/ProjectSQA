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

public class TarArchiveOutputStream_getCount_125638318043 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term278;

    public TarArchiveOutputStream_getCount_125638318043() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term278 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term293 = (byte[]) newByteArray(1);
        byte[] term296 = (byte[]) newByteArray(6);
        byte[] term312 = (byte[]) newByteArray(5);
        setLongField(term278, term278.getClass(), "currSize", 6967924379644551255L);
        setField(term278, term278.getClass(), "currName", "SzjVpOQTyS");
        setLongField(term278, term278.getClass(), "currBytes", -2813493605142626659L);
        setByteElement(term293, 0, (byte) 42);
        setField(term278, term278.getClass(), "recordBuf", term293);
        setIntField(term278, term278.getClass(), "assemLen", 1193880199);
        setByteElement(term296, 0, (byte) 72);
        setByteElement(term296, 1, (byte) 111);
        setByteElement(term296, 2, (byte) 99);
        setByteElement(term296, 3, (byte) -12);
        setByteElement(term296, 4, (byte) -61);
        setByteElement(term296, 5, (byte) -85);
        setField(term278, term278.getClass(), "assemBuf", term296);
        setIntField(term278, term278.getClass(), "longFileMode", -1087774327);
        setIntField(term278, term278.getClass(), "bigNumberMode", -1530420153);
        setIntField(term278, term278.getClass(), "recordsWritten", -469968304);
        setIntField(term278, term278.getClass(), "recordsPerBlock", -1145578966);
        setIntField(term278, term278.getClass(), "recordSize", 679763016);
        setBooleanField(term278, term278.getClass(), "closed", true);
        setBooleanField(term278, term278.getClass(), "haveUnclosedEntry", false);
        setBooleanField(term278, term278.getClass(), "finished", false);
        setField(term278, term278.getClass(), "out", null);
        setField(term278, term278.getClass(), "zipEncoding", null);
        setBooleanField(term278, term278.getClass(), "addPaxHeadersForNonAsciiNames", true);
        setByteElement(term312, 0, (byte) -22);
        setByteElement(term312, 1, (byte) 93);
        setByteElement(term312, 2, (byte) 69);
        setByteElement(term312, 3, (byte) -74);
        setByteElement(term312, 4, (byte) -123);
        setField(term278, term278.getClass(), "oneByte", term312);
        setLongField(term278, term278.getClass(), "bytesWritten", -8885298608300233488L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getCount", argTypes, term278, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


