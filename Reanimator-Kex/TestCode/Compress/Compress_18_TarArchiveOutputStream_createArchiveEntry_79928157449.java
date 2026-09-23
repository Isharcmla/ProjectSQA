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

public class TarArchiveOutputStream_createArchiveEntry_79928157449 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1436;
     Object term1497;

    public TarArchiveOutputStream_createArchiveEntry_79928157449() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1436 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term1451 = (byte[]) newByteArray(9);
        byte[] term1462 = (byte[]) newByteArray(7);
        Object term1470 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarBuffer"));
        byte[] term1474 = (byte[]) newByteArray(6);
        byte[] term1489 = (byte[]) newByteArray(6);
        setLongField(term1436, term1436.getClass(), "currSize", -7612550318181586304L);
        setField(term1436, term1436.getClass(), "currName", "AijpHYOFuy");
        setLongField(term1436, term1436.getClass(), "currBytes", -2170847986967241072L);
        setByteElement(term1451, 0, (byte) -124);
        setByteElement(term1451, 1, (byte) -72);
        setByteElement(term1451, 2, (byte) 90);
        setByteElement(term1451, 3, (byte) -34);
        setByteElement(term1451, 4, (byte) -2);
        setByteElement(term1451, 5, (byte) 96);
        setByteElement(term1451, 6, (byte) 55);
        setByteElement(term1451, 7, (byte) -103);
        setByteElement(term1451, 8, (byte) -103);
        setField(term1436, term1436.getClass(), "recordBuf", term1451);
        setIntField(term1436, term1436.getClass(), "assemLen", 1398204340);
        setByteElement(term1462, 0, (byte) -98);
        setByteElement(term1462, 1, (byte) -119);
        setByteElement(term1462, 2, (byte) 120);
        setByteElement(term1462, 3, (byte) -15);
        setByteElement(term1462, 4, (byte) 115);
        setByteElement(term1462, 5, (byte) 52);
        setByteElement(term1462, 6, (byte) 96);
        setField(term1436, term1436.getClass(), "assemBuf", term1462);
        setField(term1470, term1470.getClass(), "inStream", null);
        setField(term1470, term1470.getClass(), "outStream", null);
        setIntField(term1470, term1470.getClass(), "blockSize", 229204365);
        setIntField(term1470, term1470.getClass(), "recordSize", -461771056);
        setIntField(term1470, term1470.getClass(), "recsPerBlock", -243422082);
        setByteElement(term1474, 0, (byte) 40);
        setByteElement(term1474, 1, (byte) -5);
        setByteElement(term1474, 2, (byte) 24);
        setByteElement(term1474, 3, (byte) -39);
        setByteElement(term1474, 4, (byte) 30);
        setByteElement(term1474, 5, (byte) -119);
        setField(term1470, term1470.getClass(), "blockBuffer", term1474);
        setIntField(term1470, term1470.getClass(), "currBlkIdx", 1384592638);
        setIntField(term1470, term1470.getClass(), "currRecIdx", -1002370457);
        setField(term1436, term1436.getClass(), "buffer", term1470);
        setIntField(term1436, term1436.getClass(), "longFileMode", -2014576105);
        setIntField(term1436, term1436.getClass(), "bigNumberMode", 1296895584);
        setBooleanField(term1436, term1436.getClass(), "closed", false);
        setBooleanField(term1436, term1436.getClass(), "haveUnclosedEntry", true);
        setBooleanField(term1436, term1436.getClass(), "finished", true);
        setField(term1436, term1436.getClass(), "out", null);
        setField(term1436, term1436.getClass(), "encoding", null);
        setBooleanField(term1436, term1436.getClass(), "addPaxHeadersForNonAsciiNames", false);
        setByteElement(term1489, 0, (byte) 94);
        setByteElement(term1489, 1, (byte) -52);
        setByteElement(term1489, 2, (byte) -33);
        setByteElement(term1489, 3, (byte) 16);
        setByteElement(term1489, 4, (byte) 20);
        setByteElement(term1489, 5, (byte) -114);
        setField(term1436, term1436.getClass(), "oneByte", term1489);
        setLongField(term1436, term1436.getClass(), "bytesWritten", 4044358158040652353L);
        Class<? extends Object> term206922 = Class.forName((String) "java.io.File$PathStatus");
        Field term206921 = ((Class) term206922).getDeclaredField((String) "INVALID");
        ((Field) term206921).setAccessible(true);
        Object enum3 = ((Field) term206921).get((Object) null);
        term1497 = newInstance(Class.forName("java.io.File"));
        setField(term1497, term1497.getClass(), "path", "SbAoxhfrkn");
        setField(term1497, term1497.getClass(), "status", enum3);
        setIntField(term1497, term1497.getClass(), "prefixLength", 628918458);
        setField(term1497, term1497.getClass(), "filePath", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.io.File");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term1497;
        args[1] = "kuTXqwMtDB";
        try {
            callMethod(klass, "createArchiveEntry", argTypes, term1436, args);
            assertTrue(false);
        }
        catch (IOException e) {
        }

    }

};


