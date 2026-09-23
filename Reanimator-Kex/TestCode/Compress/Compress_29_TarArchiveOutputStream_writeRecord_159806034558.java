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
import java.lang.NullPointerException;
import static org.apache.commons.compress.archivers.tar.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class TarArchiveOutputStream_writeRecord_159806034558 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1776;
     Object term1818;
     Object term1819;

    public TarArchiveOutputStream_writeRecord_159806034558() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1776 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term1791 = (byte[]) newByteArray(9);
        byte[] term1802 = (byte[]) newByteArray(0);
        byte[] term1812 = (byte[]) newByteArray(4);
        setLongField(term1776, term1776.getClass(), "currSize", 3825396310311739952L);
        setField(term1776, term1776.getClass(), "currName", "kuTXqwMtDB");
        setLongField(term1776, term1776.getClass(), "currBytes", -3838084482494604218L);
        setByteElement(term1791, 0, (byte) -90);
        setByteElement(term1791, 1, (byte) -27);
        setByteElement(term1791, 2, (byte) 119);
        setByteElement(term1791, 3, (byte) -125);
        setByteElement(term1791, 4, (byte) 100);
        setByteElement(term1791, 5, (byte) -1);
        setByteElement(term1791, 6, (byte) -127);
        setByteElement(term1791, 7, (byte) -118);
        setByteElement(term1791, 8, (byte) 69);
        setField(term1776, term1776.getClass(), "recordBuf", term1791);
        setIntField(term1776, term1776.getClass(), "assemLen", 229204365);
        setField(term1776, term1776.getClass(), "assemBuf", term1802);
        setIntField(term1776, term1776.getClass(), "longFileMode", -461771056);
        setIntField(term1776, term1776.getClass(), "bigNumberMode", -243422082);
        setIntField(term1776, term1776.getClass(), "recordsWritten", 1384592638);
        setIntField(term1776, term1776.getClass(), "recordsPerBlock", -1002370457);
        setIntField(term1776, term1776.getClass(), "recordSize", -2014576105);
        setBooleanField(term1776, term1776.getClass(), "closed", false);
        setBooleanField(term1776, term1776.getClass(), "haveUnclosedEntry", true);
        setBooleanField(term1776, term1776.getClass(), "finished", false);
        setField(term1776, term1776.getClass(), "out", null);
        setField(term1776, term1776.getClass(), "zipEncoding", null);
        setBooleanField(term1776, term1776.getClass(), "addPaxHeadersForNonAsciiNames", false);
        setByteElement(term1812, 0, (byte) 112);
        setByteElement(term1812, 1, (byte) 77);
        setByteElement(term1812, 2, (byte) -1);
        setByteElement(term1812, 3, (byte) -83);
        setField(term1776, term1776.getClass(), "oneByte", term1812);
        setLongField(term1776, term1776.getClass(), "bytesWritten", 3892018155439224435L);
        term1818 = (byte[]) newByteArray(0);
        term1819 = new Integer(1296895584);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term1818;
        args[1] = term1819;
        try {
            callMethod(klass, "writeRecord", argTypes, term1776, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


