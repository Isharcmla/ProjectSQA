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

public class TarArchiveOutputStream_setLongFileMode_121824481816 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7;
     Object term52;
     Object term75572;

    public TarArchiveOutputStream_setLongFileMode_121824481816() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term22 = (byte[]) newByteArray(5);
        byte[] term29 = (byte[]) newByteArray(4);
        Object term34 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarBuffer"));
        byte[] term35 = (byte[]) newByteArray(3);
        byte[] term47 = (byte[]) newByteArray(4);
        setLongField(term7, term7.getClass(), "currSize", 2442117782898005296L);
        setField(term7, term7.getClass(), "currName", "PAEBtnZtTD");
        setLongField(term7, term7.getClass(), "currBytes", 6375119433582206027L);
        setByteElement(term22, 0, (byte) 47);
        setByteElement(term22, 1, (byte) 48);
        setByteElement(term22, 2, (byte) 89);
        setByteElement(term22, 3, (byte) 75);
        setByteElement(term22, 4, (byte) 18);
        setField(term7, term7.getClass(), "recordBuf", term22);
        setIntField(term7, term7.getClass(), "assemLen", -1922583790);
        setByteElement(term29, 0, (byte) -58);
        setByteElement(term29, 1, (byte) -29);
        setByteElement(term29, 2, (byte) -54);
        setByteElement(term29, 3, (byte) -10);
        setField(term7, term7.getClass(), "assemBuf", term29);
        setField(term34, term34.getClass(), "inStream", null);
        setField(term34, term34.getClass(), "outStream", null);
        setByteElement(term35, 0, (byte) 79);
        setByteElement(term35, 1, (byte) -119);
        setByteElement(term35, 2, (byte) -66);
        setField(term34, term34.getClass(), "blockBuffer", term35);
        setIntField(term34, term34.getClass(), "currBlkIdx", -616727354);
        setIntField(term34, term34.getClass(), "currRecIdx", -1955890973);
        setIntField(term34, term34.getClass(), "blockSize", -2038273078);
        setIntField(term34, term34.getClass(), "recordSize", 1227103734);
        setIntField(term34, term34.getClass(), "recsPerBlock", -1339778481);
        setField(term7, term7.getClass(), "buffer", term34);
        setIntField(term7, term7.getClass(), "longFileMode", 1725571209);
        setBooleanField(term7, term7.getClass(), "closed", false);
        setBooleanField(term7, term7.getClass(), "haveUnclosedEntry", false);
        setField(term7, term7.getClass(), "out", null);
        setByteElement(term47, 0, (byte) 83);
        setByteElement(term47, 1, (byte) 74);
        setByteElement(term47, 2, (byte) -71);
        setByteElement(term47, 3, (byte) 49);
        setField(term7, term7.getClass(), "oneByte", term47);
        term52 = new Integer(-522618178);
        term75572 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term75575 = (byte[]) newByteArray(5);
        byte[] term75576 = (byte[]) newByteArray(4);
        Object term75577 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarBuffer"));
        byte[] term75578 = (byte[]) newByteArray(3);
        byte[] term75579 = (byte[]) newByteArray(4);
        setLongField(term75572, term75572.getClass(), "currSize", 2442117782898005296L);
        setField(term75572, term75572.getClass(), "currName", "PAEBtnZtTD");
        setLongField(term75572, term75572.getClass(), "currBytes", 6375119433582206027L);
        setByteElement(term75575, 0, (byte) 47);
        setByteElement(term75575, 1, (byte) 48);
        setByteElement(term75575, 2, (byte) 89);
        setByteElement(term75575, 3, (byte) 75);
        setByteElement(term75575, 4, (byte) 18);
        setField(term75572, term75572.getClass(), "recordBuf", term75575);
        setIntField(term75572, term75572.getClass(), "assemLen", -1922583790);
        setByteElement(term75576, 0, (byte) -58);
        setByteElement(term75576, 1, (byte) -29);
        setByteElement(term75576, 2, (byte) -54);
        setByteElement(term75576, 3, (byte) -10);
        setField(term75572, term75572.getClass(), "assemBuf", term75576);
        setField(term75577, term75577.getClass(), "inStream", null);
        setField(term75577, term75577.getClass(), "outStream", null);
        setByteElement(term75578, 0, (byte) 79);
        setByteElement(term75578, 1, (byte) -119);
        setByteElement(term75578, 2, (byte) -66);
        setField(term75577, term75577.getClass(), "blockBuffer", term75578);
        setIntField(term75577, term75577.getClass(), "currBlkIdx", -616727354);
        setIntField(term75577, term75577.getClass(), "currRecIdx", -1955890973);
        setIntField(term75577, term75577.getClass(), "blockSize", -2038273078);
        setIntField(term75577, term75577.getClass(), "recordSize", 1227103734);
        setIntField(term75577, term75577.getClass(), "recsPerBlock", -1339778481);
        setField(term75572, term75572.getClass(), "buffer", term75577);
        setIntField(term75572, term75572.getClass(), "longFileMode", -522618178);
        setBooleanField(term75572, term75572.getClass(), "closed", false);
        setBooleanField(term75572, term75572.getClass(), "haveUnclosedEntry", false);
        setField(term75572, term75572.getClass(), "out", null);
        setByteElement(term75579, 0, (byte) 83);
        setByteElement(term75579, 1, (byte) 74);
        setByteElement(term75579, 2, (byte) -71);
        setByteElement(term75579, 3, (byte) 49);
        setField(term75572, term75572.getClass(), "oneByte", term75579);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term52;
        callMethod(klass, "setLongFileMode", argTypes, term7, args);
        assertTrue(recursiveEquals(term7, term75572));
        assertTrue(recursiveEquals(term52, -522618178));
    }

};


