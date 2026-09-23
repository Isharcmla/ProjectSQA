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
import java.util.LinkedHashMap;
import java.lang.Long;

public class TarArchiveOutputStream_addPaxHeaderForBigNumber_99216259961 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2277;
     Object term2310;
     Object term2439;
     Object term2441;
     Object term59867;
     Object term59873;

    public TarArchiveOutputStream_addPaxHeaderForBigNumber_99216259961() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2277 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term2292 = (byte[]) newByteArray(0);
        byte[] term2294 = (byte[]) newByteArray(2);
        byte[] term2306 = (byte[]) newByteArray(2);
        setLongField(term2277, term2277.getClass(), "currSize", -8654565919063661957L);
        setField(term2277, term2277.getClass(), "currName", "tShwQLRGNe");
        setLongField(term2277, term2277.getClass(), "currBytes", -5248475803419977214L);
        setField(term2277, term2277.getClass(), "recordBuf", term2292);
        setIntField(term2277, term2277.getClass(), "assemLen", -1882480155);
        setByteElement(term2294, 0, (byte) 110);
        setByteElement(term2294, 1, (byte) 70);
        setField(term2277, term2277.getClass(), "assemBuf", term2294);
        setIntField(term2277, term2277.getClass(), "longFileMode", -1410220680);
        setIntField(term2277, term2277.getClass(), "bigNumberMode", 389427431);
        setIntField(term2277, term2277.getClass(), "recordsWritten", -1945706126);
        setIntField(term2277, term2277.getClass(), "recordsPerBlock", 1152356969);
        setIntField(term2277, term2277.getClass(), "recordSize", -1667990367);
        setBooleanField(term2277, term2277.getClass(), "closed", true);
        setBooleanField(term2277, term2277.getClass(), "haveUnclosedEntry", true);
        setBooleanField(term2277, term2277.getClass(), "finished", true);
        setField(term2277, term2277.getClass(), "out", null);
        setField(term2277, term2277.getClass(), "zipEncoding", null);
        setBooleanField(term2277, term2277.getClass(), "addPaxHeadersForNonAsciiNames", true);
        setByteElement(term2306, 0, (byte) -46);
        setByteElement(term2306, 1, (byte) -78);
        setField(term2277, term2277.getClass(), "oneByte", term2306);
        setLongField(term2277, term2277.getClass(), "bytesWritten", -6723783499250797216L);
        term2310 = new LinkedHashMap();
        term2439 = new Long(41775768178052008L);
        term2441 = new Long(6682528376118987775L);
        term59867 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term59870 = (byte[]) newByteArray(0);
        byte[] term59871 = (byte[]) newByteArray(2);
        byte[] term59872 = (byte[]) newByteArray(2);
        setLongField(term59867, term59867.getClass(), "currSize", -8654565919063661957L);
        setField(term59867, term59867.getClass(), "currName", "tShwQLRGNe");
        setLongField(term59867, term59867.getClass(), "currBytes", -5248475803419977214L);
        setField(term59867, term59867.getClass(), "recordBuf", term59870);
        setIntField(term59867, term59867.getClass(), "assemLen", -1882480155);
        setByteElement(term59871, 0, (byte) 110);
        setByteElement(term59871, 1, (byte) 70);
        setField(term59867, term59867.getClass(), "assemBuf", term59871);
        setIntField(term59867, term59867.getClass(), "longFileMode", -1410220680);
        setIntField(term59867, term59867.getClass(), "bigNumberMode", 389427431);
        setIntField(term59867, term59867.getClass(), "recordsWritten", -1945706126);
        setIntField(term59867, term59867.getClass(), "recordsPerBlock", 1152356969);
        setIntField(term59867, term59867.getClass(), "recordSize", -1667990367);
        setBooleanField(term59867, term59867.getClass(), "closed", true);
        setBooleanField(term59867, term59867.getClass(), "haveUnclosedEntry", true);
        setBooleanField(term59867, term59867.getClass(), "finished", true);
        setField(term59867, term59867.getClass(), "out", null);
        setField(term59867, term59867.getClass(), "zipEncoding", null);
        setBooleanField(term59867, term59867.getClass(), "addPaxHeadersForNonAsciiNames", true);
        setByteElement(term59872, 0, (byte) -46);
        setByteElement(term59872, 1, (byte) -78);
        setField(term59867, term59867.getClass(), "oneByte", term59872);
        setLongField(term59867, term59867.getClass(), "bytesWritten", -6723783499250797216L);
        term59873 = new LinkedHashMap();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.util.Map");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = long.class;
        argTypes[3] = long.class;
        Object[] args = new Object[4];
        args[0] = term2310;
        args[1] = "nHXjMycHlU";
        args[2] = term2439;
        args[3] = term2441;
        callMethod(klass, "addPaxHeaderForBigNumber", argTypes, term2277, args);
        assertTrue(recursiveEquals(term2277, term59867));
        assertTrue(recursiveEquals(term2310, term59873));
        assertTrue(recursiveEquals(term2439, 41775768178052008L));
        assertTrue(recursiveEquals(term2441, 6682528376118987775L));
    }

};


