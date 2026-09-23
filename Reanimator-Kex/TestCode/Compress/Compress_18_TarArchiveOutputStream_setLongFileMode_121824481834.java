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
import static org.apache.commons.compress.archivers.tar.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.compress.archivers.tar.EqualityUtils.*;
import java.lang.Object;
import java.lang.Integer;

public class TarArchiveOutputStream_setLongFileMode_121824481834 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term79;
     Object term128;
     Object term202936;

    public TarArchiveOutputStream_setLongFileMode_121824481834() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term79 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term94 = (byte[]) newByteArray(5);
        byte[] term101 = (byte[]) newByteArray(4);
        Object term106 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarBuffer"));
        byte[] term110 = (byte[]) newByteArray(3);
        byte[] term122 = (byte[]) newByteArray(4);
        setLongField(term79, term79.getClass(), "currSize", 2442117782898005296L);
        setField(term79, term79.getClass(), "currName", "xxtlPwDYFs");
        setLongField(term79, term79.getClass(), "currBytes", 6375119433582206027L);
        setByteElement(term94, 0, (byte) 47);
        setByteElement(term94, 1, (byte) 48);
        setByteElement(term94, 2, (byte) 89);
        setByteElement(term94, 3, (byte) 75);
        setByteElement(term94, 4, (byte) 18);
        setField(term79, term79.getClass(), "recordBuf", term94);
        setIntField(term79, term79.getClass(), "assemLen", 1227103734);
        setByteElement(term101, 0, (byte) -58);
        setByteElement(term101, 1, (byte) -29);
        setByteElement(term101, 2, (byte) -54);
        setByteElement(term101, 3, (byte) -10);
        setField(term79, term79.getClass(), "assemBuf", term101);
        setField(term106, term106.getClass(), "inStream", null);
        setField(term106, term106.getClass(), "outStream", null);
        setIntField(term106, term106.getClass(), "blockSize", -1339778481);
        setIntField(term106, term106.getClass(), "recordSize", 1725571209);
        setIntField(term106, term106.getClass(), "recsPerBlock", -522618178);
        setByteElement(term110, 0, (byte) 79);
        setByteElement(term110, 1, (byte) -119);
        setByteElement(term110, 2, (byte) -66);
        setField(term106, term106.getClass(), "blockBuffer", term110);
        setIntField(term106, term106.getClass(), "currBlkIdx", 1134449235);
        setIntField(term106, term106.getClass(), "currRecIdx", -883034806);
        setField(term79, term79.getClass(), "buffer", term106);
        setIntField(term79, term79.getClass(), "longFileMode", 1585847225);
        setIntField(term79, term79.getClass(), "bigNumberMode", 597278769);
        setBooleanField(term79, term79.getClass(), "closed", false);
        setBooleanField(term79, term79.getClass(), "haveUnclosedEntry", false);
        setBooleanField(term79, term79.getClass(), "finished", false);
        setField(term79, term79.getClass(), "out", null);
        setField(term79, term79.getClass(), "encoding", null);
        setBooleanField(term79, term79.getClass(), "addPaxHeadersForNonAsciiNames", false);
        setByteElement(term122, 0, (byte) 83);
        setByteElement(term122, 1, (byte) 74);
        setByteElement(term122, 2, (byte) -71);
        setByteElement(term122, 3, (byte) 49);
        setField(term79, term79.getClass(), "oneByte", term122);
        setLongField(term79, term79.getClass(), "bytesWritten", -8257434502486459194L);
        term128 = new Integer(-1685132342);
        term202936 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term202939 = (byte[]) newByteArray(5);
        byte[] term202940 = (byte[]) newByteArray(4);
        Object term202941 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarBuffer"));
        byte[] term202942 = (byte[]) newByteArray(3);
        byte[] term202943 = (byte[]) newByteArray(4);
        setLongField(term202936, term202936.getClass(), "currSize", 2442117782898005296L);
        setField(term202936, term202936.getClass(), "currName", "xxtlPwDYFs");
        setLongField(term202936, term202936.getClass(), "currBytes", 6375119433582206027L);
        setByteElement(term202939, 0, (byte) 47);
        setByteElement(term202939, 1, (byte) 48);
        setByteElement(term202939, 2, (byte) 89);
        setByteElement(term202939, 3, (byte) 75);
        setByteElement(term202939, 4, (byte) 18);
        setField(term202936, term202936.getClass(), "recordBuf", term202939);
        setIntField(term202936, term202936.getClass(), "assemLen", 1227103734);
        setByteElement(term202940, 0, (byte) -58);
        setByteElement(term202940, 1, (byte) -29);
        setByteElement(term202940, 2, (byte) -54);
        setByteElement(term202940, 3, (byte) -10);
        setField(term202936, term202936.getClass(), "assemBuf", term202940);
        setField(term202941, term202941.getClass(), "inStream", null);
        setField(term202941, term202941.getClass(), "outStream", null);
        setIntField(term202941, term202941.getClass(), "blockSize", -1339778481);
        setIntField(term202941, term202941.getClass(), "recordSize", 1725571209);
        setIntField(term202941, term202941.getClass(), "recsPerBlock", -522618178);
        setByteElement(term202942, 0, (byte) 79);
        setByteElement(term202942, 1, (byte) -119);
        setByteElement(term202942, 2, (byte) -66);
        setField(term202941, term202941.getClass(), "blockBuffer", term202942);
        setIntField(term202941, term202941.getClass(), "currBlkIdx", 1134449235);
        setIntField(term202941, term202941.getClass(), "currRecIdx", -883034806);
        setField(term202936, term202936.getClass(), "buffer", term202941);
        setIntField(term202936, term202936.getClass(), "longFileMode", -1685132342);
        setIntField(term202936, term202936.getClass(), "bigNumberMode", 597278769);
        setBooleanField(term202936, term202936.getClass(), "closed", false);
        setBooleanField(term202936, term202936.getClass(), "haveUnclosedEntry", false);
        setBooleanField(term202936, term202936.getClass(), "finished", false);
        setField(term202936, term202936.getClass(), "out", null);
        setField(term202936, term202936.getClass(), "encoding", null);
        setBooleanField(term202936, term202936.getClass(), "addPaxHeadersForNonAsciiNames", false);
        setByteElement(term202943, 0, (byte) 83);
        setByteElement(term202943, 1, (byte) 74);
        setByteElement(term202943, 2, (byte) -71);
        setByteElement(term202943, 3, (byte) 49);
        setField(term202936, term202936.getClass(), "oneByte", term202943);
        setLongField(term202936, term202936.getClass(), "bytesWritten", -8257434502486459194L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term128;
        callMethod(klass, "setLongFileMode", argTypes, term79, args);
        assertTrue(recursiveEquals(term79, term202936));
        assertTrue(recursiveEquals(term128, -1685132342));
    }

};


