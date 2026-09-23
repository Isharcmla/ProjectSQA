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

public class TarArchiveOutputStream_finish_37385763417 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term82;

    public TarArchiveOutputStream_finish_37385763417() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term82 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term97 = (byte[]) newByteArray(1);
        byte[] term100 = (byte[]) newByteArray(6);
        Object term107 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarBuffer"));
        byte[] term108 = (byte[]) newByteArray(2);
        byte[] term120 = (byte[]) newByteArray(6);
        setLongField(term82, term82.getClass(), "currSize", -8400487765614892086L);
        setField(term82, term82.getClass(), "currName", "sjlJAEtRrb");
        setLongField(term82, term82.getClass(), "currBytes", 5270370404989704783L);
        setByteElement(term97, 0, (byte) -54);
        setField(term82, term82.getClass(), "recordBuf", term97);
        setIntField(term82, term82.getClass(), "assemLen", -883034806);
        setByteElement(term100, 0, (byte) 67);
        setByteElement(term100, 1, (byte) 78);
        setByteElement(term100, 2, (byte) 87);
        setByteElement(term100, 3, (byte) 121);
        setByteElement(term100, 4, (byte) -99);
        setByteElement(term100, 5, (byte) -2);
        setField(term82, term82.getClass(), "assemBuf", term100);
        setField(term107, term107.getClass(), "inStream", null);
        setField(term107, term107.getClass(), "outStream", null);
        setByteElement(term108, 0, (byte) -16);
        setByteElement(term108, 1, (byte) -112);
        setField(term107, term107.getClass(), "blockBuffer", term108);
        setIntField(term107, term107.getClass(), "currBlkIdx", 1585847225);
        setIntField(term107, term107.getClass(), "currRecIdx", 597278769);
        setIntField(term107, term107.getClass(), "blockSize", -1685132342);
        setIntField(term107, term107.getClass(), "recordSize", -1456670397);
        setIntField(term107, term107.getClass(), "recsPerBlock", 1622346318);
        setField(term82, term82.getClass(), "buffer", term107);
        setIntField(term82, term82.getClass(), "longFileMode", 1048535127);
        setBooleanField(term82, term82.getClass(), "closed", false);
        setBooleanField(term82, term82.getClass(), "haveUnclosedEntry", true);
        setBooleanField(term82, term82.getClass(), "finished", true);
        setField(term82, term82.getClass(), "out", null);
        setByteElement(term120, 0, (byte) -111);
        setByteElement(term120, 1, (byte) 23);
        setByteElement(term120, 2, (byte) -15);
        setByteElement(term120, 3, (byte) 36);
        setByteElement(term120, 4, (byte) 118);
        setByteElement(term120, 5, (byte) 106);
        setField(term82, term82.getClass(), "oneByte", term120);
        setLongField(term82, term82.getClass(), "bytesWritten", 7411271909051562686L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "finish", argTypes, term82, args);
            assertTrue(false);
        }
        catch (IOException e) {
        }

    }

};


