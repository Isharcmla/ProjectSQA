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
import java.lang.Boolean;

public class TarArchiveOutputStream_setAddPaxHeadersForNonAsciiNames_55559346242 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term207;
     Object term251;
     Object term54337;

    public TarArchiveOutputStream_setAddPaxHeadersForNonAsciiNames_55559346242() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term207 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term222 = (byte[]) newByteArray(2);
        byte[] term226 = (byte[]) newByteArray(6);
        byte[] term242 = (byte[]) newByteArray(7);
        setLongField(term207, term207.getClass(), "currSize", 4872422362414183754L);
        setField(term207, term207.getClass(), "currName", "EGtDIRbSSb");
        setLongField(term207, term207.getClass(), "currBytes", 6811161968424632369L);
        setByteElement(term222, 0, (byte) -16);
        setByteElement(term222, 1, (byte) -112);
        setField(term207, term207.getClass(), "recordBuf", term222);
        setIntField(term207, term207.getClass(), "assemLen", 590364439);
        setByteElement(term226, 0, (byte) -111);
        setByteElement(term226, 1, (byte) 23);
        setByteElement(term226, 2, (byte) -15);
        setByteElement(term226, 3, (byte) 36);
        setByteElement(term226, 4, (byte) 118);
        setByteElement(term226, 5, (byte) 106);
        setField(term207, term207.getClass(), "assemBuf", term226);
        setIntField(term207, term207.getClass(), "longFileMode", 865208305);
        setIntField(term207, term207.getClass(), "bigNumberMode", -1275173084);
        setIntField(term207, term207.getClass(), "recordsWritten", -244121226);
        setIntField(term207, term207.getClass(), "recordsPerBlock", -203030934);
        setIntField(term207, term207.getClass(), "recordSize", -1179120542);
        setBooleanField(term207, term207.getClass(), "closed", false);
        setBooleanField(term207, term207.getClass(), "haveUnclosedEntry", true);
        setBooleanField(term207, term207.getClass(), "finished", false);
        setField(term207, term207.getClass(), "out", null);
        setField(term207, term207.getClass(), "zipEncoding", null);
        setBooleanField(term207, term207.getClass(), "addPaxHeadersForNonAsciiNames", true);
        setByteElement(term242, 0, (byte) 98);
        setByteElement(term242, 1, (byte) 67);
        setByteElement(term242, 2, (byte) 66);
        setByteElement(term242, 3, (byte) -121);
        setByteElement(term242, 4, (byte) -119);
        setByteElement(term242, 5, (byte) 71);
        setByteElement(term242, 6, (byte) 80);
        setField(term207, term207.getClass(), "oneByte", term242);
        setLongField(term207, term207.getClass(), "bytesWritten", -7237588299778557629L);
        term251 = new Boolean(false);
        term54337 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream"));
        byte[] term54340 = (byte[]) newByteArray(2);
        byte[] term54341 = (byte[]) newByteArray(6);
        byte[] term54342 = (byte[]) newByteArray(7);
        setLongField(term54337, term54337.getClass(), "currSize", 4872422362414183754L);
        setField(term54337, term54337.getClass(), "currName", "EGtDIRbSSb");
        setLongField(term54337, term54337.getClass(), "currBytes", 6811161968424632369L);
        setByteElement(term54340, 0, (byte) -16);
        setByteElement(term54340, 1, (byte) -112);
        setField(term54337, term54337.getClass(), "recordBuf", term54340);
        setIntField(term54337, term54337.getClass(), "assemLen", 590364439);
        setByteElement(term54341, 0, (byte) -111);
        setByteElement(term54341, 1, (byte) 23);
        setByteElement(term54341, 2, (byte) -15);
        setByteElement(term54341, 3, (byte) 36);
        setByteElement(term54341, 4, (byte) 118);
        setByteElement(term54341, 5, (byte) 106);
        setField(term54337, term54337.getClass(), "assemBuf", term54341);
        setIntField(term54337, term54337.getClass(), "longFileMode", 865208305);
        setIntField(term54337, term54337.getClass(), "bigNumberMode", -1275173084);
        setIntField(term54337, term54337.getClass(), "recordsWritten", -244121226);
        setIntField(term54337, term54337.getClass(), "recordsPerBlock", -203030934);
        setIntField(term54337, term54337.getClass(), "recordSize", -1179120542);
        setBooleanField(term54337, term54337.getClass(), "closed", false);
        setBooleanField(term54337, term54337.getClass(), "haveUnclosedEntry", true);
        setBooleanField(term54337, term54337.getClass(), "finished", false);
        setField(term54337, term54337.getClass(), "out", null);
        setField(term54337, term54337.getClass(), "zipEncoding", null);
        setBooleanField(term54337, term54337.getClass(), "addPaxHeadersForNonAsciiNames", false);
        setByteElement(term54342, 0, (byte) 98);
        setByteElement(term54342, 1, (byte) 67);
        setByteElement(term54342, 2, (byte) 66);
        setByteElement(term54342, 3, (byte) -121);
        setByteElement(term54342, 4, (byte) -119);
        setByteElement(term54342, 5, (byte) 71);
        setByteElement(term54342, 6, (byte) 80);
        setField(term54337, term54337.getClass(), "oneByte", term54342);
        setLongField(term54337, term54337.getClass(), "bytesWritten", -7237588299778557629L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveOutputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term251;
        callMethod(klass, "setAddPaxHeadersForNonAsciiNames", argTypes, term207, args);
        assertTrue(recursiveEquals(term207, term54337));
        assertTrue(recursiveEquals(term251, false));
    }

};


