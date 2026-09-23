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

public class TarArchiveOutputStream_stripTo7Bits_65758611918 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1197;

    public TarArchiveOutputStream_stripTo7Bits_65758611918() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1197 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term1212 = (byte[]) newByteArray(0);
        byte[] term1214 = (byte[]) newByteArray(8);
        byte[] term1232 = (byte[]) newByteArray(0);
        setLongField(term1197, term1197.getClass(), "currSize", 5907001541142728739L);
        setField(term1197, term1197.getClass(), "currName", "vrQLuWIDJX");
        setLongField(term1197, term1197.getClass(), "currBytes", 4178434741742309755L);
        setField(term1197, term1197.getClass(), "recordBuf", term1212);
        setIntField(term1197, term1197.getClass(), "assemLen", 890669485);
        setByteElement(term1214, 0, (byte) 12);
        setByteElement(term1214, 1, (byte) -75);
        setByteElement(term1214, 2, (byte) 69);
        setByteElement(term1214, 3, (byte) -6);
        setByteElement(term1214, 4, (byte) 107);
        setByteElement(term1214, 5, (byte) -109);
        setByteElement(term1214, 6, (byte) 122);
        setByteElement(term1214, 7, (byte) 83);
        setField(term1197, term1197.getClass(), "assemBuf", term1214);
        setIntField(term1197, term1197.getClass(), "longFileMode", 691577392);
        setIntField(term1197, term1197.getClass(), "bigNumberMode", -893623680);
        setIntField(term1197, term1197.getClass(), "recordsWritten", -1963434938);
        setIntField(term1197, term1197.getClass(), "recordsPerBlock", 906181092);
        setIntField(term1197, term1197.getClass(), "recordSize", 1045657203);
        setBooleanField(term1197, term1197.getClass(), "closed", false);
        setBooleanField(term1197, term1197.getClass(), "haveUnclosedEntry", true);
        setBooleanField(term1197, term1197.getClass(), "finished", false);
        setField(term1197, term1197.getClass(), "out", null);
        setField(term1197, term1197.getClass(), "zipEncoding", null);
        setBooleanField(term1197, term1197.getClass(), "addPaxHeadersForNonAsciiNames", true);
        setField(term1197, term1197.getClass(), "oneByte", term1232);
        setLongField(term1197, term1197.getClass(), "bytesWritten", -2068172595987555756L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "flxyYxBRtu";
        callMethod(klass, "stripTo7Bits", argTypes, term1197, args);
    }

};


