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
import java.lang.Character;

public class TarArchiveOutputStream_shouldBeReplaced_193959686119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1274;
     Object term1309;

    public TarArchiveOutputStream_shouldBeReplaced_193959686119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1274 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term1289 = (byte[]) newByteArray(0);
        byte[] term1291 = (byte[]) newByteArray(1);
        byte[] term1302 = (byte[]) newByteArray(5);
        setLongField(term1274, term1274.getClass(), "currSize", -6292278961887936280L);
        setField(term1274, term1274.getClass(), "currName", "OclPbYPkcH");
        setLongField(term1274, term1274.getClass(), "currBytes", -6645965768855543712L);
        setField(term1274, term1274.getClass(), "recordBuf", term1289);
        setIntField(term1274, term1274.getClass(), "assemLen", 1861318859);
        setByteElement(term1291, 0, (byte) -123);
        setField(term1274, term1274.getClass(), "assemBuf", term1291);
        setIntField(term1274, term1274.getClass(), "longFileMode", 1474524152);
        setIntField(term1274, term1274.getClass(), "bigNumberMode", 568954359);
        setIntField(term1274, term1274.getClass(), "recordsWritten", 53410913);
        setIntField(term1274, term1274.getClass(), "recordsPerBlock", -375014958);
        setIntField(term1274, term1274.getClass(), "recordSize", 1107176718);
        setBooleanField(term1274, term1274.getClass(), "closed", false);
        setBooleanField(term1274, term1274.getClass(), "haveUnclosedEntry", false);
        setBooleanField(term1274, term1274.getClass(), "finished", true);
        setField(term1274, term1274.getClass(), "out", null);
        setField(term1274, term1274.getClass(), "zipEncoding", null);
        setBooleanField(term1274, term1274.getClass(), "addPaxHeadersForNonAsciiNames", false);
        setByteElement(term1302, 0, (byte) -76);
        setByteElement(term1302, 1, (byte) -115);
        setByteElement(term1302, 2, (byte) -48);
        setByteElement(term1302, 3, (byte) 126);
        setByteElement(term1302, 4, (byte) -2);
        setField(term1274, term1274.getClass(), "oneByte", term1302);
        setLongField(term1274, term1274.getClass(), "bytesWritten", 4784595517102746672L);
        term1309 = new Character('P');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = char.class;
        Object[] args = new Object[1];
        args[0] = term1309;
        callMethod(klass, "shouldBeReplaced", argTypes, term1274, args);
    }

};


