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

public class TarArchiveOutputStream_close_191405504718 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term153;

    public TarArchiveOutputStream_close_191405504718() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term153 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term168 = (byte[]) newByteArray(7);
        byte[] term177 = (byte[]) newByteArray(1);
        Object term179 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarBuffer"));
        byte[] term180 = (byte[]) newByteArray(6);
        byte[] term196 = (byte[]) newByteArray(5);
        setLongField(term153, term153.getClass(), "currSize", 4872422362414183754L);
        setField(term153, term153.getClass(), "currName", "MuLcgQHgqz");
        setLongField(term153, term153.getClass(), "currBytes", 6811161968424632369L);
        setByteElement(term168, 0, (byte) 98);
        setByteElement(term168, 1, (byte) 67);
        setByteElement(term168, 2, (byte) 66);
        setByteElement(term168, 3, (byte) -121);
        setByteElement(term168, 4, (byte) -119);
        setByteElement(term168, 5, (byte) 71);
        setByteElement(term168, 6, (byte) 80);
        setField(term153, term153.getClass(), "recordBuf", term168);
        setIntField(term153, term153.getClass(), "assemLen", -6029667);
        setByteElement(term177, 0, (byte) 42);
        setField(term153, term153.getClass(), "assemBuf", term177);
        setField(term179, term179.getClass(), "inStream", null);
        setField(term179, term179.getClass(), "outStream", null);
        setByteElement(term180, 0, (byte) 72);
        setByteElement(term180, 1, (byte) 111);
        setByteElement(term180, 2, (byte) 99);
        setByteElement(term180, 3, (byte) -12);
        setByteElement(term180, 4, (byte) -61);
        setByteElement(term180, 5, (byte) -85);
        setField(term179, term179.getClass(), "blockBuffer", term180);
        setIntField(term179, term179.getClass(), "currBlkIdx", -2068769794);
        setIntField(term179, term179.getClass(), "currRecIdx", -117576464);
        setIntField(term179, term179.getClass(), "blockSize", -1007160944);
        setIntField(term179, term179.getClass(), "recordSize", 1135664017);
        setIntField(term179, term179.getClass(), "recsPerBlock", 590364439);
        setField(term153, term153.getClass(), "buffer", term179);
        setIntField(term153, term153.getClass(), "longFileMode", 865208305);
        setBooleanField(term153, term153.getClass(), "closed", true);
        setBooleanField(term153, term153.getClass(), "haveUnclosedEntry", true);
        setBooleanField(term153, term153.getClass(), "finished", false);
        setField(term153, term153.getClass(), "out", null);
        setByteElement(term196, 0, (byte) -22);
        setByteElement(term196, 1, (byte) 93);
        setByteElement(term196, 2, (byte) 69);
        setByteElement(term196, 3, (byte) -74);
        setByteElement(term196, 4, (byte) -123);
        setField(term153, term153.getClass(), "oneByte", term196);
        setLongField(term153, term153.getClass(), "bytesWritten", -7237588299778557629L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "close", argTypes, term153, args);
            assertTrue(false);
        }
        catch (IOException e) {
        }

    }

};


