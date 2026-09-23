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
import static org.apache.commons.compress.archivers.tar.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.compress.archivers.tar.EqualityUtils.*;

public class TarArchiveOutputStream_closeArchiveEntry_11319256749 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term652;
     Object term56039;

    public TarArchiveOutputStream_closeArchiveEntry_11319256749() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term652 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term667 = (byte[]) newByteArray(3);
        byte[] term672 = (byte[]) newByteArray(7);
        byte[] term689 = (byte[]) newByteArray(2);
        setLongField(term652, term652.getClass(), "currSize", -4502405999831680926L);
        setField(term652, term652.getClass(), "currName", "MxlszYVzRf");
        setLongField(term652, term652.getClass(), "currBytes", 1967728129628047933L);
        setByteElement(term667, 0, (byte) -95);
        setByteElement(term667, 1, (byte) -2);
        setByteElement(term667, 2, (byte) 28);
        setField(term652, term652.getClass(), "recordBuf", term667);
        setIntField(term652, term652.getClass(), "assemLen", -481533957);
        setByteElement(term672, 0, (byte) 84);
        setByteElement(term672, 1, (byte) 85);
        setByteElement(term672, 2, (byte) -17);
        setByteElement(term672, 3, (byte) -83);
        setByteElement(term672, 4, (byte) 48);
        setByteElement(term672, 5, (byte) -128);
        setByteElement(term672, 6, (byte) 70);
        setField(term652, term652.getClass(), "assemBuf", term672);
        setIntField(term652, term652.getClass(), "longFileMode", 1240914516);
        setIntField(term652, term652.getClass(), "bigNumberMode", -1465035361);
        setIntField(term652, term652.getClass(), "recordsWritten", 1090617576);
        setIntField(term652, term652.getClass(), "recordsPerBlock", -1547384488);
        setIntField(term652, term652.getClass(), "recordSize", 1442160736);
        setBooleanField(term652, term652.getClass(), "closed", true);
        setBooleanField(term652, term652.getClass(), "haveUnclosedEntry", true);
        setBooleanField(term652, term652.getClass(), "finished", false);
        setField(term652, term652.getClass(), "out", null);
        setField(term652, term652.getClass(), "zipEncoding", null);
        setBooleanField(term652, term652.getClass(), "addPaxHeadersForNonAsciiNames", false);
        setByteElement(term689, 0, (byte) -28);
        setByteElement(term689, 1, (byte) 115);
        setField(term652, term652.getClass(), "oneByte", term689);
        setLongField(term652, term652.getClass(), "bytesWritten", 2120084523938730454L);
        term56039 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term56042 = (byte[]) newByteArray(3);
        byte[] term56043 = (byte[]) newByteArray(7);
        byte[] term56044 = (byte[]) newByteArray(2);
        setLongField(term56039, term56039.getClass(), "currSize", -4502405999831680926L);
        setField(term56039, term56039.getClass(), "currName", "MxlszYVzRf");
        setLongField(term56039, term56039.getClass(), "currBytes", 1967728129628047933L);
        setByteElement(term56042, 0, (byte) -95);
        setByteElement(term56042, 1, (byte) -2);
        setByteElement(term56042, 2, (byte) 28);
        setField(term56039, term56039.getClass(), "recordBuf", term56042);
        setIntField(term56039, term56039.getClass(), "assemLen", -481533957);
        setByteElement(term56043, 0, (byte) 84);
        setByteElement(term56043, 1, (byte) 85);
        setByteElement(term56043, 2, (byte) -17);
        setByteElement(term56043, 3, (byte) -83);
        setByteElement(term56043, 4, (byte) 48);
        setByteElement(term56043, 5, (byte) -128);
        setByteElement(term56043, 6, (byte) 70);
        setField(term56039, term56039.getClass(), "assemBuf", term56043);
        setIntField(term56039, term56039.getClass(), "longFileMode", 1240914516);
        setIntField(term56039, term56039.getClass(), "bigNumberMode", -1465035361);
        setIntField(term56039, term56039.getClass(), "recordsWritten", 1090617576);
        setIntField(term56039, term56039.getClass(), "recordsPerBlock", -1547384488);
        setIntField(term56039, term56039.getClass(), "recordSize", 1442160736);
        setBooleanField(term56039, term56039.getClass(), "closed", true);
        setBooleanField(term56039, term56039.getClass(), "haveUnclosedEntry", false);
        setBooleanField(term56039, term56039.getClass(), "finished", false);
        setField(term56039, term56039.getClass(), "out", null);
        setField(term56039, term56039.getClass(), "zipEncoding", null);
        setBooleanField(term56039, term56039.getClass(), "addPaxHeadersForNonAsciiNames", false);
        setByteElement(term56044, 0, (byte) -28);
        setByteElement(term56044, 1, (byte) 115);
        setField(term56039, term56039.getClass(), "oneByte", term56044);
        setLongField(term56039, term56039.getClass(), "bytesWritten", 2120084523938730454L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "closeArchiveEntry", argTypes, term652, args);
        assertTrue(recursiveEquals(term652, term56039));
    }

};


