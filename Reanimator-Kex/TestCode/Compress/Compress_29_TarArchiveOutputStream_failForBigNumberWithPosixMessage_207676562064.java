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

public class TarArchiveOutputStream_failForBigNumberWithPosixMessage_207676562064 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2833;
     Object term2887;
     Object term2889;

    public TarArchiveOutputStream_failForBigNumberWithPosixMessage_207676562064() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2833 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term2848 = (byte[]) newByteArray(6);
        byte[] term2856 = (byte[]) newByteArray(7);
        byte[] term2873 = (byte[]) newByteArray(0);
        setLongField(term2833, term2833.getClass(), "currSize", 2701184207686293431L);
        setField(term2833, term2833.getClass(), "currName", "fhkbdRViHi");
        setLongField(term2833, term2833.getClass(), "currBytes", 4474998035090263139L);
        setByteElement(term2848, 0, (byte) -15);
        setByteElement(term2848, 1, (byte) 115);
        setByteElement(term2848, 2, (byte) 52);
        setByteElement(term2848, 3, (byte) 96);
        setByteElement(term2848, 4, (byte) 40);
        setByteElement(term2848, 5, (byte) -5);
        setField(term2833, term2833.getClass(), "recordBuf", term2848);
        setIntField(term2833, term2833.getClass(), "assemLen", -1618206977);
        setByteElement(term2856, 0, (byte) 24);
        setByteElement(term2856, 1, (byte) -39);
        setByteElement(term2856, 2, (byte) 30);
        setByteElement(term2856, 3, (byte) -119);
        setByteElement(term2856, 4, (byte) 94);
        setByteElement(term2856, 5, (byte) -52);
        setByteElement(term2856, 6, (byte) -33);
        setField(term2833, term2833.getClass(), "assemBuf", term2856);
        setIntField(term2833, term2833.getClass(), "longFileMode", -1747406163);
        setIntField(term2833, term2833.getClass(), "bigNumberMode", 388157121);
        setIntField(term2833, term2833.getClass(), "recordsWritten", 1684998508);
        setIntField(term2833, term2833.getClass(), "recordsPerBlock", -1476644457);
        setIntField(term2833, term2833.getClass(), "recordSize", 1270666529);
        setBooleanField(term2833, term2833.getClass(), "closed", false);
        setBooleanField(term2833, term2833.getClass(), "haveUnclosedEntry", true);
        setBooleanField(term2833, term2833.getClass(), "finished", true);
        setField(term2833, term2833.getClass(), "out", null);
        setField(term2833, term2833.getClass(), "zipEncoding", null);
        setBooleanField(term2833, term2833.getClass(), "addPaxHeadersForNonAsciiNames", true);
        setField(term2833, term2833.getClass(), "oneByte", term2873);
        setLongField(term2833, term2833.getClass(), "bytesWritten", 2848819812340321742L);
        term2887 = new Long(-8876856890348836498L);
        term2889 = new Long(846579494941632714L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = long.class;
        argTypes[2] = long.class;
        Object[] args = new Object[3];
        args[0] = "uWHnvSvaPl";
        args[1] = term2887;
        args[2] = term2889;
        try {
            callMethod(klass, "failForBigNumberWithPosixMessage", argTypes, term2833, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


