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
import java.lang.String;

public class TarArchiveOutputStream_createArchiveEntry_79928157425 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term687;
     Object term732;

    public TarArchiveOutputStream_createArchiveEntry_79928157425() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term687 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term702 = (byte[]) newByteArray(1);
        byte[] term705 = (byte[]) newByteArray(0);
        Object term706 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarBuffer"));
        byte[] term707 = (byte[]) newByteArray(9);
        byte[] term726 = (byte[]) newByteArray(4);
        setLongField(term687, term687.getClass(), "currSize", -4502405999831680926L);
        setField(term687, term687.getClass(), "currName", "RMFIsYGgne");
        setLongField(term687, term687.getClass(), "currBytes", 1967728129628047933L);
        setByteElement(term702, 0, (byte) -126);
        setField(term687, term687.getClass(), "recordBuf", term702);
        setIntField(term687, term687.getClass(), "assemLen", -478195677);
        setField(term687, term687.getClass(), "assemBuf", term705);
        setField(term706, term706.getClass(), "inStream", null);
        setField(term706, term706.getClass(), "outStream", null);
        setByteElement(term707, 0, (byte) 12);
        setByteElement(term707, 1, (byte) -75);
        setByteElement(term707, 2, (byte) 69);
        setByteElement(term707, 3, (byte) -6);
        setByteElement(term707, 4, (byte) 107);
        setByteElement(term707, 5, (byte) -109);
        setByteElement(term707, 6, (byte) 122);
        setByteElement(term707, 7, (byte) 83);
        setByteElement(term707, 8, (byte) -123);
        setField(term706, term706.getClass(), "blockBuffer", term707);
        setIntField(term706, term706.getClass(), "currBlkIdx", 972867650);
        setIntField(term706, term706.getClass(), "currRecIdx", 1655935355);
        setIntField(term706, term706.getClass(), "blockSize", -481533957);
        setIntField(term706, term706.getClass(), "recordSize", 1240914516);
        setIntField(term706, term706.getClass(), "recsPerBlock", -1465035361);
        setField(term687, term687.getClass(), "buffer", term706);
        setIntField(term687, term687.getClass(), "longFileMode", 1090617576);
        setBooleanField(term687, term687.getClass(), "closed", false);
        setBooleanField(term687, term687.getClass(), "haveUnclosedEntry", true);
        setBooleanField(term687, term687.getClass(), "finished", true);
        setField(term687, term687.getClass(), "out", null);
        setByteElement(term726, 0, (byte) -76);
        setByteElement(term726, 1, (byte) -115);
        setByteElement(term726, 2, (byte) -48);
        setByteElement(term726, 3, (byte) 126);
        setField(term687, term687.getClass(), "oneByte", term726);
        setLongField(term687, term687.getClass(), "bytesWritten", 2120084523938730454L);
        Class<? extends Object> term78328 = Class.forName((String) "java.io.File$PathStatus");
        Field term78327 = ((Class) term78328).getDeclaredField((String) "INVALID");
        ((Field) term78327).setAccessible(true);
        Object enum1 = ((Field) term78327).get((Object) null);
        term732 = newInstance(Class.forName("java.io.File"));
        setField(term732, term732.getClass(), "path", "NRdvgJlhkX");
        setField(term732, term732.getClass(), "status", enum1);
        setIntField(term732, term732.getClass(), "prefixLength", -1547384488);
        setField(term732, term732.getClass(), "filePath", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.io.File");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term732;
        args[1] = "uuaPigETmJ";
        try {
            callMethod(klass, "createArchiveEntry", argTypes, term687, args);
            assertTrue(false);
        }
        catch (IOException e) {
        }

    }

};


