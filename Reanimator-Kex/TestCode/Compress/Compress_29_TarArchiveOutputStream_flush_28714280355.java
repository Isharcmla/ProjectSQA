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

public class TarArchiveOutputStream_flush_28714280355 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1382;

    public TarArchiveOutputStream_flush_28714280355() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1382 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term1397 = (byte[]) newByteArray(7);
        byte[] term1406 = (byte[]) newByteArray(2);
        byte[] term1418 = (byte[]) newByteArray(1);
        setLongField(term1382, term1382.getClass(), "currSize", -4443169559037975007L);
        setField(term1382, term1382.getClass(), "currName", "TEParAifyi");
        setLongField(term1382, term1382.getClass(), "currBytes", -3842548265506930260L);
        setByteElement(term1397, 0, (byte) -50);
        setByteElement(term1397, 1, (byte) -79);
        setByteElement(term1397, 2, (byte) 110);
        setByteElement(term1397, 3, (byte) -111);
        setByteElement(term1397, 4, (byte) -54);
        setByteElement(term1397, 5, (byte) -25);
        setByteElement(term1397, 6, (byte) -35);
        setField(term1382, term1382.getClass(), "recordBuf", term1397);
        setIntField(term1382, term1382.getClass(), "assemLen", -2015048153);
        setByteElement(term1406, 0, (byte) 3);
        setByteElement(term1406, 1, (byte) -10);
        setField(term1382, term1382.getClass(), "assemBuf", term1406);
        setIntField(term1382, term1382.getClass(), "longFileMode", -2063457669);
        setIntField(term1382, term1382.getClass(), "bigNumberMode", -1222006000);
        setIntField(term1382, term1382.getClass(), "recordsWritten", 2095798786);
        setIntField(term1382, term1382.getClass(), "recordsPerBlock", -1565502840);
        setIntField(term1382, term1382.getClass(), "recordSize", 344323424);
        setBooleanField(term1382, term1382.getClass(), "closed", true);
        setBooleanField(term1382, term1382.getClass(), "haveUnclosedEntry", false);
        setBooleanField(term1382, term1382.getClass(), "finished", false);
        setField(term1382, term1382.getClass(), "out", null);
        setField(term1382, term1382.getClass(), "zipEncoding", null);
        setBooleanField(term1382, term1382.getClass(), "addPaxHeadersForNonAsciiNames", true);
        setByteElement(term1418, 0, (byte) -106);
        setField(term1382, term1382.getClass(), "oneByte", term1418);
        setLongField(term1382, term1382.getClass(), "bytesWritten", -5788180182343976541L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "flush", argTypes, term1382, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


