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
     Object term79;

    public TarArchiveOutputStream_finish_37385763417() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term79 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term94 = (byte[]) newByteArray(1);
        byte[] term97 = (byte[]) newByteArray(6);
        Object term104 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarBuffer"));
        byte[] term105 = (byte[]) newByteArray(2);
        byte[] term115 = (byte[]) newByteArray(6);
        setLongField(term79, term79.getClass(), "currSize", -8257434502486459194L);
        setField(term79, term79.getClass(), "currName", "sjlJAEtRrb");
        setLongField(term79, term79.getClass(), "currBytes", -8400487765614892086L);
        setByteElement(term94, 0, (byte) -54);
        setField(term79, term79.getClass(), "recordBuf", term94);
        setIntField(term79, term79.getClass(), "assemLen", -883034806);
        setByteElement(term97, 0, (byte) 67);
        setByteElement(term97, 1, (byte) 78);
        setByteElement(term97, 2, (byte) 87);
        setByteElement(term97, 3, (byte) 121);
        setByteElement(term97, 4, (byte) -99);
        setByteElement(term97, 5, (byte) -2);
        setField(term79, term79.getClass(), "assemBuf", term97);
        setField(term104, term104.getClass(), "inStream", null);
        setField(term104, term104.getClass(), "outStream", null);
        setByteElement(term105, 0, (byte) -16);
        setByteElement(term105, 1, (byte) -112);
        setField(term104, term104.getClass(), "blockBuffer", term105);
        setIntField(term104, term104.getClass(), "currBlkIdx", 1585847225);
        setIntField(term104, term104.getClass(), "currRecIdx", 597278769);
        setIntField(term104, term104.getClass(), "blockSize", -1685132342);
        setIntField(term104, term104.getClass(), "recordSize", -1456670397);
        setIntField(term104, term104.getClass(), "recsPerBlock", 1622346318);
        setField(term79, term79.getClass(), "buffer", term104);
        setIntField(term79, term79.getClass(), "longFileMode", 1048535127);
        setBooleanField(term79, term79.getClass(), "closed", false);
        setField(term79, term79.getClass(), "out", null);
        setByteElement(term115, 0, (byte) -111);
        setByteElement(term115, 1, (byte) 23);
        setByteElement(term115, 2, (byte) -15);
        setByteElement(term115, 3, (byte) 36);
        setByteElement(term115, 4, (byte) 118);
        setByteElement(term115, 5, (byte) 106);
        setField(term79, term79.getClass(), "oneByte", term115);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "finish", argTypes, term79, args);
            assertTrue(false);
        }
        catch (IOException e) {
        }

    }

};


