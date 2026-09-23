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
     Object term80;

    public TarArchiveOutputStream_finish_37385763417() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term80 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term95 = (byte[]) newByteArray(1);
        byte[] term98 = (byte[]) newByteArray(6);
        Object term105 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarBuffer"));
        byte[] term106 = (byte[]) newByteArray(2);
        byte[] term117 = (byte[]) newByteArray(6);
        setLongField(term80, term80.getClass(), "currSize", -8257434502486459194L);
        setField(term80, term80.getClass(), "currName", "sjlJAEtRrb");
        setLongField(term80, term80.getClass(), "currBytes", -8400487765614892086L);
        setByteElement(term95, 0, (byte) -54);
        setField(term80, term80.getClass(), "recordBuf", term95);
        setIntField(term80, term80.getClass(), "assemLen", -883034806);
        setByteElement(term98, 0, (byte) 67);
        setByteElement(term98, 1, (byte) 78);
        setByteElement(term98, 2, (byte) 87);
        setByteElement(term98, 3, (byte) 121);
        setByteElement(term98, 4, (byte) -99);
        setByteElement(term98, 5, (byte) -2);
        setField(term80, term80.getClass(), "assemBuf", term98);
        setField(term105, term105.getClass(), "inStream", null);
        setField(term105, term105.getClass(), "outStream", null);
        setByteElement(term106, 0, (byte) -16);
        setByteElement(term106, 1, (byte) -112);
        setField(term105, term105.getClass(), "blockBuffer", term106);
        setIntField(term105, term105.getClass(), "currBlkIdx", 1585847225);
        setIntField(term105, term105.getClass(), "currRecIdx", 597278769);
        setIntField(term105, term105.getClass(), "blockSize", -1685132342);
        setIntField(term105, term105.getClass(), "recordSize", -1456670397);
        setIntField(term105, term105.getClass(), "recsPerBlock", 1622346318);
        setField(term80, term80.getClass(), "buffer", term105);
        setIntField(term80, term80.getClass(), "longFileMode", 1048535127);
        setBooleanField(term80, term80.getClass(), "closed", false);
        setBooleanField(term80, term80.getClass(), "haveUnclosedEntry", false);
        setField(term80, term80.getClass(), "out", null);
        setByteElement(term117, 0, (byte) -111);
        setByteElement(term117, 1, (byte) 23);
        setByteElement(term117, 2, (byte) -15);
        setByteElement(term117, 3, (byte) 36);
        setByteElement(term117, 4, (byte) 118);
        setByteElement(term117, 5, (byte) 106);
        setField(term80, term80.getClass(), "oneByte", term117);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "finish", argTypes, term80, args);
            assertTrue(false);
        }
        catch (IOException e) {
        }

    }

};


