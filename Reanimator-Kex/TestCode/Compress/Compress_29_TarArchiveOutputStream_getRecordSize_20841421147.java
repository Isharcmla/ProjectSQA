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

public class TarArchiveOutputStream_getRecordSize_20841421147 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term516;
     Object term55632;

    public TarArchiveOutputStream_getRecordSize_20841421147() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term516 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term531 = (byte[]) newByteArray(1);
        byte[] term534 = (byte[]) newByteArray(9);
        byte[] term553 = (byte[]) newByteArray(3);
        setLongField(term516, term516.getClass(), "currSize", -2585684163342970173L);
        setField(term516, term516.getClass(), "currName", "NRdvgJlhkX");
        setLongField(term516, term516.getClass(), "currBytes", 8059786003080744426L);
        setByteElement(term531, 0, (byte) 35);
        setField(term516, term516.getClass(), "recordBuf", term531);
        setIntField(term516, term516.getClass(), "assemLen", -1588772968);
        setByteElement(term534, 0, (byte) 66);
        setByteElement(term534, 1, (byte) 123);
        setByteElement(term534, 2, (byte) -5);
        setByteElement(term534, 3, (byte) 84);
        setByteElement(term534, 4, (byte) -97);
        setByteElement(term534, 5, (byte) -24);
        setByteElement(term534, 6, (byte) 88);
        setByteElement(term534, 7, (byte) 96);
        setByteElement(term534, 8, (byte) 70);
        setField(term516, term516.getClass(), "assemBuf", term534);
        setIntField(term516, term516.getClass(), "longFileMode", -93135961);
        setIntField(term516, term516.getClass(), "bigNumberMode", -112921587);
        setIntField(term516, term516.getClass(), "recordsWritten", 933028652);
        setIntField(term516, term516.getClass(), "recordsPerBlock", 287287233);
        setIntField(term516, term516.getClass(), "recordSize", 962840079);
        setBooleanField(term516, term516.getClass(), "closed", true);
        setBooleanField(term516, term516.getClass(), "haveUnclosedEntry", true);
        setBooleanField(term516, term516.getClass(), "finished", true);
        setField(term516, term516.getClass(), "out", null);
        setField(term516, term516.getClass(), "zipEncoding", null);
        setBooleanField(term516, term516.getClass(), "addPaxHeadersForNonAsciiNames", true);
        setByteElement(term553, 0, (byte) 48);
        setByteElement(term553, 1, (byte) -46);
        setByteElement(term553, 2, (byte) -128);
        setField(term516, term516.getClass(), "oneByte", term553);
        setLongField(term516, term516.getClass(), "bytesWritten", -4365849114644724155L);
        term55632 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term55635 = (byte[]) newByteArray(1);
        byte[] term55636 = (byte[]) newByteArray(9);
        byte[] term55637 = (byte[]) newByteArray(3);
        setLongField(term55632, term55632.getClass(), "currSize", -2585684163342970173L);
        setField(term55632, term55632.getClass(), "currName", "NRdvgJlhkX");
        setLongField(term55632, term55632.getClass(), "currBytes", 8059786003080744426L);
        setByteElement(term55635, 0, (byte) 35);
        setField(term55632, term55632.getClass(), "recordBuf", term55635);
        setIntField(term55632, term55632.getClass(), "assemLen", -1588772968);
        setByteElement(term55636, 0, (byte) 66);
        setByteElement(term55636, 1, (byte) 123);
        setByteElement(term55636, 2, (byte) -5);
        setByteElement(term55636, 3, (byte) 84);
        setByteElement(term55636, 4, (byte) -97);
        setByteElement(term55636, 5, (byte) -24);
        setByteElement(term55636, 6, (byte) 88);
        setByteElement(term55636, 7, (byte) 96);
        setByteElement(term55636, 8, (byte) 70);
        setField(term55632, term55632.getClass(), "assemBuf", term55636);
        setIntField(term55632, term55632.getClass(), "longFileMode", -93135961);
        setIntField(term55632, term55632.getClass(), "bigNumberMode", -112921587);
        setIntField(term55632, term55632.getClass(), "recordsWritten", 933028652);
        setIntField(term55632, term55632.getClass(), "recordsPerBlock", 287287233);
        setIntField(term55632, term55632.getClass(), "recordSize", 962840079);
        setBooleanField(term55632, term55632.getClass(), "closed", true);
        setBooleanField(term55632, term55632.getClass(), "haveUnclosedEntry", true);
        setBooleanField(term55632, term55632.getClass(), "finished", true);
        setField(term55632, term55632.getClass(), "out", null);
        setField(term55632, term55632.getClass(), "zipEncoding", null);
        setBooleanField(term55632, term55632.getClass(), "addPaxHeadersForNonAsciiNames", true);
        setByteElement(term55637, 0, (byte) 48);
        setByteElement(term55637, 1, (byte) -46);
        setByteElement(term55637, 2, (byte) -128);
        setField(term55632, term55632.getClass(), "oneByte", term55637);
        setLongField(term55632, term55632.getClass(), "bytesWritten", -4365849114644724155L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getRecordSize", argTypes, term516, args);
        assertTrue(recursiveEquals(term516, term55632));
        assertTrue(recursiveEquals(retValue, 962840079));
    }

};


