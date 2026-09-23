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
     Object term147;

    public TarArchiveOutputStream_close_191405504718() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term147 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term162 = (byte[]) newByteArray(7);
        byte[] term171 = (byte[]) newByteArray(1);
        Object term173 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarBuffer"));
        byte[] term174 = (byte[]) newByteArray(6);
        byte[] term188 = (byte[]) newByteArray(5);
        setLongField(term147, term147.getClass(), "currSize", 5270370404989704783L);
        setField(term147, term147.getClass(), "currName", "MuLcgQHgqz");
        setLongField(term147, term147.getClass(), "currBytes", 7411271909051562686L);
        setByteElement(term162, 0, (byte) 98);
        setByteElement(term162, 1, (byte) 67);
        setByteElement(term162, 2, (byte) 66);
        setByteElement(term162, 3, (byte) -121);
        setByteElement(term162, 4, (byte) -119);
        setByteElement(term162, 5, (byte) 71);
        setByteElement(term162, 6, (byte) 80);
        setField(term147, term147.getClass(), "recordBuf", term162);
        setIntField(term147, term147.getClass(), "assemLen", -6029667);
        setByteElement(term171, 0, (byte) 42);
        setField(term147, term147.getClass(), "assemBuf", term171);
        setField(term173, term173.getClass(), "inStream", null);
        setField(term173, term173.getClass(), "outStream", null);
        setByteElement(term174, 0, (byte) 72);
        setByteElement(term174, 1, (byte) 111);
        setByteElement(term174, 2, (byte) 99);
        setByteElement(term174, 3, (byte) -12);
        setByteElement(term174, 4, (byte) -61);
        setByteElement(term174, 5, (byte) -85);
        setField(term173, term173.getClass(), "blockBuffer", term174);
        setIntField(term173, term173.getClass(), "currBlkIdx", -2068769794);
        setIntField(term173, term173.getClass(), "currRecIdx", -117576464);
        setIntField(term173, term173.getClass(), "blockSize", -1007160944);
        setIntField(term173, term173.getClass(), "recordSize", 1135664017);
        setIntField(term173, term173.getClass(), "recsPerBlock", 590364439);
        setField(term147, term147.getClass(), "buffer", term173);
        setIntField(term147, term147.getClass(), "longFileMode", 865208305);
        setBooleanField(term147, term147.getClass(), "closed", false);
        setField(term147, term147.getClass(), "out", null);
        setByteElement(term188, 0, (byte) -22);
        setByteElement(term188, 1, (byte) 93);
        setByteElement(term188, 2, (byte) 69);
        setByteElement(term188, 3, (byte) -74);
        setByteElement(term188, 4, (byte) -123);
        setField(term147, term147.getClass(), "oneByte", term188);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "close", argTypes, term147, args);
            assertTrue(false);
        }
        catch (IOException e) {
        }

    }

};


