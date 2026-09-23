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
import java.lang.Object;

public class TarArchiveOutputStream_close_191405504740 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term527;

    public TarArchiveOutputStream_close_191405504740() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term527 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term542 = (byte[]) newByteArray(5);
        byte[] term549 = (byte[]) newByteArray(6);
        Object term556 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarBuffer"));
        byte[] term560 = (byte[]) newByteArray(5);
        byte[] term574 = (byte[]) newByteArray(3);
        setLongField(term527, term527.getClass(), "currSize", -6573104506744284592L);
        setField(term527, term527.getClass(), "currName", "RMFIsYGgne");
        setLongField(term527, term527.getClass(), "currBytes", -4920224193275732920L);
        setByteElement(term542, 0, (byte) 66);
        setByteElement(term542, 1, (byte) -112);
        setByteElement(term542, 2, (byte) 81);
        setByteElement(term542, 3, (byte) 65);
        setByteElement(term542, 4, (byte) -44);
        setField(term527, term527.getClass(), "recordBuf", term542);
        setIntField(term527, term527.getClass(), "assemLen", 287287233);
        setByteElement(term549, 0, (byte) 33);
        setByteElement(term549, 1, (byte) -74);
        setByteElement(term549, 2, (byte) -84);
        setByteElement(term549, 3, (byte) -53);
        setByteElement(term549, 4, (byte) -93);
        setByteElement(term549, 5, (byte) 82);
        setField(term527, term527.getClass(), "assemBuf", term549);
        setField(term556, term556.getClass(), "inStream", null);
        setField(term556, term556.getClass(), "outStream", null);
        setIntField(term556, term556.getClass(), "blockSize", 962840079);
        setIntField(term556, term556.getClass(), "recordSize", 1540719661);
        setIntField(term556, term556.getClass(), "recsPerBlock", 1265463001);
        setByteElement(term560, 0, (byte) -89);
        setByteElement(term560, 1, (byte) 24);
        setByteElement(term560, 2, (byte) 123);
        setByteElement(term560, 3, (byte) -101);
        setByteElement(term560, 4, (byte) -102);
        setField(term556, term556.getClass(), "blockBuffer", term560);
        setIntField(term556, term556.getClass(), "currBlkIdx", 335112684);
        setIntField(term556, term556.getClass(), "currRecIdx", 1551099402);
        setField(term527, term527.getClass(), "buffer", term556);
        setIntField(term527, term527.getClass(), "longFileMode", -2027534003);
        setIntField(term527, term527.getClass(), "bigNumberMode", 1063420942);
        setBooleanField(term527, term527.getClass(), "closed", false);
        setBooleanField(term527, term527.getClass(), "haveUnclosedEntry", false);
        setBooleanField(term527, term527.getClass(), "finished", false);
        setField(term527, term527.getClass(), "out", null);
        setField(term527, term527.getClass(), "encoding", null);
        setBooleanField(term527, term527.getClass(), "addPaxHeadersForNonAsciiNames", true);
        setByteElement(term574, 0, (byte) -95);
        setByteElement(term574, 1, (byte) -2);
        setByteElement(term574, 2, (byte) 28);
        setField(term527, term527.getClass(), "oneByte", term574);
        setLongField(term527, term527.getClass(), "bytesWritten", 8428634514691209827L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "close", argTypes, term527, args);
            assertTrue(false);
        }
        catch (IOException e) {
        }

    }

};


