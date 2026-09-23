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

public class TarArchiveOutputStream_putArchiveEntry_53641996448 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term581;

    public TarArchiveOutputStream_putArchiveEntry_53641996448() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term581 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term596 = (byte[]) newByteArray(5);
        byte[] term603 = (byte[]) newByteArray(6);
        byte[] term619 = (byte[]) newByteArray(5);
        setLongField(term581, term581.getClass(), "currSize", 2486810210675247493L);
        setField(term581, term581.getClass(), "currName", "uuaPigETmJ");
        setLongField(term581, term581.getClass(), "currBytes", 7009926388951271268L);
        setByteElement(term596, 0, (byte) 66);
        setByteElement(term596, 1, (byte) -112);
        setByteElement(term596, 2, (byte) 81);
        setByteElement(term596, 3, (byte) 65);
        setByteElement(term596, 4, (byte) -44);
        setField(term581, term581.getClass(), "recordBuf", term596);
        setIntField(term581, term581.getClass(), "assemLen", 335112684);
        setByteElement(term603, 0, (byte) 33);
        setByteElement(term603, 1, (byte) -74);
        setByteElement(term603, 2, (byte) -84);
        setByteElement(term603, 3, (byte) -53);
        setByteElement(term603, 4, (byte) -93);
        setByteElement(term603, 5, (byte) 82);
        setField(term581, term581.getClass(), "assemBuf", term603);
        setIntField(term581, term581.getClass(), "longFileMode", 1551099402);
        setIntField(term581, term581.getClass(), "bigNumberMode", -2027534003);
        setIntField(term581, term581.getClass(), "recordsWritten", 1063420942);
        setIntField(term581, term581.getClass(), "recordsPerBlock", 1375330971);
        setIntField(term581, term581.getClass(), "recordSize", -478195677);
        setBooleanField(term581, term581.getClass(), "closed", true);
        setBooleanField(term581, term581.getClass(), "haveUnclosedEntry", false);
        setBooleanField(term581, term581.getClass(), "finished", true);
        setField(term581, term581.getClass(), "out", null);
        setField(term581, term581.getClass(), "zipEncoding", null);
        setBooleanField(term581, term581.getClass(), "addPaxHeadersForNonAsciiNames", true);
        setByteElement(term619, 0, (byte) -89);
        setByteElement(term619, 1, (byte) 24);
        setByteElement(term619, 2, (byte) 123);
        setByteElement(term619, 3, (byte) -101);
        setByteElement(term619, 4, (byte) -102);
        setField(term581, term581.getClass(), "oneByte", term619);
        setLongField(term581, term581.getClass(), "bytesWritten", -7672528020740371001L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.compress.archivers.ArchiveEntry");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "putArchiveEntry", argTypes, term581, args);
            assertTrue(false);
        }
        catch (IOException e) {
        }

    }

};


