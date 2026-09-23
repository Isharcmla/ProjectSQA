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

public class TarArchiveOutputStream_write_164325068050 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term715;
     Object term758;
     Object term764;
     Object term766;
     Object term56145;
     Object term56151;

    public TarArchiveOutputStream_write_164325068050() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term715 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term730 = (byte[]) newByteArray(6);
        byte[] term738 = (byte[]) newByteArray(6);
        byte[] term754 = (byte[]) newByteArray(2);
        setLongField(term715, term715.getClass(), "currSize", 6855071767938501807L);
        setField(term715, term715.getClass(), "currName", "LQFpaHEwXR");
        setLongField(term715, term715.getClass(), "currBytes", -5892135042702373494L);
        setByteElement(term730, 0, (byte) 96);
        setByteElement(term730, 1, (byte) 51);
        setByteElement(term730, 2, (byte) -53);
        setByteElement(term730, 3, (byte) -8);
        setByteElement(term730, 4, (byte) -9);
        setByteElement(term730, 5, (byte) 97);
        setField(term715, term715.getClass(), "recordBuf", term730);
        setIntField(term715, term715.getClass(), "assemLen", -1772434990);
        setByteElement(term738, 0, (byte) -46);
        setByteElement(term738, 1, (byte) 14);
        setByteElement(term738, 2, (byte) 34);
        setByteElement(term738, 3, (byte) 126);
        setByteElement(term738, 4, (byte) 7);
        setByteElement(term738, 5, (byte) -96);
        setField(term715, term715.getClass(), "assemBuf", term738);
        setIntField(term715, term715.getClass(), "longFileMode", -1845499264);
        setIntField(term715, term715.getClass(), "bigNumberMode", -505439934);
        setIntField(term715, term715.getClass(), "recordsWritten", -344842608);
        setIntField(term715, term715.getClass(), "recordsPerBlock", 941650513);
        setIntField(term715, term715.getClass(), "recordSize", 444029505);
        setBooleanField(term715, term715.getClass(), "closed", false);
        setBooleanField(term715, term715.getClass(), "haveUnclosedEntry", true);
        setBooleanField(term715, term715.getClass(), "finished", true);
        setField(term715, term715.getClass(), "out", null);
        setField(term715, term715.getClass(), "zipEncoding", null);
        setBooleanField(term715, term715.getClass(), "addPaxHeadersForNonAsciiNames", false);
        setByteElement(term754, 0, (byte) -22);
        setByteElement(term754, 1, (byte) -5);
        setField(term715, term715.getClass(), "oneByte", term754);
        setLongField(term715, term715.getClass(), "bytesWritten", 5262507301787091109L);
        term758 = (byte[]) newByteArray(5);
        setByteElement(term758, 0, (byte) -124);
        setByteElement(term758, 1, (byte) -105);
        setByteElement(term758, 2, (byte) 25);
        setByteElement(term758, 3, (byte) 16);
        setByteElement(term758, 4, (byte) 39);
        term764 = new Integer(-1034506028);
        term766 = new Integer(-1263114719);
        term56145 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term56148 = (byte[]) newByteArray(6);
        byte[] term56149 = (byte[]) newByteArray(6);
        byte[] term56150 = (byte[]) newByteArray(2);
        setLongField(term56145, term56145.getClass(), "currSize", 6855071767938501807L);
        setField(term56145, term56145.getClass(), "currName", "LQFpaHEwXR");
        setLongField(term56145, term56145.getClass(), "currBytes", -5892135042702373494L);
        setByteElement(term56148, 0, (byte) 96);
        setByteElement(term56148, 1, (byte) 51);
        setByteElement(term56148, 2, (byte) -53);
        setByteElement(term56148, 3, (byte) -8);
        setByteElement(term56148, 4, (byte) -9);
        setByteElement(term56148, 5, (byte) 97);
        setField(term56145, term56145.getClass(), "recordBuf", term56148);
        setIntField(term56145, term56145.getClass(), "assemLen", -1772434990);
        setByteElement(term56149, 0, (byte) -46);
        setByteElement(term56149, 1, (byte) 14);
        setByteElement(term56149, 2, (byte) 34);
        setByteElement(term56149, 3, (byte) 126);
        setByteElement(term56149, 4, (byte) 7);
        setByteElement(term56149, 5, (byte) -96);
        setField(term56145, term56145.getClass(), "assemBuf", term56149);
        setIntField(term56145, term56145.getClass(), "longFileMode", -1845499264);
        setIntField(term56145, term56145.getClass(), "bigNumberMode", -505439934);
        setIntField(term56145, term56145.getClass(), "recordsWritten", -344842608);
        setIntField(term56145, term56145.getClass(), "recordsPerBlock", 941650513);
        setIntField(term56145, term56145.getClass(), "recordSize", 444029505);
        setBooleanField(term56145, term56145.getClass(), "closed", false);
        setBooleanField(term56145, term56145.getClass(), "haveUnclosedEntry", true);
        setBooleanField(term56145, term56145.getClass(), "finished", true);
        setField(term56145, term56145.getClass(), "out", null);
        setField(term56145, term56145.getClass(), "zipEncoding", null);
        setBooleanField(term56145, term56145.getClass(), "addPaxHeadersForNonAsciiNames", false);
        setByteElement(term56150, 0, (byte) -22);
        setByteElement(term56150, 1, (byte) -5);
        setField(term56145, term56145.getClass(), "oneByte", term56150);
        setLongField(term56145, term56145.getClass(), "bytesWritten", 5262507301787091109L);
        term56151 = (byte[]) newByteArray(5);
        setByteElement(term56151, 0, (byte) -124);
        setByteElement(term56151, 1, (byte) -105);
        setByteElement(term56151, 2, (byte) 25);
        setByteElement(term56151, 3, (byte) 16);
        setByteElement(term56151, 4, (byte) 39);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term758;
        args[1] = term764;
        args[2] = term766;
        callMethod(klass, "write", argTypes, term715, args);
        assertTrue(recursiveEquals(term715, term56145));
        assertTrue(recursiveEquals(term758, term56151));
        assertTrue(recursiveEquals(term764, -1034506028));
        assertTrue(recursiveEquals(term766, -1263114719));
    }

};


