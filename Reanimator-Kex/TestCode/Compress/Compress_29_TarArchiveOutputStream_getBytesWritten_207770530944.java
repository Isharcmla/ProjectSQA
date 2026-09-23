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

public class TarArchiveOutputStream_getBytesWritten_207770530944 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term341;

    public TarArchiveOutputStream_getBytesWritten_207770530944() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term341 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term356 = (byte[]) newByteArray(5);
        byte[] term363 = (byte[]) newByteArray(2);
        byte[] term375 = (byte[]) newByteArray(3);
        setLongField(term341, term341.getClass(), "currSize", -4325723315152823407L);
        setField(term341, term341.getClass(), "currName", "MjGYSRKTNF");
        setLongField(term341, term341.getClass(), "currBytes", 2535595959091595249L);
        setByteElement(term356, 0, (byte) -23);
        setByteElement(term356, 1, (byte) 100);
        setByteElement(term356, 2, (byte) 106);
        setByteElement(term356, 3, (byte) -57);
        setByteElement(term356, 4, (byte) -103);
        setField(term341, term341.getClass(), "recordBuf", term356);
        setIntField(term341, term341.getClass(), "assemLen", -602026508);
        setByteElement(term363, 0, (byte) 98);
        setByteElement(term363, 1, (byte) 79);
        setField(term341, term341.getClass(), "assemBuf", term363);
        setIntField(term341, term341.getClass(), "longFileMode", -157887805);
        setIntField(term341, term341.getClass(), "bigNumberMode", 1876565163);
        setIntField(term341, term341.getClass(), "recordsWritten", -817164822);
        setIntField(term341, term341.getClass(), "recordsPerBlock", -1016503459);
        setIntField(term341, term341.getClass(), "recordSize", -1968847291);
        setBooleanField(term341, term341.getClass(), "closed", true);
        setBooleanField(term341, term341.getClass(), "haveUnclosedEntry", false);
        setBooleanField(term341, term341.getClass(), "finished", false);
        setField(term341, term341.getClass(), "out", null);
        setField(term341, term341.getClass(), "zipEncoding", null);
        setBooleanField(term341, term341.getClass(), "addPaxHeadersForNonAsciiNames", true);
        setByteElement(term375, 0, (byte) 61);
        setByteElement(term375, 1, (byte) -92);
        setByteElement(term375, 2, (byte) -42);
        setField(term341, term341.getClass(), "oneByte", term375);
        setLongField(term341, term341.getClass(), "bytesWritten", -5476826692763582090L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getBytesWritten", argTypes, term341, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


