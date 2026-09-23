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

public class TarArchiveOutputStream_writeEOFRecord_106353833954 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1327;

    public TarArchiveOutputStream_writeEOFRecord_106353833954() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1327 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term1342 = (byte[]) newByteArray(4);
        byte[] term1348 = (byte[]) newByteArray(4);
        byte[] term1362 = (byte[]) newByteArray(0);
        setLongField(term1327, term1327.getClass(), "currSize", -7612550318181586304L);
        setField(term1327, term1327.getClass(), "currName", "IoAlmYsBwc");
        setLongField(term1327, term1327.getClass(), "currBytes", -2170847986967241072L);
        setByteElement(term1342, 0, (byte) 103);
        setByteElement(term1342, 1, (byte) 23);
        setByteElement(term1342, 2, (byte) 96);
        setByteElement(term1342, 3, (byte) -70);
        setField(term1327, term1327.getClass(), "recordBuf", term1342);
        setIntField(term1327, term1327.getClass(), "assemLen", -2015854073);
        setByteElement(term1348, 0, (byte) -73);
        setByteElement(term1348, 1, (byte) 1);
        setByteElement(term1348, 2, (byte) 99);
        setByteElement(term1348, 3, (byte) -121);
        setField(term1327, term1327.getClass(), "assemBuf", term1348);
        setIntField(term1327, term1327.getClass(), "longFileMode", 538259104);
        setIntField(term1327, term1327.getClass(), "bigNumberMode", 96566506);
        setIntField(term1327, term1327.getClass(), "recordsWritten", -343325701);
        setIntField(term1327, term1327.getClass(), "recordsPerBlock", 107945604);
        setIntField(term1327, term1327.getClass(), "recordSize", -1963464809);
        setBooleanField(term1327, term1327.getClass(), "closed", false);
        setBooleanField(term1327, term1327.getClass(), "haveUnclosedEntry", false);
        setBooleanField(term1327, term1327.getClass(), "finished", false);
        setField(term1327, term1327.getClass(), "out", null);
        setField(term1327, term1327.getClass(), "zipEncoding", null);
        setBooleanField(term1327, term1327.getClass(), "addPaxHeadersForNonAsciiNames", true);
        setField(term1327, term1327.getClass(), "oneByte", term1362);
        setLongField(term1327, term1327.getClass(), "bytesWritten", 4044358158040652353L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "writeEOFRecord", argTypes, term1327, args);
            assertTrue(false);
        }
        catch (IOException e) {
        }

    }

};


