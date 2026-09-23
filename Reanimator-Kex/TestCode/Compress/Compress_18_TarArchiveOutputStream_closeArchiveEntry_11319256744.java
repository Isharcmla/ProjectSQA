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

public class TarArchiveOutputStream_closeArchiveEntry_11319256744 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term766;
     Object term205193;

    public TarArchiveOutputStream_closeArchiveEntry_11319256744() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term766 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term781 = (byte[]) newByteArray(5);
        byte[] term788 = (byte[]) newByteArray(1);
        Object term790 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarBuffer"));
        byte[] term794 = (byte[]) newByteArray(0);
        byte[] term803 = (byte[]) newByteArray(9);
        setLongField(term766, term766.getClass(), "currSize", -4502405999831680926L);
        setField(term766, term766.getClass(), "currName", "MxlszYVzRf");
        setLongField(term766, term766.getClass(), "currBytes", 1967728129628047933L);
        setByteElement(term781, 0, (byte) -1);
        setByteElement(term781, 1, (byte) 117);
        setByteElement(term781, 2, (byte) 43);
        setByteElement(term781, 3, (byte) -27);
        setByteElement(term781, 4, (byte) 34);
        setField(term766, term766.getClass(), "recordBuf", term781);
        setIntField(term766, term766.getClass(), "assemLen", -1347665717);
        setByteElement(term788, 0, (byte) -126);
        setField(term766, term766.getClass(), "assemBuf", term788);
        setField(term790, term790.getClass(), "inStream", null);
        setField(term790, term790.getClass(), "outStream", null);
        setIntField(term790, term790.getClass(), "blockSize", -1888585309);
        setIntField(term790, term790.getClass(), "recordSize", 683666002);
        setIntField(term790, term790.getClass(), "recsPerBlock", 1596213415);
        setField(term790, term790.getClass(), "blockBuffer", term794);
        setIntField(term790, term790.getClass(), "currBlkIdx", -268815336);
        setIntField(term790, term790.getClass(), "currRecIdx", -1210583429);
        setField(term766, term766.getClass(), "buffer", term790);
        setIntField(term766, term766.getClass(), "longFileMode", -663691365);
        setIntField(term766, term766.getClass(), "bigNumberMode", 339854490);
        setBooleanField(term766, term766.getClass(), "closed", true);
        setBooleanField(term766, term766.getClass(), "haveUnclosedEntry", true);
        setBooleanField(term766, term766.getClass(), "finished", false);
        setField(term766, term766.getClass(), "out", null);
        setField(term766, term766.getClass(), "encoding", null);
        setBooleanField(term766, term766.getClass(), "addPaxHeadersForNonAsciiNames", false);
        setByteElement(term803, 0, (byte) 12);
        setByteElement(term803, 1, (byte) -75);
        setByteElement(term803, 2, (byte) 69);
        setByteElement(term803, 3, (byte) -6);
        setByteElement(term803, 4, (byte) 107);
        setByteElement(term803, 5, (byte) -109);
        setByteElement(term803, 6, (byte) 122);
        setByteElement(term803, 7, (byte) 83);
        setByteElement(term803, 8, (byte) -123);
        setField(term766, term766.getClass(), "oneByte", term803);
        setLongField(term766, term766.getClass(), "bytesWritten", 2120084523938730454L);
        term205193 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term205196 = (byte[]) newByteArray(5);
        byte[] term205197 = (byte[]) newByteArray(1);
        Object term205198 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarBuffer"));
        byte[] term205199 = (byte[]) newByteArray(0);
        byte[] term205200 = (byte[]) newByteArray(9);
        setLongField(term205193, term205193.getClass(), "currSize", -4502405999831680926L);
        setField(term205193, term205193.getClass(), "currName", "MxlszYVzRf");
        setLongField(term205193, term205193.getClass(), "currBytes", 1967728129628047933L);
        setByteElement(term205196, 0, (byte) -1);
        setByteElement(term205196, 1, (byte) 117);
        setByteElement(term205196, 2, (byte) 43);
        setByteElement(term205196, 3, (byte) -27);
        setByteElement(term205196, 4, (byte) 34);
        setField(term205193, term205193.getClass(), "recordBuf", term205196);
        setIntField(term205193, term205193.getClass(), "assemLen", -1347665717);
        setByteElement(term205197, 0, (byte) -126);
        setField(term205193, term205193.getClass(), "assemBuf", term205197);
        setField(term205198, term205198.getClass(), "inStream", null);
        setField(term205198, term205198.getClass(), "outStream", null);
        setIntField(term205198, term205198.getClass(), "blockSize", -1888585309);
        setIntField(term205198, term205198.getClass(), "recordSize", 683666002);
        setIntField(term205198, term205198.getClass(), "recsPerBlock", 1596213415);
        setField(term205198, term205198.getClass(), "blockBuffer", term205199);
        setIntField(term205198, term205198.getClass(), "currBlkIdx", -268815336);
        setIntField(term205198, term205198.getClass(), "currRecIdx", -1210583429);
        setField(term205193, term205193.getClass(), "buffer", term205198);
        setIntField(term205193, term205193.getClass(), "longFileMode", -663691365);
        setIntField(term205193, term205193.getClass(), "bigNumberMode", 339854490);
        setBooleanField(term205193, term205193.getClass(), "closed", true);
        setBooleanField(term205193, term205193.getClass(), "haveUnclosedEntry", false);
        setBooleanField(term205193, term205193.getClass(), "finished", false);
        setField(term205193, term205193.getClass(), "out", null);
        setField(term205193, term205193.getClass(), "encoding", null);
        setBooleanField(term205193, term205193.getClass(), "addPaxHeadersForNonAsciiNames", false);
        setByteElement(term205200, 0, (byte) 12);
        setByteElement(term205200, 1, (byte) -75);
        setByteElement(term205200, 2, (byte) 69);
        setByteElement(term205200, 3, (byte) -6);
        setByteElement(term205200, 4, (byte) 107);
        setByteElement(term205200, 5, (byte) -109);
        setByteElement(term205200, 6, (byte) 122);
        setByteElement(term205200, 7, (byte) 83);
        setByteElement(term205200, 8, (byte) -123);
        setField(term205193, term205193.getClass(), "oneByte", term205200);
        setLongField(term205193, term205193.getClass(), "bytesWritten", 2120084523938730454L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "closeArchiveEntry", argTypes, term766, args);
        assertTrue(recursiveEquals(term766, term205193));
    }

};


