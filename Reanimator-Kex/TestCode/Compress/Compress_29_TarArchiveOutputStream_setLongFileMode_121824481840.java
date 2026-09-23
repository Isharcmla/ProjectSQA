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
import java.lang.Integer;

public class TarArchiveOutputStream_setLongFileMode_121824481840 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term79;
     Object term120;
     Object term54153;

    public TarArchiveOutputStream_setLongFileMode_121824481840() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term79 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term94 = (byte[]) newByteArray(5);
        byte[] term101 = (byte[]) newByteArray(4);
        byte[] term115 = (byte[]) newByteArray(3);
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
        setIntField(term79, term79.getClass(), "longFileMode", -1339778481);
        setIntField(term79, term79.getClass(), "bigNumberMode", 1725571209);
        setIntField(term79, term79.getClass(), "recordsWritten", -522618178);
        setIntField(term79, term79.getClass(), "recordsPerBlock", 1134449235);
        setIntField(term79, term79.getClass(), "recordSize", -883034806);
        setBooleanField(term79, term79.getClass(), "closed", false);
        setBooleanField(term79, term79.getClass(), "haveUnclosedEntry", false);
        setBooleanField(term79, term79.getClass(), "finished", false);
        setField(term79, term79.getClass(), "out", null);
        setField(term79, term79.getClass(), "zipEncoding", null);
        setBooleanField(term79, term79.getClass(), "addPaxHeadersForNonAsciiNames", false);
        setByteElement(term115, 0, (byte) 79);
        setByteElement(term115, 1, (byte) -119);
        setByteElement(term115, 2, (byte) -66);
        setField(term79, term79.getClass(), "oneByte", term115);
        setLongField(term79, term79.getClass(), "bytesWritten", -8257434502486459194L);
        term120 = new Integer(1585847225);
        term54153 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term54156 = (byte[]) newByteArray(5);
        byte[] term54157 = (byte[]) newByteArray(4);
        byte[] term54158 = (byte[]) newByteArray(3);
        setLongField(term54153, term54153.getClass(), "currSize", 2442117782898005296L);
        setField(term54153, term54153.getClass(), "currName", "xxtlPwDYFs");
        setLongField(term54153, term54153.getClass(), "currBytes", 6375119433582206027L);
        setByteElement(term54156, 0, (byte) 47);
        setByteElement(term54156, 1, (byte) 48);
        setByteElement(term54156, 2, (byte) 89);
        setByteElement(term54156, 3, (byte) 75);
        setByteElement(term54156, 4, (byte) 18);
        setField(term54153, term54153.getClass(), "recordBuf", term54156);
        setIntField(term54153, term54153.getClass(), "assemLen", 1227103734);
        setByteElement(term54157, 0, (byte) -58);
        setByteElement(term54157, 1, (byte) -29);
        setByteElement(term54157, 2, (byte) -54);
        setByteElement(term54157, 3, (byte) -10);
        setField(term54153, term54153.getClass(), "assemBuf", term54157);
        setIntField(term54153, term54153.getClass(), "longFileMode", 1585847225);
        setIntField(term54153, term54153.getClass(), "bigNumberMode", 1725571209);
        setIntField(term54153, term54153.getClass(), "recordsWritten", -522618178);
        setIntField(term54153, term54153.getClass(), "recordsPerBlock", 1134449235);
        setIntField(term54153, term54153.getClass(), "recordSize", -883034806);
        setBooleanField(term54153, term54153.getClass(), "closed", false);
        setBooleanField(term54153, term54153.getClass(), "haveUnclosedEntry", false);
        setBooleanField(term54153, term54153.getClass(), "finished", false);
        setField(term54153, term54153.getClass(), "out", null);
        setField(term54153, term54153.getClass(), "zipEncoding", null);
        setBooleanField(term54153, term54153.getClass(), "addPaxHeadersForNonAsciiNames", false);
        setByteElement(term54158, 0, (byte) 79);
        setByteElement(term54158, 1, (byte) -119);
        setByteElement(term54158, 2, (byte) -66);
        setField(term54153, term54153.getClass(), "oneByte", term54158);
        setLongField(term54153, term54153.getClass(), "bytesWritten", -8257434502486459194L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term120;
        callMethod(klass, "setLongFileMode", argTypes, term79, args);
        assertTrue(recursiveEquals(term79, term54153));
        assertTrue(recursiveEquals(term120, 1585847225));
    }

};


