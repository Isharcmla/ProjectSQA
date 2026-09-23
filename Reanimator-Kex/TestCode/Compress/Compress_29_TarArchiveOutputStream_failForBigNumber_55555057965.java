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
import java.lang.RuntimeException;
import static org.apache.commons.compress.archivers.tar.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class TarArchiveOutputStream_failForBigNumber_55555057965 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2924;
     Object term2979;
     Object term2981;

    public TarArchiveOutputStream_failForBigNumber_55555057965() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2924 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term2939 = (byte[]) newByteArray(7);
        byte[] term2948 = (byte[]) newByteArray(1);
        byte[] term2959 = (byte[]) newByteArray(6);
        setLongField(term2924, term2924.getClass(), "currSize", 6689117472719450333L);
        setField(term2924, term2924.getClass(), "currName", "kBdSllIBVz");
        setLongField(term2924, term2924.getClass(), "currBytes", 5836128569274066678L);
        setByteElement(term2939, 0, (byte) 16);
        setByteElement(term2939, 1, (byte) 20);
        setByteElement(term2939, 2, (byte) -114);
        setByteElement(term2939, 3, (byte) 93);
        setByteElement(term2939, 4, (byte) -60);
        setByteElement(term2939, 5, (byte) -4);
        setByteElement(term2939, 6, (byte) 28);
        setField(term2924, term2924.getClass(), "recordBuf", term2939);
        setIntField(term2924, term2924.getClass(), "assemLen", -1022990421);
        setByteElement(term2948, 0, (byte) 94);
        setField(term2924, term2924.getClass(), "assemBuf", term2948);
        setIntField(term2924, term2924.getClass(), "longFileMode", 1045547089);
        setIntField(term2924, term2924.getClass(), "bigNumberMode", -1122880881);
        setIntField(term2924, term2924.getClass(), "recordsWritten", -542712742);
        setIntField(term2924, term2924.getClass(), "recordsPerBlock", -1254072822);
        setIntField(term2924, term2924.getClass(), "recordSize", -1111249833);
        setBooleanField(term2924, term2924.getClass(), "closed", false);
        setBooleanField(term2924, term2924.getClass(), "haveUnclosedEntry", true);
        setBooleanField(term2924, term2924.getClass(), "finished", true);
        setField(term2924, term2924.getClass(), "out", null);
        setField(term2924, term2924.getClass(), "zipEncoding", null);
        setBooleanField(term2924, term2924.getClass(), "addPaxHeadersForNonAsciiNames", true);
        setByteElement(term2959, 1, (byte) -96);
        setByteElement(term2959, 2, (byte) -88);
        setByteElement(term2959, 3, (byte) -73);
        setByteElement(term2959, 4, (byte) 105);
        setByteElement(term2959, 5, (byte) -86);
        setField(term2924, term2924.getClass(), "oneByte", term2959);
        setLongField(term2924, term2924.getClass(), "bytesWritten", -2177368829816872572L);
        term2979 = new Long(-8463029266761149071L);
        term2981 = new Long(3133860696238261492L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = long.class;
        argTypes[2] = long.class;
        argTypes[3] = Class.forName("java.lang.String");
        Object[] args = new Object[4];
        args[0] = "TJmVBGfTML";
        args[1] = term2979;
        args[2] = term2981;
        args[3] = "tPlsykYBqO";
        try {
            callMethod(klass, "failForBigNumber", argTypes, term2924, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


