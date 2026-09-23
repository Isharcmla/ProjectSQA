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

public class TarArchiveOutputStream_writeRecord_159809760757 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1708;
     Object term1750;

    public TarArchiveOutputStream_writeRecord_159809760757() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1708 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term1723 = (byte[]) newByteArray(7);
        byte[] term1732 = (byte[]) newByteArray(1);
        byte[] term1743 = (byte[]) newByteArray(5);
        setLongField(term1708, term1708.getClass(), "currSize", -2644215923136513282L);
        setField(term1708, term1708.getClass(), "currName", "SbAoxhfrkn");
        setLongField(term1708, term1708.getClass(), "currBytes", -1468719814009985452L);
        setByteElement(term1723, 0, (byte) -95);
        setByteElement(term1723, 1, (byte) -6);
        setByteElement(term1723, 2, (byte) 51);
        setByteElement(term1723, 3, (byte) 122);
        setByteElement(term1723, 4, (byte) 84);
        setByteElement(term1723, 5, (byte) -36);
        setByteElement(term1723, 6, (byte) 103);
        setField(term1708, term1708.getClass(), "recordBuf", term1723);
        setIntField(term1708, term1708.getClass(), "assemLen", 1598895173);
        setByteElement(term1732, 0, (byte) -63);
        setField(term1708, term1708.getClass(), "assemBuf", term1732);
        setIntField(term1708, term1708.getClass(), "longFileMode", 1830648570);
        setIntField(term1708, term1708.getClass(), "bigNumberMode", -227365013);
        setIntField(term1708, term1708.getClass(), "recordsWritten", 11724947);
        setIntField(term1708, term1708.getClass(), "recordsPerBlock", 1953277050);
        setIntField(term1708, term1708.getClass(), "recordSize", 1283079251);
        setBooleanField(term1708, term1708.getClass(), "closed", false);
        setBooleanField(term1708, term1708.getClass(), "haveUnclosedEntry", false);
        setBooleanField(term1708, term1708.getClass(), "finished", false);
        setField(term1708, term1708.getClass(), "out", null);
        setField(term1708, term1708.getClass(), "zipEncoding", null);
        setBooleanField(term1708, term1708.getClass(), "addPaxHeadersForNonAsciiNames", false);
        setByteElement(term1743, 0, (byte) 39);
        setByteElement(term1743, 1, (byte) -54);
        setByteElement(term1743, 2, (byte) 9);
        setByteElement(term1743, 3, (byte) 19);
        setByteElement(term1743, 4, (byte) -103);
        setField(term1708, term1708.getClass(), "oneByte", term1743);
        setLongField(term1708, term1708.getClass(), "bytesWritten", -7738503207562305297L);
        term1750 = (byte[]) newByteArray(1);
        setByteElement(term1750, 0, (byte) 61);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term1750;
        try {
            callMethod(klass, "writeRecord", argTypes, term1708, args);
            assertTrue(false);
        }
        catch (IOException e) {
        }

    }

};


