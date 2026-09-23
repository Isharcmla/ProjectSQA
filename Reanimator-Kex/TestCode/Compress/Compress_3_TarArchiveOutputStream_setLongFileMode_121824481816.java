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
     Object term51;
     Object term75558;

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
        byte[] term46 = (byte[]) newByteArray(4);
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
        setField(term7, term7.getClass(), "out", null);
        setByteElement(term46, 0, (byte) 83);
        setByteElement(term46, 1, (byte) 74);
        setByteElement(term46, 2, (byte) -71);
        setByteElement(term46, 3, (byte) 49);
        setField(term7, term7.getClass(), "oneByte", term46);
        term51 = new Integer(-522618178);
        term75558 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term75561 = (byte[]) newByteArray(5);
        byte[] term75562 = (byte[]) newByteArray(4);
        Object term75563 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarBuffer"));
        byte[] term75564 = (byte[]) newByteArray(3);
        byte[] term75565 = (byte[]) newByteArray(4);
        setLongField(term75558, term75558.getClass(), "currSize", 2442117782898005296L);
        setField(term75558, term75558.getClass(), "currName", "PAEBtnZtTD");
        setLongField(term75558, term75558.getClass(), "currBytes", 6375119433582206027L);
        setByteElement(term75561, 0, (byte) 47);
        setByteElement(term75561, 1, (byte) 48);
        setByteElement(term75561, 2, (byte) 89);
        setByteElement(term75561, 3, (byte) 75);
        setByteElement(term75561, 4, (byte) 18);
        setField(term75558, term75558.getClass(), "recordBuf", term75561);
        setIntField(term75558, term75558.getClass(), "assemLen", -1922583790);
        setByteElement(term75562, 0, (byte) -58);
        setByteElement(term75562, 1, (byte) -29);
        setByteElement(term75562, 2, (byte) -54);
        setByteElement(term75562, 3, (byte) -10);
        setField(term75558, term75558.getClass(), "assemBuf", term75562);
        setField(term75563, term75563.getClass(), "inStream", null);
        setField(term75563, term75563.getClass(), "outStream", null);
        setByteElement(term75564, 0, (byte) 79);
        setByteElement(term75564, 1, (byte) -119);
        setByteElement(term75564, 2, (byte) -66);
        setField(term75563, term75563.getClass(), "blockBuffer", term75564);
        setIntField(term75563, term75563.getClass(), "currBlkIdx", -616727354);
        setIntField(term75563, term75563.getClass(), "currRecIdx", -1955890973);
        setIntField(term75563, term75563.getClass(), "blockSize", -2038273078);
        setIntField(term75563, term75563.getClass(), "recordSize", 1227103734);
        setIntField(term75563, term75563.getClass(), "recsPerBlock", -1339778481);
        setField(term75558, term75558.getClass(), "buffer", term75563);
        setIntField(term75558, term75558.getClass(), "longFileMode", -522618178);
        setBooleanField(term75558, term75558.getClass(), "closed", false);
        setField(term75558, term75558.getClass(), "out", null);
        setByteElement(term75565, 0, (byte) 83);
        setByteElement(term75565, 1, (byte) 74);
        setByteElement(term75565, 2, (byte) -71);
        setByteElement(term75565, 3, (byte) 49);
        setField(term75558, term75558.getClass(), "oneByte", term75565);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term51;
        callMethod(klass, "setLongFileMode", argTypes, term7, args);
        assertTrue(recursiveEquals(term7, term75558));
        assertTrue(recursiveEquals(term51, -522618178));
    }

};


