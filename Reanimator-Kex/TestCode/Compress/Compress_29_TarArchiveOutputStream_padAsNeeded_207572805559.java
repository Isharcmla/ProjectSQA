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

public class TarArchiveOutputStream_padAsNeeded_207572805559 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1844;
     Object term59276;

    public TarArchiveOutputStream_padAsNeeded_207572805559() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1844 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term1859 = (byte[]) newByteArray(7);
        byte[] term1868 = (byte[]) newByteArray(4);
        byte[] term1882 = (byte[]) newByteArray(8);
        setLongField(term1844, term1844.getClass(), "currSize", 5953383087795962419L);
        setField(term1844, term1844.getClass(), "currName", "Ghbwtircqb");
        setLongField(term1844, term1844.getClass(), "currBytes", 7994303628307559416L);
        setByteElement(term1859, 0, (byte) -63);
        setByteElement(term1859, 1, (byte) 108);
        setByteElement(term1859, 2, (byte) -105);
        setByteElement(term1859, 3, (byte) 33);
        setByteElement(term1859, 4, (byte) 109);
        setByteElement(term1859, 5, (byte) -54);
        setByteElement(term1859, 6, (byte) -85);
        setField(term1844, term1844.getClass(), "recordBuf", term1859);
        setIntField(term1844, term1844.getClass(), "assemLen", 1041916673);
        setByteElement(term1868, 0, (byte) 81);
        setByteElement(term1868, 1, (byte) -113);
        setByteElement(term1868, 2, (byte) 90);
        setByteElement(term1868, 3, (byte) 10);
        setField(term1844, term1844.getClass(), "assemBuf", term1868);
        setIntField(term1844, term1844.getClass(), "longFileMode", -601863069);
        setIntField(term1844, term1844.getClass(), "bigNumberMode", 663292551);
        setIntField(term1844, term1844.getClass(), "recordsWritten", -1885090354);
        setIntField(term1844, term1844.getClass(), "recordsPerBlock", -2066804303);
        setIntField(term1844, term1844.getClass(), "recordSize", -1731761810);
        setBooleanField(term1844, term1844.getClass(), "closed", true);
        setBooleanField(term1844, term1844.getClass(), "haveUnclosedEntry", false);
        setBooleanField(term1844, term1844.getClass(), "finished", false);
        setField(term1844, term1844.getClass(), "out", null);
        setField(term1844, term1844.getClass(), "zipEncoding", null);
        setBooleanField(term1844, term1844.getClass(), "addPaxHeadersForNonAsciiNames", true);
        setByteElement(term1882, 0, (byte) 87);
        setByteElement(term1882, 1, (byte) -35);
        setByteElement(term1882, 2, (byte) -14);
        setByteElement(term1882, 3, (byte) 10);
        setByteElement(term1882, 4, (byte) 65);
        setByteElement(term1882, 5, (byte) -44);
        setByteElement(term1882, 6, (byte) 115);
        setByteElement(term1882, 7, (byte) -32);
        setField(term1844, term1844.getClass(), "oneByte", term1882);
        setLongField(term1844, term1844.getClass(), "bytesWritten", 2443640364875054177L);
        term59276 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term59279 = (byte[]) newByteArray(7);
        byte[] term59280 = (byte[]) newByteArray(4);
        byte[] term59281 = (byte[]) newByteArray(8);
        setLongField(term59276, term59276.getClass(), "currSize", 5953383087795962419L);
        setField(term59276, term59276.getClass(), "currName", "Ghbwtircqb");
        setLongField(term59276, term59276.getClass(), "currBytes", 7994303628307559416L);
        setByteElement(term59279, 0, (byte) -63);
        setByteElement(term59279, 1, (byte) 108);
        setByteElement(term59279, 2, (byte) -105);
        setByteElement(term59279, 3, (byte) 33);
        setByteElement(term59279, 4, (byte) 109);
        setByteElement(term59279, 5, (byte) -54);
        setByteElement(term59279, 6, (byte) -85);
        setField(term59276, term59276.getClass(), "recordBuf", term59279);
        setIntField(term59276, term59276.getClass(), "assemLen", 1041916673);
        setByteElement(term59280, 0, (byte) 81);
        setByteElement(term59280, 1, (byte) -113);
        setByteElement(term59280, 2, (byte) 90);
        setByteElement(term59280, 3, (byte) 10);
        setField(term59276, term59276.getClass(), "assemBuf", term59280);
        setIntField(term59276, term59276.getClass(), "longFileMode", -601863069);
        setIntField(term59276, term59276.getClass(), "bigNumberMode", 663292551);
        setIntField(term59276, term59276.getClass(), "recordsWritten", -1885090354);
        setIntField(term59276, term59276.getClass(), "recordsPerBlock", -2066804303);
        setIntField(term59276, term59276.getClass(), "recordSize", -1731761810);
        setBooleanField(term59276, term59276.getClass(), "closed", true);
        setBooleanField(term59276, term59276.getClass(), "haveUnclosedEntry", false);
        setBooleanField(term59276, term59276.getClass(), "finished", false);
        setField(term59276, term59276.getClass(), "out", null);
        setField(term59276, term59276.getClass(), "zipEncoding", null);
        setBooleanField(term59276, term59276.getClass(), "addPaxHeadersForNonAsciiNames", true);
        setByteElement(term59281, 0, (byte) 87);
        setByteElement(term59281, 1, (byte) -35);
        setByteElement(term59281, 2, (byte) -14);
        setByteElement(term59281, 3, (byte) 10);
        setByteElement(term59281, 4, (byte) 65);
        setByteElement(term59281, 5, (byte) -44);
        setByteElement(term59281, 6, (byte) 115);
        setByteElement(term59281, 7, (byte) -32);
        setField(term59276, term59276.getClass(), "oneByte", term59281);
        setLongField(term59276, term59276.getClass(), "bytesWritten", 2443640364875054177L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "padAsNeeded", argTypes, term1844, args);
        assertTrue(recursiveEquals(term1844, term59276));
    }

};


