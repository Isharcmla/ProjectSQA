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

public class TarArchiveOutputStream_finish_37385763445 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term400;

    public TarArchiveOutputStream_finish_37385763445() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term400 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term415 = (byte[]) newByteArray(1);
        byte[] term418 = (byte[]) newByteArray(0);
        byte[] term428 = (byte[]) newByteArray(2);
        setLongField(term400, term400.getClass(), "currSize", -872011222785455006L);
        setField(term400, term400.getClass(), "currName", "hRNSzYYIrc");
        setLongField(term400, term400.getClass(), "currBytes", -316468845751588286L);
        setByteElement(term415, 0, (byte) 116);
        setField(term400, term400.getClass(), "recordBuf", term415);
        setIntField(term400, term400.getClass(), "assemLen", 1632125673);
        setField(term400, term400.getClass(), "assemBuf", term418);
        setIntField(term400, term400.getClass(), "longFileMode", 454281060);
        setIntField(term400, term400.getClass(), "bigNumberMode", -1786399638);
        setIntField(term400, term400.getClass(), "recordsWritten", 2055867847);
        setIntField(term400, term400.getClass(), "recordsPerBlock", -1048298087);
        setIntField(term400, term400.getClass(), "recordSize", 292681826);
        setBooleanField(term400, term400.getClass(), "closed", true);
        setBooleanField(term400, term400.getClass(), "haveUnclosedEntry", true);
        setBooleanField(term400, term400.getClass(), "finished", true);
        setField(term400, term400.getClass(), "out", null);
        setField(term400, term400.getClass(), "zipEncoding", null);
        setBooleanField(term400, term400.getClass(), "addPaxHeadersForNonAsciiNames", true);
        setByteElement(term428, 0, (byte) -81);
        setByteElement(term428, 1, (byte) 102);
        setField(term400, term400.getClass(), "oneByte", term428);
        setLongField(term400, term400.getClass(), "bytesWritten", 5127676408959197577L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "finish", argTypes, term400, args);
            assertTrue(false);
        }
        catch (IOException e) {
        }

    }

};


